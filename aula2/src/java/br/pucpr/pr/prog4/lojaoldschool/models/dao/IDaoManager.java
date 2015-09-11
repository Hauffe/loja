package br.pucpr.pr.prog4.lojaoldschool.models.dao;

public interface IDaoManager 
{
    void iniciar();
    void encerrar();
    void confirmarTransação();
    void abortarTransação();
    IPessoaDao getPessoaDao();
}
