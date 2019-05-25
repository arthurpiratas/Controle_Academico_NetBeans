/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Administrador;
import Negocio.Fachada;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthur
 */
public class jofConsultaAMD extends javax.swing.JInternalFrame {

    /**
     * Creates new form jofConsultaAMD
     */
    
    Fachada fachada; 
    private DefaultTableModel dtmADM;
    
    public jofConsultaAMD(Fachada fachada, int tipoDeTela) {
        initComponents();
        this.fachada = fachada; 
        dtmADM = (DefaultTableModel) jtADM.getModel();
        
        for (Administrador adm : fachada.retornaListaAdm()) {
            Object[] dados = {adm.getId(), adm.getNome(), adm.getDataDeNascimento(), adm.getNomeUsuario()};
            dtmADM.addRow(dados);
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

        jpTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtADM = new javax.swing.JTable();
        jpConsultaADM = new javax.swing.JPanel();
        jbExcluirADM = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();
        jpAlteraADM = new javax.swing.JPanel();

        setTitle("Consulta Administrador");
        getContentPane().setLayout(null);

        jtADM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Data de Nascimento", "Nome usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtADM);

        javax.swing.GroupLayout jpTabelaLayout = new javax.swing.GroupLayout(jpTabela);
        jpTabela.setLayout(jpTabelaLayout);
        jpTabelaLayout.setHorizontalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
        );
        jpTabelaLayout.setVerticalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jpTabela);
        jpTabela.setBounds(0, 174, 551, 187);

        jbExcluirADM.setText("Exclui Administrador");
        jbExcluirADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirADMActionPerformed(evt);
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

        javax.swing.GroupLayout jpConsultaADMLayout = new javax.swing.GroupLayout(jpConsultaADM);
        jpConsultaADM.setLayout(jpConsultaADMLayout);
        jpConsultaADMLayout.setHorizontalGroup(
            jpConsultaADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaADMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbExcluirADM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jpConsultaADMLayout.setVerticalGroup(
            jpConsultaADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaADMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultaADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbExcluirADM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSair))
                .addContainerGap())
        );

        getContentPane().add(jpConsultaADM);
        jpConsultaADM.setBounds(0, 120, 550, 50);

        javax.swing.GroupLayout jpAlteraADMLayout = new javax.swing.GroupLayout(jpAlteraADM);
        jpAlteraADM.setLayout(jpAlteraADMLayout);
        jpAlteraADMLayout.setHorizontalGroup(
            jpAlteraADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jpAlteraADMLayout.setVerticalGroup(
            jpAlteraADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        getContentPane().add(jpAlteraADM);
        jpAlteraADM.setBounds(0, 0, 550, 110);

        setBounds(0, 0, 567, 391);
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirADMActionPerformed
        // TODO add your handling code here:

        if(jtADM.getSelectedRow() != -1){

            if(fachada.verificaADMExise(jtADM.getValueAt(jtADM.getSelectedRow(), 1).toString())){
                fachada.removeADM(Integer.parseInt(jtADM.getValueAt(jtADM.getSelectedRow(), 0).toString()));
                dtmADM.removeRow(jtADM.getSelectedRow());
                JOptionPane.showMessageDialog(rootPane, "Administrador Excluido com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Este Administrador não existe, favor atualizar a Tabela");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha");
        }

    }//GEN-LAST:event_jbExcluirADMActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:

        limpaTabela();
        for (Administrador adm : fachada.retornaListaAdm()) {
            Object[] dados = {adm.getId(), adm.getNome(), adm.getDataDeNascimento(), adm.getNomeUsuario()};
            dtmADM.addRow(dados);
        }

    }//GEN-LAST:event_jbAtualizarActionPerformed
    
    
    public void limpaTabela(){
        
        if (dtmADM.getRowCount() > 0){
            for (int i=0;i<=dtmADM.getRowCount();i++){
                dtmADM.removeRow(0);
            }            
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbExcluirADM;
    private javax.swing.JButton jbSair;
    private javax.swing.JPanel jpAlteraADM;
    private javax.swing.JPanel jpConsultaADM;
    private javax.swing.JPanel jpTabela;
    private javax.swing.JTable jtADM;
    // End of variables declaration//GEN-END:variables
}
