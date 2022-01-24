<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>

<body style="background-color: lavender">
	<h1>
		<center>Welcome to Mobile Accessories Store</center>
	</h1>
	<!--  Do not change the below line -->
	<a href="/showPage?language=en">English</a>|
	<a href="/showPage?language=de">German</a>|
	<a href="/showPage?language=fr">French</a>
	</align>
	<!--  Design the page as per the requirements-->

	<form:form modelAttribute="order" method="post" action="/billDesk">
		<table class="center">
			<tr>
				<td id="id1"><spring:message code="label.customerName" /></td>
				<td><form:input path="customerName" id="customerName"
						name="customerName" /></td>
				<td><form:errors path="customerName"></form:errors></td>
			</tr>
			
			<tr>
				<td id="id2"><spring:message code="label.contactNumber" /></td>
				<td><form:input path="contactNumber" id="contactNumber"
						name="contactNumber" /></td>
				<td><form:errors path="contactNumber"></form:errors></td>
			</tr>
			
			<tr>
				<td id="id3"><spring:message code="label.productName" /></td>
				<td><form:select path="productName" id="productName"
						name="productName" items="${productList}" /></td>
			</tr>
			
			<tr>
				<td id="id4"><spring:message code="label.quantity" /></td>
				<td><form:input path="quantity" id="quantity"
						name="quantity" /></td>
				<td><form:errors path="quantity"></form:errors></td>
			</tr>
			
			<tr>
				<td><input type="submit" id="submit" name="submit" value="PlaceOrder" /></td>
				<td><input type="reset" id="reset" name="reset" value="Cancel" /></td>
			</tr>
			
		</table>

	</form:form>
</body>
</html>
