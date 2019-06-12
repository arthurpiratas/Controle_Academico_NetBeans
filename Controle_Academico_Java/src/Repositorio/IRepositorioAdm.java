package Repositorio;

import java.util.ArrayList;

import Basicas.Administrador;import Excecoes.ExcecaoNome;
import Excecoes.ExcecaoNomeUsuario;
;

public interface IRepositorioAdm {

	public void insereADM(Administrador adm) throws ExcecaoNome, ExcecaoNomeUsuario;
	public void alteraADM(Administrador adm) throws ExcecaoNome, ExcecaoNomeUsuario;
	public void removeADM(int id); 
	public Administrador buscaADM(String nome); 
	public boolean verificaADMExise(String nome); 
	public void listaADM(); 
	public boolean verifiaADMLogin(String login); 
	public Administrador buscaADMLogin(String login);
	public ArrayList<Administrador> retornaListaAdm();
	public int retornaProximoID();
	
}
