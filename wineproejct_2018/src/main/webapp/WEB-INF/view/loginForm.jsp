<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-/ /W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>





<body>
	<form action="login.do" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="loginId" value="${param.loginId }"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
			.
				<td><input type="submit" value="로그인"></td>
			</tr>
			<c:if test="${errors.noLoginId }">없는 아이디 입니다</c:if>
			<c:if test="${errors.wrongPassword }">비밀번호가 틀렸습니다</c:if>
			<c:if test="${ errors.noConfirm}">인증이 아직안됨</c:if>
		</table>
	</form>

</body>
</html>