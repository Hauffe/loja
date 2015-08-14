package br.pucpr.pr.prog4.lojaoldschool.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.pucpr.pr.prog4.lojaoldschool.models.*;
import java.util.List;
import javax.servlet.RequestDispatcher;


public class ProdutoListaServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IProdutoManager manager = new ProdutoManager();
        List<Produto> produtos;
        produtos = manager.obterTodos();
        
        request.setAttribute("Produtos", produtos);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp2/lista-produtos.jsp");
        rd.forward(request, response);
    }


}
