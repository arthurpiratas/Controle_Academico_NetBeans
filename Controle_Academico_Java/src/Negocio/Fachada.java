package Negocio;

import java.util.ArrayList;

import Basicas.*;

public class Fachada {
	
	private ControleADM ctrAdm;
	private ControleAluno ctrAluno; 
	private ControleDisciplina ctrDisciplina; 
	private ControleProfessor ctrProfessor; 
	private ControleRendimentoEscolar ctrRendimentoEscolar; 
	private ControleTurma ctrturma; 
	
	private static Fachada instance;
	
	public Fachada() {
		ctrAdm = new ControleADM(); 
		ctrAluno = new ControleAluno(); 
		ctrDisciplina = new ControleDisciplina(); 
		ctrProfessor = new ControleProfessor(); 
		ctrRendimentoEscolar = new ControleRendimentoEscolar(); 
		ctrturma = new ControleTurma(); 
	}
	
	public static Fachada getInstance(){
		if (Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	public void insereADM(Administrador adm) {
		ctrAdm.insereADM(adm);
	}
	
	public void alteraADM(Administrador adm) {
		ctrAdm.alteraADM(adm);
	}
	
	public void removeADM(int id) {
		ctrAdm.removeADM(id);
	}
	
	public Administrador buscaADM(String nome) {
		return ctrAdm.buscaADM(nome); 
	}
	
	public boolean verificaADMExise(String nome) {
		return ctrAdm.verificaADMExise(nome);
	}
	
	public void listaADM() {
		ctrAdm.listaADM();
	}
	
	public boolean verificaLoginAdmExiste(String login) {
		return ctrAdm.verificaLoginExiste(login);
	}
	
	public boolean verificaLoginAdm(String login, String senha) {
		return ctrAdm.verificaLoginAdm(login, senha); 
	}
	
	public Administrador buscaADMLogin(String login, String senha) {
		return ctrAdm.buscaADMLogin(login, senha);
	}
	
	public ArrayList<Administrador> retornaListaAdm(){
		return ctrAdm.retornaListaAdm();
	}
	
	public int retornaProximoIdADM() {
		return ctrAdm.retornaProximoIdADM();
	}
	
	public void insereAluno(Aluno aluno) {
		ctrAluno.insereAluno(aluno);
	}
	
	public void atualizaAluno(Aluno aluno) {
		ctrAluno.atualizaAluno(aluno);
	}
	
	public Aluno buscaAluno(String matricula) {
		return ctrAluno.buscaAluno(matricula);
	}
	
	public void removeAluno(String matricula) {
		ctrAluno.removeAluno(matricula);
	}
	
	public boolean verificaAlunoExiste(String matricula) {
		return ctrAluno.verificaAlunoExiste(matricula); 
	}
	
	public boolean verificaLoginAluno(String login, String senha) {
		return ctrAluno.verificaLoginAluno(login, senha); 
	}
	
	public boolean verificaLoginAlunoExiste(String login) {
		return ctrAluno.verificaLoginAlunoExiste(login); 
	}
	
	public Aluno retornaAlunoLogado(String login, String senha) {
		return ctrAluno.retornaAlunoLogado(login, senha);
	}
	
	public void listaAlunos() {
		ctrAluno.listaAlunos();
	}
	
	public ArrayList<Aluno> retornaListaAluno(){
		return ctrAluno.retornaListaAluno();
	}
	
	public int retornaProximoIDAluno() {
		return ctrAluno.retornaProximoIDAluno();
	}
	
	public String retornaMatricula(String periodo) {
		return ctrAluno.retornaMatricula(periodo);
	}
	
	public ArrayList<Aluno> retornaListaAlunosTurma(Turma turma){
		return ctrAluno.retornaListaAlunosTurma(turma);
	}
        
        public boolean verificaAlunoExisteNome(String nome) {
                return ctrAluno.verificaAlunoExisteNome(nome);
        }        
	
	public void insereDisciplina(Disciplina disciplina) {
		ctrDisciplina.insereDisciplina(disciplina);
	}
	
	public void alteraDisciplina(Disciplina disciplina) {
		ctrDisciplina.alteraDisciplina(disciplina);
	}
	
	public void removeDisciplina(int codigo) {
		ctrDisciplina.removeDisciplina(codigo);
	}
	
	public Disciplina buscaDisciplina(int codigo) {
		return ctrDisciplina.buscaDisciplina(codigo);
	}
	
	public boolean verificaDisciplinaExiste(String nome) {
		return ctrDisciplina.verificaDisciplinaExiste(nome);
	}
	
	public void listaDisciplina() {
		ctrDisciplina.listaDisciplina();
	}
	
	public ArrayList<Disciplina> retornaListaDisciplina(){
		return ctrDisciplina.retornaListaDisciplina();
	}
	
	public int retornaProximoCodigoDisciplina() {
		return ctrDisciplina.retornaProximoCodigoDisciplina();
	}
	
	public void insereProfessor(Professor professor) {
		ctrProfessor.insereProfessor(professor);
	}
	
	public void alteraProfessor(Professor professor) {
		ctrProfessor.alteraProfessor(professor);
	}
	
	public void removeProfessor(int id) {
		ctrProfessor.removeProfessor(id);
	}
	
	public Professor buscaProfessor(int id) {
		return ctrProfessor.buscaProfessor(id);
	}
	
	public Professor buscaProfessor(String nome) {
		return ctrProfessor.buscaProfessor(nome);
	}
	
	public void listaProfessor() {
		ctrProfessor.listaProfessor();
	}
	
	public boolean verificaProfessorExiste(String nome) {
		return ctrProfessor.verificaProfessorExiste(nome); 
	}
	
	public boolean verificaProfessorExiste(int id) {
		return ctrProfessor.verificaProfessorExiste(id); 
	}
	
	public boolean verificaLoginProfessor(String login, String senha) {
		return ctrProfessor.verificaLoginProfessor(login, senha);
	}
	
	public boolean verificaLoginProfessorExiste(String login) {
		return ctrProfessor.verificaLoginProfessorExiste(login);
	}
	
	public Professor retornaProfessorLogado(String login, String senha) {
		return ctrProfessor.retornaProfessorLogado(login, senha);
	}
	
	public ArrayList<Professor> retornaListaProfessor() {
		return ctrProfessor.retornaListaProfessor();
	}
	
	public int retornaProximoIdProfessor() {
		return ctrProfessor.retornaProximoIdprofessor();
	}
	
	public void insereTurma(Turma turma) {
		ctrturma.insereTurma(turma);
	}
	
	public void alteraTurma(Turma turma) {
		ctrturma.alteraTurma(turma);
	}
	
	public void removeTurma(String nome) {
		ctrturma.removeTurma(nome);
	}
	
	public Turma buscaTurma(int id) {
		return ctrturma.buscaTurma(id);
	}
	
	public boolean verificaTurmaExiste(String nome) {
		return ctrturma.verificaTurmaExiste(nome);
	}
	
	public void listaTurma() {
		ctrturma.listaTurma();
	}
	
	public boolean verificaDesciplinaPossuiTurma(Disciplina disciplina) {
		return ctrturma.verificaDesciplinaPossuiTurma(disciplina);
	}
	
	public boolean verificaProfessorPossuiTurma(Professor professor) {
		return ctrturma.verificaProfessorPossuiTurma(professor);
	}
	
	public void excluiTurmaPorDisciplina(int codigo) {
		ctrturma.excluiTurmaPorDisciplina(codigo);
	}
	
	public void excluiTurmaPorProfessor(int idProfessor) {
		ctrturma.excluiTurmaPorProfessor(idProfessor);
	}
	
	public boolean verificaCapacidadeTurma(Turma turma) {
		return ctrturma.verificaCapacidadeTurma(turma);
	}
	
	public boolean verificaAlunoEmTurma(Turma turma, Aluno aluno) {
		return ctrturma.verificaAlunoEmTurma(turma, aluno);
	}
	
	public void insereAlunoEmTurma(Turma turma, Aluno aluno) {
		ctrturma.insereAlunoEmTurma(turma, aluno);
	}
	
	public void removeAlunoEmTurma(Turma turma, Aluno aluno) {
		ctrturma.removeAlunoEmTurma(turma, aluno);
	}
	
	public ArrayList<Turma> retornaListaTurmaAluno(Aluno aluno){
		return ctrturma.retornaListaTurmaAluno(aluno);
	}
	
	public ArrayList<Turma> retornaListaTurmaProfessor(Professor professor){
		return ctrturma.retornaListaTurmaProfessor(professor);
	}
	
	public ArrayList<Turma> retornaListaTurmaSemProfessor(){
		return ctrturma.retornaListaTurmaSemProfessor();
	}
	
	public ArrayList<Turma> retornaDisponibilidadeTurmasAluno(){
		return ctrturma.retornaDisponibilidadeTurmasAluno();
	}
	
	public ArrayList<Aluno> retornaAlunoNaTurma(ControleAluno ctrAluno, int idTurma){
		return ctrturma.retornaAlunoNaTurma(ctrAluno, idTurma);
	}
	
	public int retornaProximoIdTurma() {
		return ctrturma.retornaProximoIdTurma();
	}
	
	public boolean verificaAlunoMatriculadoTurma(int idTurma, Aluno aluno) {
		return ctrturma.verificaAlunoMatriculadoTurma(idTurma, aluno);
	}
}
