<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Selected</title>
  </head>
  <body>
<table>
<s:iterator value="beanList" status="stat">
  <tr>
    <td><s:property value="text"/></td>
    <td><s:if test="%{selected[#stat.index]}"> = SELECTED</s:if><s:else> = NOT SELECTED</s:else></td>
  </tr>
</s:iterator>
</table>
  </body>
</html>