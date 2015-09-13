<%-- 
    Document   : lista-produtos
    Created on : 14/08/2015, 18:58:02
    Author     : alexandre.hauffe
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="br.pucpr.pr.prog4.lojaoldschool.models.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../style/estilo.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de produtos</h1>
        <div>
            <c:forEach var="produto" items="${Produtos}">
            <p>${produto.nome}</p>
                <a href="detalhe?id=${produto.id}">
                    <img src="../imagens/${produto.id}.jpg" alt=""/>
                </a>
                <p>${produto.preco}</p>
            <p>
           </c:forEach>
        </div>
    </body>
</html>
