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
public class ExcecaoNota extends Exception{

    public ExcecaoNota() {
        super();
    }
    @Override
    public String getMessage(){
        return "A nota deve ser de 0 à 10";
    }
    
   
}
