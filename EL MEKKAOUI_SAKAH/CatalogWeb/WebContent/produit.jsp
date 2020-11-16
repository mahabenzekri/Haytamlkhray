<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="fr.info.model.Categorie"%>
<%@page import="fr.info.model.Produit"%>
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
<h2>Produits de la categorie choisie :</h2>

<table  class="table">
<thead>
<tr>
<th text-align="center" scope="col">PRODUIT</th>
 <th> </th>
<th text-align="center"scope="col">PRIX</th>

</tr>
</thead>
<tbody>
<% List<Produit> produits = (ArrayList<Produit>)request.getAttribute("produit"); 
for(Produit prod : produits)
{%>
<tr>
<td   name="produit"><%= prod.getNom() %>  </td>
<td> </td>
<td  ><a href="<%=request.getContextPath()+"/AjoutPanier?idProd="+prod.getId()%>" >Ajouter au panier</a></td>
</tr>
 
 <%	} %>   
</tbody>
</table>

</div>
    <div class="Column">

    </div>
</body>
</html>