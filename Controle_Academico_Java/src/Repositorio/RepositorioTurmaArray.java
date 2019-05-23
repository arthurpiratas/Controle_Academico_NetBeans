package Repositorio;

import java.util.ArrayList;

import Basicas.Aluno;
import Basicas.Disciplina;
import Basicas.Professor;
import Basicas.Turma;
import Negocio.ControleAluno;

public class RepositorioTurmaArray implements IRepositorioTurma{
	
	
	private Turma listaTurma[]; 
	private int index; 
	public final static int tamanhoMaxTruma = 1000;
	
	public RepositorioTurmaArray() {
		this.listaTurma = new Turma[tamanhoMaxTruma]; 
		this.index = 0; 
	}
	
	@Override
	public void insereTurma(Turma turma) {
		// TODO Auto-generated method stub
		
		listaTurma[index] = turma; 
		this.index += 1; 
		
	}

	@Override
	public void alteraTurma(Turma turma) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getId() == turma.getId()) {
				listaTurma[i] = turma; 
			}
		}
		
	}

	@Override
	public void removeTurma(String nome) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getNome().equals(nome)) {
					
				listaTurma[i] = listaTurma[index-1]; 
				index -= 1; 
				
			}
		}
	}

	@Override
	public Turma buscaTurma(int id) {
		// TODO Auto-generated method stub
		
		Turma turma = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getId() == id) {
				turma = listaTurma[i]; 
			}
		}
		
		return turma;
	}

	@Override
	public boolean verificaTurmaExise(String nome) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaTurma[index].getNome().equals(nome)) {
				return true; 
			}
		}
		
		return false;
	}

	@Override
	public void listaTurma() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			System.out.println("Codigo: " + listaTurma[i].getId() +" Nome: " + listaTurma[i].getNome() + " Quantidade: " + listaTurma[i].getQtdAlunoTurma() + " Código disciplina: " + listaTurma[i].getDisciplina() + " Professor: " + listaTurma[i].getProfessor());
			for (int j = 0; j < listaTurma[i].getQtdAlunoTurma(); j++) {
				System.out.println("Matrícula: " + listaTurma[i].getAlunoTurma()[j]);
			}
		}
		
		
		
	}

	@Override
	public Turma[] retornaListaTurma() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	// Verificação se uma turma possui professores ou disciplina em caso de exclusão de um professor ou disciplina que estão em uma turma

	@Override
	public boolean verificaDesciplinaPossuiTurma(Disciplina disciplina) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getDisciplina() == disciplina.getcodigo()) {
				return true; 
			}
		}
		
		return false;
	}

	@Override
	public boolean verificaProfessorPossuiTurma(Professor professor) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getProfessor() == professor.getId()) {
				return true; 
			}
		}
		
		return false;
		
	}

	@Override
	public void excluiTurmaPorDisciplina(int codigo) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getDisciplina() == codigo) {
				removeTurma(listaTurma[i].getNome());
			}
		}
		
	}

	@Override
	public void excluiTurmaPorProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getDisciplina()  == idProfessor) {
				removeTurma(listaTurma[i].getNome());
			}
		}
	}
	
	
	@Override
	public ArrayList<Turma> retornaListaTurmaAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		
		ArrayList<Turma> listaTurmaAluno = new ArrayList<Turma>(); 
		
			for (int i = 0; i < index; i++) {
			for (int j = 0; j < this.listaTurma[i].getQtdAlunoTurma(); j++) {
				if(this.listaTurma[i].getAlunoTurma()[j].equals(aluno.getMatricula())) {
					listaTurmaAluno.add(this.listaTurma[i]);
				}
				
			}
		}
		
		return listaTurmaAluno;
	}

	@Override
	public ArrayList<Turma> RetornaDisponibilidadeTurmasAluno() {
		// TODO Auto-generated method stub
		
		ArrayList<Turma> listaTurma = new ArrayList<Turma>();
		
		for (int i = 0; i < index; i++) {
			if(this.listaTurma[i].getQtdAlunoTurma() < this.listaTurma[i].getCapacidadeDaTurma()) {
				listaTurma.add(this.listaTurma[i]); 
			}
		}
		
		return listaTurma;
	}

	@Override
	public ArrayList<Turma> retornaListaTurmaProfessor(Professor professor) {
		// TODO Auto-generated method stub
		
		ArrayList<Turma> listaTurma = new ArrayList<Turma>();
		
		for (int i = 0; i < index; i++) {
			if(this.listaTurma[i].getProfessor()  == professor.getId()) {
				listaTurma.add(this.listaTurma[i]);
			}
		}
		
		return listaTurma;
	}

	@Override
	public ArrayList<Turma> retornaListaTurmaSemProfessor() {
		// TODO Auto-generated method stub

		ArrayList<Turma> listaTurma = new ArrayList<Turma>();
		
		for (int i = 0; i < index; i++) {
			if(this.listaTurma[i].getProfessor() == -1) {
				listaTurma.add(this.listaTurma[i]);
			}
		}
		
		return listaTurma;
		
	}

	@Override
	public ArrayList<Turma> retornaListaPorDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		ArrayList<Turma> listaTurma = new ArrayList<Turma>();
		
		for (int i = 0; i < index; i++) {
			if(this.listaTurma[i].getDisciplina() == disciplina.getcodigo()) {
				listaTurma.add(this.listaTurma[i]);
			}
		}
		
		return listaTurma;
	}

	@Override
	public ArrayList<Aluno> retornaAlunoNaTurma(ControleAluno ctrAluno, int idTurma) {
		// TODO Auto-generated method stub
		
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>(); 
		
		for (int i = 0; i < this.index; i++) {
			if(listaTurma[i].getId() == idTurma) {
				for (int j = 0; j < listaTurma[i].getQtdAlunoTurma(); j++) {
					Aluno aluno = ctrAluno.buscaAluno(listaTurma[i].getAlunoTurma()[j]);
					listaAluno.add(aluno);
				}
			}
		}
		
		return listaAluno;
	}

	@Override
	public int retornaProximoID() {
		// TODO Auto-generated method stub
		
		int cont = 0; 
		
		for (int i = 0; i < index; i++) {
			if(cont <=  listaTurma[i].getId()) {
				cont =  (listaTurma[i].getId() + 1);
			}
			 
		}
		
		return cont; 
	}

	@Override
	public boolean verificaAlunoMatriculadoTurma(int idTurma, Aluno aluno) {
		
		ArrayList<Turma> listaTurmaAluno = retornaListaTurmaAluno(aluno);
		
		for (int i = 0; i < listaTurmaAluno.size(); i++) {
			if(listaTurmaAluno.get(i).getId() == idTurma) {
				for (int j = 0; j < listaTurmaAluno.get(i).getQtdAlunoTurma(); j++) {
					if(listaTurmaAluno.get(i).getAlunoTurma()[j].equals(aluno.getMatricula())) {
						return true;
					}
				}
			}	
		}

		return false;
	}

}
