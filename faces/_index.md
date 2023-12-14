---
title: "Jakarta Faces"
summary: "Jakarta Faces defines an MVC framework for building user interfaces for web applications, 
including UI components, state management, event handling, input validation, page navigation, and 
support for internationalization and accessibility."
seo_title: "Jakarta Faces Specifications | JSF formerly JavaServer Faces | Jakarta EE"
description: "Find all releases of the Jakarta Faces specification which
defines an MVC framework for building user interfaces for web applications."
#<!--.................0123456789.123456789.123456789.123456789.123456789.123456789-->
summary_sixty_char: "MVC framework for building user interfaces for web apps"
project_id: "ee4j.faces"
---

## Jakarta Faces Explained

Jakarta Faces was initially released in 2004, and it provides the ability to
develop web based user interfaces with XML for the view and a corresponding
Java class to contain the business logic for the view. This specification has
adapted over the years to continue as a relevant web based user interface API
for modern times.

Both Jakarta Faces and [Jakarta Server Pages](/specifications/pages/) utilize
[Jakarta Servlet](/specifications/servlet/) under the hood, which also makes
Jakarta Servlet a foundational technology for building Jakarta EE web
application user interfaces.

### Configuration

Each of these three UI technologies requires some minimal configuration. All
of these APIs are available for use by default if using the full Jakarta EE
Platform or the Jakarta EE Web Profile. However, to add the specifications
individually, the following dependencies are required:

Jakarta Servlet Dependency:

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

#### Additional Configuration

Jakarta Servlet used to require servlet registration and mapping within the
web.xml for each servlet that is part of an application. Modern servlets do not
require any configuration by default, as servlet registration and mapping is
performed by placing the `@WebServlet` annotation on a servlet class. This
annotation accepts the servlet path as an attribute.

Jakarta Faces requires some additional configuration in order to route the web
requests through the Faces servlet. There is an optional configuration with
Jakarta Faces which allows developers to specify the default extension for the
user interface pages. However, the default extension is .xhtml if this
configuration is not specified. The configuration should be placed within the
web.xml.

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

### Jakarta Faces Overview

Jakarta Faces is built upon Jakarta Servlet and provides even more abstraction
than Jakarta Server Pages. Jakarta Faces provides strict enforcement of the
Model-View-Controller paradigm, maintaining a clean separation of view code
from business logic. Jakarta Faces is a server-side web framework that enables
developers the ability to focus different portions of an application
development life cycle to different teams with expertise in those areas. The
specification has matured over the years to enable excellent support for modern
technologies, such as microservices.

At the heart of Jakarta Faces is its templating framework, facelets, which
provides excellent support for applying templates throughout and reuse of page
content. Jakarta Faces facelet views adhere to XML, and the page suffix ends
with .xhtml. The views are composed of custom components and events that are
processed by the Jakarta Faces runtime. There are components for just about
every web application construct…from input text fields, to calendar widgets, to
maps. Not only does facelets allow for templating, but it also provides great
support for development of reusable components. In fact, there are libraries
of reusable components available for use and entire component libraries that
are open source providing ready-to-use components for building applications
with Jakarta Faces.

Jakarta Faces has a request processing lifecycle, much like that of Jakarta
Server Pages. There are a series of phases that each request goes through, and
this overview will not go into depth on the phases. However, it is important
to note that these phases determine when validations, conversions, and events
are processed throughout the lifecycle of a Jakarta Faces request/response.

Jakarta Faces allows communication between the front end and the back end via
the use of Contexts and Dependency Injection (CDI) beans. CDI beans can be
referenced within Jakarta Faces views using Expression Language, enclosing
expressions within `#{ expression }`. The following Faces view provides similar
output as that of the Jakarta Servlet example from earlier in this article,
displaying a message from a Java class on screen:

```xml
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="jakarta.faces.html">
    <h:head>
        <title>Facelet Title</title>
    </h:head>
    <h:body>
        <h:outputText value="#{helloCdi.message}"/>
    </h:body>
</html>
```

The corresponding CDI Bean is named HelloCdi, and it contains the following
code. For the first example, only the message field is used.

```java
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named
@ViewScoped
public class HelloCdi implements java.io.Serializable {
    
    private String message = "Hello Jakarta Faces!";
    private String changedText;
    public HelloCdi(){
        
    }
    
    public void changeMessage() {
        this.message = changedText;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getChangedText() {
        return changedText;
    }

    public void setChangedText(String changedText) {
        this.changedText = changedText;
    }
}
```

To break the example down, `<html>` tag lists tag library namespaces that can
be utilized within the view, and maps them to a corresponding letter. In the
example, the `xmlns:h="jakarta.faces.html"` maps the letter “h” to the Jakarta
Faces HTML tag library namespace. As such, any of the Jakarta Faces HTML tags
must be prefaced with “h:”. Another often used namespace that is part of
Jakarta Faces contains the Faces core components. This namespace is typically
bound to the letter “f” as such: `xmlns:f="jakarta.faces.core"`, and the core
components cover converters, validators, and others. The body of the XHTML
form contains opening and closing `<h:head>` and `<h:body>` tags. Any
parameters that need to be placed into the head of the view would be placed
within the `h:head` section, and any components that will be used to compose
the view would be placed within the h:body section. In the example, the
Jakarta Faces `h:outputText` component is contained within the h:body and it is
used to display the data which is stored within the message property of the CDI
bean. Note that the CDI bean has the `@ViewScoped` annotation applied, which
makes this bean hold state for the life of the view. When the user navigates
away from the page, the state is lost. However, a CDI bean can contain any of
the valid CDI scopes.

Jakarta Faces makes templating easy, providing the ability to create portions
of a page such as a footer once, and then apply that portion to other pages.
Using templating, it is possible to create headers, footers, menus on the top,
left, or right, and so forth. To utilize facelets templating, the facelets
namespace must be brought into a page within the `<html>` tag
`xmlns:ui="jakarta.faces.facelets"`. The facelets “insert” and “include”
components enable one to include facelets pages within each other.

```xml
<h:body>
    <div id="body">        
            . . .
    </div>
    <div id="footer">
        <ui:insert name="footer">
            <ui:include src="/template/applicationFooter.xhtml"/>
        </ui:insert>
    </div>
</h:body>
```

As mentioned, Jakarta Faces contains a large number of components for use
within the views, and they can be easily wired up to save values and
communicate with backend business logic via CDI beans. To name a few, the
`inputText` component translates to an HTML input component of type text, the
`commandButton` component translates to a button which submits form contents,
and the dataTable component allows data to be displayed within an HTML table.
It is easy to develop a create, remove, update, delete data application using a
`dataTable` component. The Jakarta Faces HTML components that ship with the
platform are basic without much styling applied, but there are many third party
component providers that contain enhanced styling that can make forms and
tables very visually appealing.

As an example of Jakarta Faces forms functionality, the following page contains
a Jakarta Faces form. Inside the form are an outputText component to display a
message bound to a CDI property, an `inputText` component that is bound to a
property within a CDI bean, which can have its value changed from the view
since it contains a setter method. The view also contains a `commandButton`
which is bound to an action method within the bean. When the `commandButton` is
pressed, the text which has been entered into the `inputText` component is
assigned to the message property and redisplayed on the screen.

```xml
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="jakarta.faces.html">
    <h:head>
        <title>Facelet Title</title>
    </h:head>
    <h:body>
        <h:form id="helloForm">
            <h:outputText id="message" value="#{helloCdi.message}"/>
            
            <h:inputText id="inputMessage" value="#{helloCdi.changedText}"/>
            <br/><br/>
            <h:commandButton id="submitButton" action="#{helloCdi.changeMessage}" value="Change Message"/>
            
        </h:form>
    </h:body>
</html>
```

Jakarta Faces also includes a navigational API which provides the ability to
navigate from one view to another. There are two different forms of navigation
within Jakarta Faces. An optional faces-config.xml file can be included within
the WEB-INF folder of the application, and navigational rules, amongst other
configurations, can be specified via XML. The following navigational rule can
be placed within this file and it will route the user to the
authentication.xhtml page when a value of `GOTO_LOGIN` is returned from an
action method within a CDI bean.

```xml
<navigation-rule>
        <from-view-id>/*</from-view-id>
        <navigation-case>
            <from-outcome>GOTO_LOGIN</from-outcome>
            <to-view-id>authenticate.xhtml</to-view-id>
        </navigation-case>
</navigation-rule>
```

Navigation can also occur by returning the name of the view to which navigation
should occur from an action method. For instance, when a user clicks a command
button to initiate an action method, it could return a `String` of
`"authenticate.xhtml"` to navigate to that page. There are also components that
contain an “outcome” attribute, which can be used to specify the name of the
view to which navigation should route the user.

Jakarta Faces includes a validation framework to validate data as it is entered
into data fields or submitted via a form. Jakarta Faces comes with a number of
validators, which perform validation on numbers, etc. However, it is also easy
to develop custom validators that can be applied to components within a Faces
form. In a similar fashion, Jakarta Faces includes a converter framework that
allows data to be converted automatically by the supplied converters or by
custom created converters. An example of a converter would be converting all
characters of a `String` to uppercase, or converting a `String` to a date object.

The following example demonstrates how to apply a length validator to the
`inputText` field. Note that the applied `validateLength` converter is part of the
Jakarta Faces core component library, so it contains a prefix of “f”.

```xml
<h:inputText id="inputMessage" value="#{helloCdi.changedText}">
    <f:validateLength minimum="10" maximum="200" />
</h:inputText>
```

It is possible to provide a label attribute on an `inputText` field to change
the label color of a field label when the contents fail validation. Another
option is to associate an outputText with a particular error message if
validation fails. Modern applications utilize JavaScript and AJAX (Asynchronous
JavaScript and XML) to submit forms and display content to users without page
refreshes. This process also helps the user identify issues with form entry
more easily. The Jakarta Faces components are ready to use with AJAX by
applying the core ajax component to corresponding Faces tags. There is no
JavaScript code necessary, as Jakarta Faces abstracts the code intricacies from
the developer. The following code demonstrates how to apply AJAX to a command
button and process the inputMessage and the `commandButton` action, and then
finally refresh the value of the component assigned to an ID of “message”.

```xml
<h:commandButton id="ajaxSubmitButton"
                  value="Ajax Change Message"
                  actionListener="#{helloCdi.changeMessage()}">
    <f:ajax execute="inputMessage, @this" render="message"/>
</h:commandButton>
```

Jakarta Faces supports features such as resource bundles, which enable
internationalization and the ability to store static messages. Centralizing
text within resource bundles makes management much easier. There is also an
`outputStylesheet` component that can be used to easily apply style sheets to
pages, and each of the components contains styling attributes. As mentioned
previously, there are a number of third party component libraries that have
components that already have styling applied to them. There is also a dialog
API, which makes it easy to embed dialogs into Jakarta Faces forms.

In the most recent release, there have been a number of new features added.
There is now a new API for developing facelets programmatically. One can now
also use extensionless pages so that each page no longer requires the .xhtml
suffix. Some of the components have also been updated with new attributes and
options. So many other features haven’t even been mentioned in this brief
overvew, and to learn more about them, please refer to the specification.
