<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "java.util.*"%>
<%@ page import = "h2test.H2db"%>

<%
	SortedMap<String, String> data = new TreeMap<>();
	H2db h2db = new H2db();
	data = h2db.getData();
	String adminUser = request.getParameter("admin");
	pageContext.setAttribute("testData", data);
	
	if ((adminUser != null) && (adminUser.equals("1"))) {
%>
	<form action="./save.jsp" method="post">
	
	<c:forEach items="${testData}" var="entry" varStatus="loop">
		<input type="text" id="qname${loop.count}" name="qname${loop.count}" value="${entry.key}"><br>
		<input type="text" id="ans${loop.count}" name="ans${loop.count}" value="${entry.value}"><br><br><br>
	</c:forEach>
	
	<table>
		<tr>
		<td><c:out value="Enter New Question:"/> </td>
		<td><input type="text" id="qnamenew" name="qnamenew"></td>
		</tr>
		<tr>
		<td><c:out value="Enter New Answer:"/></td>
		<td><input type="text" id="ansnew" name="ansnew"></td>
		</tr>
	</table>
	<input type="submit" id="submit" name="Submit">
	</form>
	
<% } else { %>
	<c:forEach items="${testData}" var="entry">
		<c:out value="${entry.key}"/><br>
		<c:out value="${entry.value}"/><br><br><br>
	</c:forEach>

<% } %>	