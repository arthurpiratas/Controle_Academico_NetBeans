package Negocio;

import Repositorio.RepositorioAlunoArray;
import Repositorio.IRepositorioAluno;

import java.util.ArrayList;

import Basicas.Aluno;
import Basicas.Turma;

public class ControleAluno {
	
	IRepositorioAluno repAluno = new RepositorioAlunoArray();
		
	
	public void insereAluno(Aluno aluno) {
			repAluno.insereAluno(aluno);	
	}
	
	public void atualizaAluno(Aluno aluno) {
			repAluno.alteraAluno(aluno);
	}
	
	public Aluno buscaAluno(String matricula) {
		return	repAluno.buscaAluno(matricula); 
	}
	
	public void removeAluno(String matricula) {
			repAluno.removeAluno(matricula);
	}
	
	public boolean verificaAlunoExiste(String matricula) {
		return repAluno.verificaAlunoExise(matricula);
	}
	
	public boolean verificaLoginAluno(String login, String senha) {
		
		if(repAluno.verifiaAlunoLogin(login)) {
			Aluno aluno = repAluno.buscaAlunoLogin(login); 
			if(aluno.getSenha().equals(senha)) {
				return true; 
			}
		}
		
		return false; 
	}
	
	
	public boolean verificaLoginAlunoExiste(String login) {
		
		if(repAluno.verifiaAlunoLogin(login)) {
			return true; 
		}
		
		return false; 
	}
	
	
	public Aluno retornaAlunoLogado(String login, String senha) {
		Aluno aluno = null; 
		
		if(verificaLoginAluno(login, senha)) {
			aluno = repAluno.buscaAlunoLogin(login);
                        
		}
		
		return aluno; 
	}
	
	public void listaAlunos() {
		repAluno.listaAluno();
	}
	
	public ArrayList<Aluno> retornaListaAluno(){
		return repAluno.retornaListaAluno();
	}
	
	public int retornaProximoIDAluno() {
		return repAluno.retornaProximoID(); 
	}
	
	public String retornaMatricula(String periodo) {
		return repAluno.retornaMatricula(periodo); 
	}
	
	public ArrayList<Aluno> retornaListaAlunosTurma(Turma turma){
		
		ArrayList<Aluno> listaAlunoTurma = new ArrayList<Aluno>();
		
		for (int i = 0; i < turma.getQtdAlunoTurma(); i++) {
			Aluno aluno = buscaAluno(turma.getAlunoTurma()[i]);
			listaAlunoTurma.add(aluno);
		}
		
		return listaAlunoTurma;
		
	}
        
        public boolean verificaAlunoExisteNome(String nome) {
            return repAluno.verificaAlunoExisteNome(nome);
        }
        
        public Aluno buscaAluno(int idAluno) {
            return repAluno.buscaAluno(idAluno); 
        }

}
