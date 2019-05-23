package Negocio;

import Basicas.Aluno;
import Basicas.Rendimento_Escolar;
import Basicas.Turma;
import Repositorio.IRepositorioRendimento_Escolar;
import Repositorio.RepositorioRendimentoEscolarArray;

public class ControleRendimentoEscolar {
	
	IRepositorioRendimento_Escolar repRendimentoEscolar = new RepositorioRendimentoEscolarArray(); 
	
	public void insereRendimentoEscola(Rendimento_Escolar rendimentoEscolar) {
		repRendimentoEscolar.insereRendimento(rendimentoEscolar);
	}
	
	public void alteraRendimentoEscolar(Rendimento_Escolar rendimentoEscolar) {
		repRendimentoEscolar.alteraRendimento(rendimentoEscolar);
	}
	
	public void removeRendimentoEscolar(Aluno aluno, Turma turma) {
		repRendimentoEscolar.removeRendimento(aluno, turma);
	}
	
	public Rendimento_Escolar buscaRendimentoEscolar(Aluno aluno, Turma turma) {
		return repRendimentoEscolar.buscaRendimento_Escolar(aluno, turma);
	}
	
	public boolean verificaRendimentoEscolaExiste(Aluno aluno, Turma turma) {
		return repRendimentoEscolar.verificaRendimento_Escolar(aluno, turma); 
	}
	
	public void listaRendimentoEscolarAluno(Aluno aluno) {
		repRendimentoEscolar.listaRendimento_EscolarAluno(aluno);
	}
	
	public void listaRendimentoEscolarTurma(Turma turma) {
		repRendimentoEscolar.listaRendimento_EscolarTurma(turma);
	}
	
	public boolean verificaRendimentoEscolarPossuiAluno(Aluno aluno) {
		return repRendimentoEscolar.verificaRendimentoEscolarPossuiAluno(aluno); 
	}
	
	public boolean verificaRendimentoEscolarPossuiTurma(Turma turma) {
		return repRendimentoEscolar.verificaRendimentoEscolarPossuiTurma(turma);
	}

}
