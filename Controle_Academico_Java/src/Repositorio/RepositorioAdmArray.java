package Repositorio;

import java.util.ArrayList;

import Basicas.Administrador;


public class RepositorioAdmArray implements IRepositorioAdm{
	
	private Administrador listaADM[]; 
	private int index; 
	public final static int tamanhoMaxADM = 10; 
	
	public RepositorioAdmArray() {
		this.listaADM = new Administrador[tamanhoMaxADM]; 
		this.index = 0;
	}
	
	public Administrador[] getListaAdm() {
		return this.listaADM; 
	}

	@Override
	public void insereADM(Administrador adm) {
		// TODO Auto-generated method stub
		
		this.listaADM[index] = adm;
		this.index += 1; 
		
	}

	@Override
	public void alteraADM(Administrador adm) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaADM[i].getId() == adm.getId()) {
				listaADM[i] = adm;
			}
		}
		
	}

	@Override
	public void removeADM(int id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaADM[i].getId() == id) {
				
				this.listaADM[i] = listaADM[index-1]; 
				this.index -= 1;
				
			}	
		}
	}

	@Override
	public Administrador buscaADM(String nome) {
		// TODO Auto-generated method stub
		
		Administrador adm = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaADM[i].getNome().equals(nome)) {
				adm = listaADM[i]; 
			}
		}
		
		return adm;
	}

	@Override
	public boolean verificaADMExise(String nome) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if (listaADM[i].getNome().equals(nome)) {
				return true; 
			}
		} 
		
		return false;
	}

	@Override
	public void listaADM() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			System.out.println("Nome: " + listaADM[i].getNome());
		}
		
	}

	@Override
	public boolean verifiaADMLogin(String login) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaADM[i].getNomeUsuario().equals(login)) {
				return true; 
			}
		}
		
		return false;
	}

	@Override
	public Administrador buscaADMLogin(String login) {
		// TODO Auto-generated method stub
		
		Administrador adm = null; 
		
		for (int i = 0; i < this.index; i++) {
			if(listaADM[i].getNomeUsuario().equals(login)) {
				adm = listaADM[i]; 
			}
		}
		
		
		return adm;
	}

	@Override
	public ArrayList<Administrador> retornaListaAdm() {
		// TODO Auto-generated method stub
		
		ArrayList<Administrador> listaADM = new ArrayList<Administrador>(); 
		
		for (int i = 0; i < index; i++) {
			listaADM.add(this.listaADM[i]); 
		}
		
		return listaADM;
	}

	@Override
	public int retornaProximoID() {
		// TODO Auto-generated method stub
		
		int cont = 0; 
		
		for (int i = 0; i < index; i++) {
			
			if(cont <=  listaADM[i].getId()) {
				cont =  (listaADM[i].getId() + 1 );
			}
			 
		}
		
		return cont; 
	}
		
	

}
