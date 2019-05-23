package Basicas;

import java.util.Date;

public class Turma {
	
	private int id; 
	private String nome; 
	private int professor_ID; 
	private int disciplina_COD; 
	private int capacidadeDaTurma;
	private String alunoTurma[]; 
	private int qtdAlunoTurma; 
	
	
	public Turma(int id, String nome, int professor, int capacidadeDaTurma, int disciplina) {
		
		this.id = id;
		this.nome = nome;
		this.professor_ID = professor;
		this.capacidadeDaTurma = capacidadeDaTurma;
		this.alunoTurma = new String[capacidadeDaTurma]; 
		this.qtdAlunoTurma = 0; 
		this.disciplina_COD = disciplina; 
	}
	
	public Turma(int id, String nome, int capacidadeDaTurma, int disciplina) {
		
		this.id = id;
		this.nome = nome;
		this.professor_ID = -1; 
		this.capacidadeDaTurma = capacidadeDaTurma;
		this.alunoTurma = new String[capacidadeDaTurma]; 
		this.qtdAlunoTurma = 0; 
		this.disciplina_COD = disciplina; 
	}
	
	
	
	public int getDisciplina() {
		return disciplina_COD;
	}


	public void setDisciplina(int disciplina) {
		this.disciplina_COD = disciplina;
	}


	public String[] getAlunoTurma() {
		return alunoTurma;
	}


	public void setAlunoTurma(String[] alunoTurma) {
		this.alunoTurma = alunoTurma;
	}


	public int getQtdAlunoTurma() {
		return qtdAlunoTurma;
	}


	public void setQtdAlunoTurma(int qtdAlunoTurma) {
		this.qtdAlunoTurma = qtdAlunoTurma;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getProfessor() {
		return professor_ID;
	}
	public void setProfessor(int professor) {
		this.professor_ID = professor;
	}
	public int getCapacidadeDaTurma() {
		return capacidadeDaTurma;
	}
	public void setCapacidadeDaTurma(int capacidadeDaTurma) {
		this.capacidadeDaTurma = capacidadeDaTurma;
	} 
	
	
}
