/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Turma;
import Negocio.Fachada;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthur
 */



public class jofConsultaTurma extends javax.swing.JInternalFrame {

    /**
     * Creates new form jofConsultaTurma
     */
    
    Fachada fachada; 
    private DefaultTableModel dtmTurmas;
    
    public jofConsultaTurma(Fachada fachada, int TipodeTela) {
        initComponents();
        
        this.fachada = fachada;
        
        dtmTurmas = (DefaultTableModel) jtTurmas.getModel();
        
        for (Turma turma : fachada.retornaListaTurma()) {
            Object[] dados = {turma.getId(), turma.getNome(), turma.getProfessor() != -1 ? fachada.buscaProfessor(turma.getProfessor()).getNome() : " ", fachada.buscaDisciplina(turma.getDisciplina()).getNome(), turma.getCapacidadeDaTurma(), turma.getQtdAlunoTurma()};
            dtmTurmas.addRow(dados);
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
        jtTurmas = new javax.swing.JTable();
        jpConsultaTurma = new javax.swing.JPanel();
        jbExcluirTurma = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();
        jpAtualizaTyrma = new javax.swing.JPanel();

        setTitle("Consulta Turma");
        getContentPane().setLayout(null);

        jtTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Professor", "Disciplina", "Capacidade Turma", "Alunos na Turma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTurmas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 170, 690, 200);

        jbExcluirTurma.setText("Exclui Turma");
        jbExcluirTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirTurmaActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultaTurmaLayout = new javax.swing.GroupLayout(jpConsultaTurma);
        jpConsultaTurma.setLayout(jpConsultaTurmaLayout);
        jpConsultaTurmaLayout.setHorizontalGroup(
            jpConsultaTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaTurmaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jbExcluirTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jpConsultaTurmaLayout.setVerticalGroup(
            jpConsultaTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultaTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSair, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jbAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbExcluirTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jpConsultaTurma);
        jpConsultaTurma.setBounds(0, 110, 690, 50);

        javax.swing.GroupLayout jpAtualizaTyrmaLayout = new javax.swing.GroupLayout(jpAtualizaTyrma);
        jpAtualizaTyrma.setLayout(jpAtualizaTyrmaLayout);
        jpAtualizaTyrmaLayout.setHorizontalGroup(
            jpAtualizaTyrmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jpAtualizaTyrmaLayout.setVerticalGroup(
            jpAtualizaTyrmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jpAtualizaTyrma);
        jpAtualizaTyrma.setBounds(0, 0, 690, 100);

        setBounds(0, 0, 709, 408);
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirTurmaActionPerformed
        // TODO add your handling code here:
         
        if(jtTurmas.getSelectedRow() != -1){
            
                if(fachada.verificaTurmaExiste(jtTurmas.getValueAt(jtTurmas.getSelectedRow(), 1).toString())){
                fachada.removeTurma(jtTurmas.getValueAt(jtTurmas.getSelectedRow(), 1).toString());
                dtmTurmas.removeRow(jtTurmas.getSelectedRow());
                JOptionPane.showMessageDialog(rootPane, "Aluno Excluido com Sucesso!");
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Este Aluno não existe, favor atualizar a Tabela");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha");
        }

    }//GEN-LAST:event_jbExcluirTurmaActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:

        limpaTabela();
        for (Turma turma : fachada.retornaListaTurma()) {
            Object[] dados = {turma.getId(), turma.getNome(), turma.getProfessor() != -1 ? fachada.buscaProfessor(turma.getProfessor()).getNome() : " ", fachada.buscaDisciplina(turma.getDisciplina()).getNome(), turma.getCapacidadeDaTurma(), turma.getQtdAlunoTurma()};
            dtmTurmas.addRow(dados);
        }

    }//GEN-LAST:event_jbAtualizarActionPerformed
    
    
    public void limpaTabela(){
        
        if (dtmTurmas.getRowCount() > 0){
            for (int i=0;i<=dtmTurmas.getRowCount();i++){
                dtmTurmas.removeRow(0);
            }            
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbExcluirTurma;
    private javax.swing.JButton jbSair;
    private javax.swing.JPanel jpAtualizaTyrma;
    private javax.swing.JPanel jpConsultaTurma;
    private javax.swing.JTable jtTurmas;
    // End of variables declaration//GEN-END:variables
}