<%@page contentType="text/htnl" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "java.util.*"%>
<%@ page import = "h2test.H2db"%>

<%
	SortedMap<String, String> data = new TreeMap<>();
	Enumeration <String> params = request.getParameterNames();
	int i=0;
	String question = "";
	String paramName = "";
	while (params.hasMoreElements()) {
		paramName = params.nextElement();
		if (i==0){
			i +=1;
			question = request.getParameter(paramName);
		} else {
			data.put(question, request.getParameter(paramName));
			question = "";
			i =0;
		}
	}
	
	pageContext.setAttribute("testData", data);
	H2db h2db = new H2db();
	h2db.deleteAndInsertData(data);
	response.sendRedirect(request.getHeader("referer"));
%>
	