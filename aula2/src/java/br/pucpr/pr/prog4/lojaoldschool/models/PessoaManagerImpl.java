/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.pr.prog4.lojaoldschool.models;

import br.pucpr.pr.prog4.lojaoldschool.models.dao.IDaoManager;
import br.pucpr.pr.prog4.lojaoldschool.models.dao.IPessoaDao;
import br.pucpr.pr.prog4.lojaoldschool.models.dao.JdbcDaoManager;

/**
 *
 * @author alexandre.hauffe
 */
public class PessoaManagerImpl implements PessoaManager{

    @Override
    public Pessoa cadastrar(Pessoa pessoa) {
        IDaoManager maneger;
        maneger = new JdbcDaoManager();
        
        try {
            maneger.iniciar();
            IPessoaDao dao = maneger.getPessoaDao();
            Pessoa p;
            p = dao.Inserir(pessoa);
            maneger.confirmarTransação();
            maneger.encerrar();
            return p;
        } catch (Exception e) {
            maneger.abortarTransação();
            throw e;
        }
        
    }    
    
}
