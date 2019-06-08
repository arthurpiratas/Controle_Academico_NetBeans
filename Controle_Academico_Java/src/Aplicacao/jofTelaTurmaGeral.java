/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Aluno;
import Basicas.Disciplina;
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
public class jofTelaTurmaGeral extends javax.swing.JInternalFrame {

    /**
     * Creates new form jofTelaTurmaGeral
     */
    
    Fachada fachada; 
    private DefaultTableModel dtmTurmas;
    private DefaultTableModel dtmRendimentoEscolar;
    private Professor professor;
    
    public jofTelaTurmaGeral(Professor professor, int tipoTela) {
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
        
        if(tipoTela == 1){
            jpTelaStatus.setEnabled(false);
            jpTelaStatus.setVisible(false);
            jbEnviar.setEnabled(true);
            this.title = "Consulta Turmas";
        }else{
            jpConsultaTurmas.setEnabled(false);
            jbEnviar.setEnabled(false);
            jtEmenta.setEnabled(false);
            this.title = "Status Turmas";
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
        jpConsultaTurmas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtEmenta = new javax.swing.JTextArea();
        jpTelaStatus = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNomeTurma = new javax.swing.JTextField();
        jtPercentualReprovados = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtQtdReprovados = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtQtdAprovados = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtPercentualAprovado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtQtdFinal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtPercentualFinal = new javax.swing.JTextField();
        jbEnviar = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();

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

        jLabel3.setText("Ementa");

        jtEmenta.setColumns(20);
        jtEmenta.setRows(5);
        jScrollPane2.setViewportView(jtEmenta);

        javax.swing.GroupLayout jpConsultaTurmasLayout = new javax.swing.GroupLayout(jpConsultaTurmas);
        jpConsultaTurmas.setLayout(jpConsultaTurmasLayout);
        jpConsultaTurmasLayout.setHorizontalGroup(
            jpConsultaTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaTurmasLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jpConsultaTurmasLayout.setVerticalGroup(
            jpConsultaTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaTurmasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
        );

        getContentPane().add(jpConsultaTurmas);
        jpConsultaTurmas.setBounds(10, 10, 200, 190);

        jpTelaStatus.setLayout(null);

        jLabel4.setText("Turma");
        jpTelaStatus.add(jLabel4);
        jLabel4.setBounds(180, 7, 60, 14);

        jLabel5.setText("Percentual Reprovados");
        jpTelaStatus.add(jLabel5);
        jLabel5.setBounds(310, 100, 120, 14);

        jtNomeTurma.setEditable(false);
        jtNomeTurma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpTelaStatus.add(jtNomeTurma);
        jtNomeTurma.setBounds(230, 4, 70, 19);

        jtPercentualReprovados.setEditable(false);
        jtPercentualReprovados.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpTelaStatus.add(jtPercentualReprovados);
        jtPercentualReprovados.setBounds(310, 140, 90, 19);

        jLabel6.setText("Alunos Reprovados");
        jpTelaStatus.add(jLabel6);
        jLabel6.setBounds(310, 30, 100, 14);

        jtQtdReprovados.setEditable(false);
        jtQtdReprovados.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpTelaStatus.add(jtQtdReprovados);
        jtQtdReprovados.setBounds(310, 60, 90, 19);

        jLabel7.setText("Alunos Aprovados");
        jpTelaStatus.add(jLabel7);
        jLabel7.setBounds(20, 30, 100, 14);

        jtQtdAprovados.setEditable(false);
        jtQtdAprovados.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpTelaStatus.add(jtQtdAprovados);
        jtQtdAprovados.setBounds(20, 60, 90, 19);

        jLabel8.setText("Percentual de  Aprovados");
        jpTelaStatus.add(jLabel8);
        jLabel8.setBounds(20, 100, 140, 14);

        jtPercentualAprovado.setEditable(false);
        jtPercentualAprovado.setFont(new java.awt.Font("MV Boli", 0, 10)); // NOI18N
        jpTelaStatus.add(jtPercentualAprovado);
        jtPercentualAprovado.setBounds(20, 140, 90, 23);

        jLabel9.setText("Alunos na Final");
        jpTelaStatus.add(jLabel9);
        jLabel9.setBounds(170, 30, 100, 14);

        jtQtdFinal.setEditable(false);
        jtQtdFinal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpTelaStatus.add(jtQtdFinal);
        jtQtdFinal.setBounds(170, 60, 90, 19);

        jLabel10.setText("Percentual Final");
        jpTelaStatus.add(jLabel10);
        jLabel10.setBounds(170, 100, 110, 14);

        jtPercentualFinal.setEditable(false);
        jtPercentualFinal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jpTelaStatus.add(jtPercentualFinal);
        jtPercentualFinal.setBounds(170, 140, 90, 19);

        getContentPane().add(jpTelaStatus);
        jpTelaStatus.setBounds(310, 10, 440, 190);

        jbEnviar.setText("Enviar");
        jbEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEnviar);
        jbEnviar.setBounds(223, 150, 80, 23);

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAtualizar);
        jbAtualizar.setBounds(223, 50, 80, 23);

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair);
        jbSair.setBounds(223, 100, 80, 23);

        setBounds(0, 0, 776, 488);
    }// </editor-fold>//GEN-END:initComponents

    private void jtTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTurmaMouseClicked
        // TODO add your handling code here:
        limpaTabelaRendimentoEscolar();
        limpaCampos();

        if(jtTurma.getSelectedRow() != -1){
            for (Rendimento_Escolar rendimento_Escolar : fachada.retornaListaRendimentoTurma(Integer.parseInt(jtTurma.getValueAt(jtTurma.getSelectedRow(), 0).toString()))) {
                Object[] dados = {fachada.buscaAluno(rendimento_Escolar.getAluno()).getNome(), fachada.buscaAluno(rendimento_Escolar.getAluno()).getMatricula(), fachada.buscaTurma(rendimento_Escolar.getTurma()).getNome(), rendimento_Escolar.getStatus()};
                dtmRendimentoEscolar.addRow(dados);
                
            }
            preencheCampos(fachada.buscaTurma(Integer.parseInt(jtTurma.getValueAt(jtTurma.getSelectedRow(), 0).toString())));
            
        }
    }//GEN-LAST:event_jtTurmaMouseClicked

    private void jtTurmaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTurmaKeyReleased
        // TODO add your handling code here:
        limpaTabelaRendimentoEscolar();
        limpaCampos();

        if(jtTurma.getSelectedRow() != -1){
            for (Rendimento_Escolar rendimento_Escolar : fachada.retornaListaRendimentoTurma(Integer.parseInt(jtTurma.getValueAt(jtTurma.getSelectedRow(), 0).toString()))) {
                Object[] dados = {fachada.buscaAluno(rendimento_Escolar.getAluno()).getNome(), fachada.buscaAluno(rendimento_Escolar.getAluno()).getMatricula(),fachada.buscaTurma(rendimento_Escolar.getTurma()).getNome(), rendimento_Escolar.getStatus()};
                dtmRendimentoEscolar.addRow(dados);
                
            }
            preencheCampos(fachada.buscaTurma(Integer.parseInt(jtTurma.getValueAt(jtTurma.getSelectedRow(), 0).toString())));
            
        }
    }//GEN-LAST:event_jtTurmaKeyReleased

    private void jtRendimentoEscolarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRendimentoEscolarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jtRendimentoEscolarMouseClicked

    private void jtRendimentoEscolarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRendimentoEscolarKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jtRendimentoEscolarKeyReleased

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:
        limpaTabelaRendimentoEscolar();
        limpaTabelaTurma();
        limpaCampos();
        
        for (Turma turma : fachada.retornaListaTurmaProfessor(professor)) {
            Object[] dados = {turma.getId(), turma.getNome(), turma.getProfessor() != -1 ? fachada.buscaProfessor(turma.getProfessor()).getNome() : " ", fachada.buscaDisciplina(turma.getDisciplina()).getNome(), turma.getCapacidadeDaTurma(), turma.getQtdAlunoTurma()};
            dtmTurmas.addRow(dados);
        }
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviarActionPerformed
        // TODO add your handling code here:
        
        if(jtTurma.getSelectedRow() != -1){
            Disciplina disciplinaAux = fachada.buscaDisciplina(jtTurma.getValueAt(jtTurma.getSelectedRow(), 3).toString());
            disciplinaAux.setEmenta(jtEmenta.getText());
            fachada.alteraDisciplina(disciplinaAux);
            JOptionPane.showMessageDialog(rootPane, "Ementa Alterada!");
            limpaTabelaRendimentoEscolar();
            limpaTabelaTurma();
            limpaCampos();
        }
        
        
        
        
    }//GEN-LAST:event_jbEnviarActionPerformed
    
    
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
        
        jtEmenta.setText("");
        jtNomeTurma.setText("");
        jtPercentualAprovado.setText("");
        jtPercentualFinal.setText("");
        jtPercentualReprovados.setText("");
        jtQtdAprovados.setText("");
        jtQtdFinal.setText("");
        jtQtdReprovados.setText("");
        jtEmenta.setText("");
       
    }
    
    private void preencheCampos(Turma turma){
         
        
        jtNomeTurma.setText(turma.getNome());
        jtPercentualAprovado.setText(String.valueOf(fachada.retornaPercentualAlunosAprovados(turma.getId()))+"%");
        jtPercentualFinal.setText(String.valueOf(fachada.retornaPercentualAlunosFinal(turma.getId()))+"%");
        jtPercentualReprovados.setText(String.valueOf(fachada.retornaPercentualAlunosReprovado(turma.getId()))+"%");
        jtQtdAprovados.setText(String.valueOf(fachada.retornaQtdAlunosAprovados(turma.getId())));
        jtQtdFinal.setText(String.valueOf(fachada.retornaQtdAlunosFinal(turma.getId())));
        jtQtdReprovados.setText(String.valueOf(fachada.retornaQtdAlunosReprovados(turma.getId())));
        jtEmenta.setText(fachada.buscaDisciplina(turma.getDisciplina()).getEmenta());
                 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbEnviar;
    private javax.swing.JButton jbSair;
    private javax.swing.JPanel jpConsultaTurmas;
    private javax.swing.JScrollPane jpTabelaNotas;
    private javax.swing.JPanel jpTabelaTurma;
    private javax.swing.JPanel jpTelaStatus;
    private javax.swing.JTextArea jtEmenta;
    private javax.swing.JTextField jtNomeTurma;
    private javax.swing.JTextField jtPercentualAprovado;
    private javax.swing.JTextField jtPercentualFinal;
    private javax.swing.JTextField jtPercentualReprovados;
    private javax.swing.JTextField jtQtdAprovados;
    private javax.swing.JTextField jtQtdFinal;
    private javax.swing.JTextField jtQtdReprovados;
    private javax.swing.JTable jtRendimentoEscolar;
    private javax.swing.JTable jtTurma;
    // End of variables declaration//GEN-END:variables
}