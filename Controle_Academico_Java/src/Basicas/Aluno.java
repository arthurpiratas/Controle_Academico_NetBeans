package Basicas;

import java.util.Date;

public class Aluno extends Usuario{
	
	private int id; 
	private String matricula; 
	private String nome; 
	private Date dataDeNascimento; 
	private int perido; 
	
	
	
	public Aluno(int id, String nome, Date dataDeNascimento, int perido, String nomeUsuario, String senha, String matricula) {
		
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.perido = perido;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.matricula = matricula; 
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public int getPerido() {
		return perido;
	}
	public void setPerido(int perido) {
		this.perido = perido;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	} 
	
	
	
}
