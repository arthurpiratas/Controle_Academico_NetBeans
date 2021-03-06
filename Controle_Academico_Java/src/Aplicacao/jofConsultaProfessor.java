/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Professor;
import Excecoes.ExcecaoNome;
import Excecoes.ExcecaoNomeUsuario;
import Negocio.Fachada;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthur
 */
public class jofConsultaProfessor extends javax.swing.JInternalFrame {

    /**
     * Creates new form jofConsultaProfessor
     */
    
    Fachada fachada;
    private DefaultTableModel dtmProfessor;
    private Professor professorAUX; 
    
    public jofConsultaProfessor(int tipoTela) {
        initComponents();
        
        this.fachada = Fachada.getInstance();
        dtmProfessor = (DefaultTableModel) jtprofessor.getModel();
        professorAUX = null;
        
        
        limpaTabela();
        
        for (Professor professor : fachada.retornaListaProfessor()) {
            Object[] dados = {professor.getId(), professor.getNome(), professor.getCargo(), professor.getDataDeNascimento(), professor.getNomeUsuario()};
            dtmProfessor.addRow(dados);
        }
        
        if(tipoTela == 1){
            jpAlteraProfessor.setVisible(false);
            jpAlteraProfessor.setVisible(false);
            this.title = "Consulta Professor";
        }else{
            jpConsultaProfessor.setEnabled(false);
            jpConsultaProfessor.setVisible(false);
            this.title = "Altera Professor";
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtprofessor = new javax.swing.JTable();
        jpConsultaProfessor = new javax.swing.JPanel();
        jbExcluirAluno = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();
        jpAlteraProfessor = new javax.swing.JPanel();
        jbAtualizar2 = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbAlterar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jbSair4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtNomeUsuario = new javax.swing.JTextField();
        jtSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jtDataNascimento = new javax.swing.JTextField();
        jtCargo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setTitle("Consulta Professor");
        getContentPane().setLayout(null);

        jtprofessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cargo", "Data de Nascimento", "Nome Usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtprofessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtprofessorMouseClicked(evt);
            }
        });
        jtprofessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtprofessorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtprofessor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 210, 620, 170);

        jpConsultaProfessor.setLayout(null);

        jbExcluirAluno.setText("Exclui Professor");
        jbExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirAlunoActionPerformed(evt);
            }
        });
        jpConsultaProfessor.add(jbExcluirAluno);
        jbExcluirAluno.setBounds(30, 10, 140, 30);

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jpConsultaProfessor.add(jbSair);
        jbSair.setBounds(388, 11, 140, 30);

        jbAtualizar.setText("Atualizar");
        jbAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });
        jpConsultaProfessor.add(jbAtualizar);
        jbAtualizar.setBounds(210, 10, 140, 30);

        getContentPane().add(jpConsultaProfessor);
        jpConsultaProfessor.setBounds(0, 140, 620, 50);

        jpAlteraProfessor.setLayout(null);

        jbAtualizar2.setText("Atualizar");
        jbAtualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizar2ActionPerformed(evt);
            }
        });
        jpAlteraProfessor.add(jbAtualizar2);
        jbAtualizar2.setBounds(510, 10, 100, 20);

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jpAlteraProfessor.add(jbLimpar);
        jbLimpar.setBounds(510, 100, 100, 20);

        jbAlterar1.setText("Alterar");
        jbAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterar1ActionPerformed(evt);
            }
        });
        jpAlteraProfessor.add(jbAlterar1);
        jbAlterar1.setBounds(510, 40, 100, 20);

        jLabel1.setText("Cargo");
        jpAlteraProfessor.add(jLabel1);
        jLabel1.setBounds(300, 60, 40, 14);

        jLabel2.setText("Nome Usuário");
        jpAlteraProfessor.add(jLabel2);
        jLabel2.setBounds(10, 100, 100, 20);
        jpAlteraProfessor.add(jtNome);
        jtNome.setBounds(90, 60, 120, 30);

        jbSair4.setText("Sair");
        jbSair4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSair4ActionPerformed(evt);
            }
        });
        jpAlteraProfessor.add(jbSair4);
        jbSair4.setBounds(510, 70, 100, 20);

        jLabel3.setText("Nome");
        jpAlteraProfessor.add(jLabel3);
        jLabel3.setBounds(10, 60, 50, 20);
        jpAlteraProfessor.add(jtNomeUsuario);
        jtNomeUsuario.setBounds(120, 100, 120, 30);
        jpAlteraProfessor.add(jtSenha);
        jtSenha.setBounds(340, 100, 130, 30);

        jLabel4.setText("Código");
        jpAlteraProfessor.add(jLabel4);
        jLabel4.setBounds(10, 20, 60, 14);

        jLabel5.setText("Data de Nascimento");
        jpAlteraProfessor.add(jLabel5);
        jLabel5.setBounds(230, 20, 120, 14);

        jtID.setEditable(false);
        jpAlteraProfessor.add(jtID);
        jtID.setBounds(90, 10, 120, 30);
        jpAlteraProfessor.add(jtDataNascimento);
        jtDataNascimento.setBounds(340, 10, 130, 30);
        jpAlteraProfessor.add(jtCargo);
        jtCargo.setBounds(340, 50, 130, 30);

        jLabel7.setText("Senha");
        jpAlteraProfessor.add(jLabel7);
        jLabel7.setBounds(270, 110, 60, 14);

        getContentPane().add(jpAlteraProfessor);
        jpAlteraProfessor.setBounds(0, 0, 620, 140);

        setBounds(0, 0, 636, 411);
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirAlunoActionPerformed
        // TODO add your handling code here:

        if(jtprofessor.getSelectedRow() != -1){

            if(fachada.verificaProfessorExiste(Integer.parseInt(jtprofessor.getValueAt(jtprofessor.getSelectedRow(), 0).toString()))){
                
                if(fachada.verificaProfessorPossuiTurma(Integer.parseInt(jtprofessor.getValueAt(jtprofessor.getSelectedRow(), 0).toString()))){
                    JOptionPane.showMessageDialog(rootPane, "Professor não pode ser Excluido, pois está vinculado a uma turma!");
                }else{
                fachada.removeProfessor(Integer.parseInt(jtprofessor.getValueAt(jtprofessor.getSelectedRow(), 0).toString()));
                dtmProfessor.removeRow(jtprofessor.getSelectedRow());
                JOptionPane.showMessageDialog(rootPane, "Professor Excluido com Sucesso!");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Este Professor não existe, favor atualizar a Tabela");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha");
        }

    }//GEN-LAST:event_jbExcluirAlunoActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:

        limpaTabela();
        for (Professor professor : fachada.retornaListaProfessor()) {
            Object[] dados = {professor.getId(), professor.getNome(), professor.getCargo(), professor.getDataDeNascimento(), professor.getNomeUsuario()};
            dtmProfessor.addRow(dados);
        }

    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbAtualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizar2ActionPerformed
        // TODO add your handling code here:
        limpaTabela();
        limpaCampos();
        professorAUX = null;
        for (Professor professor : fachada.retornaListaProfessor()) {
            Object[] dados = {professor.getId(), professor.getNome(), professor.getCargo(), professor.getDataDeNascimento(), professor.getNomeUsuario()};
            dtmProfessor.addRow(dados);
        }
        
    }//GEN-LAST:event_jbAtualizar2ActionPerformed
    
    
    private void limpaCampos(){
            professorAUX = null; 
            jtID.setText("");
            jtNome.setText("");
            jtDataNascimento.setText("");
            jtNomeUsuario.setText("");
            jtSenha.setText("");
            jtCargo.setText("");
    }
    
    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
            limpaCampos();
        
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterar1ActionPerformed
        // TODO add your handling code here:
        
        if(jtprofessor.getSelectedRow() != -1 && professorAUX != null ){
           
           professorAUX = new Professor(professorAUX.getId(), jtNome.getText(), jtCargo.getText(), null, jtNomeUsuario.getText(), jtSenha.getText());
            
            try {
                fachada.alteraProfessor(professorAUX);
                limpaTabela();
                limpaCampos();
                JOptionPane.showMessageDialog(rootPane, "Professor Alterado, favor Atualizar a Tabela!!!");
            } catch (ExcecaoNome ex) {
                Logger.getLogger(jofConsultaProfessor.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (ExcecaoNomeUsuario ex) {
                Logger.getLogger(jofConsultaProfessor.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha");
        }
        
    }//GEN-LAST:event_jbAlterar1ActionPerformed

    private void jbSair4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSair4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSair4ActionPerformed

    private void jtprofessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtprofessorMouseClicked
        // TODO add your handling code here:
        if(jtprofessor.getSelectedRow() != -1){
            professorAUX = fachada.buscaProfessor(Integer.parseInt(jtprofessor.getValueAt(jtprofessor.getSelectedRow(), 0).toString()));
            jtID.setText(String.valueOf(professorAUX.getId()));
            jtNome.setText(professorAUX.getNome());
            jtDataNascimento.setText("");
            jtNomeUsuario.setText(professorAUX.getNomeUsuario());
            jtSenha.setText(professorAUX.getSenha());
            jtCargo.setText(professorAUX.getCargo());
        }
    }//GEN-LAST:event_jtprofessorMouseClicked

    private void jtprofessorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtprofessorKeyReleased
        // TODO add your handling code here:
        if(jtprofessor.getSelectedRow() != -1){
            professorAUX = fachada.buscaProfessor(Integer.parseInt(jtprofessor.getValueAt(jtprofessor.getSelectedRow(), 0).toString()));
            jtID.setText(String.valueOf(professorAUX.getId()));
            jtNome.setText(professorAUX.getNome());
            jtDataNascimento.setText("");
            jtNomeUsuario.setText(professorAUX.getNomeUsuario());
            jtSenha.setText(professorAUX.getSenha());
            jtCargo.setText(professorAUX.getCargo());
        }
    }//GEN-LAST:event_jtprofessorKeyReleased

    private void limpaTabela(){
        
        if (dtmProfessor.getRowCount() >= 0){
            for (int i=dtmProfessor.getRowCount();i > 0;i--){
                dtmProfessor.removeRow(0);
            }            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbAtualizar2;
    private javax.swing.JButton jbExcluirAluno;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSair4;
    private javax.swing.JPanel jpAlteraProfessor;
    private javax.swing.JPanel jpConsultaProfessor;
    private javax.swing.JTextField jtCargo;
    private javax.swing.JTextField jtDataNascimento;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNomeUsuario;
    private javax.swing.JTextField jtSenha;
    private javax.swing.JTable jtprofessor;
    // End of variables declaration//GEN-END:variables
}
