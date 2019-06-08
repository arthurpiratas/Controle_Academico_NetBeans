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
public class ExcecaoAtividade extends Exception{
    
    public ExcecaoAtividade() {
        super();
    }
    @Override
    public String getMessage(){
        return " não pode ser avaliada, pois não foi entregue!";
    }
    
}
