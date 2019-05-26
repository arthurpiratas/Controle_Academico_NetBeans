package Repositorio;

import java.util.ArrayList;

import Basicas.Aluno;
import javax.swing.JOptionPane;

public class RepositorioAlunoArray implements IRepositorioAluno{
	
	private Aluno listaAluno[]; 
	private int index; 
	public final static int tamanhoMaxAlunos = 1000; 
	
	public RepositorioAlunoArray() {
		this.listaAluno = new Aluno[tamanhoMaxAlunos]; 
		this.index = 0; 
	}
	
	

	public Aluno[] getListaAluno() {
		return listaAluno;
	}



	@Override
	public void insereAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		this.listaAluno[index] =  aluno; 
		this.index += 1; 
		
	}

	@Override
	public void alteraAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
                    
			if(listaAluno[i].getId() == aluno.getId()) {
				listaAluno[i] = aluno; 
			}
		}
		
	}

	@Override
	public void removeAluno(String matricula) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaAluno[i].getMatricula().equals(matricula)) {
					listaAluno[i] = listaAluno[index-1]; 
					index -= 1; 
				
			}
		}
		
	}

	@Override
	public Aluno buscaAluno(String matricula) {
		// TODO Auto-generated method stub
		
		Aluno aluno = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaAluno[i].getMatricula().equals(matricula)) {
				aluno = listaAluno[i]; 
			}
		}
		
		return aluno;
	}

	@Override
	public boolean verificaAlunoExise(String matricula) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < index; i++) {
			if(listaAluno[i].getMatricula().equals(matricula)) {
				return true; 
			}
		}
		
		return false;
	}
        
        @Override
        public boolean verificaAlunoExisteNome(String nome) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < index; i++) {
			if(listaAluno[i].getNome().equals(nome)) {
				return true; 
			}
		}
		
		return false;
	}

	@Override
	public void listaAluno() {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			System.out.println("ID: " + listaAluno[i].getId()  + "Nome: " + listaAluno[i].getNome() + " Matr�cula: " + listaAluno[i].getMatricula() + "  " + this.index);
		}
	}

	@Override
	public ArrayList<Aluno> retornaListaAluno() {
		// TODO Auto-generated method stub
		
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
		
		for (int i = 0; i < index; i++) {
			listaAluno.add(this.listaAluno[i]); 
		}
		
		return listaAluno;
	}



	@Override
	public boolean verifiaAlunoLogin(String login) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaAluno[i].getNomeUsuario().equals(login)) {
				return true; 
			}
		}
		
		return false;
	}



	@Override
	public Aluno buscaAlunoLogin(String login) {
		// TODO Auto-generated method stub
		Aluno aluno = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaAluno[i].getNomeUsuario().equals(login)) {
				aluno = listaAluno[i];
                                
                                
			}
		}
		
		return aluno;
	}



	@Override
	public int retornaProximoID() {
		// TODO Auto-generated method stub
		
		int cont = 0; 
		
		for (int i = 0; i < index; i++) {
			
			if(cont <=  listaAluno[i].getId()) {
				cont =  (listaAluno[i].getId() + 1);
			}
			 
		}
		
		return cont; 

	}



	@Override
	public String retornaMatricula(String periodo) {
		// TODO Auto-generated method stub
		
		String matricula = "";
		
		matricula = periodo + retornaProximoID();
		
		return matricula;
	}



	

}
