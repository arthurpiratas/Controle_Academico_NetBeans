package Negocio;

import java.util.ArrayList;

import Basicas.Professor;
import Excecoes.ExcecaoLogin;
import Excecoes.ExcecaoLoginNome;
import Excecoes.ExcecaoNome;
import Excecoes.ExcecaoNomeUsuario;
import Repositorio.IRepositorioProfessor;
import Repositorio.RepositorioProfessorArray;

public class ControleProfessor {
	
	IRepositorioProfessor repProfessor = new RepositorioProfessorArray(); 
	
	public void insereProfessor(Professor professor) throws ExcecaoNome, ExcecaoNomeUsuario {
		repProfessor.insereProfessor(professor);
	}
	
	public void alteraProfessor(Professor professor) throws ExcecaoNome, ExcecaoNomeUsuario {
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
		
		return repProfessor.verifiaProfessorLogin(login);
				
						
		
	}
	
	public Professor retornaProfessorLogado(String login, String senha) throws ExcecaoLogin, ExcecaoLoginNome {
		Professor professor = null; 
		
		if(verificaLoginProfessor(login, senha)) {
                    professor = repProfessor.buscaProfessorLogin(login);
		}else if(verificaLoginProfessorExiste(login)){
                    throw new ExcecaoLogin();
                }else{
                    throw new ExcecaoLoginNome();
                }
		
                return professor; 
		
	}
	
	public ArrayList<Professor> retornaListaProfessor(){
		return repProfessor.retornaListaProfessor();
	}
	
	public int retornaProximoIdprofessor() {
		return repProfessor.retornaProximoID();
	}

}
