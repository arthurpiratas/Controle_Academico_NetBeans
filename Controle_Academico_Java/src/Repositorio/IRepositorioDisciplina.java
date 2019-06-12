package Repositorio;

import java.util.ArrayList;

import Basicas.Disciplina;
import Excecoes.ExcecaoNome;

public interface IRepositorioDisciplina {
	
	public void insereDisciplina(Disciplina disciplina) throws ExcecaoNome; 
	public void alteraDisciplina(Disciplina disciplina) throws ExcecaoNome; 
	public void removeDisciplina(int codigo); 
	public Disciplina buscaDisciplina(int codigo); 
	public boolean verificaDisciplinaExise(String nome); 
	public void listaDisciplinas(); 
	public ArrayList<Disciplina> retornaListaDisciplina(); 
	public int retornaProximoID();
        public Disciplina buscaDisciplina(String  nome);
	
}
