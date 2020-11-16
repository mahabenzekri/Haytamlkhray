<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="fr.info.model.Produit"%>

<%@page import="fr.info.model.Categorie"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Header.jsp" %>
 <div class="Column">
<h2>Categories :</h2>
<% List<Categorie> categories = (ArrayList<Categorie>)request.getAttribute("categorie");
 
    for(Categorie cat : categories)
    {
    	out.print("<a href="+request.getContextPath()+"/Product?idP="+cat.getId()+">"+cat.getLibelle()+"</a>");
        out.print("<br/>");
        out.print("<br/>");
        out.print("<br/>");
    }
 
%>
</div>

 <div id="load_page">

 </div>
 
 

</body>
</html>