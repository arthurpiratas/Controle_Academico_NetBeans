package Repositorio;


import java.util.ArrayList;

import Basicas.Professor;import Excecoes.ExcecaoNome;
import Excecoes.ExcecaoNomeUsuario;
;

public interface IRepositorioProfessor {
	
	public void insereProfessor(Professor professor) throws ExcecaoNome, ExcecaoNomeUsuario;
	public void alteraProfessor(Professor professor) throws ExcecaoNome, ExcecaoNomeUsuario; 
	public void removeProfessor(int id); 
	public Professor buscaProfessor(int id); 
	public Professor buscaProfessor(String nome); 
	public boolean verificaProfessorExiste(String nome); 
	public boolean verificaProfessorExiste(int id); 
	public void listaProfessors(); 
	public ArrayList<Professor> retornaListaProfessor(); 
	public boolean verifiaProfessorLogin(String login); 
	public Professor buscaProfessorLogin(String login);
	public int retornaProximoID();
}
