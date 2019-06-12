package Repositorio;


import java.util.ArrayList;

import Basicas.Professor;
import Excecoes.ExcecaoNome;
import Excecoes.ExcecaoNomeUsuario;

public class RepositorioProfessorArray implements IRepositorioProfessor{
	
	private int index; 
	private Professor listaProfessor[]; 
	public final static int tamanhoMaxProfessor = 400;
	
	public RepositorioProfessorArray() {
		// TODO Auto-generated constructor stub
		
		this.listaProfessor = new Professor[tamanhoMaxProfessor]; 
		this.index = 0; 
		
	}

	public Professor[] getListaProfessor() {
		return listaProfessor;
	}

	@Override
	public void insereProfessor(Professor professor) throws ExcecaoNome, ExcecaoNomeUsuario{
		// TODO Auto-generated method stub
                
                if(verificaProfessorExiste(professor.getNome())){
                    throw new ExcecaoNome();
                }else if(verifiaProfessorLogin(professor.getNomeUsuario())){
                    throw new ExcecaoNomeUsuario();
                }else{
                    this.listaProfessor[index] = professor; 
                    this.index += 1;
                }
                
	}

	@Override
	public void alteraProfessor(Professor professor) throws ExcecaoNome, ExcecaoNomeUsuario{
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getId() == professor.getId()) {
                            if(!(listaProfessor[i].getNome().equals(professor.getNome()))  && verificaProfessorExiste(professor.getNome())){
                                throw new ExcecaoNome();
                            }else if(!(listaProfessor[i].getNomeUsuario().equals(professor.getNomeUsuario())) && verifiaProfessorLogin(professor.getNomeUsuario())){
                                throw new ExcecaoNomeUsuario();
                            }else{
                                listaProfessor[i] = professor;
                            }
			}
		}
		
	}

	@Override
	public void removeProfessor(int id) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getId() == id) {
					
				listaProfessor[i] = listaProfessor[index-1];
				index -= 1;				 
			}
		}
		
	}

	@Override
	public Professor buscaProfessor(int id) {
		// TODO Auto-generated method stub
		
		Professor professor = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getId() == id) {
				professor =  listaProfessor[i]; 
			}
		}
		
		return professor;
	}

	@Override
	public Professor buscaProfessor(String nome) {
		// TODO Auto-generated method stub
		Professor professor = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getNome().equals(nome)) {
				professor =  listaProfessor[i]; 
			}
		}
		
		return professor;
	}

	@Override
	public boolean verificaProfessorExiste(String nome) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getNome().equals(nome)) {
				return true;  
			}
		}
		
		return false;
	}
	
        @Override
	public boolean verificaProfessorExiste(int id) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getId() == id) {
				return true;  
			}
		}
		
		return false;
	}

	@Override
	public void listaProfessors() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			System.out.println("Nome " + listaProfessor[i].getNome() + " Cargo: " + listaProfessor[i].getCargo() + " ID: " + listaProfessor[i].getId());
		}
		
	}

	@Override
	public ArrayList<Professor> retornaListaProfessor() {
		
		
		ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
		
		for (int i = 0; i < index; i++) {
			listaProfessor.add(this.listaProfessor[i]);
		}
		
		return listaProfessor;
	}

	@Override
	public boolean verifiaProfessorLogin(String login) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getNomeUsuario().equals(login)) {
				return true; 
			}
		}
		
		return false;
	}

	@Override
	public Professor buscaProfessorLogin(String login) {
		// TODO Auto-generated method stub
		Professor professor = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getNomeUsuario().equals(login)) {
				professor = listaProfessor[i];
			}
		}
		
		return professor;
	}

	@Override
	public int retornaProximoID() {
		// TODO Auto-generated method stub
		int cont = 0; 
		
		for (int i = 0; i < index; i++) {
			
			if(cont <=  listaProfessor[i].getId()) {
				cont =  (listaProfessor[i].getId() + 1);
			}
			 
		}
		
		return cont; 
	}

	

}
