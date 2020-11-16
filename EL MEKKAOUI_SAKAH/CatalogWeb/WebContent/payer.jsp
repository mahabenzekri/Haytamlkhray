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
<h2>Validation de commande :</h2>
<h4>Veuillez saisir les informations de commande :</h4>

<table  class="table">

<tbody>

<tr>
<td>Adresse de livraison </td>
<td><input type="text"></td>

</tr>
 
</tbody>

</table>
<input type="submit" value="Payer">
</div>
    <div class="Column">

    </div>
</body>
</html>