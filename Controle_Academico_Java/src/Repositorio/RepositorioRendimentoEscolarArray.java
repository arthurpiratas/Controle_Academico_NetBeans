package Repositorio;

import Basicas.Aluno;
import Basicas.Rendimento_Escolar;
import Basicas.Turma;

public class RepositorioRendimentoEscolarArray implements IRepositorioRendimento_Escolar{
	
	private Rendimento_Escolar listaRendimentoEscola[]; 
	private int index; 
	public final static int tamanhoMaxRedEscol = 1000;
	
	

	public RepositorioRendimentoEscolarArray() {
		
		this.listaRendimentoEscola = new Rendimento_Escolar[tamanhoMaxRedEscol];
		this.index = 0;
	}

	public Rendimento_Escolar[] getListaRendimentoEscola() {
		return listaRendimentoEscola;
	}

	@Override
	public void insereRendimento(Rendimento_Escolar rendimentoEscolar) {
		// TODO Auto-generated method stub
		
		this.listaRendimentoEscola[index] = rendimentoEscolar; 
		this.index += 1; 
		
	}

	@Override
	public void alteraRendimento(Rendimento_Escolar rendimentoEscolar) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaRendimentoEscola[i].getAluno().getMatricula() == rendimentoEscolar.getAluno().getMatricula() && listaRendimentoEscola[i].getTurma().getId() == rendimentoEscolar.getTurma().getId()) {
				listaRendimentoEscola[i] = rendimentoEscolar; 
			}
		}
	}

	@Override
	public void removeRendimento(Aluno aluno, Turma turma) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaRendimentoEscola[i].getAluno().getMatricula() == aluno.getMatricula() && listaRendimentoEscola[i].getTurma().getId() == turma.getId()) {
					
				listaRendimentoEscola[i] = listaRendimentoEscola[index-1]; 
				index -= 1;
				
			}
		}
	}

	@Override
	public Rendimento_Escolar buscaRendimento_Escolar(Aluno aluno, Turma turma) {
		// TODO Auto-generated method stub
		Rendimento_Escolar rendimentoEscolar = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaRendimentoEscola[i].getAluno().getMatricula() == aluno.getMatricula() && listaRendimentoEscola[i].getTurma().getId() == turma.getId()) {
				rendimentoEscolar =  listaRendimentoEscola[i]; 
				
			}
		}
		
		return rendimentoEscolar; 
	}

	@Override
	public boolean verificaRendimento_Escolar(Aluno aluno, Turma turma) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaRendimentoEscola[i].getAluno().getMatricula() == aluno.getMatricula() && listaRendimentoEscola[i].getTurma().getId() == turma.getId()) {
				return true; 
				
			}
		}
		
		return false;
	}

	@Override
	public void listaRendimento_EscolarAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaRendimentoEscola[i].getAluno().getMatricula().equals(aluno.getMatricula())) {
				System.out.println("Nome" + listaRendimentoEscola[i].getAluno().getNome() + "Nota 1" + listaRendimentoEscola[i].getNota1());
				
			}
		}
		
	}

	@Override
	public void listaRendimento_EscolarTurma(Turma turma) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaRendimentoEscola[i].getTurma().getNome().equals(turma.getNome())) {
				System.out.println("Nome" + listaRendimentoEscola[i].getAluno().getNome() + "Nota 1" + listaRendimentoEscola[i].getNota1());
				
			}
		}
		
	}

	@Override
	public Rendimento_Escolar[] retornaListaRendimento_EscolarAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rendimento_Escolar[] retornaListaRendimento_EscolarTurma(Aluno turma) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verificaRendimentoEscolarPossuiAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaRendimentoEscola[i].getAluno().getId() == aluno.getId()) {
				return true; 
			}
		}
		
		return false;
	}

	@Override
	public boolean verificaRendimentoEscolarPossuiTurma(Turma turma) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaRendimentoEscola[i].getTurma().getId() == turma.getId()) {
				return true; 
			}
		}
		
		return false;
	}

	@Override
	public void removeRendimentoEscolarPorAluno(String matricula) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void removeRendimentoEscolarPorTurma(String nome) {
		// TODO Auto-generated method stub
		
	}

}
