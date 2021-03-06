/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.pr.prog4.lojaoldschool.models.dao;

import br.pucpr.pr.prog4.lojaoldschool.models.Pessoa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author alexandre.hauffe
 */
public class JdbcPessoaDao implements IPessoaDao{
     
    private Connection conexão; 
    
    public JdbcPessoaDao(Connection conexão){
        this.conexão = conexão;
    }

    public void setConexão(Connection conexão) {
        this.conexão = conexão;
    }
    
    @Override
    public Pessoa Inserir(Pessoa pessoa) {
        
        String sql = "INSERT INTO pessoa "
                + "(pessoa, nome, comentario, cpf, sexo, data) "
                + "VALUES "
                + "(?, ?, ?, ?, ?, ?)";
        
        PreparedStatement ps;
        try {
            ps = conexão.prepareStatement(sql);
            ps.setString(1, pessoa.getTipo());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getComentario());
            ps.setString(4, pessoa.getCPF());
            ps.setString(5, pessoa.getSexo() + "");
            ps.setDate(6, new java.sql.Date(pessoa.getData().getTime()));
            
            ps.executeUpdate();
            return pessoa;
        } catch (Exception e) {
            throw new DaoException("Erro no jdbc" + e.getMessage());
        }
    }

    
}
