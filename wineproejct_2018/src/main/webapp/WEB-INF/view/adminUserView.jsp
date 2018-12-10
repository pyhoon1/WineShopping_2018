<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</script>
<script>
	function User() {
		location.href = "adminUserList.do"; 
	}
	function Product() {
		location.href = "productList.do";
	}
	function updateManager() {
		if (confirm("관리자 계정을 수정하겠습니까?")) {
			if (document.getElementById('NoHave').innerHTML == "중복을 검사해주세요") {
				alert("중복 검사를 해주세요!");
				return false;
			} else if (document.getElementById('NoHave').innerHTML == "중복된 아이디가 있습니다.") {
				alert("아이디가 중복이 됩니다.");
				return false;
			} else {
				$.ajax({
					url : 'updateAdmin.do',
					type : 'post',
					data : $('#frm').serialize(),
					error : function(error) {
						console.log(error);
					},
					success : function(result) {
						if (result == "Y") {
							alert("회원 수정에 성공했습니다.");
							location.href="adminUserView.do?userId="+$('#userId').val();
						} else {
							alert("회원 수정에 실패했습니다.")
							return false;
						}
					}

				})
			}
		} else {
			return false;
		}
	}
	function hasUsers() {
		var userId = {
			'loginId' : $('#loginId').val()
		}
		$.ajax({
					url : 'hasUser.do',
					type : 'post',
					data : userId,
					error : function(error) {
						console.log(error);
					},
					success : function(result) {
						if (result == "Y") {
							alert("가입되어 있는 아이디가 있습니다.");
							document.getElementById('NoHave').innerHTML = "중복된 아이디가 있습니다.";
						} else {
							alert("사용 가능한 아이디입니다.");
							document.getElementById('NoHave').innerHTML = "중복된 아이디가 없습니다.";
						}
					}

				})
	}
	
	function viewReview(){		
		var userId = {
				'userId' : $('#userId').val()
			}
			$.ajax({
						url : 'userReviewView.do',
						type : 'POST',
						dataType: 'text',
						data : userId,
						error : function(error) {
							console.log(error);
						},
						success : function(html) {
							$("#reviewAndPayment").html(html);	
						}

					})
	};
	function viewPayment(){		
		var userId = {
				'userId' : $('#userId').val()
			}
			$.ajax({
						url : 'userPaymentView.do',
						type : 'POST',
						dataType: 'text',
						data : userId,
						error : function(error) {
							console.log(error);
						},
						success : function(html) {
							$("#reviewAndPayment").html(html);	
						}

					})
	};
	
	function warningReview(state,reviewId,userId){
		var information = {
				'state' : state,
				'reviewId' : reviewId,
				'userId' : userId
		}
		$.ajax({
			url : 'warningReview.do',
			type : 'POST',
			dataType : 'text',
			data : information,
			error : function(error) {
				console.log(error);
			},
			success : function(html) {
				viewReview();
			}

		})
		
	}
	function deleteReview(reviewId,userId){
		if(confirm("이 리뷰를 삭제하겠습니까?")){
			var information = {
					'reviewId' : reviewId,
					'userId' : userId
			}
			$.ajax({
				url : 'deleteReview.do',
				type : 'POST',
				dataType : 'text',
				data : information,
				error : function(error) {
					console.log(error);
				},
				success : function(html) {
					viewReview();
				}

			})
		}else{
			return false;
		}
		
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
				success : function(html) {
					alert(loginId + "님을 삭제하였습니다.")
					location.href="adminUserList.do";
				}

			})
		}else{
			return false;
		}
		
		
	}
</script>
<meta http-equiv="Content-Ty pe" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button onclick="User();">유저 관리</button>
	<button onclick="Product();">상품 관리</button>
	<button onclick="Review();">리뷰 목록</button>
	<button onclick="Payment();">결제 목록</button>

	<c:set value="${user.rating}" var="rating" />
	<form id="frm" action="post">
		<table>
			<c:choose>
				<c:when test="${rating == 'M'}">
					<tr>
						<td>관리자 아이디</td>
						<td>관리자 비밀번호</td>
						<td>관리자 성명</td>
						<td>관리자 이메일</td>
						<td>관리자 주소</td>
						<td>관리자 전화번호</td>
						<td>생년월일</td>
						<td>등급</td>
					</tr>
				</c:when>
				<c:otherwise>
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
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${rating == 'M'}">
					<input type="hidden" Id="userId" name="userId"
						value="${user.userId}">
					<tr>
						<td><input type="text" id="loginId" name="loginId"
							value="${user.loginId}"> <input type="button"
							id="hasUser" onclick="hasUsers()" value="아이디 중복검사"> <span
							id="NoHave">중복을 검사해주세요</span></td>
						<td><input type="text" id="password" name="password"
							value="${user.password}"></td>
						<td><input type="text" id="userName" name="userName"
							value="${user.userName}"></td>
						<td><input type="text" id="email" name="email"
							value="${user.email}"></td>
						<td><input type="text" id="address" name="address"
							value="${user.address}"></td>
						<td><input type="text" id="phone" name="phone"
							value="${user.phone}"></td>
						<td><input type="text" id="birth" name="birth"
							value="${user.birth}"></td>
						<td><input type="text" id="rating" name="rating"
							value="${user.rating}" readonly></td>
						<td><input type="button" id="update"
							onclick="updateManager()" value="수정"></td>
					</tr>
		</table>
		</c:when>
		<c:otherwise>
			<tr>
				<input type="hidden" Id="userId" name="userId"
					value="${user.userId}">
				<td>${user.loginId}</td>
				<td>${user.password}</td>
				<td>${user.userName}</td>
				<td>${user.email}</td>
				<td>${user.address}</td>
				<td>${user.phone}</td>
				<td>${user.birth}</td>
				<td>${user.rating}</td>
				<td>${user.totalAmount}</td>
				<td>${user.wdate}</td>
				<td><input type="button" onclick="deleteUser('${user.userId}','${user.loginId}')" value="유저 삭제"></td>
			</tr>
			</table>
		</c:otherwise>
		</c:choose>
	</form>
	<c:if test="${rating != 'M'}">
		<input type="button" onclick="viewPayment()" id="paymentReview"
			value="결제 목록">
		<button id="viewReview" onclick="viewReview()">리뷰 목록</button>
				<table id="reviewAndPayment">


		</table>

		
	</c:if>
</body>

</html>