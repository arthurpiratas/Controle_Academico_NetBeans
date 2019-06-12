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
public class ExcecaoNome extends Exception{
    public ExcecaoNome() {
        super();
    }
    @Override
    public String getMessage(){
        return "Nome Já existe, favor incluir um nome diferente!";
    }
}
