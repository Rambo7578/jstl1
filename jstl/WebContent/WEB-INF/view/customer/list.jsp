<%@page import="com.iot.test.vo.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	고객리스트
	<table border="1" cellspacing="0" cellpadding="0">
		<tr>
			<th><a href="${root}/view/customer/list?target=customerid&orderStr=${orderStr}">CustomerID</a></th>
			<th><a href="${root}/view/customer/list?target=customername&orderStr=${orderStr}">CustomerName</a></th>
			<th><a href="${root}/view/customer/list?target=city&orderStr=${orderStr}">City</a></th>
			<th><a href="${root}/view/customer/list?target=country&orderStr=${orderStr}">Country</a></th>
		</tr>
		<input type="submit" value="삭제" onclick="">
		<input type="submit" value="수정" onclick="">
		
		<c:if test="${customerList eq null}">
			<tr>
				<td colspan="4" align="center">고객리스트 없음</td>
			</tr>
		</c:if>
		<c:forEach items="${customerList}" var="customer">
			<tr>
				<td>${customer.customerID}</td>
				<td>${customer.customerName}</td>
				<td>${customer.city}</td>
				<td>${customer.country}</td>
				
			</tr>
			
		</c:forEach>

	</table>
</body>
</html>