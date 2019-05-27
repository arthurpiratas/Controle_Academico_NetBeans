package Repositorio;

import Basicas.Aluno;
import Basicas.Turma;
import Basicas.Rendimento_Escolar;;

public interface IRepositorioRendimento_Escolar {
	
	public void insereRendimento(Rendimento_Escolar rendimentoEscolar); 
	public void alteraRendimento(Rendimento_Escolar rendimentoEscolar); 
	public void removeRendimento(int aluno, int turma); 
	public Rendimento_Escolar buscaRendimento_Escolar(int aluno, int turma); 
	public boolean verificaRendimento_Escolar(int aluno, int turma); 
	public void listaRendimento_EscolarAluno(int aluno); 
	public void listaRendimento_EscolarTurma(int turma); 
	public Rendimento_Escolar[] retornaListaRendimento_EscolarAluno(int aluno);
	public Rendimento_Escolar[] retornaListaRendimento_EscolarTurma(int turma);
	public boolean verificaRendimentoEscolarPossuiAluno(int aluno); 
	public boolean verificaRendimentoEscolarPossuiTurma(int turma); 
	public void removeRendimentoEscolarPorAluno(String matricula); 
	public void removeRendimentoEscolarPorTurma(String nome); 

}
