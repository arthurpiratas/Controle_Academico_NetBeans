package Repositorio;

import java.util.ArrayList;

import Basicas.Administrador;;

public interface IRepositorioAdm {

	public void insereADM(Administrador adm); 
	public void alteraADM(Administrador adm); 
	public void removeADM(int id); 
	public Administrador buscaADM(String nome); 
	public boolean verificaADMExise(String nome); 
	public void listaADM(); 
	public boolean verifiaADMLogin(String login); 
	public Administrador buscaADMLogin(String login);
	public ArrayList<Administrador> retornaListaAdm();
	public int retornaProximoID();
	
}
