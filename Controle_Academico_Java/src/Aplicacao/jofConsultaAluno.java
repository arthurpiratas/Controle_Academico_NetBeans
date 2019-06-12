/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Aluno;
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
public class jofConsultaAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form jofConsultaAluno
     */
    
    Fachada fachada; 
    private DefaultTableModel dtmAlunos;
    private Aluno alunoAUX;
    public jofConsultaAluno(int tipoTela) {
        
        // De acordo com o tipo de tela, iremos definir 1 - consulta e 2 para alterar. 
        initComponents();
        this.fachada = Fachada.getInstance();
        alunoAUX = null;
        
        dtmAlunos = (DefaultTableModel) jtAluno.getModel();
        
        limpaTabela();
        
        for (Aluno aluno : fachada.retornaListaAluno()) {
            Object[] dados = {aluno.getMatricula(), aluno.getNome(), aluno.getDataDeNascimento(), aluno.getNomeUsuario(), aluno.getPerido()};
            dtmAlunos.addRow(dados);
        }
        
        if(tipoTela == 1){
            this.title = "Consulta Aluno"; 
            jpAlteraAluno.setEnabled(false);
            jpAlteraAluno.setVisible(false);
        }else{
            jpConsultaAluno.setEnabled(false);
            jpConsultaAluno.setVisible(false);
            this.title = "Altera Aluno"; 
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

        btgGrupoBotaoAlterar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAluno = new javax.swing.JTable();
        jpAlteraAluno = new javax.swing.JPanel();
        jbSair2 = new javax.swing.JButton();
        jbAtualizar2 = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtPeriodo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtNomeUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtMatricula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtSenha = new javax.swing.JTextField();
        jpConsultaAluno = new javax.swing.JPanel();
        jbExcluirAluno = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();

        setTitle("Consulta Alunos");
        setMinimumSize(new java.awt.Dimension(705, 407));
        getContentPane().setLayout(null);

        jtAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Data Nascimento", "Nome Usuário", "Período"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlunoMouseClicked(evt);
            }
        });
        jtAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtAlunoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtAluno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 210, 740, 230);

        jpAlteraAluno.setLayout(null);

        jbSair2.setText("Sair");
        jbSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSair2ActionPerformed(evt);
            }
        });
        jpAlteraAluno.add(jbSair2);
        jbSair2.setBounds(570, 100, 90, 30);

        jbAtualizar2.setText("Atualizar");
        jbAtualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizar2ActionPerformed(evt);
            }
        });
        jpAlteraAluno.add(jbAtualizar2);
        jbAtualizar2.setBounds(200, 100, 100, 30);

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        jpAlteraAluno.add(jbAlterar);
        jbAlterar.setBounds(30, 100, 90, 30);

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jpAlteraAluno.add(jbLimpar);
        jbLimpar.setBounds(390, 100, 90, 30);

        jLabel1.setText("Matrícula");
        jpAlteraAluno.add(jLabel1);
        jLabel1.setBounds(10, 10, 60, 14);
        jpAlteraAluno.add(jtPeriodo);
        jtPeriodo.setBounds(550, 10, 120, 30);

        jLabel2.setText("Data ");
        jpAlteraAluno.add(jLabel2);
        jLabel2.setBounds(490, 60, 40, 14);
        jpAlteraAluno.add(jtNomeUsuario);
        jtNomeUsuario.setBounds(340, 10, 120, 30);

        jLabel3.setText("Nome");
        jpAlteraAluno.add(jLabel3);
        jLabel3.setBounds(10, 50, 50, 14);
        jpAlteraAluno.add(jtNome);
        jtNome.setBounds(100, 40, 120, 30);

        jLabel4.setText("Período");
        jpAlteraAluno.add(jLabel4);
        jLabel4.setBounds(490, 20, 50, 14);
        jpAlteraAluno.add(jtData);
        jtData.setBounds(550, 50, 120, 30);

        jLabel5.setText("Nome Usuário");
        jpAlteraAluno.add(jLabel5);
        jLabel5.setBounds(260, 20, 80, 14);

        jtMatricula.setEditable(false);
        jpAlteraAluno.add(jtMatricula);
        jtMatricula.setBounds(100, 0, 120, 30);

        jLabel6.setText("Senha");
        jpAlteraAluno.add(jLabel6);
        jLabel6.setBounds(260, 60, 50, 14);
        jpAlteraAluno.add(jtSenha);
        jtSenha.setBounds(340, 50, 120, 30);

        getContentPane().add(jpAlteraAluno);
        jpAlteraAluno.setBounds(0, 0, 720, 150);

        jbExcluirAluno.setText("Exclui Aluno");
        jbExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirAlunoActionPerformed(evt);
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

        javax.swing.GroupLayout jpConsultaAlunoLayout = new javax.swing.GroupLayout(jpConsultaAluno);
        jpConsultaAluno.setLayout(jpConsultaAlunoLayout);
        jpConsultaAlunoLayout.setHorizontalGroup(
            jpConsultaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaAlunoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jbExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jpConsultaAlunoLayout.setVerticalGroup(
            jpConsultaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSair, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jbAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbExcluirAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jpConsultaAluno);
        jpConsultaAluno.setBounds(0, 150, 720, 50);

        setBounds(0, 0, 737, 475);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:
        
        limpaTabela();
        for (Aluno aluno : fachada.retornaListaAluno()) {
            Object[] dados = {aluno.getMatricula(), aluno.getNome(), aluno.getDataDeNascimento(), aluno.getNomeUsuario(), aluno.getPerido()};
            dtmAlunos.addRow(dados);
        }
        
    }//GEN-LAST:event_jbAtualizarActionPerformed

    
    private void limpaTabela(){
        
        if (dtmAlunos.getRowCount() >= 0){
            for (int i=dtmAlunos.getRowCount();i > 0;i--){
                dtmAlunos.removeRow(0);
            }            
        }
    }
    
    private void jbExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirAlunoActionPerformed
        // TODO add your handling code here:
        
        if(jtAluno.getSelectedRow() != -1){
            
           if(fachada.verificaAlunoExiste(jtAluno.getValueAt(jtAluno.getSelectedRow(), 0).toString())){           
           fachada.removeAluno(jtAluno.getValueAt(jtAluno.getSelectedRow(), 0).toString());
           dtmAlunos.removeRow(jtAluno.getSelectedRow());
           JOptionPane.showMessageDialog(rootPane, "Aluno Excluido com Sucesso!");
           }else{
               JOptionPane.showMessageDialog(rootPane, "Este Aluno não existe, favor atualizar a Tabela");
           }            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha");
        }
        
    }//GEN-LAST:event_jbExcluirAlunoActionPerformed

    private void jbSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSair2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSair2ActionPerformed

    private void jbAtualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizar2ActionPerformed
        // TODO add your handling code here:
        limpaTabela();
        for (Aluno aluno : fachada.retornaListaAluno()) {
            Object[] dados = {aluno.getMatricula(), aluno.getNome(), aluno.getDataDeNascimento(), aluno.getNomeUsuario(), aluno.getPerido()};
            dtmAlunos.addRow(dados);
        }

    }//GEN-LAST:event_jbAtualizar2ActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:

        if(jtAluno.getSelectedRow() != -1){
            
            
                alunoAUX = new Aluno(alunoAUX.getId(), jtNome.getText(), null, Integer.parseInt(jtPeriodo.getText()), jtNomeUsuario.getText(), jtSenha.getText(), jtMatricula.getText());
                
                try {
                    fachada.atualizaAluno(alunoAUX);
                    limpaTabela();
                    limpaCampos();
                    JOptionPane.showMessageDialog(rootPane, "Aluno Alterado, favor Atualizar a Tabela!!!");
                } catch (ExcecaoNome ex) {
                    Logger.getLogger(jofConsultaAluno.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                } catch (ExcecaoNomeUsuario ex) {
                    Logger.getLogger(jofConsultaAluno.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
           
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha");
        }

    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        limpaCampos();

    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAlunoKeyReleased
        // TODO add your handling code here:
        if(jtAluno.getSelectedRow() != -1){
            alunoAUX = fachada.buscaAluno(jtAluno.getValueAt(jtAluno.getSelectedRow(), 0).toString());
            jtData.setText("");
            jtMatricula.setText(alunoAUX.getMatricula());
            jtNome.setText(alunoAUX.getNome());
            jtPeriodo.setText(String.valueOf(alunoAUX.getPerido()));
            jtSenha.setText(alunoAUX.getSenha());
            jtNomeUsuario.setText(alunoAUX.getNomeUsuario());
        }
    }//GEN-LAST:event_jtAlunoKeyReleased

    private void jtAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlunoMouseClicked
        // TODO add your handling code here:
            alunoAUX = fachada.buscaAluno(jtAluno.getValueAt(jtAluno.getSelectedRow(), 0).toString());
            jtData.setText("");
            jtMatricula.setText(alunoAUX.getMatricula());
            jtNome.setText(alunoAUX.getNome());
            jtPeriodo.setText(String.valueOf(alunoAUX.getPerido()));
            jtSenha.setText(alunoAUX.getSenha());
            jtNomeUsuario.setText(alunoAUX.getNomeUsuario());
    }//GEN-LAST:event_jtAlunoMouseClicked
    
    private void limpaCampos(){
        
        alunoAUX = null;
        jtData.setText("");
        jtMatricula.setText("");
        jtNome.setText("");
        jtPeriodo.setText("");
        jtSenha.setText("");
        jtNomeUsuario.setText("");
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGrupoBotaoAlterar;
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
    private javax.swing.JButton jbExcluirAluno;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSair2;
    private javax.swing.JPanel jpAlteraAluno;
    private javax.swing.JPanel jpConsultaAluno;
    private javax.swing.JTable jtAluno;
    private javax.swing.JTextField jtData;
    private javax.swing.JTextField jtMatricula;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNomeUsuario;
    private javax.swing.JTextField jtPeriodo;
    private javax.swing.JTextField jtSenha;
    // End of variables declaration//GEN-END:variables
}
