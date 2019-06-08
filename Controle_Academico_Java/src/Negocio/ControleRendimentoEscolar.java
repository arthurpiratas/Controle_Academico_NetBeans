package Negocio;

import Basicas.Aluno;
import Basicas.Rendimento_Escolar;
import Basicas.Turma;
import Excecoes.ExcecaoAtividade;
import Excecoes.ExcecaoNota;
import Repositorio.IRepositorioRendimento_Escolar;
import Repositorio.RepositorioRendimentoEscolarArray;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class ControleRendimentoEscolar {
	
	IRepositorioRendimento_Escolar repRendimentoEscolar = new RepositorioRendimentoEscolarArray(); 
	
	public void insereRendimentoEscola(Rendimento_Escolar rendimentoEscolar) {
		repRendimentoEscolar.insereRendimento(rendimentoEscolar);
	}
	
	public void alteraRendimentoEscolar(Rendimento_Escolar rendimentoEscolar) {
		repRendimentoEscolar.alteraRendimento(rendimentoEscolar);
	}
	
	public void removeRendimentoEscolar(int aluno, int turma) {
		repRendimentoEscolar.removeRendimento(aluno, turma);
	}
	
	public Rendimento_Escolar buscaRendimentoEscolar(int aluno, int turma) {
		return repRendimentoEscolar.buscaRendimento_Escolar(aluno, turma);
	}
	
	public boolean verificaRendimentoEscolaExiste(int aluno, int turma) {
		return repRendimentoEscolar.verificaRendimento_Escolar(aluno, turma); 
	}
	
	public void listaRendimentoEscolarAluno(int aluno) {
		repRendimentoEscolar.listaRendimento_EscolarAluno(aluno);
	}
	
	public void listaRendimentoEscolarTurma(int turma) {
		repRendimentoEscolar.listaRendimento_EscolarTurma(turma);
	}
	
	public boolean verificaRendimentoEscolarPossuiAluno(int aluno) {
		return repRendimentoEscolar.verificaRendimentoEscolarPossuiAluno(aluno); 
	}
	
	public boolean verificaRendimentoEscolarPossuiTurma(int turma) {
		return repRendimentoEscolar.verificaRendimentoEscolarPossuiTurma(turma);
	}
        
        public ArrayList<Rendimento_Escolar> retornaListaRendimentoTurma(int turma){
                return repRendimentoEscolar.retornaListaRendimentoTurma(turma);
        }
        public ArrayList<Rendimento_Escolar> retornaListaRendimentoAluno(int aluno){
            return repRendimentoEscolar.retornaListaRendimentoAluno(aluno); 
        }
        
        public void insereAtividadeAluno(int idAluno, int idTurma, int atividade, String atividadeTxt){
            
            Rendimento_Escolar rendimentoAluno = repRendimentoEscolar.buscaRendimento_Escolar(idAluno, idTurma); 
            String[] atividades = rendimentoAluno.getTrabalhos();
            
            
            if(rendimentoAluno.getTrabalhos()[atividade].equals("Não Entregue")){
                atividades[atividade] = atividadeTxt;
                rendimentoAluno.setTrabalhos(atividades);
                repRendimentoEscolar.alteraRendimento(rendimentoAluno);
            }
            
        }
        
        public void insereNotaAtividadeAluno(int idAluno, int idTurma, int atividade, float nota) throws ExcecaoNota, ExcecaoAtividade{
            
            Rendimento_Escolar rendimentoAluno = repRendimentoEscolar.buscaRendimento_Escolar(idAluno, idTurma); 
            float atividades[] = rendimentoAluno.getNotasTrabalhos();
            
            if(!(rendimentoAluno.getTrabalhos()[atividade].equals("Não Entregue"))){
                if(nota < 0 || nota >10){
                    throw new ExcecaoNota();
                }else{
                    atividades[atividade] = nota;
                    rendimentoAluno.setNotasTrabalhos(atividades);
                    repRendimentoEscolar.alteraRendimento(rendimentoAluno);
                }
                
            }else{
                throw new ExcecaoAtividade();
            }
            
        }
        
        public int retornaQtdAlunosAprovados(int idTurma){
            
            int cont = 0;
            
            
            
            for (Rendimento_Escolar renEsc : repRendimentoEscolar.retornaListaRendimentoTurma(idTurma)) {
                if(renEsc.getMedia() >= 7){
                    cont++;
                }
                
            }
            
            return cont; 
        }
        
        public float retornaPercentualAlunosAprovados(int idTurma){
            
            int qtdAlunosAprovados = retornaQtdAlunosAprovados(idTurma);
            int qtdAlunosTurma = repRendimentoEscolar.retornaListaRendimentoTurma(idTurma).size();
            float total; 
            
            
            
            total = ((float)(qtdAlunosAprovados*100)/qtdAlunosTurma);
            NumberFormat formatter = new DecimalFormat("0.0");
            total = Float.parseFloat(formatter.format(total));
            
            return total; 
        }
        
        public float retornaPercentualAlunosFinal(int idTurma){
            
            int qtdAlunosFinal = retornaQtdAlunosFinal(idTurma);
            int qtdAlunosTurma = repRendimentoEscolar.retornaListaRendimentoTurma(idTurma).size();
            float total; 
            
             
            
            total = ((float)(qtdAlunosFinal*100)/qtdAlunosTurma);
            NumberFormat formatter = new DecimalFormat("0.0");
            total = Float.parseFloat(formatter.format(total));
            
            return total; 
        }
        
        public float retornaPercentualAlunosReprovado(int idTurma){
            
            int qtdAlunosReprovado = retornaQtdAlunosReprovados(idTurma);
            int qtdAlunosTurma = repRendimentoEscolar.retornaListaRendimentoTurma(idTurma).size();
            float total; 
            
             
            
            total = ((float)(qtdAlunosReprovado*100)/qtdAlunosTurma);
            NumberFormat formatter = new DecimalFormat("0.0");
            total = Float.parseFloat(formatter.format(total));
            
            return total; 
        }
        
        public int retornaQtdAlunosFinal(int idTurma){
            
            int cont = 0;
            
            
            
            for (Rendimento_Escolar renEsc : repRendimentoEscolar.retornaListaRendimentoTurma(idTurma)) {
                if(renEsc.getMedia() >= 3  &&  renEsc.getMedia() < 7){
                    cont++;
                }
                
            }
            
            return cont; 
        }
        
         public int retornaQtdAlunosReprovados(int idTurma){
            
            int cont = 0;
            
            
            
            for (Rendimento_Escolar renEsc : repRendimentoEscolar.retornaListaRendimentoTurma(idTurma)) {
                if(renEsc.getMedia() < 3){
                    cont++;
                }
                
            }
            
            return cont; 
        }
         
        public String retornaSituacaoAluno(int idTurma, int IdAluno){
            
            String estdo = new String();
            
            for (Rendimento_Escolar renEsc : repRendimentoEscolar.retornaListaRendimentoTurma(idTurma)) {
                if(renEsc.getAluno() == IdAluno){
                   if(renEsc.getMedia() >= 7){
                       return "Aprovado";
                   }else if(renEsc.getMedia() >= 3 && renEsc.getMedia() < 7){
                       return "Final"; 
                   }else{
                       return "Reprovado";
                   }
                }
                
            }
            
            return estdo; 
        }
        
        public void calculaMediaAluno(int idTurma, int IdAluno){
            
            for (Rendimento_Escolar renEsc : repRendimentoEscolar.retornaListaRendimentoTurma(idTurma)) {
                if(renEsc.getAluno() == IdAluno){
                    float nota1; 
                    float nota2;
                    float media;
                    
                    
                        
                    
                    nota1 = (((renEsc.getNotasTrabalhos()[0] + renEsc.getNotasTrabalhos()[1])/2)*0.1f) + ((renEsc.getNota1()));
                    nota2 = (((renEsc.getNotasTrabalhos()[2] + renEsc.getNotasTrabalhos()[3])/2)*0.1f) + ((renEsc.getNota2()));
                    
                    if(nota1 >= 10){
                        nota1 = 10.0f;
                    }
                    if(nota2 >= 10){
                        nota2 = 10.0f;
                    }
                    
                    NumberFormat formatter = new DecimalFormat("0.0");
                    
                    media = ((nota1+nota2)/2); 
                    
                    media = Float.parseFloat(formatter.format(media));
                    
                    renEsc.setMedia(media);
                    repRendimentoEscolar.alteraRendimento(renEsc);
                }
                
            }
        }
        

}
