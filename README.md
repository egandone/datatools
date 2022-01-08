# datatools
Utilities for performing ad-hoc data changes and analysis

## Goals
1. Build a web-app to encapsulate common data change requests
1. Final deployment/runtime will be PCF
1. Authentication via AD/LDAP (?)
   * Maybe try OAuth - not sure how that works internally
1. Authorization - ?
   * Need to figure out how to use AD/LDAP for login but control access to individual features/functionality via a group or maybe just a static list?
1. Use [Thymeleaf](https://www.thymeleaf.org/) for server-side page rendering
1. Use [Bootstrap](https://getbootstrap.com/) for CSS and JS support

## History
* 0.0.1 - initial running version
  * basic secured "hello world" spring boot application

## References
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/) - starting tutorial for creating a secured a secured web application with spring

## Other Reference Documentation (from Sping Initializr)
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#using-boot-devtools)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-spring-mvc-template-engines)

## Guides (from Sping Initializr)
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)



