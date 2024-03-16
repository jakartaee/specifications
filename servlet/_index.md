---
title: "Jakarta Servlet"
summary: "Jakarta Servlet defines a server-side API for handling HTTP requests and responses."
description: "Find all releases of the Jakarta Servlet specification which offers a number of APIs that can be used to create web based user interfaces."
seo_title: "Jakarta Servlet Specification | Jakarta EE"
#<!--.................0123456789.123456789.123456789.123456789.123456789.123456789-->
summary_sixty_char: "A server-side API for handling HTTP requests and responses"
project_id: "ee4j.servlet"
---

{{< grid/div class="specifications-content" >}}

## Jakarta Servlet Explained

The [Jakarta EE Platform](/specifications/platform) offers a number of APIs that can be used to create web based user interfaces. The most mature and perhaps most well known is the `Jakarta Servlet` specification.
`Jakarta Servlet` was first released in 1996, and it enables Java developers to create web pages containing dynamic web content using pure Java.
The specification has changed much over the years and it is able to interact with modern technologies and comply with the modern era of web technologies with features such as HTTP/2.

In general, `Jakarta Servlet` APIs are the least often used for development of application user interfaces since the learning curve is often a bit higher.
Although it may not be as widely used for development, it does contain a standard API which is widely supported, and most other user interface specifications are built upon it.
Both [Jakarta Server Pages](/specifications/pages) and [Jakarta Faces](/specifications/faces) utilize `Jakarta Servlet` under the hood, which also makes `Jakarta Servlet` a foundational technology for building Jakarta EE web application user interfaces.

### Configuration

Each of these three UI technologies requires some minimal configuration. All of these APIs are available for use by default if using the full Jakarta EE Platform or the Jakarta EE Web Profile.
However, to add the specifications individually, the following dependencies are required:

`Jakarta Servlet` Dependency:

```xml
<dependency>
    <groupId>jakarta.servlet</groupId>
    <artifactId>jakarta.servlet-api</artifactId>
    <version>6.0.0</version>
    <scope>provided</scope>
</dependency>
```

Jakarta Server Pages Dependency:

```xml
<dependency>
    <groupId>jakarta.servlet.jsp</groupId>
    <artifactId>jakarta.servlet.jsp-api</artifactId>
    <version>3.1.0</version>
    <scope>provided</scope>
</dependency>
```

Jakarta Faces Dependency:

```xml
<dependency>
    <groupId>jakarta.faces</groupId>
    <artifactId>jakarta.faces-api</artifactId>
    <version>4.0.1</version>
</dependency>
```

### Additional Configuration

`Jakarta Servlet` used to require servlet registration and mapping within the `web.xml` for each servlet that is part of an application.
Modern servlets do not require any configuration by default, as servlet registration and mapping is performed by placing the `@WebServlet` annotation on a servlet class.
This annotation accepts the servlet path as an attribute.

[Jakarta Faces](/specifications/faces) requires some additional configuration in order to route the web requests through the Faces servlet.
There is an optional configuration with Jakarta Faces which allows developers to specify the default extension for the user interface pages.
However, the default extension is `.xhtml` if this configuration is not specified. The configuration should be placed within the `web.xml`.

```xml
<servlet>
    <servlet-name>Faces Servlet</servlet-name>
    <servlet-class>jakarta.faces.webapp.FacesServlet</servlet-class>
    <load-on-startup>1</load-on-startup>
</servlet>
<servlet-mapping>
    <servlet-name>Faces Servlet</servlet-name>
    <url-pattern>*.xhtml</url-pattern>
</servlet-mapping>
```

### Jakarta Servlet Overview

`Jakarta Servlet` enables developers to write web UIs using pure Java. At its simplest, a servlet is developed by creating a Java class and extending the `Servlet` interface.
There are two classes that are generally used to extend Servlet interface: `GenericServlet` and `HttpServlet`. In most cases, `HttpServlet` is extended.
The `service()` method is called upon when the servlet is loaded into the web browser. The `Servlet` interface defines a service method that is invoked to act upon each request.
There are a number of methods that are automatically called upon via the `service()` method, and a servlet should implement those methods which provide the processing needed for the task at hand.

* `doGet()`: handles `HTTP GET` requests for displaying data
* `doPost()`: handles `HTTP POST` requests for performing inserts
* `doPut()`: handles `HTTP PUT` requests for performing updates
* `doDelete()`: handles `HTTP DELETE` requests for performing deletions
* `doHead()`: handles `HTTP HEAD` requests
* `doOptions()`: handles `HTTP OPTIONS` requests
* `doTrace()`: handles `HTTP TRACE` requests

In the case of loading some simple dynamic content, implementing the `doGet()` method may be all that is required. The `@WebServlet` annotation can be applied to a servlet class in order to register it with the container.
The path to which a user must visit to invoke the servlet should be passed to the `@WebServlet` annotation.
In the following example the servlet can be invoked by visiting the URL path containing the host name, port, and servlet path of `/HelloServlet` within a web browser:

```Java
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    static String PAGE_HEADER = "<html><head><title>hello</title></head><body>";
    static String PAGE_FOOTER = "</body></html>";
    @Inject
    HelloService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println(PAGE_HEADER);
        try {
            writer.println(service.printMessage("Jakarta EE!"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        writer.println(PAGE_FOOTER);
        writer.close();
    }
}
```

When the servlet URL is visited by a client, a request is sent to the host server, and then it hands off the request to the servlet container.
The servlet container then determines which servlet to invoke and then calls upon it with the request and response objects.  

The servlet life cycle is as follows:

1. Loading and Instantiation: Servlet container loads the servlets that are registered and instantiates them for use.
2. Initialization: `Servlet` initialization occurs calling upon the `init()` method of the servlet.
3. RequestHandling: Request objects of type `ServletRequest` are handled, and then `ServletResponse` objects are filled out and passed as parameters to the `service()` method. At this stage, single requests or multiple asynchronous requests can be processed, depending upon configuration.
4. End of Service: Once a container determines that a servlet is no longer needed, the `destroy()` method of the servlet is called to allow the servlet to release resources, if needed.

In some cases, data needs to be passed in from a web form to a servlet for processing. This can be achieved through the use of HTML forms and request parameters.
Parameters can be sent to a servlet through the URI and they are processed via name-value pairs. Multiple values can be assigned to any parameter name.
Once the parameters are passed, the servlet contains a number of methods that can be used for accessing the parameters.

### Additional Features

There are a number of other important features that `Jakarta Servlet` provides that go above and beyond the basics of displaying dynamic content and accepting request parameters.
This section will provide a high level overview for a number of these features. Many of these additional features can be registered within the `web.xml` of an application, or they can be registered using annotations.

`Servlet Filters` are lightweight and reusable Java components that allow on-the-fly modifications of header and payload for both the request and response.
`Jakarta Servlet` provides a framework for writing filters and applying them to servlets. To write a filter, a class must extend `jakarta.servlet.Filter`, and implement the `doFilter()` method.
The `@WebFilter` annotation can be applied to a class, along with metadata, to define it as a filter.

`Servlet Listeners` can be used to listen for events and perform actions when the corresponding events occur. There are a number of different event types, from servlet startup/shutdown, to session or request events.
Listener classes must implement a listener interface corresponding to the associated type of event listener being developed. Listener events include: `AsyncListener`, `ServletContextListener`,
`ServletContextAttributeListener`, `ServletRequestListener`, `ServletRequestAttributeListener`, `HttpSessionListener`, `HttpSessionBindingListener`, `HttpSessionAttributeListener`, `HttpSessionActivationListener`.
Listeners can be registered by applying the `@WebListener` annotation to a listener class.

`Servlet containers` allow files to be uploaded when data is sent via `multipart/form-data`. To indicate that a servlet is used for performing upload, it must have the `@MultipartConfig` annotation applied to it.

`Servlets` can access information pertaining to attributes and headers via provided APIs. Attributes are associated with each request, and they can be set to specify information.
Headers are also associated with every HTTP request, and they can be used to specify information about sessions and caching, amongst other things.

`Servlets` can make use of the URI path to invoke different resources. The path portion of a URI identifies which resource should be processed.
Part of the `Jakarta Servlet` specification outlines a standard set of guidelines that should be followed by compliant containers when processing URI paths.
A servlet request path conforms to the following format:

```Java
requestURI = contextPath + servletPath + pathInfo
```

`Jakarta Servlet` containers utilize non-blocking request processing, which helps to improve scalability and makes it easy to increase the number of simultaneously processed connections.
Non-Blocking IO makes it possible to read and write when needed, without requiring a connection to wait for other processes to complete. `Jakarta Servlet` provides an API for working with non-blocking requests.

`HTTP/2 Server Push` enables a servlet to push required resources to a client when needed. This provides the ability to load resources before they are needed so that overall performance of servlet applications is significantly improved.

There are APIs for processing cookies, working with SSL, and much more. This brief overview only scratches the surface of `Jakarta Servlet` capability. To learn more, please review the specification.

{{< grid/div >}}
