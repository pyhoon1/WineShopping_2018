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

	<form action="join.do" method="post">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" value="${param.userName }"
					name="userName"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" value="${param.loginId }" name="loginId">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" value="${param.password }"
					name="password"></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input type="text" name="confirmPassword"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email" value="${param.email }"></td>
			</tr>

			<tr>
				<td>생년월일</td>
				<td><input type="text" value="${param.birth }" name="birth"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" value="${param.phone }" name="phone"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" value="${param.address }" name="address"></td>
			</tr>
			<tr>
				<td><input type="submit" value="회원가입"></td>
			</tr>
			<tr>


				<c:if test="${errors.duplicateLoginId }">이미 존재하는 아이디 입니다</c:if>
				<c:if test="${errors.duplicateEmail }">이미 존재하는 이메일 입니다</c:if>
				</td>
			</tr>
		</table>
	</form>




</body>
</html>