<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://fonts.googleapis.com/css?family=Cardo"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Noto+Serif+KR"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="css/userPop.css">
<script src="./javascript/userPop.js"></script>
<title>Insert title here</title>
</head>
<body> 
	<div class="wrapper">
		<div class="buttons">
			<button id="receipt">구매 내역 보기</button>
			<button id="review">쓴 리뷰 보기</button>
		</div>
		<div class="receipt">
			<div class="title">
				<h2>구매 내역</h2>
				<i class="fas fa-times" id="receipt-close"></i>
			</div>
			<table>
				<thead>
					<tr>
						<td>상품 이름</td>
						<td>상품 가격</td>
						<td>상품 갯수</td>
						<td>날짜</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>
						<td>2016.2.3</td>
					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>
						<td>2016.2.3</td>
					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>
						<td>2016.2.3</td>
					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>
						<td>2016.2.3</td>
					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>
						<td>2016.2.3</td>
					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>
						<td>2016.2.3</td>
					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>
						<td>2016.2.3</td>
					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>
						<td>2016.2.3</td>
					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>
						<td>2016.2.3</td>
					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>
						<td>2016.2.3</td>
					</tr>
				</tbody>
			</table>
			<div class="paging">
				<i class="fas fa-caret-left"></i> <span> <a href="#">1</a> <a
					href="#">2</a> <a href="#">3</a> <a href="#">4</a> <a href="#">5</a>
				</span> <i class="fas fa-caret-right"></i>
			</div>
		</div>
		<div class='review'>
			<div class="title">
				<h2>쓴 리뷰 내역</h2>
				<i class="fas fa-times" id="review-close"></i>
			</div>
			<table>
				<thead>
					<tr>
						<td>상품 코드</td>
						<td>리뷰 내용</td>
						<td>날짜</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>

					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>

					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>

					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>

					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>

					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>

					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>

					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>

					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>

					</tr>
					<tr>
						<td>이름</td>
						<td>1000</td>
						<td>2</td>

					</tr>
				</tbody>
			</table>
			<div class="paging">
				<i class="fas fa-caret-left"></i> <span> <a href="#">1</a> <a
					href="#">2</a> <a href="#">3</a> <a href="#">4</a> <a href="#">5</a>
				</span> <i class="fas fa-caret-right"></i>
			</div>
		</div>
	</div>
</body>
</html>