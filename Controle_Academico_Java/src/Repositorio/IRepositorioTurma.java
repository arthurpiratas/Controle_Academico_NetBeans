package Repositorio;

import java.util.ArrayList;

import Basicas.Aluno;
import Basicas.Disciplina;
import Basicas.Professor;
import Basicas.Turma;
import Negocio.ControleAluno;

public interface IRepositorioTurma {
	
	public void insereTurma(Turma turma); 
	public void alteraTurma(Turma turma); 
	public void removeTurma(String nome); 
	public Turma buscaTurma(int id); 
	public boolean verificaTurmaExise(String nome); 
	public void listaTurma(); 
	public Turma[] retornaListaTurma(); 
	public ArrayList<Turma> retornaListaTurmaAluno(Aluno aluno);
	public ArrayList<Turma> retornaListaTurmaProfessor(Professor professor);
	public ArrayList<Turma> retornaListaTurmaSemProfessor();
	public boolean verificaDesciplinaPossuiTurma(Disciplina disciplina); 
	public boolean verificaProfessorPossuiTurma(Professor professor); 
	public void excluiTurmaPorDisciplina(int codigo); 
	public void excluiTurmaPorProfessor(int idProfessor); 
	public ArrayList<Turma> RetornaDisponibilidadeTurmasAluno();
	public ArrayList<Turma> retornaListaPorDisciplina(Disciplina disciplina); 
	public ArrayList<Aluno> retornaAlunoNaTurma(ControleAluno ctrAluno, int idTurma); 
	public int retornaProximoID();
	public boolean verificaAlunoMatriculadoTurma (int idTurma, Aluno aluno);
	
	

}
