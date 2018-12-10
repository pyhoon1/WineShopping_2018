<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<tr>
	<td>상품 명</td>
	<td>개별 상품 가격</td>
	<td>구매 수량</td>
	<td>결제 금액</td>
	<td>결제 일자</td>
</tr>
<c:forEach items="${paymentList}" var="payment"> 
	<tr>
		<td>${payment.productName}</td>
		<td>${payment.productPrice}</td>
		<td>${payment.basketCount}</td>
		<td>${payment.total}</td>
		<td>${payment.wdate}</td>
	</tr>
</c:forEach>