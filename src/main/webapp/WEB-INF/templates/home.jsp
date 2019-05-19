<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Main Page</title>
  </head>
  <body>
<s:form>
<table>
<s:iterator value="beanList" status="stat">
  <tr>
    <td><s:property value="text"/></td>
    <td><s:checkbox name="selected[%{#stat.index}]"/></td>
  </tr>
</s:iterator>
</table>
<s:submit name="submit" id="submit"/>
</s:form>
  </body>
</html>
