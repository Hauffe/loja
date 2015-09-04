/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.pr.prog4.lojaoldschool.controllers;

import br.pucpr.pr.prog4.lojaoldschool.models.IProdutoManager;
import br.pucpr.pr.prog4.lojaoldschool.models.Produto;
import br.pucpr.pr.prog4.lojaoldschool.models.ProdutoManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexandre.hauffe
 */
public class ProdutoDetalheServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id;
        String idParam;
        idParam = request.getParameter("id");
        id = Integer.parseInt(idParam);
        
        IProdutoManager manager;
        manager = new ProdutoManager();
        
         Produto produto;
         produto = manager.obterPorId(id);
         
        request.setAttribute("Produto", produto);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp2/detalhe-produto.jsp");
        rd.forward(request, response);
        
    }


}
