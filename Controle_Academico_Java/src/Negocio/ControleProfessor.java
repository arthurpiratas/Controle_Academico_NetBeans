package Negocio;

import java.util.ArrayList;

import Basicas.Professor;
import Repositorio.IRepositorioProfessor;
import Repositorio.RepositorioProfessorArray;

public class ControleProfessor {
	
	IRepositorioProfessor repProfessor = new RepositorioProfessorArray(); 
	
	public void insereProfessor(Professor professor) {
		repProfessor.insereProfessor(professor);
	}
	
	public void alteraProfessor(Professor professor) {
		repProfessor.alteraProfessor(professor);
	}
	
	public void removeProfessor(int id) {
		repProfessor.removeProfessor(id);
	}
	
	public Professor buscaProfessor(int id) {
		return repProfessor.buscaProfessor(id); 
	}
	
	public Professor buscaProfessor(String nome) {
		return repProfessor.buscaProfessor(nome); 
	}
	
	public void listaProfessor() {
		repProfessor.listaProfessors();
	}
	
	public boolean verificaProfessorExiste(String nome) {
		return repProfessor.verificaProfessorExiste(nome);
	}
	
	public boolean verificaProfessorExiste(int id) {
		return repProfessor.verificaProfessorExiste(id);
	}
	
	public boolean verificaLoginProfessor(String login, String senha) {
		
		if(repProfessor.verifiaProfessorLogin(login)) {
			Professor professor = repProfessor.buscaProfessorLogin(login); 
			if(professor.getSenha().equals(senha)) {
				return true;
			}
			
		}
		
		return false; 
	}
	
	public boolean verificaLoginProfessorExiste(String login) {
		
		if(repProfessor.verifiaProfessorLogin(login)) {
				return true;
						
		}
		
		return false; 
	}
	
	public Professor retornaProfessorLogado(String login, String senha) {
		Professor professor = null; 
		
		if(verificaLoginProfessor(login, senha)) {
			return professor = repProfessor.buscaProfessorLogin(login);
		}
		
		return professor; 
	}
	
	public ArrayList<Professor> retornaListaProfessor(){
		return retornaListaProfessor();
	}
	
	public int retornaProximoIdprofessor() {
		return repProfessor.retornaProximoID();
	}

}
