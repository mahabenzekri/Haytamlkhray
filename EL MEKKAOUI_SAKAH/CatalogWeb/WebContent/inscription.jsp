<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Header.jsp" %>
<h2>Votre compte n'est pas reconnu veuillez vous inscrire : </h2>
<form action="<%=request.getContextPath()+"/validerInscription"%>">
<table>
<tr>
<td> Login : </td>
<td><input type="text" name="login"> </td>

</tr>
<tr>
<td> Mot de passe : </td>
<td><input type="password" name="mdp"> </td>

</tr>
<tr>

<td><input type="submit" > </td>

</tr>
<tr>

</tr>

</table>

</form>
</body>
</html>