package br.pucpr.pr.prog4.lojaoldschool.models.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcDaoManager implements IDaoManager 
{
    Connection conexão;
    JdbcPessoaDao pessoaDao;
    
    public JdbcDaoManager()
    {
        pessoaDao = new JdbcPessoaDao(conexão);
    }
    
    
    @Override
    public void iniciar() throws DaoException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url;
            url = "jdbc:mysql://localhost:3306/loja";
            conexão = DriverManager.getConnection(url, "root", "");
            conexão.setAutoCommit(false);
            pessoaDao.setConexão(conexão);
        }
        catch( Exception ex )
        {
            throw new DaoException("Ocorreu um erro ao conectar ao banco de dados:" + 
                    ex.getMessage());
        }
    }

    @Override
    public void encerrar() 
    {
        try {
            if(!conexão.isClosed())
                conexão.close();
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void confirmarTransação() {
        try{
            conexão.commit();            
        }catch(SQLException ex){
            throw new DaoException("Erro" + ex.toString());
        }
        
    }

    @Override
    public void abortarTransação() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IPessoaDao getPessoaDao() 
    {
        return pessoaDao;
    }


}
