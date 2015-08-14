<%-- 
    Document   : lista-produtos
    Created on : 14/08/2015, 18:58:02
    Author     : alexandre.hauffe
--%>

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
        <h1>Lista de produtos</h1>
        <div>
            <p>Pc 1</p>
            <a href="listaProdutos?id=1">
                <img src="../../imagens/62298_index_p.jpg" alt=""/>
            </a>
            <p>Valor: 2,50</p>
            
            <% 
                List<Produto> produtos;
                produtos = (List<Produto>) request.getAttribute("Produtos");
                
                for(Produto produto: produtos){
                   
            %>
            <p><%=produto.getNome()%></p>
                <a href="listaProdutos?id=<%=produto.getId()%>">
                    <img src="imagens/<%=produto.getId()%>" alt=""/>
                </a>
            <p><%=produto.getPreco()%></p>
            <%
                }
            %>  
        </div>
    </body>
</html>
