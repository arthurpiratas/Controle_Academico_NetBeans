package Repositorio;


import java.util.ArrayList;

import Basicas.Professor;;

public interface IRepositorioProfessor {
	
	public void insereProfessor(Professor professor); 
	public void alteraProfessor(Professor professor); 
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
