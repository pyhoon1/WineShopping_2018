<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/admin/admin.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
        crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Cardo" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Noto+Serif+KR" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="./view/admin/admin.js"></script>
<title>Insert title here</title>
</head>
<body>
	 <div class="wrapper">
        <h1>Welcome to admin page!</h1>
        <div class="nav">
            <ul>
                <li id="user">유저 관리</li>
                <li id="product">상품 관리</li>
                <li id="review">리뷰 관리</li>
                <li id="payment">구매 내역 관리</li>
            </ul>
        </div>
        <div class="content">
            <div class="user-list">
                <table>
                    <thead>
                        <tr>
                            <td>유저 번호</td>
                            <td>유저 아이디</td>
                            <td>이메일</td>
                            <td>주소</td>
                            <td>전화번호</td>
                            <td>생년월일</td>
                            <td>회원 등급</td>
                            <td>총액</td>
                            <td>가입일</td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td><a onclick="window.open('userPop.html?userid=${userid}','유저 팝업', 'width=600, height=750, toolvar=no, location=no, resizable=no')">id</a></td>
                            <td>email</td>
                            <td>address</td>
                            <td>phone</td>
                            <td>birth</td>
                            <td>ration</td>
                            <td>totalAmount</td>
                            <td>wdate</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td><a href="">id</a></td>
                            <td>email</td>
                            <td>address</td>
                            <td>phone</td>
                            <td>birth</td>
                            <td>ration</td>
                            <td>totalAmount</td>
                            <td>wdate</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td><a href="">id</a></td>
                            <td>email</td>
                            <td>address</td>
                            <td>phone</td>
                            <td>birth</td>
                            <td>ration</td>
                            <td>totalAmount</td>
                            <td>wdate</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td><a href="">id</a></td>
                            <td>email</td>
                            <td>address</td>
                            <td>phone</td>
                            <td>birth</td>
                            <td>ration</td>
                            <td>totalAmount</td>
                            <td>wdate</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td><a href="">id</a></td>
                            <td>email</td>
                            <td>address</td>
                            <td>phone</td>
                            <td>birth</td>
                            <td>ration</td>
                            <td>totalAmount</td>
                            <td>wdate</td>
                        </tr>
                    </tbody>
                </table>
                <div class="paging">
                        <i class="fas fa-caret-left"></i>
                        <span>
                            <a href="#">1</a>
                            <a href="#">2</a>
                            <a href="#">3</a>
                            <a href="#">4</a>
                            <a href="#">5</a>
                        </span>
                        <i class="fas fa-caret-right"></i>
                </div>
            </div>

            <div class="product-list">
                <table>
                    <thead>
                        <tr>
                            <td>상품 번호</td>
                            <td>생산자</td>
                            <td>품종</td>
                            <td>종류</td>
                            <td>상품 명</td>
                            <td>설명</td>
                            <td>브랜드 설명</td>
                            <td>상품 가격</td>
                            <td>상품 원산지</td>
                            <td>상품 년도</td>
                            <td>궁합 좋은 음식 이름</td>
                            <td>온도</td>
                            <td>도수</td>
                            <td>용량</td>
                            <td>팔린 갯수</td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td>producer</td>
                            <td>variety</td>
                            <td>windKinds</td>
                            <td>productName</td>
                            <td>wineEx</td>
                            <td>brandEx</td>
                            <td>price</td>
                            <td>nation</td>
                            <td>year</td>
                            <td>matchFoodName</td>
                            <td>temperature</td>
                            <td>alcohol</td>
                            <td>weight</td>
                            <td>count</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>producer</td>
                            <td>variety</td>
                            <td>windKinds</td>
                            <td>productName</td>
                            <td>wineEx</td>
                            <td>brandEx</td>
                            <td>price</td>
                            <td>nation</td>
                            <td>year</td>
                            <td>matchFoodName</td>
                            <td>temperature</td>
                            <td>alcohol</td>
                            <td>weight</td>
                            <td>count</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>producer</td>
                            <td>variety</td>
                            <td>windKinds</td>
                            <td>productName</td>
                            <td>wineEx</td>
                            <td>brandEx</td>
                            <td>price</td>
                            <td>nation</td>
                            <td>year</td>
                            <td>matchFoodName</td>
                            <td>temperature</td>
                            <td>alcohol</td>
                            <td>weight</td>
                            <td>count</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>producer</td>
                            <td>variety</td>
                            <td>windKinds</td>
                            <td>productName</td>
                            <td>wineEx</td>
                            <td>brandEx</td>
                            <td>price</td>
                            <td>nation</td>
                            <td>year</td>
                            <td>matchFoodName</td>
                            <td>temperature</td>
                            <td>alcohol</td>
                            <td>weight</td>
                            <td>count</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>producer</td>
                            <td>variety</td>
                            <td>windKinds</td>
                            <td>productName</td>
                            <td>wineEx</td>
                            <td>brandEx</td>
                            <td>price</td>
                            <td>nation</td>
                            <td>year</td>
                            <td>matchFoodName</td>
                            <td>temperature</td>
                            <td>alcohol</td>
                            <td>weight</td>
                            <td>count</td>
                        </tr>
                    </tbody>
                </table>
                <div class="paging">
                        <i class="fas fa-caret-left"></i>
                        <span>
                            <a href="#">1</a>
                            <a href="#">2</a>
                            <a href="#">3</a>
                            <a href="#">4</a>
                            <a href="#">5</a>
                        </span>
                        <i class="fas fa-caret-right"></i>
                </div>
            </div>

            <div class="review-list">
                <table>
                    <thead>
                        <tr>
                            <td>리뷰 아이디</td>
                            <td>상품 코드</td>
                            <td>상품 명</td>
                            <td>유저 이름</td>
                            <td>유저 아이디</td>
                            <td>내용</td>
                            <td>작성일</td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>reviewId</td>
                            <td>productId</td>
                            <td>productName</td>
                            <td>userName</td>
                            <td>userId</td>
                            <td>content</td>
                            <td>wadte</td>
                        </tr>
               <tr>
                            <td>reviewId</td>
                            <td>productId</td>
                            <td>productName</td>
                            <td>userName</td>
                            <td>userId</td>
                            <td>content</td>
                            <td>wadte</td>
                        </tr>
             <tr>
                            <td>reviewId</td>
                            <td>productId</td>
                            <td>productName</td>
                            <td>userName</td>
                            <td>userId</td>
                            <td>content</td>
                            <td>wadte</td>
                        </tr>
    <tr>
                            <td>reviewId</td>
                            <td>productId</td>
                            <td>productName</td>
                            <td>userName</td>
                            <td>userId</td>
                            <td>content</td>
                            <td>wadte</td>
                        </tr>
               <tr>
                            <td>reviewId</td>
                            <td>productId</td>
                            <td>productName</td>
                            <td>userName</td>
                            <td>userId</td>
                            <td>content</td>
                            <td>wadte</td>
                        </tr>
                    </tbody>
                </table>
                <div class="paging">
                        <i class="fas fa-caret-left"></i>
                        <span>
                            <a href="#">1</a>
                            <a href="#">2</a>
                            <a href="#">3</a>
                            <a href="#">4</a>
                            <a href="#">5</a>
                        </span>
                        <i class="fas fa-caret-right"></i>
                </div>
            </div>

            <div class="payment-list">
                <table>
                    <thead>
                        <tr>
                            <td>유저 아이디</td>
                            <td>상품 아이디</td>
                            <td>상품 이름</td>
                            <td>상품 가격</td>
                            <td>상품 갯수</td>
                            <td>작성 일</td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>userId</td>
                            <td>productId</td>
                            <td>productName</td>
                            <td>productPrice</td>
                            <td>basketCount</td>
                            <td>wdate</td>
                        </tr>
                       <tr>
                            <td>userId</td>
                            <td>productId</td>
                            <td>productName</td>
                            <td>productPrice</td>
                            <td>basketCount</td>
                            <td>wdate</td>
                        </tr>
                       <tr>
                            <td>userId</td>
                            <td>productId</td>
                            <td>productName</td>
                            <td>productPrice</td>
                            <td>basketCount</td>
                            <td>wdate</td>
                        </tr>
                  <tr>
                            <td>userId</td>
                            <td>productId</td>
                            <td>productName</td>
                            <td>productPrice</td>
                            <td>basketCount</td>
                            <td>wdate</td>
                        </tr>
                <tr>
                            <td>userId</td>
                            <td>productId</td>
                            <td>productName</td>
                            <td>productPrice</td>
                            <td>basketCount</td>
                            <td>wdate</td>
                        </tr>
                    </tbody>
                </table>
                <div class="paging">
                        <i class="fas fa-caret-left"></i>
                        <span>
                            <a href="#">1</a>
                            <a href="#">2</a>
                            <a href="#">3</a>
                            <a href="#">4</a>
                            <a href="#">5</a>
                        </span>
                        <i class="fas fa-caret-right"></i>
                </div>
            </div>
        </div>
    </div>

</body>
</html>