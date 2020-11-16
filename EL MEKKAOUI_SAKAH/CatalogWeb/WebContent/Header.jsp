<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style><%@include file="/WEB-INF/CSS/menu.css"%></style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>


</head>
<body>

<div class="Row">
    <div class="Column">
    
    <div class="vertical-menu">
  <a href="#"  class="active">Menu</a>
  <a href="<%=request.getContextPath()+"/index.jsp"%>">Accueil</a>
  <a href="<%=request.getContextPath()+"/Hello"%>" class="btn">Categorie</a>
  <a href="#">Votre panier</a>

</div>


    
    
    </div>
    
 
</body>
</html>





    