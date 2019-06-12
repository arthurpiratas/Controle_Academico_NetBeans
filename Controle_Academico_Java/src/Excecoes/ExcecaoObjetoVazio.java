/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecoes;

/**
 *
 * @author Arthur
 */
public class ExcecaoObjetoVazio extends Exception{
    
    String objeto;
    
    public ExcecaoObjetoVazio(String objeto) {
        super();
        this.objeto = objeto;
    }
    @Override
    public String getMessage(){
        return objeto + " não localizado, favor atualizar a tabela!";
    }
}
