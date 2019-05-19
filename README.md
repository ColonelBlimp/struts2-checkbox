# Struts2 Multiple &lt;s:checkbox/&gt; Example Web Application

The aim of this web application is to provide a _basic_ example of a web application which uses multiple &lt;s:checkbox/&gt;.
It is **NOT** intended to be an example of _best practice_, rather _a way of wiring things together_. Some of the Java is
coded for readability. There are no unit tests.

It is assumed that the developer knows how to deploy the web application to a web container.

## Components

1. Struts2 (2.5.20)
2. Guice (4.2.2)
3. Log4j2 (2.11.2)
4. Maven (3.6.1)
5. Eclipse 2019-03 (4.11.0)

## Notes

To use the freemarker __home.ftl__ simply change:

    <result name="input">WEB-INF/templates/home.jsp</result>

to:

    <result type="freemarker" name="input">WEB-INF/templates/home.ftl</result>
