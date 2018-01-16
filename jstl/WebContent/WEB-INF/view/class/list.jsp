<%@page import="java.util.ArrayList"%>
<%@page import="com.iot.test.vo.ClassInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	List<ClassInfo> classList = (ArrayList<ClassInfo>) request.getAttribute("classList");
%>
<body>
클래스리스트<br>
<table border="1">
	<tr>
		<th>반이름</th>
		<th>반설명</th>
	</tr>
	<c:forEach items="${classList}" var="ci">
	<tr>
		<td>${ci.ciName}</td>
		<td>${ci.ciDesc}</td>
	</tr>
	</c:forEach>
</table>


<table border="1">
	<tr>
		<th>반이름</th>
		<th>반설명</th>
	</tr>
	<%
	for( ClassInfo ci : classList){
	%>
	<tr>
		<td><%=ci.getCiName()%></td>
		<td><%=ci.getCiDesc()%></td>
	</tr>
	<%
	}
	%>
</table>
</body>
</html>