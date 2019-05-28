package Basicas;

public class Rendimento_Escolar {
	
	private int turmaID; 
	private int alunoID; 
	private float nota1; 
	private float nota2; 
	private String trabalhos[]; 
	private float notasTrabalhos[];
        private float media;
        private String status;
	
	
	public Rendimento_Escolar(int turma, int aluno, int nota1, int nota2) {
		 
		this.turmaID = turma;
		this.alunoID = aluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.trabalhos = new String[4];
		
		for (int i = 0; i < trabalhos.length; i++) {
			this.trabalhos[i] = ""; 
		}
		
		this.notasTrabalhos = new float[4];
		
		for (int i = 0; i < notasTrabalhos.length; i++) {
			this.notasTrabalhos[i] = 0.0f;
		}
		
	}
	
	public Rendimento_Escolar(int turma, int aluno) {
		 
		this.turmaID = turma;
		this.alunoID = aluno;
		this.nota1 = 0.0f;
		this.nota2 = 0.0f;
                this.media = 0.0f;
                this.status = "Matriculado";
		this.trabalhos = new String[4];
		
		for (int i = 0; i < trabalhos.length; i++) {
			this.trabalhos[i] = "Não Entregue"; 
		}
		
		this.notasTrabalhos = new float[4];
		
		for (int i = 0; i < notasTrabalhos.length; i++) {
			this.notasTrabalhos[i] = 0.0f;
		}
		
	}

	
	public int getTurma() {
		return turmaID;
	}

	public void setTurma(int turma) {
		this.turmaID = turma;
	}

	public int getAluno() {
		return alunoID;
	}

	public void setAluno(int aluno) {
		this.alunoID = aluno;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
        
        public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
        
        public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
