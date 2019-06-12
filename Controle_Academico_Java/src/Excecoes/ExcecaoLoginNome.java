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
public class ExcecaoLoginNome  extends Exception{
    
    public ExcecaoLoginNome() {
        super();
         
    }
    @Override
    public String getMessage(){
        return "Login não existe. Favor solicitar cadastro!";
    }
}
