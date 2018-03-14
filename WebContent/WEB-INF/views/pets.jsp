<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>I love cats!</title>
</head>
<body>
	<fieldset>
	<form action = '/Pets2/Catcontroller' >
		<h2>Make a Cat!</h2>
		Name<input type = "text" name = "name">
		Breed<input type = "text" name = "breed">
		Weight<input type = "text" name = "weight">
		<input type = "submit" value = "submit">
	</form>
	</fieldset>
	<fieldset>
	<form action = '/Pets2/Dogcontroller'>
		<h2>Make a Dog!</h2>
		Name<input type = "text" name = "name">
		Breed<input type = "text" name = "breed">
		Weight<input type = "text" name = "weight">
		<input type = "submit" value = "submit">
	</form>
	</fieldset>
</body>
</html>