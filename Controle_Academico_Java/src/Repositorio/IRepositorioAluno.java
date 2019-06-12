package Repositorio;
import java.util.ArrayList;

import Basicas.Aluno;
import Excecoes.ExcecaoNome;
import Excecoes.ExcecaoNomeUsuario;

public interface IRepositorioAluno {
	
	public void insereAluno(Aluno aluno) throws ExcecaoNome, ExcecaoNomeUsuario; 
	public void alteraAluno(Aluno aluno) throws ExcecaoNome, ExcecaoNomeUsuario;
	public void removeAluno(String matricula); 
	public Aluno buscaAluno(String matricula); 
	public boolean verificaAlunoExise(String matricula); 
	public void listaAluno(); 
	public ArrayList<Aluno> retornaListaAluno(); 
	public boolean verifiaAlunoLogin(String login); 
	public Aluno buscaAlunoLogin(String login);
	public int retornaProximoID();
	public String retornaMatricula(String periodo);
        public boolean verificaAlunoExisteNome(String nome);
        public Aluno buscaAluno(int idAluno);
	
}
