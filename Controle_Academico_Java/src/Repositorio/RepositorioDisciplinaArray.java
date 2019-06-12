package Repositorio;

import java.util.ArrayList;

import Basicas.Disciplina;
import Excecoes.ExcecaoNome;

public class RepositorioDisciplinaArray implements IRepositorioDisciplina{
	
	private int index;
	public final static int tamanhoMaxDisciplina = 500; 
	private Disciplina listaDisciplina[]; 
	
	public RepositorioDisciplinaArray() {
		// TODO Auto-generated constructor stub
		 
		this.index = 0; 
		this.listaDisciplina = new Disciplina[tamanhoMaxDisciplina];
		
	}

	@Override
	public void insereDisciplina(Disciplina disciplina) throws ExcecaoNome{
		// TODO Auto-generated method stub
		
                if(verificaDisciplinaExise(disciplina.getNome())){
                    throw new ExcecaoNome();
                }else{
                    this.listaDisciplina[index] = disciplina; 
                    this.index += 1; 
                }
                
		
		
	}

	@Override
	public void alteraDisciplina(Disciplina disciplina) throws ExcecaoNome{
		// TODO Auto-generated method stub
		          
                for (int i = index-1; i >= 0; i--) {                    
			if(listaDisciplina[i].getcodigo() == disciplina.getcodigo()) {                         
                            if(listaDisciplina[i].getNome().equals(disciplina.getNome()) || (!verificaDisciplinaExise(disciplina.getNome()))){
                                listaDisciplina[i] = disciplina; 
                            }else{
                               throw new ExcecaoNome();  
                                
                            }
                            break;
			}
		}
		
	}

	@Override
	public void removeDisciplina(int codigo) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaDisciplina[i].getcodigo() == codigo) {
					
				listaDisciplina[i] = listaDisciplina[index-1];
				index -= 1;
				
				 
			}
		}
		
		
	}
        
        @Override
	public Disciplina buscaDisciplina(String  nome) {
		// TODO Auto-generated method stub
		
		Disciplina disciplina = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaDisciplina[i].getNome().equals(nome)) {
				disciplina =  listaDisciplina[i];
				
			}
		}
		
		return disciplina;
	}
        

	@Override
	public Disciplina buscaDisciplina(int  codigo) {
		// TODO Auto-generated method stub
		
		Disciplina disciplina = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaDisciplina[i].getcodigo() == codigo) {
				disciplina =  listaDisciplina[i];
				
			}
		}
		
		return disciplina;
	}

	@Override
	public boolean verificaDisciplinaExise(String nome) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < index; i++) {
			if(listaDisciplina[i].getNome().equals(nome)) {
				return true; 
				
			}
		}
		
		return false;
	}

	@Override
	public void listaDisciplinas() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			System.out.println("Codigo: " + listaDisciplina[i].getcodigo() + " Nome: " + listaDisciplina[i].getNome() + " Ementa: " + listaDisciplina[i].getEmenta());
		}
		
	}

	@Override
	public ArrayList<Disciplina> retornaListaDisciplina() {
		// TODO Auto-generated method stub
		
		ArrayList<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
		
		for (int i = 0; i < index; i++) {
              
		listaDisciplina.add(this.listaDisciplina[i]); 
		}
		
		return listaDisciplina;
	}

	@Override
	public int retornaProximoID() {
		// TODO Auto-generated method stub
		int cont = 0; 
		
		for (int i = 0; i < index; i++) {
			
			if(cont <=  listaDisciplina[i].getcodigo()) {
				cont =  (listaDisciplina[i].getcodigo() + 1);
			}
			 
		}
		
		return cont; 
	}

    

}
