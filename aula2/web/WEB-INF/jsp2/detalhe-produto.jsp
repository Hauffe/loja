<%-- 
    Document   : detalhe-produto
    Created on : 21/08/2015, 19:37:26
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>produto <c:out value="${Produto.id}" /> </h1>
    </body>
</html>
