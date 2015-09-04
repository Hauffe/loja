/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.pr.prog4.lojaoldschool.controllers;

import br.pucpr.pr.prog4.lojaoldschool.models.Pessoa;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexandre.hauffe
 */


public class ClienteServlet extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp2/clienteForm.jsp");
        rd.forward(request, response);
        
    }
    
@Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Pessoa pessoa = new Pessoa();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        pessoa.setTipo(request.getParameter("pessoa"));
        pessoa.setNome(request.getParameter("nome"));
        pessoa.setComentario(request.getParameter("comentario"));
        pessoa.setCPF(request.getParameter("cpf"));
        pessoa.setSexo(request.getParameter("sexo"));
        
        try{
            Date dataNasc = sdf.parse(request.getParameter("datanasc"));
            pessoa.setData(dataNasc);
        }catch (ParseException ex) {
            Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
