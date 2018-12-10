<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</script>
<script>
	function insertMatchFood(){
		if(confirm("상품을 등록하시겠습니까?")){
			if($('#matchFoodName').val() == ""){
				alert('제품 명을 입력해주세요!');
				$('#matchFoodName').focus();
				return false;
			}
			else if($('#price').val() == ""){
				alert('가격을 입력해주세요!');
				$('#price').focus();
				return false;
			}
			else if($('#weight').val() == ""){
				alert('중량을 입력해주세요!');
				$('#weight').focus();
				return false;
			}
			else if($('#ex').val() == ""){
				alert('제품 설명을 입력해주세요!');
				$('#ex').focus();
				return false;
			}
			else if(document.getElementById('NoHave').innerHTML == '상품 중복 검사를 해주세요'){
				alert('중복 검사를 해주세요!');
				return false
			}else if(document.getElementById('NoHave').innerHTML == '등록된 상품이 있습니다'){
				alert('상품이 중복됩니다.');
			}else{
				var form = $('#frm')[0];
				var formData = new FormData(form);

				$.ajax({
					url : 'adminInsertMatchFood.do',
					type : 'post',
					data : formData,
				    enctype:'multipart/form-data',
				    processData: false,
				    contentType: false,
					error : function(error) {
						console.log(error);
					},
					success : function() {
						alert("상품 등록에 성공했습니다. 메인으로 돌아갑니다.");
						location.href="adminProductList.do"
					}

				})
			}
			
		
	}
	}

	function hasMatchFoodName() {
		if($('#matchFoodName').val() == ""){
			alert("중복을 검사할 음식명을 입력해주세요");
			return false;
		}else{
		var information = {
			'matchFoodName' : $('#matchFoodName').val()
		}
		$.ajax({
					url : 'hasMatchFood.do',
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

	function findNation() {
		$('.nation option[value=' + $('#search').val() + ']').attr('selected',
				'selected');
	};
	
</script>
</head>
<body>
	<form id="frm" action="insertMatchFood.do" method="post" enctype="multipart/form-data">
		<table>
			<caption>부가 상품 등록</caption>
			<tr>
				<td>상품명</td>	
				<td><input type="text" id="matchFoodName" name="matchFoodName" >
					<input type="button" onclick="hasMatchFoodName()"
					value="부가 상품 중복검사"></td>

				<td><span id="NoHave">상품 중복 검사를 해주세요</span></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="number" id="price" name="price"></td>
			</tr>
			<tr>
				<td>원산지</td>
				<td><select class="nation" id="nation" name="nation">
						<option value="남아프리카공화국">남아프리카공화국</option>
						<option value="대한민국">대한민국</option>
						<option value="독일">독일</option>
						<option value="스페인">스페인</option>
						<option value="이탈리아">이탈리아</option>
						<option value="칠레">칠레</option>
						<option value="포루투갈">포루투갈</option>
						<option value="프랑스">프랑스</option>
						<option value="호주">호주</option>
				</select></td>
				<td><input type="text" id="search" name="search"></td>
				<td><input type="button" onclick="findNation()" value="검색"></td>
			</tr>
			<tr>
				<td>상품 사진</td>
				<td><input type="file" id="uploadFile" name="uploadFile" accept="image/*"></td>
			</tr>
			<tr>
				<td>잘맞는 와인 타입</td>
				<td><select name="wineImg">
						<option value="레드와인">레드와인</option>
						<option value="로제와인">로제와인</option>
						<option value="스파클링">스파클링</option>
						<option value="화이트와인">화이트와인</option>
				</select></td>
			</tr>
			<tr>
				<td>중량</td>
				<td><input type="text" name="weight" id="weight"></td>
			</tr>
			<tr>
				<td>음식 설명</td>
				<td><textarea rows="5" cols="10" name="ex" id="ex"></textarea></td>
			</tr>
		</table>
		<input type="button" onclick="insertMatchFood()" value="기타 제품 등록">
	</form>
</body>
</html>