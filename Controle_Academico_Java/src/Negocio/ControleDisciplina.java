package Negocio;

import java.util.ArrayList;

import Basicas.Disciplina;
import Excecoes.ExcecaoExclusaoIndevida;
import Excecoes.ExcecaoNome;
import Excecoes.ExcecaoObjetoVazio;
import Repositorio.IRepositorioDisciplina;
import Repositorio.RepositorioDisciplinaArray;

public class ControleDisciplina {
	
	IRepositorioDisciplina repDisciplina = new RepositorioDisciplinaArray(); 
	
	public void insereDisciplina(Disciplina disciplina) throws ExcecaoNome {
                
		repDisciplina.insereDisciplina(disciplina);
	}	
	
	public void alteraDisciplina(Disciplina disciplina) throws ExcecaoNome {
		repDisciplina.alteraDisciplina(disciplina);
	}
	
	public void removeDisciplina(int codigo, ControleTurma ctrTurma) throws ExcecaoExclusaoIndevida {
            
                if(ctrTurma.verificaDesciplinaPossuiTurma(codigo)){
                    throw new ExcecaoExclusaoIndevida("A Disciplina");
                }else{
                    repDisciplina.removeDisciplina(codigo);
                }
		
	}
	
	public Disciplina buscaDisciplina(int codigo) throws ExcecaoObjetoVazio {
                if(repDisciplina.buscaDisciplina(codigo) == null){
                    throw new ExcecaoObjetoVazio("Disciplina"); 
                }else{
                    return repDisciplina.buscaDisciplina(codigo); 
                }
		
	}
        
        public Disciplina buscaDisciplina(String nome) {
		return repDisciplina.buscaDisciplina(nome); 
	}
	
	public boolean verificaDisciplinaExiste(String nome) {
		return repDisciplina.verificaDisciplinaExise(nome); 
	}
	
	public void listaDisciplina() {
		repDisciplina.listaDisciplinas();
	}
	
	public ArrayList<Disciplina> retornaListaDisciplina(){
		return repDisciplina.retornaListaDisciplina();
	}
	
	public int retornaProximoCodigoDisciplina() {
		return repDisciplina.retornaProximoID();
	}

}
