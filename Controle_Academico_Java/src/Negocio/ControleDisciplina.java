package Negocio;

import java.util.ArrayList;

import Basicas.Disciplina;
import Repositorio.IRepositorioDisciplina;
import Repositorio.RepositorioDisciplinaArray;

public class ControleDisciplina {
	
	IRepositorioDisciplina repDisciplina = new RepositorioDisciplinaArray(); 
	
	public void insereDisciplina(Disciplina disciplina) {
		repDisciplina.insereDisciplina(disciplina);
	}	
	
	public void alteraDisciplina(Disciplina disciplina) {
		repDisciplina.alteraDisciplina(disciplina);
	}
	
	public void removeDisciplina(int codigo) {
		repDisciplina.removeDisciplina(codigo);
	}
	
	public Disciplina buscaDisciplina(int codigo) {
		return repDisciplina.buscaDisciplina(codigo); 
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
