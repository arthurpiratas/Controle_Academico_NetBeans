package Basicas;

public class Rendimento_Escolar {
	
	private Turma turma; 
	private Aluno aluno; 
	private int nota1; 
	private int nota2; 
	private String trabalhos[]; 
	private float notasTrabalhos[];
	
	
	public Rendimento_Escolar(Turma turma, Aluno aluno, int nota1, int nota2) {
		 
		this.turma = turma;
		this.aluno = aluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.trabalhos = new String[4];
		
		for (int i = 0; i < trabalhos.length; i++) {
			this.trabalhos[i] = " "; 
		}
		
		this.notasTrabalhos = new float[4];
		
		for (int i = 0; i < notasTrabalhos.length; i++) {
			this.notasTrabalhos[i] = 0.0f;
		}
		
	}
	
	public Rendimento_Escolar(Turma turma, Aluno aluno) {
		 
		this.turma = turma;
		this.aluno = aluno;
		this.nota1 = 0;
		this.nota2 = 0;
		this.trabalhos = new String[4];
		
		for (int i = 0; i < trabalhos.length; i++) {
			this.trabalhos[i] = " "; 
		}
		
		this.notasTrabalhos = new float[4];
		
		for (int i = 0; i < notasTrabalhos.length; i++) {
			this.notasTrabalhos[i] = 0.0f;
		}
		
	}

	public Rendimento_Escolar(Turma turma, Aluno aluno, int nota1, int nota2, String[] trabalhos,
			float[] notasTrabalhos) {
		 
		this.turma = turma;
		this.aluno = aluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.trabalhos = trabalhos;
		this.notasTrabalhos = notasTrabalhos;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public String[] getTrabalhos() {
		return trabalhos;
	}

	public void setTrabalhos(String[] trabalhos) {
		this.trabalhos = trabalhos;
	}

	public float[] getNotasTrabalhos() {
		return notasTrabalhos;
	}

	public void setNotasTrabalhos(float[] notasTrabalhos) {
		this.notasTrabalhos = notasTrabalhos;
	}
	
	
	
}
