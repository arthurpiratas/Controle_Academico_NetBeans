package Basicas;

public class Disciplina {
	
	private int codigo; 
	private String nome; 
	private String ementa;
	
	
	public Disciplina(int codigo, String nome, String ementa) {

		this.codigo = codigo;
		this.nome = nome;
		this.ementa = ementa;
	}
	
	public int getcodigo() {
		return codigo;
	}
	public void setcodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	} 
	
	
}
