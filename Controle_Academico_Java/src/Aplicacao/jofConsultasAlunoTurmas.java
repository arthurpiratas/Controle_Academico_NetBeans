/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Aluno;
import Basicas.Disciplina;
import Basicas.Rendimento_Escolar;
import Basicas.Turma;
import Negocio.Fachada;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthur
 */
public class jofConsultasAlunoTurmas extends javax.swing.JInternalFrame {

    /**
     * Creates new form jofConsultasAlunoTurmas
     */
    
    private Fachada fachada;
    private Aluno aluno;
    private DefaultTableModel dtmTurmas;
    int tipoTela = 0; 
    
    public jofConsultasAlunoTurmas(Fachada fachada, Aluno aluno, int TipoDeTela) {
        initComponents();
        this.fachada = fachada; 
        this.aluno = aluno;
        
        dtmTurmas = (DefaultTableModel) jtTurma.getModel();
        
        limpaTabela();
        
        if(TipoDeTela == 1){
            jpMatriculaTurma1.setEnabled(false);
            jpMatriculaTurma1.setVisible(false);
            jpNotas.setEnabled(false);
            jpNotas.setVisible(false);
            this.title = "Consultas Aluno";
            
            for (Turma turma : fachada.retornaListaTurmaAluno(aluno)) {
                Object[] dados = {turma.getNome(), turma.getProfessor() != -1 ? fachada.buscaProfessor(turma.getProfessor()).getNome() : " ", fachada.buscaDisciplina(turma.getDisciplina()).getNome(), "Matriculado"};
                dtmTurmas.addRow(dados);
            }
            
            
        }else if(TipoDeTela == 2){
            jpConsultaTurmas.setEnabled(false);
            jpConsultaTurmas.setVisible(false);
            jpNotas.setEnabled(false);
            jpNotas.setVisible(false);
            this.title = "Matrículas";
            
            for (Turma turma : fachada.RetornaTurmaDisponivelParaAluno(aluno)) {
                Object[] dados = {turma.getNome(), turma.getProfessor() != -1 ? fachada.buscaProfessor(turma.getProfessor()).getNome() : " ", fachada.buscaDisciplina(turma.getDisciplina()).getNome(), "Não Matriculado"};
                dtmTurmas.addRow(dados);
            }
            
        }else{
            jpConsultaTurmas.setEnabled(false);
            jpConsultaTurmas.setVisible(false);
            jpMatriculaTurma1.setEnabled(false);
            jpMatriculaTurma1.setVisible(false); 
            
            this.title = "Consulta Notas";
            
            for (Turma turma : fachada.retornaListaTurmaAluno(aluno)) {
                Object[] dados = {turma.getNome(), turma.getProfessor() != -1 ? fachada.buscaProfessor(turma.getProfessor()).getNome() : " ", fachada.buscaDisciplina(turma.getDisciplina()).getNome(), "Matriculado"};
                dtmTurmas.addRow(dados);
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

        jpTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTurma = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtEmenta = new javax.swing.JTextArea();
        jpConsultaTurmas = new javax.swing.JPanel();
        jbAtualizar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbExcluiMatricula = new javax.swing.JButton();
        jpMatriculaTurma1 = new javax.swing.JPanel();
        jbSair2 = new javax.swing.JButton();
        jbAtualizar2 = new javax.swing.JButton();
        jbMatricula = new javax.swing.JButton();
        jpNotas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtnotaAtv3 = new javax.swing.JTextField();
        jtMedia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtnotaAtv1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtnotaAtv2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtSituacao = new javax.swing.JTextField();
        jtnota1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtnota2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtnotaAtv4 = new javax.swing.JTextField();
        jbSair3 = new javax.swing.JButton();

        setTitle("Consultas Aluno ");
        getContentPane().setLayout(null);

        jpTabela.setLayout(null);

        jtTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turma", "Professor", "Disciplina", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jpTabela.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 560, 170);

        jtEmenta.setEditable(false);
        jtEmenta.setColumns(20);
        jtEmenta.setRows(5);
        jScrollPane2.setViewportView(jtEmenta);

        jpTabela.add(jScrollPane2);
        jScrollPane2.setBounds(570, 0, 166, 170);

        getContentPane().add(jpTabela);
        jpTabela.setBounds(0, 270, 740, 180);

        jpConsultaTurmas.setLayout(null);

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });
        jpConsultaTurmas.add(jbAtualizar);
        jbAtualizar.setBounds(50, 10, 140, 23);

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jpConsultaTurmas.add(jbSair);
        jbSair.setBounds(550, 10, 120, 23);

        jbExcluiMatricula.setText("Desfazer Mastrícula");
        jbExcluiMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluiMatriculaActionPerformed(evt);
            }
        });
        jpConsultaTurmas.add(jbExcluiMatricula);
        jbExcluiMatricula.setBounds(310, 10, 140, 23);

        getContentPane().add(jpConsultaTurmas);
        jpConsultaTurmas.setBounds(0, 150, 730, 50);

        jpMatriculaTurma1.setLayout(null);

        jbSair2.setText("Sair");
        jbSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSair2ActionPerformed(evt);
            }
        });
        jpMatriculaTurma1.add(jbSair2);
        jbSair2.setBounds(540, 10, 120, 23);

        jbAtualizar2.setText("Atualizar");
        jbAtualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizar2ActionPerformed(evt);
            }
        });
        jpMatriculaTurma1.add(jbAtualizar2);
        jbAtualizar2.setBounds(40, 10, 140, 23);

        jbMatricula.setText("Mastricular-se");
        jbMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMatriculaActionPerformed(evt);
            }
        });
        jpMatriculaTurma1.add(jbMatricula);
        jbMatricula.setBounds(300, 10, 140, 23);

        getContentPane().add(jpMatriculaTurma1);
        jpMatriculaTurma1.setBounds(10, 210, 720, 50);

        jpNotas.setLayout(null);

        jLabel1.setText("Média");
        jpNotas.add(jLabel1);
        jLabel1.setBounds(630, 10, 70, 14);

        jLabel2.setText("Atividade 2");
        jpNotas.add(jLabel2);
        jLabel2.setBounds(130, 10, 70, 14);

        jtnotaAtv3.setEditable(false);
        jtnotaAtv3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpNotas.add(jtnotaAtv3);
        jtnotaAtv3.setBounds(230, 40, 80, 30);

        jtMedia.setEditable(false);
        jpNotas.add(jtMedia);
        jtMedia.setBounds(630, 40, 70, 30);

        jLabel3.setText("Situação ");
        jpNotas.add(jLabel3);
        jLabel3.setBounds(220, 90, 70, 14);

        jtnotaAtv1.setEditable(false);
        jtnotaAtv1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpNotas.add(jtnotaAtv1);
        jtnotaAtv1.setBounds(10, 40, 80, 30);

        jLabel4.setText("Atividade 3");
        jpNotas.add(jLabel4);
        jLabel4.setBounds(240, 10, 70, 14);

        jtnotaAtv2.setEditable(false);
        jtnotaAtv2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpNotas.add(jtnotaAtv2);
        jtnotaAtv2.setBounds(120, 40, 80, 30);

        jLabel5.setText("Atividade 4");
        jpNotas.add(jLabel5);
        jLabel5.setBounds(350, 10, 70, 14);

        jLabel6.setText("Nota 1");
        jpNotas.add(jLabel6);
        jLabel6.setBounds(460, 10, 70, 14);

        jtSituacao.setEditable(false);
        jpNotas.add(jtSituacao);
        jtSituacao.setBounds(290, 90, 110, 30);

        jtnota1.setEditable(false);
        jpNotas.add(jtnota1);
        jtnota1.setBounds(450, 40, 70, 30);

        jLabel7.setText("Nota 2 ");
        jpNotas.add(jLabel7);
        jLabel7.setBounds(540, 10, 70, 14);

        jtnota2.setEditable(false);
        jpNotas.add(jtnota2);
        jtnota2.setBounds(540, 40, 70, 30);

        jLabel8.setText("Atividade 1");
        jpNotas.add(jLabel8);
        jLabel8.setBounds(20, 10, 70, 14);

        jtnotaAtv4.setEditable(false);
        jtnotaAtv4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpNotas.add(jtnotaAtv4);
        jtnotaAtv4.setBounds(340, 40, 80, 30);

        jbSair3.setText("Sair");
        jbSair3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSair3ActionPerformed(evt);
            }
        });
        jpNotas.add(jbSair3);
        jbSair3.setBounds(540, 90, 120, 23);

        getContentPane().add(jpNotas);
        jpNotas.setBounds(10, 10, 710, 130);

        setBounds(0, 0, 753, 483);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSair2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSair2ActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbSair3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSair3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSair3ActionPerformed

    private void jbAtualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizar2ActionPerformed
        // TODO add your handling code here:
        
        limpaTabela(); 
        for (Turma turma : fachada.RetornaTurmaDisponivelParaAluno(aluno)) {
                Object[] dados = {turma.getNome(), turma.getProfessor() != -1 ? fachada.buscaProfessor(turma.getProfessor()).getNome() : " ", fachada.buscaDisciplina(turma.getDisciplina()).getNome(), "Não Matriculado"};
                dtmTurmas.addRow(dados);
        }
        
    }//GEN-LAST:event_jbAtualizar2ActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:
        limpaTabela(); 
        for (Turma turma : fachada.retornaListaTurmaAluno(aluno)) {
                Object[] dados = {turma.getNome(), turma.getProfessor() != -1 ? fachada.buscaProfessor(turma.getProfessor()).getNome() : " ", fachada.buscaDisciplina(turma.getDisciplina()).getNome(), "Matriculado"};
                dtmTurmas.addRow(dados);
        }
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jtTurmaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTurmaKeyReleased
        // TODO add your handling code here:
        if(jtTurma.getSelectedRow() != -1){
            if(fachada.verificaDisciplinaExiste(jtTurma.getValueAt(jtTurma.getSelectedRow(), 2).toString())){
                Disciplina disciplina = fachada.buscaDisciplina(jtTurma.getValueAt(jtTurma.getSelectedRow(), 2).toString());
                jtEmenta.setText(disciplina.getEmenta());
                try{
                    limpaCampos();
                    Rendimento_Escolar rendEsco = fachada.buscaRendimentoEscolar(aluno.getId(), fachada.buscaTurma(jtTurma.getValueAt(jtTurma.getSelectedRow(), 0).toString()).getId());
                    jtnotaAtv1.setText(rendEsco.getTrabalhos()[0].equals("Não Entregue") ? "Não Entregue" : String.valueOf(rendEsco.getNotasTrabalhos()[0]));
                    jtnotaAtv2.setText(rendEsco.getTrabalhos()[1].equals("Não Entregue") ? "Não Entregue" : String.valueOf(rendEsco.getNotasTrabalhos()[1]));
                    jtnotaAtv3.setText(rendEsco.getTrabalhos()[2].equals("Não Entregue") ? "Não Entregue" : String.valueOf(rendEsco.getNotasTrabalhos()[2]));
                    jtnotaAtv4.setText(rendEsco.getTrabalhos()[3].equals("Não Entregue") ? "Não Entregue" : String.valueOf(rendEsco.getNotasTrabalhos()[3]));
                    jtnota1.setText(String.valueOf(rendEsco.getNota1()));
                    jtnota2.setText(String.valueOf(rendEsco.getNota2()));
                    jtMedia.setText(String.valueOf(rendEsco.getMedia()));
                    jtSituacao.setText(rendEsco.getStatus());
                }catch(NullPointerException e){
                    
                }
            }
        }
    }//GEN-LAST:event_jtTurmaKeyReleased

    private void jtTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTurmaMouseClicked
        // TODO add your handling code here:
        if(jtTurma.getSelectedRow() != -1){
            if(fachada.verificaDisciplinaExiste(jtTurma.getValueAt(jtTurma.getSelectedRow(), 2).toString())){
                Disciplina disciplina = fachada.buscaDisciplina(jtTurma.getValueAt(jtTurma.getSelectedRow(), 2).toString());
                jtEmenta.setText(disciplina.getEmenta());
                try{
                    limpaCampos();
                    Rendimento_Escolar rendEsco = fachada.buscaRendimentoEscolar(aluno.getId(), fachada.buscaTurma(jtTurma.getValueAt(jtTurma.getSelectedRow(), 0).toString()).getId());
                    jtnotaAtv1.setText(rendEsco.getTrabalhos()[0].equals("Não Entregue") ? "Não Entregue" : String.valueOf(rendEsco.getNotasTrabalhos()[0]));
                    jtnotaAtv2.setText(rendEsco.getTrabalhos()[1].equals("Não Entregue") ? "Não Entregue" : String.valueOf(rendEsco.getNotasTrabalhos()[1]));
                    jtnotaAtv3.setText(rendEsco.getTrabalhos()[2].equals("Não Entregue") ? "Não Entregue" : String.valueOf(rendEsco.getNotasTrabalhos()[2]));
                    jtnotaAtv4.setText(rendEsco.getTrabalhos()[3].equals("Não Entregue") ? "Não Entregue" : String.valueOf(rendEsco.getNotasTrabalhos()[3]));
                    jtnota1.setText(String.valueOf(rendEsco.getNota1()));
                    jtnota2.setText(String.valueOf(rendEsco.getNota2()));
                    jtMedia.setText(String.valueOf(rendEsco.getMedia()));
                    jtSituacao.setText(rendEsco.getStatus());
                }catch(NullPointerException e){
                    
                }
                
            }
        }
    }//GEN-LAST:event_jtTurmaMouseClicked

    private void jbMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMatriculaActionPerformed
        // TODO add your handling code here:
        if(jtTurma.getSelectedRow() != -1){
            Turma turma =  fachada.buscaTurma(jtTurma.getValueAt(jtTurma.getSelectedRow(), 0).toString());
            fachada.insereAlunoEmTurma(turma, aluno);
            Rendimento_Escolar rendEsco = new Rendimento_Escolar(turma.getId(), aluno.getId());
            fachada.insereRendimentoEscola(rendEsco);
            JOptionPane.showMessageDialog(rootPane, "Matrícula realizada!");
            dtmTurmas.removeRow(jtTurma.getSelectedRow()); 
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma Turma!");
        }
    }//GEN-LAST:event_jbMatriculaActionPerformed

    private void jbExcluiMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluiMatriculaActionPerformed
        // TODO add your handling code here:
        if(jtTurma.getSelectedRow() != -1){
            Turma turma = fachada.buscaTurma(jtTurma.getValueAt(jtTurma.getSelectedRow(), 0).toString());
            fachada.removeAlunoEmTurma(turma, aluno);
            fachada.removeRendimentoEscolar(aluno.getId(), turma.getId());
            JOptionPane.showMessageDialog(rootPane, "Matrícula Excluida!");
            dtmTurmas.removeRow(jtTurma.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma Turma!");
        }
    }//GEN-LAST:event_jbExcluiMatriculaActionPerformed
    
    
    private void limpaCampos(){
        jtnotaAtv1.setText("");
        jtnotaAtv2.setText("");
        jtnotaAtv3.setText("");
        jtnotaAtv4.setText("");
        jtnota1.setText("");
        jtnota2.setText("");
        jtMedia.setText("");
        jtSituacao.setText("");
    }
    
    private void limpaTabela(){
        
        if (dtmTurmas.getRowCount() >= 0){
            for (int i=dtmTurmas.getRowCount();i > 0;i--){
                dtmTurmas.removeRow(0);
            }            
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbAtualizar2;
    private javax.swing.JButton jbExcluiMatricula;
    private javax.swing.JButton jbMatricula;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSair2;
    private javax.swing.JButton jbSair3;
    private javax.swing.JPanel jpConsultaTurmas;
    private javax.swing.JPanel jpMatriculaTurma1;
    private javax.swing.JPanel jpNotas;
    private javax.swing.JPanel jpTabela;
    private javax.swing.JTextArea jtEmenta;
    private javax.swing.JTextField jtMedia;
    private javax.swing.JTextField jtSituacao;
    private javax.swing.JTable jtTurma;
    private javax.swing.JTextField jtnota1;
    private javax.swing.JTextField jtnota2;
    private javax.swing.JTextField jtnotaAtv1;
    private javax.swing.JTextField jtnotaAtv2;
    private javax.swing.JTextField jtnotaAtv3;
    private javax.swing.JTextField jtnotaAtv4;
    // End of variables declaration//GEN-END:variables
}
