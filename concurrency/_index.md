---
title: "Jakarta Concurrency"
summary: "Jakarta Concurrency provides a specification for using concurrency from application components without compromising container integrity while still preserving the Jakarta EE platform's fundamental benefits."
description: "Find all releases of the Jakarta Concurrency specification which provides a standard API for developing concurrent application processes without compromising container integrity."
seo_title: "Jakarta Concurrency Specification | Jakarta EE"
#<!--.................0123456789.123456789.123456789.123456789.123456789.123456789-->
summary_sixty_char: "API for app level concurrency that integrates with container"
project_id: "ee4j.cu"
---

{{< grid/div class="specifications-content" >}}

## Jakarta Concurrency Explained

Application performance can make or break a user’s experience. Applications that provide a consistent experience and perform well are more likely to benefit user productivity.
The Jakarta Concurrency specification targets application performance and usability by providing a standard API for developing concurrent application processes without compromising container integrity.
It is not recommended to utilize traditional Java SE threads or timers within a Jakarta EE container because use of threads or timers may cause reliability issues and unexpected results.
Jakarta Concurrency provides an API that does not intrude on container integrity, but rather, uses services that are managed by the container and matches the functionality provided by the `Java SE Concurrency Utilities`.

Developers who are familiar with the `Java SE Concurrency Utilities` API will be able to leverage their existing knowledge to use this API, as there are many similarities.
Containers extend the `java.util.concurrent` API by providing managed versions of `java.util.concurrent.ExecutorService` interfaces.
All Jakarta EE compliant containers include default executor services, context services, and thread factories for performing particular tasks such as spawning asynchronous tasks and scheduling tasks to be executed at a specified time.
However, it is also possible to develop custom services, if needed, and register them with a container.

### Configuring Jakarta Concurrency

Jakarta Concurrency is part of the [Jakarta EE Platform](/specifications/platform) and [Jakarta EE Web Profile](/specifications/webprofile) specifications. To explicitly add the Jakarta Concurrency API to a maven application, add the following dependency:

```xml
<dependency>
    <groupId>jakarta.enterprise.concurrent</groupId>
    <artifactId>jakarta.enterprise.concurrent-api</artifactId>
    <version>3.0.2</version>
</dependency>
```

### Asynchronous Tasks

Jakarta EE compliant containers must provide instances of `ManagedExecutorService`, which extend the Java SE `ExecutorService`. Tasks can be passed to a `ManagedExecutorService`, which performs the tasks on container managed threads.
This process can occur asynchronously, allowing the application to continue performing other tasks while the `ManagedExecutorService` processes the task which had been handed off.
The `ManagedExecutorService` can return a `Future` or `CompletableFuture` object to the caller, from which the result of the task can be obtained after the task has completed.
The caller can poll this `Future` object and then perform some action using the resulting object once the task has completed. With a `CompletableFuture` or `CompletionStage`, the caller can chain dependent actions to the completion of the task rather than polling.

A task is developed by creating a class that must implement `java.util.concurrent.Callable` or `java.lang.Runnable`, or any of the functional interfaces that can be supplied to a `java.util.concurrent.CompletionStage`.
A Callable task class can optionally return a result to the caller. When tasks are submitted to a managed executor or managed `CompletionStage`, they become contextual, behaving in the same manner as they had within the original container.
This means that the task runs under the same contextual information and state that was present on the thread that submits the task to the `ManagedExecutorService`.
For example, a session may contain the username of an authenticated user. A task that is submitted to a `ManagedExecutorService` while running as that user, will be run by the `ManagedExecutorService` as that user. 
A task class that implements `Runnable` may be structured as follows:

```Java
public class MyTask implements Runnable {
    // Inject resources, if needed

    public void run() {
        // execute logic
    }
}
```

For more fine grained control, a task class can optionally implement the `jakarta.enterprise.concurrent.ManagedTask` interface, which enables the ability to perform actions upon lifecycle events.
This is achieved by registering a `jakarta.enterprise.concurrent.ManagedTaskListener` instance with the task. A use case for implementing `ManagedTask` may be to initiate a process when a particular lifecycle event occurs.

To pass a task to a `ManagedExecutorService`, the `ManagedExecutorService` can be obtained for use within a resource through use of the `Java Naming and Directory Interface (JNDI)`.
The `ManagedExecutorService` can be configured by the application via a `ManagedExecutorDefinition` annotation or via XML within the `web.xml` or `application.xml` deployment descriptors.
Alternatively, the default `java:comp/DefaultManagedExecutorService` can also be used.

After the resource has been obtained, the task can be submitted to it by calling upon any one of the `submit()`, `execute()`, `invokeAll()`, `invokeAny()`, `runAsync()`, or `supplyAsync()` methods.
The following code demonstrates how to obtain the `ManagedExecutorService` resource and submit a task to it.

```Java
@Resource(lookup = "java:comp/DefaultManagedExecutorService")
ManagedExecutorService managedExecutorService;

// Pass task class to the ManagedExecutorService
Future<ResultType> futureObject = managedExecutorService.submit(myTask);
```

If there are a number of tasks which need to be executed in parallel, it is possible to do so by passing a list of `Callable` tasks to the `ManagedExecutorService` `invokeAll()` method.
The following code demonstrates how to construct a list of builder tasks and submit them to the `ManagedExecutorService`.

```Java
List<Future<TaskType>> results = managedExecutorService
        .invokeAll(List.of(new TaskType(1), new TaskType(2)));
```

In circumstances where transactions are required, `jakarta.transaction.UserTransaction` can be used to utilize transactions within task classes.
In order to do so, look up the `UserTransaction` in `JNDI` as `java:comp/UserTransaction` or obtain the `SessionContext` resource, and then utilize it to obtain a `UserTransaction`.

### Scheduled Tasks

The `ManagedScheduledExecutorService` is a container resource that extends the `java.util.concurrent.ScheduledExecutorService` and `jakarta.enterprise.concurrent.ManagedExecutorService`
interfaces to provide the same managed functionality as a `ManagedExecutorService`, with the additional ability to delay and schedule tasks to run at a specific time.
Task classes, which implement either `java.lang.Runnable` or `java.util.concurrent.Callable`, can be passed to the `ManagedScheduledExecutorService` and executed at a delayed or scheduled interval.

To pass a task to the `ManagedScheduledExecutorService`, the service can be obtained by a resource via a `JNDI` lookup.
The `ManagedScheduledExecutorService` can be configured by the application via a `ManagedScheduledExecutorDefinition` annotation or via XML within the `web.xml` or `application.xml` deployment descriptors.
Alternatively, the default `java:comp/DefaultManagedScheduledExecutorService` can also be used.

Once obtained, task(s) can be submitted by calling upon any one of the `submit()`, `execute()`, `invokeAll()`, `invokeAny()`, `runAsync()`, `supplyAsync()`, `schedule()`, `scheduleAtFixedRate()`, or `scheduleWithFixedDelay()` methods.
The following code demonstrates how to obtain a `ManagedScheduledExecutorService` resource and schedule a task.

```Java
@Resource(lookup = "java:comp/DefaultManagedScheduledExecutorService")
ManagedScheduledExecutorService managedScheduledExecutorService;

// Pass task class to the ManagedScheduledExecutorService
Future futureHandle = managedScheduledExecutorService
        .scheduleAtFixedRate(myTask, 10, TimeUnit.MINUTES);
```

### Managed Threads

A `ManagedThreadFactory` can be used to create new thread instances within a Jakarta EE container without directly utilizing `java.util.Thread`. `ManagedThreadFactory` instances can be looked up in `JNDI`.

The `ManagedThreadFactory` can be configured by the application via a `ManagedThreadFactoryDefinition` annotation or via XML within the `web.xml` or `application.xml` deployment descriptors.
Alternatively, the default `java:comp/DefaultManagedThreadFactory` can also be used. Managed threads execute much like a standard thread, however, they execute in the same context as the application component that looked up the `ManagedThreadFactory`.
To utilize a `ManagedThreadFactory`, inject an instance into a resource and then call upon the `newThread()`, passing the `Runnable` task class. Lastly, invoke the `start()` method on the new thread to begin.
Using the example task class from the previous section, the following code demonstrates how to create a new thread and pass the task to the thread:

```Java
@Resource(name = "concurrent/MyManagedThreadFactory")
ManagedThreadFactory threadFactory;
. . .
// Create task and pass to thread
MyTask task = new MyTask();
Thread taskThread = threadFactory.newThread(task);
taskThread.start();
. . .
// Destroy the thread if it is no longer needed
taskThread.interrupt();
```

### Contextual Tasks

The `ContextService` can be used to create contextual objects for Jakarta EE without the use of a `ManagedExecutorService`.
The `ContextService` utilizes dynamic proxy capabilities which are found within the `java.lang.reflect` package or creates non-dynamic proxy instances in order to associate the context of the container with an object instance(s).
Since the contextual object proxy will be run as an extension of the container that creates it, the proxy may interact with the container resource. The contextual object proxy can also be stored and run at a later time, if needed.
Such solutions are useful for developing applications that require context throughout a process, such as a workflow. The `ContextService` can be obtained using `JNDI`.
A `ContextService` can be configured by the application via a `ContextServiceDefinition` annotation or via the `<context-service>` element within XML deployment descriptors.
Alternatively, the default `java:comp/DefaultContextService` can also be used.

### Asynchronous Methods

Jakarta EE 10 introduced asynchronous methods to the Jakarta Concurrency specification. Asynchronous methods enable developers to annotate methods contained within CDI beans in order to have those methods invoked asynchronously.
The CDI bean must not be a `Jakarta Enterprise Bean`, and the asynchronous method cannot be annotated with conflicting asynchronous annotations from other specifications.
Asynchronous methods must have a return type of `java.util.concurrent.CompletableFuture`, `java.util.concurrent.CompletionStage`, or void.
Behind the scenes, the application container will execute the method as the action of a `java.util.concurrent.CompletableFuture` or `java.util.concurrent.CompletionStage`.
Container context is captured from the submitting thread and propagated to the asynchronous method. When dependent stages are chained to the completion of the stage, container context is captured from the requesting thread and propagated to the dependent stage action.
The following code demonstrates an example of developing an asynchronous method:

```Java
@Asynchronous(executor="java:module/env/concurrent/myExecutor")
public CompletableFuture<String> myMethod() {
    // Processing
    return Asynchronous.Result.complete(string);
}
```

### Thread Context Providers

Jakarta Concurrency contains a ThreadContextProvider SPI to provide a standard means for third party thread context types to be provided alongside the Jakarta EE container’s built-in thread context types.
This means that there is a standard way for third party developers to create types that can be utilized within a compliant Jakarta EE container without breaking compliance.

### Conclusion

Jakarta Concurrency provides a standard means for developing concurrent solutions within a Jakarta EE container without compromising the integrity of the container.
Compliant Jakarta EE containers enable executor services, context services, and managed thread factories to be configured, which can accept tasks and execute them asynchronously or at scheduled intervals.
Through the use of these services, container context is propagated to tasks and container resources are available for use by tasks.

{{< grid/div >}}
