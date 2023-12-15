---
title: "Jakarta Pages"
summary: "Jakarta Pages defines a template engine for web applications that supports mixing of textual content
(including HTML and XML) with custom tags, expression language, and embedded Java code, that gets compiled
into a Jakarta Servlet."
seo_title: "Jakarta Server Pages Specification | Jakarta EE"
description: "Find all releases of the Jakarta Server Pages specification which
defines a template engine for web applications that supports mixing of textual
content with custom tags, expression language, and embedded Java code, that
gets compiled into a Jakarta Servlet."
#<!--.................0123456789.123456789.123456789.123456789.123456789.123456789-->
summary_sixty_char: "Defines a template engine for web applications"
project_id: "ee4j.jsp"
---

{{< grid/div class="specifications-content" >}}

## Jakarta Server Pages Explained

Jakarta Server Pages (JSP) was first released in 1999, and it enables
developers to create web based user interfaces using a mixture of HTML markup
and special Jakarta Servlet tags. JSP enables easy creation of dynamic web
views, and it has also made great progressions over the years to position it
for standard model-view-controller development. Model-View-Controller
development specifies clear separation of view code from business logic, and in
the early years of JSP it was common to see business logic intermixed with HTML
code.

Both Jakarta Server Pages and [Jakarta Faces](/specifications/faces) utilize
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
web.xml for each servlet that is part of an application. Modern servlets do
not require any configuration by default, as servlet registration and mapping
is performed by placing the `@WebServlet` annotation on a servlet class. This
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

### Jakarta Server Pages Overview

The Jakarta Server Pages specification enables developers to utilize HTTP and
XML markup, custom processing tags, expression language, and embedded Java code
in order to process and display dynamic web content. Jakarta Server Pages are
an abstraction built on top of Jakarta Servlet, abstracting many of the
complexities involved with the Servlet API. As such, Jakarta Server Pages
inherits many of the features that are encompassed within the Jakarta Servlet
specification.

A JSP page is merely an HTML page that contains optional tags and/or embedded
code, and it contains a page suffix of .jsp. The following is an example of a
very basic JSP. The page accesses a JavaBean containing a property named
message, which is assigned the value of `Jakarta EE!`. The message will be
displayed when the page is viewed. This JSP is the equivalent of the servlet
example from the previous section.

```txt
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="helloBean" class="com.mycompany.helloworld.HelloBean" />
    
        <jsp:getProperty name="helloBean" property="message" />
        
    </body>
</html>
```

The code for the corresponding `HelloBean` is as follows:

```java
public class HelloBean {
    private String message = "Jakarta EE!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
```

One of the first things to note is that the @ page directive should be placed
at the top of a JSP and it may contain a number of page dependent attributes
that are communicated to the JSP container. Jakarta Server Pages allows for a
mixture of tags and embedded code within a page to display dynamic content
within a page. However, it is a best practice to maintain a clean separation
of web view markup and business logic. Therefore, it is advised to keep
business logic in Java code within classes, rather than to embed. There are
three types of JSP page elements for creating dynamic content:

- Directive Element: Provide global information for the translation phase of a
  page.
  - Format: `<%@  directive %>`
- Action Element: Provide information for the request processing phase.
- Scripting Element: Provide communication between template text and actions.
  There are three types of scripting elements:
  - Declarations: Used to declare variables  `<%! declaration %>`
  - Scriptlets: Used to embed Java code into a page `<% code %>`
  - Expressions: Used to provide expressions such as conditionals `<%= expression %>`

The following JSP demonstrates how to embed code via a scriptlet in order to
conditionally display content. In the example, if the message field within
`HelloBean` is not null, then it will be displayed, otherwise a default message
of “No value in bean” will be displayed.

```txt
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="helloBean" class="com.mycompany.helloworld.HelloBean" />
    
        <% if (helloBean.getMessage() != null) { %>
            <jsp:getProperty name="helloBean" property="message" />
        <% } else { %>
            No value in bean.
        <% } %>
    </body>
</html>
```

Jakarta Expression language is used to simplify data access from different
sources. Expressions are placed within pages using the following format `${
expression }` when the expression will be evaluated immediately. To defer the
evaluation of the expression, the syntax of `#{ expression }` can be used. When
the JSP compiler sees this syntax, it generates the code to evaluate the
expression. There is an entire specification around Jakarta Expression Language
so it is an expansive topic. There is also an additional tag library known as
Jakarta Server Pages Standard Tag Library (JSTL) which contains a number of
tags for doing things such as calling functions or performing conditionals
without embedding code in a page. However, as an example of using Jakarta
Expression Language, one can utilize conditionals to determine whether values
are less than, equal to, or greater than other values by specifying `lt`, `eq`,
or `gt`, respectively. For example the following would produce the value
`true`:

```txt
${ 10 lt 50 }
```

There are a number of implicit objects that are made available for use within
pages, and within server side business logic. These objects can be used for
doing things such as obtaining the request URI. The following objects are
available for use:

- `request`: Belongs to the `HttpServletRequest` class, and makes all request
  inputs available to the server.
- `requestScope`:  Maps request scoped attribute names to their values.
- `response`: Belongs to the `HttpServletResponse` class, and determines the
  details that are passed back to a client after a request has been made.
- `page`: Supplies access to the current servlet information.
- `pageContext`: Page Context Object.
- `session`: Maintains information throughout a session.
- `sessionScope`: Maps session scoped attribute names to their values.
- `application`: Contains application based parameters.
- `applicationScope`: Maps application scoped attribute names to their values.
- `param`: Maps parameter names to a single `String` based parameter value.
- `params`: Maps parameter names to a `String[]` of values for that parameter.
- `pageScope`:  Maps page scoped attribute names to their values.
- `header`: Maps header names to single `String` header values.
- `headerValues`: Maps header names to a `String[]` of values for the
  associated name.
- `cookie`: Maps cookie names to a single `Cookie` object.
- `initParam`: Maps context initialization parameter names to their `String`
  based parameter value.
- `out`: Used to write content to the client.
- `exception`: Used to display error messages within a JSP page.
- `config`: Supplies access to the servlet context, name, and configuration
  parameters.

For instance, to obtain a request parameter value from within a Java class, the
request object can be called upon by invoking the `getParameter()` method.

```java
String message = request.getParameter("message");
```

Jakarta Server Pages also makes a number of actions available for use within a
page. These actions can be applied by specifying the following tags:

- `jsp:include`: Enables inclusion of static and dynamic resources within the
  same context of the current page.
- `jsp:forward`: Allows current request to be dispatched to a static resource,
  JSP Page, or servlet within the same context of the current page.
- `jsp:param`: Used to specify key/value information within the `jsp:include`,
  `jsp:forward`, or `jsp:params` tags.
- `jsp:plugin`: Specifies an associated plugin for the page. Deprecated as of
  JSP 3.1
- `jsp:params`: Associated with plugins. Deprecated as of JSP 3.1
- `jsp:fallback`: Associated with plugins. Deprecated as of JSP 3.1
- `jsp:attribute`: Allows page author to define value of an action attribute in
  the body of an XML element, or it can be used to enable the page author to
  specify the attributes of the element being output by a `jsp:element` action.
- `jsp:body`: Used to define the body of a standard or custom action.
- `jsp:element`: Dynamically creates an XML element and adds it to the
  response.
- `jsp:useBean`: Associates a Java object to a JSP variable, making it
  available for use within the page.
- `jsp:setProperty`: Sets values of properties within a page.
- `jsp:getProperty`: Places value of bean instance property into the implicit
  “out” object, from which the value can be displayed as output.
- `jsp:invoke`: Only used in tag files for invoking a JSP fragment.
- `jsp:doBody`: Only used in tag files for invoking the body of a tag.
- `jsp:text`: Encloses template data in a JSP page.
- `jsp:output`: Only used in JSP documents for modifying some properties of the
  output of a JSP document or tag file.

There are a number of other optional directives that can be placed on a page
within the `<%@ directive %>` enclosing characters. These directives enable
developers to do things such as specify tag libraries that can be used within a
page using the taglib directive. The include directive allows other JSP file
contents to be substituted or included within the page at translation time. It
should be noted that JSP pages can also be built completely out of XML using
JSP documents. When developing JSP Documents, XML tags are strictly enforced.

A page that is written as a JSP is compiled down to a Jakarta Servlet and
processed by the container. Jakarta Server Pages enables the reuse of page
fragments via the use of templates, and encapsulation of functionality via
components that can be written once and reused throughout an application.
Templates contain text or XML and make it easy to embed dynamic content using
JSP scriptlets and tags.

Jakarta Server Pages is a very mature framework, and as such, it contains very
robust tooling support. It enables a clean separation of roles, as front end
developers can work on the user interface without requiring use of Java code in
most cases. Although it is possible to embed Java code inside of JSP views, it
is not recommended, as it is a best practice to code business logic within Java
classes. To learn more about the details of Jakarta Server Pages, please refer
to the specification.

{{</ grid/div >}}
