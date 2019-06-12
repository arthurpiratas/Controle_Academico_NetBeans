package Negocio;

import java.util.ArrayList;

import Basicas.Administrador;
import Excecoes.ExcecaoLogin;
import Excecoes.ExcecaoLoginNome;
import Excecoes.ExcecaoNome;
import Excecoes.ExcecaoNomeUsuario;
import Repositorio.IRepositorioAdm;
import Repositorio.RepositorioAdmArray;

public class ControleADM {
	
	IRepositorioAdm repAdm = new RepositorioAdmArray();
	
	public void insereADM(Administrador adm) throws ExcecaoNome, ExcecaoNomeUsuario {
		repAdm.insereADM(adm);
	}
	
	public void alteraADM(Administrador adm) throws ExcecaoNome, ExcecaoNomeUsuario {
		repAdm.alteraADM(adm);
	}
	
	public void removeADM(int id) {
		repAdm.removeADM(id);
	}
	
	public Administrador buscaADM(String nome) {
		return repAdm.buscaADM(nome);
	}
	
	public boolean verificaADMExise(String nome) {
		return repAdm.verificaADMExise(nome);
	}
	
	public void listaADM() {
		repAdm.listaADM();
	}
	
	public boolean verificaLoginExiste(String login) {
		return repAdm.verifiaADMLogin(login);
		
	}
	
	public boolean verificaLoginAdm(String login, String senha) {
		
		if(repAdm.verifiaADMLogin(login)) {
			Administrador adm = repAdm.buscaADMLogin(login); 
			if(adm.getSenha().equals(senha)) {
				return true; 
			}
		}
		
		return false; 
	}
	
	public Administrador buscaADMLogin(String login, String senha) throws ExcecaoLoginNome, ExcecaoLogin  {
		Administrador adm = null;
		
		if (verificaLoginAdm(login, senha)) {
			adm = repAdm.buscaADMLogin(login);
		}else if(verificaLoginExiste(login)){
                    throw new ExcecaoLogin();
                }else{
                    throw new ExcecaoLoginNome();
                }
		
		return adm; 
	}
	
	public ArrayList<Administrador> retornaListaAdm(){
		return repAdm.retornaListaAdm();
	}
	
	public int retornaProximoIdADM() {
		return repAdm.retornaProximoID();
	}

}
