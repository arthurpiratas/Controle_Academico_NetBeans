package Basicas;

import java.util.Date;

public class Professor extends Usuario{
	
	private int id; 
	private String nome; 
	private String cargo; 
	private Date dataDeNascimento; 
	
	
	public Professor(int id, String nome, String cargo, Date dataDeNascimento, String nomeUsuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.dataDeNascimento = dataDeNascimento;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
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
