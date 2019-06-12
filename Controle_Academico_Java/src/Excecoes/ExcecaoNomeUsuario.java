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
public class ExcecaoNomeUsuario extends Exception{
    public ExcecaoNomeUsuario() {
        super();
    }
    @Override
    public String getMessage(){
        return "Nome de Usuário Já existe, favor incluir um nome de Usuário diferente!";
    }
}
