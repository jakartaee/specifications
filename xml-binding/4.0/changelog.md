---
title: "Change Log"
date: 2023-04-29
summary: "Release for Jakarta EE 10"
---

## API Changes

### CHANGES IN THE 4.0.5 RELEASE

* restores permissive base64 encoding

### CHANGES IN THE 4.0.4 RELEASE

* improves performance of unmarshalling XML without systemId

### CHANGES IN THE 4.0.3 RELEASE

* fixes overriding of JAXBContextFactory through properties
* handles empty string in DatatypeConverterImpl._parseBase64Binary 
* fixes unmarshalling of hexBinary with leading whitespaces

### CHANGES IN THE 4.0.2 RELEASE

* fixes exception thrown by javax.xml.bind.DatatypeConverter methods
* fixes the link to WS-I BP 1.0 in the spec
* reuses SAXParserFactory in AbstractUnmarshallerImpl for better performance
* improves javadoc by fixing formatting, typos, grammar, issues in sample code

### CHANGES IN THE 4.0.1 RELEASE

* fixes parseBoolean according spec
* allows usage of API jar on Android platform
* makes sure providers get only properties they are required to understand
* adds instructions for OSGi mediator

### CHANGES IN THE 4.0.0 RELEASE

* initial release for Jakarta EE 10


## TCK Changes

### CHANGES IN THE 4.0.3 RELEASE

#### Addressed Issues

* [#93](https://github.com/jakartaee/jaxb-tck/issues/93) TCK run should not start with ParseError

#### Other Changes

* updates license to Eclipse Foundation Technology Compatibility Kit License - v1.1
* fixes version numbers in the TCK documentation
* removes absolute paths from .jti configuration files
* removes use of SecurityManager
* removes deprecated java command line arguments
* allows building TCK on Java SE 11-25+
* allows certification on Java SE 11-25+

### CHANGES IN THE 4.0.2 RELEASE

#### Other Changes

* allows certification on Java SE 21+

### CHANGES IN THE 4.0.1 RELEASE

#### Addressed Issues

* [#82](https://github.com/jakartaee/jaxb-tck/issues/82) Incorrect requirement around combination of 'length' and 'minLength' facets

### CHANGES IN THE 4.0.0 RELEASE

* initial release for Jakarta EE 10
