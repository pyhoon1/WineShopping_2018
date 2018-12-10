<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</script>
<script>
function hasWine() {
	if($('#matchFoodName').val() == ""){
		alert("중복을 검사할 음식명을 입력해주세요");
		return false;
	}else{
	var information = {
		'matchFoodName' : $('#matchFoodName').val()
	}
	$.ajax({
				url : 'hasWine.do',
				type : 'post',
				data : information,
				error : function(error) {
					console.log(error);
				},
				success : function(result) {
					if (result == "Y") {
						alert("등록된 상품이 있습니다.");
						document.getElementById('NoHave').innerHTML = "등록된 상품이 있습니다";
					} else {
						alert("등록 가능한 상품 입니다.");
						document.getElementById('NoHave').innerHTML = "등록이 가능한 상품입니다";
					}
				}

			})
};

}
</script>
<title>Insert title here</title>
</head>
<body>
<form id="frm">
<table>
	<tr>
		<td>생산자</td>
		<td>포도 품종</td>
		<td>와인 종류</td>
		<td>상품명</td>
	</tr>
	<tr>
		<td><input type="text" name="producer" id="producer"></td>
		<td><input type="text" name="variety" id="variety"></td>
		<td><select name="wineKinds" id="wineKinds">
						<option value="레드와인">레드와인</option>
						<option value="로제와인">로제와인</option>
						<option value="스파클링">스파클링</option>
						<option value="화이트와인">화이트와인</option>
			</select></td>
		<td><input type="text" name="productName" id="productName"><input type="button" onclick="hasWine()"
					value="부가 상품 중복검사"></td>
	</tr>
	<tr>
		<td>와인 설명</td>
		<td>브랜드 설명</td>
		<td>상품 가격</td>
		<td>상품 년도</td>
	</tr>
	<tr>
		<td><textarea rows="" cols="" name="wineEx" id="wineEx"></textarea></td>
		<td><textarea rows="" cols="" name="brandEx" id="brandEx"></textarea></td>
		<td><input type="number" name="price" value="price"></td>
		<td><input type="text" name="year" id="year"></td>
	</tr>
	<tr>
		<td>궁합 좋은 음식</td>
		<td>도수</td>
		<td>용량</td>
		<td>온도</td>
		<td>상품 이미지</td>
	</tr>
	<tr>
	    <td><c:forEach items="${matchFood}" var="matchFood">
	    	<label><input type="checkbox" value="${matchFood.matchFoodName}">${matchFood.matchFoodName}</label>
	    </c:forEach> </td>
		<td><input type="text" name="alcohol" id="alcohol"></td>
		<td><input type="text" name="weight" id="weight"></td>
		<td><input type="text" name="temperature" id="temperature"></td>
		<td><input type="file" name="uploadFile"></td>
	</tr>
	
</table>
</form>
</body>
</html>