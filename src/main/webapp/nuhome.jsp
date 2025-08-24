<%@page import="com.nutridiet.project.model.Nutritionist"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
Nutritionist nutri = (Nutritionist) session.getAttribute("nutri");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nutritionist Home</title>
</head>
<body>
Hello <%= nutri.getNname()%><br/>
Nutritionist Home
</body>
</html>