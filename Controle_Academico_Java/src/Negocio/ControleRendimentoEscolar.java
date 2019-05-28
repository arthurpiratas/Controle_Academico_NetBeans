package Negocio;

import Basicas.Aluno;
import Basicas.Rendimento_Escolar;
import Basicas.Turma;
import Repositorio.IRepositorioRendimento_Escolar;
import Repositorio.RepositorioRendimentoEscolarArray;
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
        
        public void insereNotaAtividadeAluno(int idAluno, int idTurma, int atividade, float nota){
            
            Rendimento_Escolar rendimentoAluno = repRendimentoEscolar.buscaRendimento_Escolar(idAluno, idTurma); 
            float atividades[] = rendimentoAluno.getNotasTrabalhos();
            
            if(!(rendimentoAluno.getTrabalhos()[atividade].equals("Não Entregue"))){
                atividades[atividade] = nota;
                rendimentoAluno.setNotasTrabalhos(atividades);
                repRendimentoEscolar.alteraRendimento(rendimentoAluno);
            }
            
        }
        

}
