<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color: lavender">
	<h1>
		<center>Flawless Academy</center>
	</h1>
	<form:form method="post" action="/progEstimation" modelAttribute="academyBean">
		<table style="margin: 0px auto; margin-left: auto; margin-right: auto">

			<tr>
				<td>
				<form:label path="program">Select preferred program</form:label>
				</td>
				<td><form:select path="program" id="program"  items="${programList}">
					</form:select></td>
			</tr>

			<tr>
				<td>
				<form:label path="sessionsPerWeek">Number of session per week</form:label>
				</td>
				<td><form:input path="sessionsPerWeek" id="sessionsPerWeek" /></td>
				<td><form:errors path="sessionsPerWeek" id="errormsg" /></td>
			<tr>
				<td><input type="submit" value="Program Cost" name="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
