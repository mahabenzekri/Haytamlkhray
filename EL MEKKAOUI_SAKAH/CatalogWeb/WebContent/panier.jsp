<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="fr.info.model.Produit"%>

<%@page import="fr.info.model.Categorie"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
 <%@include file="Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Votre panier : </h2>
<form action="">
<table  class="table">
<thead>
<tr>
<th text-align="center" scope="col">Article</th>
 <th> </th>
<th text-align="center"scope="col">Prix</th>

</tr>
</thead>
<tbody>
<% List<Produit> produits = (ArrayList<Produit>)request.getAttribute("panier"); 
for(Produit prod : produits)
{%>
<tr>
<td   name="produit"><%= prod.getNom() %>  </td>
<td> </td>
<td  ><%= prod.getPrix()%></td>
</tr>
 
 <%	} %>   
</tbody>
</table>
<a href="<%=request.getContextPath()+"/authentification.jsp"%>">Valider votre commande</a>
</form>
</body>
</html>