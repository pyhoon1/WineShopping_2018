<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="header.css" rel="stylesheet" type="text/css">
<script src="./header.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="header">
            <div class="logo">
                <a href="main.jsp"><img src="Logo.png"></a>
            </div>
            <div class="nav">
                <ul>
                    <li id="category"><a href="#" class="border-right">Category</a>
                        <div class="category-dropdown">
                            <ul>
                                <div>
                                    <li id="nation"><a href="#">나라 별</a></li>
                                    <ul class="nation-ul">
                                        <div>
                                            <li><a href="#">이탈리아</a></li>

                                        </div>
                                        <div><a href="#">
                                                <li><a href="#">독일</a></li>
                                            </a>
                                        </div>
                                        <div>
                                            <li><a href="#">프랑스</a></li>

                                        </div>
                                        <div>
                                            <li><a href="#">스페인</a></li>

                                        </div>
                                    </ul>
                                </div>
                                <div>
                                    <li id="type"><a href="#">종류별</a></li>
                                    <ul class="type-ul">
                                        <div>
                                            <li><a href="#">화이트 와인</a></li>

                                        </div>
                                        <div>
                                            <li><a href="#">레드 와인</a></li>

                                        </div>
                                        <div>
                                            <li><a href="#">로제 와인</a></li>

                                        </div>
                                        <div>
                                            <li><a href="#">스파클링 와인</a></li>

                                        </div>
                                    </ul>
                                </div>
                                <div>
                                    <li id="price"><a href="#">가격 별</a></li>
                                    <ul class="price-ul">
                                        <div><a href="#">
                                                <li><a href="#">1만 ~ 3만</a></li>
                                            </a>
                                        </div>
                                        <div>
                                            <li><a href="#">3만 ~ 5만</a></li>

                                        </div>
                                        <div>
                                            <li><a href="#">5만 ~ 10만</a></li>

                                        </div>
                                        <div>
                                            <li><a href="#">10만 ~ 30만</a></li>

                                        </div>
                                    </ul>
                                </div>
                            </ul>
                        </div>
                    </li>
                    <li><a href="#" id="login" class="border-right">Login</a>
                        <span class="login-box">
                            <h3>로그인</h3>
                            <form action="login.jsp" method="post">
                                <div class="input-box"><input type="text"></div>
                                <div class="input-box"><input type="passward"></div>
                                <input class="submit" type="submit" value="Login">
                            </form>
                        </span>
                    </li>
                    <li><a href="./signUp.html" class="border-right">Sign up</a> </li>
                    <li><a href="#">MyPage</a></li>
                    <li>
                        <div class="search-box">
                            <input class="search-txt" type="text" name="search" placeholder="Search">
                            <a href="#" class="search-btn"><i class="fas fa-search"></i></a>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
</body>
</html>