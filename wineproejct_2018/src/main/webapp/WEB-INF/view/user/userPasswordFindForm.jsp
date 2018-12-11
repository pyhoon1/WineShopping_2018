<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="userPasswordFind.do" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="loginId" value="${param.loginId }"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="userName"
					value="${param.userName }"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email" value="${param.email }"></td>
			</tr>
			<tr>
				<td><input type="submit" value="비밀번호찾기"></td>
			</tr>
		</table>
		<c:if test="${errors.noUserInformation }">없는 정보</c:if>
		<c:if test="${errors.noEmail }">없는 이메일</c:if>

	</form>
</body>
</html>