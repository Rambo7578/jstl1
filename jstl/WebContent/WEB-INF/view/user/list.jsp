<%@page import="java.util.List"%>
<%@page import="com.iot.test.vo.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
유저리스트<br>
sdfsdfs
<script>
function getEl(id){
	return document.getElementById(id);
}
function checkValue(){
	var searchType= getEl("searchType").value.trim();
	var searchStr = getEl("searchStr").value.trim();
	
	if(searchType.length==0){
		alert("검색종류를 선택해주세요.");
		getEl("searchType").focus();
		return false;
	}
	if(searchStr.length<2){
		alert("검색어는 2글자 이상입니다.");
		getEl("searchStr").focus();
		return false;
	}
	return true;
}
</script>
<form onsubmit="return checkValue()">
	<select name="searchType" id="searchType">
		<option value="">선택</option>
		<option value="uiName" ${param.searchType eq "uiName" ? "selected":""}>이름</option>
		<option value="uiAge" ${param.searchType eq "uiAge" ? "selected":""}>나이</option>
		<option value="address" ${param.searchType eq "address" ? "selected":""}>주소</option>
	</select>
	<input type="text" name="searchStr" id="searchStr" value="${param.searchStr}">
	<input type="submit" value="검색">
</form>
<table border="1">
	<tr>
		<th>이름</th>
		<th>아이디</th>
		<th>나이</th>
		<th>주소</th>
	</tr>
	<c:forEach items="${userList}" var="ui">
		<tr>
			<td>${ui.uiName}</td>
			<td>${ui.uiId}</td>
			<td>${ui.uiAge}</td>
			<td>${ui.address}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>