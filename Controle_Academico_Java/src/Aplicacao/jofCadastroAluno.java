/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Aluno;
import Negocio.Fachada;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class jofCadastroAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form jofCadastroAluno
     */
    
    Aluno aluno;
    Fachada fachada; 
    
    public jofCadastroAluno(Fachada fachada) {
        this.fachada = fachada; 
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

        jtNome = new javax.swing.JTextField();
        jtPeriodo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfData = new javax.swing.JFormattedTextField();
        jbNovo = new javax.swing.JButton();
        jbCriar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jtSenha = new javax.swing.JTextField();

        setTitle("Cadastro Aluno");
        getContentPane().setLayout(null);
        getContentPane().add(jtNome);
        jtNome.setBounds(80, 10, 140, 30);
        getContentPane().add(jtPeriodo);
        jtPeriodo.setBounds(80, 50, 140, 30);

        jLabel1.setText("Senha");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 170, 80, 20);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 80, 20);

        jLabel3.setText("Periodo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 80, 20);

        jtfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(jtfData);
        jtfData.setBounds(80, 90, 140, 30);

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo);
        jbNovo.setBounds(20, 220, 90, 30);

        jbCriar.setText("Criar");
        jbCriar.setEnabled(false);
        jbCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCriar);
        jbCriar.setBounds(130, 220, 90, 30);

        jbLimpar.setText("Limpar");
        jbLimpar.setEnabled(false);
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpar);
        jbLimpar.setBounds(20, 270, 90, 30);

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jbFechar);
        jbFechar.setBounds(130, 270, 90, 30);

        jLabel4.setText("Data");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 90, 80, 20);

        jLabel5.setText("Usuário");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 130, 80, 20);
        getContentPane().add(jtUsuario);
        jtUsuario.setBounds(80, 130, 140, 30);
        getContentPane().add(jtSenha);
        jtSenha.setBounds(80, 170, 140, 30);

        setBounds(0, 0, 257, 341);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        String nome = new String();
        int periodo;
        String usuario = new String();
        String senha = new String();
        
        
        
        try{
          periodo = Integer.parseInt(jtPeriodo.getText());
          nome = jtNome.getText();
          usuario = jtUsuario.getText();
          senha = jtSenha.getText();
          if(!(fachada.verificaAlunoExisteNome(nome)) && !(fachada.verificaLoginAlunoExiste(usuario))){
              if(senha.length() > 0){
                  aluno = new Aluno(fachada.retornaProximoIDAluno(), nome, null, periodo, usuario, senha, fachada.retornaMatricula(String.valueOf(periodo)));
                  jbCriar.setEnabled(true);
                  jbLimpar.setEnabled(true);
              }else{
                  JOptionPane.showMessageDialog(rootPane, "Senha Não pode ser vazia");
              }
          }else{
              JOptionPane.showMessageDialog(rootPane, "Nome ou Login Já cadastrados");
          }
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(rootPane, "Erro " + e);
        }
        
        
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarActionPerformed
        // TODO add your handling code here:
        fachada.insereAluno(aluno);
        JOptionPane.showMessageDialog(rootPane, "Aluno Cadastrado, sua matricula é: " + aluno.getMatricula());
        aluno = null; 
        jtNome.setText("");
        jtPeriodo.setText("");
        jtSenha.setText("");
        jtUsuario.setText("");
        jtfData.setText("");
        jbCriar.setEnabled(false);
        jbLimpar.setEnabled(false);
    }//GEN-LAST:event_jbCriarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        aluno = null;
        jtNome.setText("");
        jtPeriodo.setText("");
        jtSenha.setText("");
        jtUsuario.setText("");
        jtfData.setText("");
        jbCriar.setEnabled(false);
        jbLimpar.setEnabled(false);
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbCriar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPeriodo;
    private javax.swing.JTextField jtSenha;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JFormattedTextField jtfData;
    // End of variables declaration//GEN-END:variables
}
