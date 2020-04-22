<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>RECYCL</title>
</head>
<body>
<form method="POST" action="home">
    <p>Afficher les demandes effectuées après le  <input type="date" name="date"></p>
    <input type="submit"/>
</form>

<c:if test="${ !empty date }"><p><c:out value="Date choisie ${date}" /></p></c:if>

<form method="POST" action="home">
    <p>Pour une demande donnée, afficher la raison sociale de l'entreprise, la tournée correspondante et la quantité à récupérer pour chaque type de déchet (Demande de votre choix).</p>
    <input type="submit"/>
</form>

<form method="POST" action="home">
    <p>Afficher la quantité totale récupérée par type de déchet pour un mois/année donné (Mois et année de votre choix).</p>
    <input type="submit"/>
</form>


<form method="POST" action="home">
    <p>Afficher les employés ayant réalisé moins de  <input type="number" name="nbTournees">  tournées.Triez le résultat sur le nombre de tournées (N étant un nombre de votre choix).</p>
    <input type="submit"/>
</form>

<c:if test="${ !empty nbTournees }"><p><c:out value="Nombre choisi ${ nbTournees }" /></p></c:if>

<form method="POST" action="home">
    <p>Affichez les informations de l'entreprise qui a réalisé plus de demandes que l'entreprise ... (autre entreprise dont vous fournissez le nom).</p>
    <input type="submit"/>
</form>

<c:if test="${ !empty nomEntreprise }"><p><c:out value="Nom choisi ${ nomEntreprise }" /></p></c:if>

<form method="POST" action="home">
    <p>Affichez les informations des demandes qui ne sont pas encore inscrites dans une tournée.</p>
    <input type="submit"/>
</form>
</body>
</html>
