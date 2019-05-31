/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Administrador;
import Basicas.Aluno;
import Basicas.Disciplina;
import Basicas.Professor;
import Basicas.Rendimento_Escolar;
import Basicas.Turma;
import Excecoes.ExcecaoNota;
import Negocio.Fachada;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    
    Fachada fachada;  
    
    
    public TelaLogin() {
        fachada = Fachada.getInstance();
        
        if(!(fachada.verificaADMExise("pedro"))){
            Aluno aluno1 = new Aluno(12346, "Arthur", null, 2, "arthur1", "1234", "223456");
            Aluno aluno2 = new Aluno(12347, "Ana", null, 1, "ana1", "1234", "123456");
            Professor professor = new Professor(0, "joão", "Matemática", null, "joao1", "1234"); 
            Professor professor2 = new Professor(1, "Caio", "Geografia", null, "joao2", "1234");
            Administrador adm = new Administrador(0, "pedro", null, "pedro1", "1234");
            Disciplina disciplina = new Disciplina(0, "Português", "Nada");
            Disciplina disciplina2 = new Disciplina(1, "Inglês", "Sabe");
            Disciplina disciplina3 = new Disciplina(2, "Francês", "Três");
            Turma turma = new Turma(0, "TM01", 2, 0);
            Turma turma2 = new Turma(1, "TM02", 50, 1);
            Turma turma3 = new Turma(2, "TM03", 10, 2);
            Turma turma4 = new Turma(3, "TM04", 1, 2, 0);
            Turma turma5 = new Turma(4, "TM05", 0, 10, 0);
            Turma turma6 = new Turma(5, "TM06", 0, 50, 2);
            Turma turma7 = new Turma(6, "TM07", 1, 1, 1);
            Turma turma8 = new Turma(7, "TM08", 0, 25, 1);
            fachada.insereAluno(aluno1);
            fachada.insereAluno(aluno2);
            fachada.insereProfessor(professor);
            fachada.insereProfessor(professor2);
            fachada.insereADM(adm);
            fachada.insereDisciplina(disciplina);
            fachada.insereDisciplina(disciplina2);
            fachada.insereDisciplina(disciplina3);
            fachada.insereTurma(turma);
            fachada.insereTurma(turma2);
            fachada.insereTurma(turma3);
            fachada.insereTurma(turma4);
            fachada.insereTurma(turma5);
            fachada.insereTurma(turma6);
            fachada.insereTurma(turma7);
            fachada.insereTurma(turma8);
            fachada.insereAlunoEmTurma(turma7, aluno1);
            fachada.insereAlunoEmTurma(turma5, aluno1);
            fachada.insereAlunoEmTurma(turma4, aluno1);
            fachada.insereAlunoEmTurma(turma6, aluno2);
            fachada.insereAlunoEmTurma(turma5, aluno2);
            fachada.insereAlunoEmTurma(turma4, aluno2);
            Rendimento_Escolar rend1 = new Rendimento_Escolar(turma7.getId(), aluno1.getId()); 
            Rendimento_Escolar rend2 = new Rendimento_Escolar(turma5.getId(), aluno1.getId());
            Rendimento_Escolar rend3 = new Rendimento_Escolar(turma4.getId(), aluno1.getId());
            Rendimento_Escolar rend4 = new Rendimento_Escolar(turma6.getId(), aluno2.getId());
            Rendimento_Escolar rend5 = new Rendimento_Escolar(turma5.getId(), aluno2.getId());
            Rendimento_Escolar rend6 = new Rendimento_Escolar(turma4.getId(), aluno2.getId());
            fachada.insereRendimentoEscola(rend1);
            fachada.insereRendimentoEscola(rend2);
            fachada.insereRendimentoEscola(rend3);
            fachada.insereRendimentoEscola(rend4);
            fachada.insereRendimentoEscola(rend5);
            fachada.insereRendimentoEscola(rend6);
            fachada.insereAtividadeAluno(aluno1.getId(), turma5.getId(), 2, "Fiz nada");
            try {
                fachada.insereNotaAtividadeAluno(aluno1.getId(), turma5.getId(), 2, 10.0f);
            } catch (ExcecaoNota ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            try {
                rend3.setNota2(10.0f);
            } catch (ExcecaoNota ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            fachada.alteraRendimentoEscolar(rend3);
            
        }
         
         /*fachada.listaDisciplina();
         fachada.listaADM();   
         fachada.listaProfessor();
         fachada.listaAlunos();
         fachada.listaTurma();*/
        initComponents();
        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btTipoUsuario = new javax.swing.ButtonGroup();
        jtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jrAluno = new javax.swing.JRadioButton();
        jrProfessor = new javax.swing.JRadioButton();
        jrAdministrador = new javax.swing.JRadioButton();
        jbEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jpSenha = new javax.swing.JPasswordField();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jtUsuario);
        jtUsuario.setBounds(70, 40, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 40, 50, 30);

        btTipoUsuario.add(jrAluno);
        jrAluno.setText("Aluno");
        getContentPane().add(jrAluno);
        jrAluno.setBounds(60, 90, 53, 23);

        btTipoUsuario.add(jrProfessor);
        jrProfessor.setText("Professor");
        getContentPane().add(jrProfessor);
        jrProfessor.setBounds(190, 90, 90, 23);

        btTipoUsuario.add(jrAdministrador);
        jrAdministrador.setText("Administrador");
        getContentPane().add(jrAdministrador);
        jrAdministrador.setBounds(320, 90, 100, 23);

        jbEntrar.setText("Entrar");
        jbEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEntrarMouseClicked(evt);
            }
        });
        getContentPane().add(jbEntrar);
        jbEntrar.setBounds(480, 30, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Senha");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 40, 50, 30);
        getContentPane().add(jpSenha);
        jpSenha.setBounds(300, 40, 140, 30);

        jbSair.setText("Sair");
        jbSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSairMouseClicked(evt);
            }
        });
        getContentPane().add(jbSair);
        jbSair.setBounds(480, 80, 90, 30);

        setSize(new java.awt.Dimension(622, 178));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEntrarMouseClicked
        // TODO add your handling code here:
        
        String login = new String();
        String senha = new String();
        login = jtUsuario.getText();
        senha = jpSenha.getText();
        
        if(jrAluno.isSelected()){            
            
            
            Aluno aluno ; /*= new Aluno(2, "arthur", null,2, jtUsuario.getText(), jpSenha.getText(), "aaaa1234");*/
            
            
            if(fachada.verificaLoginAlunoExiste(login)){
                if(fachada.verificaLoginAluno(login, senha)){
                    aluno = fachada.retornaAlunoLogado(login, senha);
                    
                    JOptionPane.showMessageDialog(rootPane, "Aluno: " + aluno.getNome() + " logado");
                    TelaPrincipalAluno telaAluno = new TelaPrincipalAluno(aluno);
                    
                    telaAluno.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Senha inválidos");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Login não existe");
            }
            
            
            
           
            
        }else if(jrProfessor.isSelected()){
                     
            
            if(fachada.verificaLoginProfessorExiste(login)){
                if(fachada.verificaLoginProfessor(login, senha)){
                    Professor professor1 = fachada.retornaProfessorLogado(login, senha); 
                    TelaPrincipalProfessor telaProfessor = new TelaPrincipalProfessor(professor1);
                    telaProfessor.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Senha inválidos");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Login não existe");
            }
            
            
            
        }else if(jrAdministrador.isSelected()){
            
            
            
            if(fachada.verificaLoginAdmExiste(login)){
                if(fachada.verificaLoginAdm(login, senha)){
                   Administrador admin = fachada.buscaADMLogin(login, senha);
                   TelaPrincipalAdm telaAdm = new TelaPrincipalAdm(admin);
                   telaAdm.setVisible(true);
                   this.dispose();
                }else{
                   JOptionPane.showMessageDialog(rootPane, "Senha inválidos");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Login não existe");
            }
            
            
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione a Opção de Usuário");
        }
    }//GEN-LAST:event_jbEntrarMouseClicked

    private void jbSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSairMouseClicked
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_jbSairMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JButton jbSair;
    private javax.swing.JPasswordField jpSenha;
    private javax.swing.JRadioButton jrAdministrador;
    private javax.swing.JRadioButton jrAluno;
    private javax.swing.JRadioButton jrProfessor;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
}
