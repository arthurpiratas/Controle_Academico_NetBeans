/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Aluno;
import Basicas.Professor;
import Basicas.Rendimento_Escolar;
import Basicas.Turma;
import Negocio.Fachada;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthur
 */
public class jofAtividadesProfessor extends javax.swing.JInternalFrame {

    /**
     * Creates new form jofAtividadesProfessor
     */
    
    Fachada fachada; 
    private DefaultTableModel dtmTurmas;
    private DefaultTableModel dtmRendimentoEscolar;
    private Professor professor;
    
    public jofAtividadesProfessor(Professor professor) {
        initComponents();
        this.professor = professor;
        
        this.fachada = Fachada.getInstance();
        
        
        
        dtmTurmas = (DefaultTableModel) jtTurma.getModel();
        dtmRendimentoEscolar = (DefaultTableModel) jtRendimentoEscolar.getModel();
        
        limpaTabelaTurma();
        limpaTabelaRendimentoEscolar();
        limpaCampos();
        
        
        for (Turma turma : fachada.retornaListaTurmaProfessor(professor)) {
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

        jpTabelaTurma = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTurma = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jpTabelaNotas = new javax.swing.JScrollPane();
        jtRendimentoEscolar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jpNotas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtAtv4 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtAtv1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtAtv2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtAtv3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtNotaAtv2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtNotaAtv4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtNotaAtv1 = new javax.swing.JTextField();
        jtNota2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtNotaAtv3 = new javax.swing.JTextField();
        jtMedia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtNota1 = new javax.swing.JTextField();
        jbAtualizar = new javax.swing.JButton();
        jbEnviar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbMedia1 = new javax.swing.JButton();

        setTitle("Atividades e Notas ");
        getContentPane().setLayout(null);

        jtTurma.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTurmaMouseClicked(evt);
            }
        });
        jtTurma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtTurmaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtTurma);

        javax.swing.GroupLayout jpTabelaTurmaLayout = new javax.swing.GroupLayout(jpTabelaTurma);
        jpTabelaTurma.setLayout(jpTabelaTurmaLayout);
        jpTabelaTurmaLayout.setHorizontalGroup(
            jpTabelaTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        jpTabelaTurmaLayout.setVerticalGroup(
            jpTabelaTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaTurmaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jpTabelaTurma);
        jpTabelaTurma.setBounds(0, 360, 760, 110);

        jLabel1.setFont(new java.awt.Font("Noto Mono", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alunos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 210, 750, 14);

        jtRendimentoEscolar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aluno", "Matrícula", "Turma", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtRendimentoEscolar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtRendimentoEscolarMouseClicked(evt);
            }
        });
        jtRendimentoEscolar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtRendimentoEscolarKeyReleased(evt);
            }
        });
        jpTabelaNotas.setViewportView(jtRendimentoEscolar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTabelaNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jpTabelaNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 230, 760, 100);

        jLabel2.setFont(new java.awt.Font("Noto Mono", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Turmas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 340, 750, 14);

        jpNotas.setLayout(null);

        jtAtv4.setEditable(false);
        jtAtv4.setColumns(20);
        jtAtv4.setRows(5);
        jScrollPane3.setViewportView(jtAtv4);

        jpNotas.add(jScrollPane3);
        jScrollPane3.setBounds(590, 30, 150, 80);

        jtAtv1.setEditable(false);
        jtAtv1.setColumns(20);
        jtAtv1.setRows(5);
        jScrollPane4.setViewportView(jtAtv1);

        jpNotas.add(jScrollPane4);
        jScrollPane4.setBounds(10, 30, 150, 80);

        jtAtv2.setEditable(false);
        jtAtv2.setColumns(20);
        jtAtv2.setRows(5);
        jScrollPane5.setViewportView(jtAtv2);

        jpNotas.add(jScrollPane5);
        jScrollPane5.setBounds(210, 30, 150, 80);

        jtAtv3.setEditable(false);
        jtAtv3.setColumns(20);
        jtAtv3.setRows(5);
        jScrollPane6.setViewportView(jtAtv3);

        jpNotas.add(jScrollPane6);
        jScrollPane6.setBounds(400, 30, 150, 80);

        jLabel3.setText("Atividade 4");
        jpNotas.add(jLabel3);
        jLabel3.setBounds(630, 10, 70, 14);

        jLabel4.setText("Atividade 1");
        jpNotas.add(jLabel4);
        jLabel4.setBounds(44, 10, 70, 14);

        jLabel5.setText("Atividade 2");
        jpNotas.add(jLabel5);
        jLabel5.setBounds(250, 10, 70, 14);

        jLabel6.setText("Atividade 3");
        jpNotas.add(jLabel6);
        jLabel6.setBounds(440, 10, 70, 14);

        jtNotaAtv2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpNotas.add(jtNotaAtv2);
        jtNotaAtv2.setBounds(110, 170, 60, 19);

        jLabel7.setText("Atividade 2:");
        jpNotas.add(jLabel7);
        jLabel7.setBounds(20, 170, 80, 14);

        jLabel8.setText("Atividade 4:");
        jpNotas.add(jLabel8);
        jLabel8.setBounds(210, 170, 80, 14);

        jtNotaAtv4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpNotas.add(jtNotaAtv4);
        jtNotaAtv4.setBounds(280, 170, 60, 19);

        jLabel9.setText("Atividade 1:");
        jpNotas.add(jLabel9);
        jLabel9.setBounds(20, 120, 80, 14);

        jLabel10.setText("Nota 2:");
        jpNotas.add(jLabel10);
        jLabel10.setBounds(400, 170, 70, 14);

        jtNotaAtv1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpNotas.add(jtNotaAtv1);
        jtNotaAtv1.setBounds(110, 120, 60, 19);

        jtNota2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNota2ActionPerformed(evt);
            }
        });
        jpNotas.add(jtNota2);
        jtNota2.setBounds(480, 170, 60, 19);

        jLabel11.setText("Atividade 3:");
        jpNotas.add(jLabel11);
        jLabel11.setBounds(210, 120, 80, 14);

        jLabel12.setText("Media");
        jpNotas.add(jLabel12);
        jLabel12.setBounds(590, 120, 70, 14);

        jtNotaAtv3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpNotas.add(jtNotaAtv3);
        jtNotaAtv3.setBounds(280, 120, 60, 19);

        jtMedia.setEditable(false);
        jtMedia.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMediaActionPerformed(evt);
            }
        });
        jpNotas.add(jtMedia);
        jtMedia.setBounds(670, 120, 60, 19);

        jLabel13.setText("Nota1:");
        jpNotas.add(jLabel13);
        jLabel13.setBounds(400, 120, 70, 14);

        jtNota1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNota1ActionPerformed(evt);
            }
        });
        jpNotas.add(jtNota1);
        jtNota1.setBounds(480, 120, 60, 19);

        jbAtualizar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });
        jpNotas.add(jbAtualizar);
        jbAtualizar.setBounds(660, 170, 70, 23);

        jbEnviar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbEnviar.setText("Enviar");
        jpNotas.add(jbEnviar);
        jbEnviar.setBounds(560, 140, 70, 21);

        jbSair.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jpNotas.add(jbSair);
        jbSair.setBounds(560, 170, 70, 21);

        jbMedia1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbMedia1.setText("Média");
        jpNotas.add(jbMedia1);
        jbMedia1.setBounds(660, 140, 70, 21);

        getContentPane().add(jpNotas);
        jpNotas.setBounds(10, 10, 740, 200);

        setBounds(0, 0, 775, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void jtNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNota2ActionPerformed

    private void jtMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMediaActionPerformed

    private void jtNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNota1ActionPerformed

    private void jtTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTurmaMouseClicked
        // TODO add your handling code here:
        limpaTabelaRendimentoEscolar();
        
        if(jtTurma.getSelectedRow() != -1){
            for (Rendimento_Escolar rendimento_Escolar : fachada.retornaListaRendimentoTurma(Integer.parseInt(jtTurma.getValueAt(jtTurma.getSelectedRow(), 0).toString()))) {
            Object[] dados = {fachada.buscaAluno(rendimento_Escolar.getAluno()).getNome(), fachada.buscaAluno(rendimento_Escolar.getAluno()).getMatricula(), fachada.buscaTurma(rendimento_Escolar.getTurma()).getNome(), rendimento_Escolar.getStatus()};
            dtmRendimentoEscolar.addRow(dados);
            }  
        }
    }//GEN-LAST:event_jtTurmaMouseClicked

    private void jtTurmaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTurmaKeyReleased
        // TODO add your handling code here:
        limpaTabelaRendimentoEscolar();
        
        if(jtTurma.getSelectedRow() != -1){
            for (Rendimento_Escolar rendimento_Escolar : fachada.retornaListaRendimentoTurma(Integer.parseInt(jtTurma.getValueAt(jtTurma.getSelectedRow(), 0).toString()))) {
            Object[] dados = {fachada.buscaAluno(rendimento_Escolar.getAluno()).getNome(), fachada.buscaAluno(rendimento_Escolar.getAluno()).getMatricula(),fachada.buscaTurma(rendimento_Escolar.getTurma()).getNome(), rendimento_Escolar.getStatus()};
            dtmRendimentoEscolar.addRow(dados);
            }  
        }
    }//GEN-LAST:event_jtTurmaKeyReleased

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
    }//GEN-LAST:event_jbSairActionPerformed

    private void jtRendimentoEscolarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRendimentoEscolarMouseClicked
        // TODO add your handling code here:
        
        limpaCampos();
        ativaCampos();
        
        if(jtRendimentoEscolar.getSelectedRow() != -1){
            Aluno alunoAux = fachada.buscaAluno(jtRendimentoEscolar.getValueAt(jtRendimentoEscolar.getSelectedRow(), 1).toString());
            Turma turmaAux = fachada.buscaTurma(jtRendimentoEscolar.getValueAt(jtRendimentoEscolar.getSelectedRow(), 2).toString());
            Rendimento_Escolar rendimentoEscolar = fachada.buscaRendimentoEscolar(alunoAux.getId(),turmaAux.getId());
            preencheCampos(rendimentoEscolar);
        }
        
    }//GEN-LAST:event_jtRendimentoEscolarMouseClicked

    private void jtRendimentoEscolarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRendimentoEscolarKeyReleased
        // TODO add your handling code here:
        
        limpaCampos();
        ativaCampos();
        
        if(jtRendimentoEscolar.getSelectedRow() != -1){
            Aluno alunoAux = fachada.buscaAluno(jtRendimentoEscolar.getValueAt(jtRendimentoEscolar.getSelectedRow(), 1).toString());
            Turma turmaAux = fachada.buscaTurma(jtRendimentoEscolar.getValueAt(jtRendimentoEscolar.getSelectedRow(), 2).toString());
            Rendimento_Escolar rendimentoEscolar = fachada.buscaRendimentoEscolar(alunoAux.getId(),turmaAux.getId());
            preencheCampos(rendimentoEscolar);
        }
        
    }//GEN-LAST:event_jtRendimentoEscolarKeyReleased

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:
        
        limpaTabelaRendimentoEscolar();
        limpaCampos();
        ativaCampos();
        
    }//GEN-LAST:event_jbAtualizarActionPerformed
    
    
    private void limpaTabelaTurma(){
        
        if (dtmTurmas.getRowCount() >= 0){
            for (int i=dtmTurmas.getRowCount();i > 0;i--){
                dtmTurmas.removeRow(0);
            }            
        }
    }
    
    private void limpaTabelaRendimentoEscolar(){
        
        if (dtmRendimentoEscolar.getRowCount() >= 0){
            for (int i=dtmRendimentoEscolar.getRowCount();i > 0;i--){
                dtmRendimentoEscolar.removeRow(0);
            }            
        }
    }
    
    private void limpaCampos(){
        
        jtAtv1.setText("");
        jtAtv2.setText("");
        jtAtv3.setText("");
        jtAtv4.setText("");
        jtMedia.setText("");
        jtNota1.setText("");
        jtNota2.setText("");
        jtNotaAtv1.setText("");
        jtNotaAtv2.setText("");
        jtNotaAtv3.setText("");
        jtNotaAtv4.setText("");
        
    }
    
    private void desativaCampos(){
        
        jtMedia.setEditable(false);
        jtNota1.setEditable(false);
        jtNota2.setEditable(false);
        jtNotaAtv1.setEditable(false);
        jtNotaAtv2.setEditable(false);
        jtNotaAtv3.setEditable(false);
        jtNotaAtv4.setEditable(false);
        jbEnviar.setEnabled(false);
        
    }
    
    private void ativaCampos(){
        
         
        jtNota1.setEditable(true);
        jtNota2.setEditable(true);
        jtNotaAtv1.setEditable(true);
        jtNotaAtv2.setEditable(true);
        jtNotaAtv3.setEditable(true);
        jtNotaAtv4.setEditable(true);
        jbEnviar.setEnabled(true);
        
    }
    
    private void preencheCampos(Rendimento_Escolar rendEsco){
        jtAtv1.setText(rendEsco.getTrabalhos()[0]);
        jtAtv2.setText(rendEsco.getTrabalhos()[1]);
        jtAtv3.setText(rendEsco.getTrabalhos()[2]);
        jtAtv4.setText(rendEsco.getTrabalhos()[3]);
        if(rendEsco.getMedia() != -1){
            jtMedia.setText(String.valueOf(rendEsco.getMedia()));
            desativaCampos();
        }else{
            jtMedia.setText("");
        }
        jtNota1.setText(String.valueOf(rendEsco.getNota1()));
        jtNota2.setText(String.valueOf(rendEsco.getNota2()));
        jtNotaAtv1.setText(String.valueOf(rendEsco.getNotasTrabalhos()[0]));
        jtNotaAtv2.setText(String.valueOf(rendEsco.getNotasTrabalhos()[1]));
        jtNotaAtv3.setText(String.valueOf(rendEsco.getNotasTrabalhos()[2]));
        jtNotaAtv4.setText(String.valueOf(rendEsco.getNotasTrabalhos()[3]));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbEnviar;
    private javax.swing.JButton jbMedia1;
    private javax.swing.JButton jbSair;
    private javax.swing.JPanel jpNotas;
    private javax.swing.JScrollPane jpTabelaNotas;
    private javax.swing.JPanel jpTabelaTurma;
    private javax.swing.JTextArea jtAtv1;
    private javax.swing.JTextArea jtAtv2;
    private javax.swing.JTextArea jtAtv3;
    private javax.swing.JTextArea jtAtv4;
    private javax.swing.JTextField jtMedia;
    private javax.swing.JTextField jtNota1;
    private javax.swing.JTextField jtNota2;
    private javax.swing.JTextField jtNotaAtv1;
    private javax.swing.JTextField jtNotaAtv2;
    private javax.swing.JTextField jtNotaAtv3;
    private javax.swing.JTextField jtNotaAtv4;
    private javax.swing.JTable jtRendimentoEscolar;
    private javax.swing.JTable jtTurma;
    // End of variables declaration//GEN-END:variables
}
