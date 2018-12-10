<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</script>
<head>
<script>
	function User() {
		location.href="adminUserList.do";
	}
	function Product(){
		location.href="adminProductList.do";
	}
	
	function deleteUser(userId,loginId){
	
		if(confirm(loginId+"님을 삭제하시겠습니까?")){
			var information = {
				'userId':userId			
				
			}
			$.ajax({
				url : 'admindeleteUser.do',
				type : 'POST',
				data : information,
				error : function(error) {
					console.log(error);
				},
				success : function() {
					alert(loginId + "님을 삭제하였습니다.")
					location.href="adminUserList.do";
				}

			})
		}else{
			return false;
		}
		
		
	}
	
	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Insert title here</title>
</head>
<body>
<button onclick="User();">유저 관리</button>
<button onclick="Product();">상품 관리</button>
<button onclick="Review();">리뷰 목록</button>
<button onclick="Payment();">결제 목록</button>
<form action="adminUserList.do" method="post">
<table>
<tr>
	<td><input type="text" name="condition"></td>
	<td><input type="submit" value="유저 검색"></td>
	</tr>
	</table>
</form>
	<table>
		<tr>
			<td>가입 아이디</td>
			<td>가입 비밀번호</td>
			<td>성명</td>
			<td>이메일</td>
			<td>주소</td>
			<td>전화번호</td>
			<td>생년월일</td>
			<td>등급</td>
			<td>총 구입액</td>
			<td>가입일</td>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
			<td><a href="adminUserView.do?userId=${user.userId}">${user.loginId}</a></td>
			<td>${user.password}</td>
			<td>${user.userName}</td>
			<td>${user.email}</td>
			<td>${user.address}</td>
			<td>${user.phone}</td>
			<td>${user.birth}</td>
			<td>${user.rating}</td>
			<td>${user.totalAmount}</td>
			<td>${user.wdate}</td>	
			<c:if test="${user.rating != 'M'}">
				<td><button onclick="deleteUser('${user.userId}','${user.loginId}')">유저 삭제</button></td>
			</c:if>
			</tr>
		</c:forEach>


	</table>

</body>
</html>