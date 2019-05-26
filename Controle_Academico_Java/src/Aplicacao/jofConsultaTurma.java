/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Disciplina;
import Basicas.Professor;
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
    Turma turmaAUX; 
    
    public jofConsultaTurma(Fachada fachada, int TipodeTela) {
        initComponents();
        
        this.fachada = fachada;
        
        dtmTurmas = (DefaultTableModel) jtTurmas.getModel();
        
        turmaAUX = null;
        
        for (Turma turma : fachada.retornaListaTurma()) {
            Object[] dados = {turma.getId(), turma.getNome(), turma.getProfessor() != -1 ? fachada.buscaProfessor(turma.getProfessor()).getNome() : " ", fachada.buscaDisciplina(turma.getDisciplina()).getNome(), turma.getCapacidadeDaTurma(), turma.getQtdAlunoTurma()};
            dtmTurmas.addRow(dados);
        }
        if(TipodeTela == 1){
            jpAtualizaTurma.setEnabled(false);
            jpAtualizaTurma.setVisible(false);
        }else{
            jpConsultaTurma.setEnabled(false);
            jpConsultaTurma.setVisible(false);
            
            for (Disciplina dis : this.fachada.retornaListaDisciplina()) {
            cbDisciplina.addItem(dis);
            }
        
            for (Professor prof : this.fachada.retornaListaProfessor()) {
            cbProfessor.addItem(prof);
            }
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
        jpAtualizaTurma = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtAlunosTurma = new javax.swing.JTextField();
        jtDisciplina = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtcapTurma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtProfessor = new javax.swing.JTextField();
        cbDisciplina = new javax.swing.JComboBox<>();
        cbProfessor = new javax.swing.JComboBox<>();
        jbSair2 = new javax.swing.JButton();
        jbAtualizar2 = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();

        setTitle("Consulta Turma");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

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
        jtTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTurmasMouseClicked(evt);
            }
        });
        jtTurmas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtTurmasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtTurmas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(4, 0, 690, 197);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 210, 700, 210);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
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
        jpConsultaTurma.setBounds(0, 160, 700, 50);

        jpAtualizaTurma.setLayout(null);

        jLabel1.setText("Alunos Turma");
        jpAtualizaTurma.add(jLabel1);
        jLabel1.setBounds(210, 130, 100, 14);

        jLabel2.setText("ID");
        jpAtualizaTurma.add(jLabel2);
        jLabel2.setBounds(10, 20, 60, 14);

        jtAlunosTurma.setEditable(false);
        jpAtualizaTurma.add(jtAlunosTurma);
        jtAlunosTurma.setBounds(290, 120, 70, 30);

        jtDisciplina.setEditable(false);
        jpAtualizaTurma.add(jtDisciplina);
        jtDisciplina.setBounds(300, 60, 120, 30);

        jLabel3.setText("Disciplina");
        jpAtualizaTurma.add(jLabel3);
        jLabel3.setBounds(230, 70, 60, 14);

        jtNome.setEditable(false);
        jpAtualizaTurma.add(jtNome);
        jtNome.setBounds(70, 70, 120, 30);

        jLabel4.setText("Capacidade Turma");
        jpAtualizaTurma.add(jLabel4);
        jLabel4.setBounds(10, 130, 100, 14);

        jtcapTurma.setEditable(false);
        jpAtualizaTurma.add(jtcapTurma);
        jtcapTurma.setBounds(120, 120, 70, 30);

        jLabel5.setText("Nome");
        jpAtualizaTurma.add(jLabel5);
        jLabel5.setBounds(10, 80, 60, 14);

        jtID.setEditable(false);
        jpAtualizaTurma.add(jtID);
        jtID.setBounds(70, 10, 120, 30);

        jLabel6.setText("Professor");
        jpAtualizaTurma.add(jLabel6);
        jLabel6.setBounds(230, 20, 60, 14);

        jtProfessor.setEditable(false);
        jpAtualizaTurma.add(jtProfessor);
        jtProfessor.setBounds(300, 10, 120, 30);

        jpAtualizaTurma.add(cbDisciplina);
        cbDisciplina.setBounds(440, 60, 120, 20);

        jpAtualizaTurma.add(cbProfessor);
        cbProfessor.setBounds(440, 10, 120, 20);

        jbSair2.setText("Sair");
        jbSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSair2ActionPerformed(evt);
            }
        });
        jpAtualizaTurma.add(jbSair2);
        jbSair2.setBounds(610, 110, 80, 40);

        jbAtualizar2.setText("Atualizar");
        jbAtualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizar2ActionPerformed(evt);
            }
        });
        jpAtualizaTurma.add(jbAtualizar2);
        jbAtualizar2.setBounds(610, 60, 80, 40);

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jpAtualizaTurma.add(jbLimpar);
        jbLimpar.setBounds(610, 10, 80, 40);

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        jpAtualizaTurma.add(jbAlterar);
        jbAlterar.setBounds(440, 110, 120, 40);

        getContentPane().add(jpAtualizaTurma);
        jpAtualizaTurma.setBounds(0, 0, 710, 160);

        setBounds(0, 0, 720, 458);
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

    private void jbSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSair2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSair2ActionPerformed

    private void jbAtualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizar2ActionPerformed
        // TODO add your handling code here:
        limpaTabela();
        for (Turma turma : fachada.retornaListaTurma()) {
            Object[] dados = {turma.getId(), turma.getNome(), turma.getProfessor() != -1 ? fachada.buscaProfessor(turma.getProfessor()).getNome() : " ", fachada.buscaDisciplina(turma.getDisciplina()).getNome(), turma.getCapacidadeDaTurma(), turma.getQtdAlunoTurma()};
            dtmTurmas.addRow(dados);
        }
    }//GEN-LAST:event_jbAtualizar2ActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        limpaCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:

        if(jtTurmas.getSelectedRow() != -1 && turmaAUX != null ){
            Disciplina disc = (Disciplina) cbDisciplina.getSelectedItem();
            Professor prof = (Professor) cbProfessor.getSelectedItem();
            turmaAUX.setProfessor(prof.getId());
            turmaAUX.setDisciplina(disc.getcodigo());
            fachada.alteraTurma(turmaAUX);
            limpaTabela();
            limpaCampos();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtTurmasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTurmasKeyReleased
        // TODO add your handling code here:
        if(jtTurmas.getSelectedRow() != -1){
            turmaAUX = fachada.buscaTurma(Integer.parseInt(jtTurmas.getValueAt(jtTurmas.getSelectedRow(), 0).toString()));
            jtID.setText(String.valueOf(turmaAUX.getId()));
            jtNome.setText(turmaAUX.getNome());
            jtAlunosTurma.setText(String.valueOf(turmaAUX.getQtdAlunoTurma()));
            jtcapTurma.setText(String.valueOf(turmaAUX.getCapacidadeDaTurma()));
            jtProfessor.setText(jtTurmas.getValueAt(jtTurmas.getSelectedRow(), 2).toString());
            jtDisciplina.setText(jtTurmas.getValueAt(jtTurmas.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jtTurmasKeyReleased

    private void jtTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTurmasMouseClicked
        // TODO add your handling code here:
        if(jtTurmas.getSelectedRow() != -1){
            turmaAUX = fachada.buscaTurma(Integer.parseInt(jtTurmas.getValueAt(jtTurmas.getSelectedRow(), 0).toString()));
            jtID.setText(String.valueOf(turmaAUX.getId()));
            jtNome.setText(turmaAUX.getNome());
            jtAlunosTurma.setText(String.valueOf(turmaAUX.getQtdAlunoTurma()));
            jtcapTurma.setText(String.valueOf(turmaAUX.getCapacidadeDaTurma()));
            jtProfessor.setText(jtTurmas.getValueAt(jtTurmas.getSelectedRow(), 2).toString());
            jtDisciplina.setText(jtTurmas.getValueAt(jtTurmas.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jtTurmasMouseClicked
    
    
    public void limpaTabela(){
        
        if (dtmTurmas.getRowCount() >= 0){
            for (int i=dtmTurmas.getRowCount();i > 0;i--){
                dtmTurmas.removeRow(0);
            }            
        }
    }
    
    public void limpaCampos(){
        turmaAUX = null; 
        jtAlunosTurma.setText("");
        jtDisciplina.setText("");
        jtID.setText("");
        jtNome.setText("");
        jtProfessor.setText("");
        jtcapTurma.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cbDisciplina;
    private javax.swing.JComboBox<Object> cbProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbAtualizar2;
    private javax.swing.JButton jbExcluirTurma;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSair2;
    private javax.swing.JPanel jpAtualizaTurma;
    private javax.swing.JPanel jpConsultaTurma;
    private javax.swing.JTextField jtAlunosTurma;
    private javax.swing.JTextField jtDisciplina;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtProfessor;
    private javax.swing.JTable jtTurmas;
    private javax.swing.JTextField jtcapTurma;
    // End of variables declaration//GEN-END:variables
}
