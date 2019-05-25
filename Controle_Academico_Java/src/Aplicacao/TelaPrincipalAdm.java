/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Administrador;
import Negocio.Fachada;

/**
 *
 * @author Arthur
 */
public class TelaPrincipalAdm extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalAdm
     */
    
    private Administrador admUser; 
    Fachada fachada;
    
    
    public TelaPrincipalAdm(Administrador admUser, Fachada fachada) {
        this.admUser = admUser;
        this.fachada = fachada;
        initComponents();
        jtNomeAdm.setText(admUser.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipalAdm = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNomeAdm = new javax.swing.JTextPane();
        jmbTelaAdm = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiCadAluno = new javax.swing.JMenuItem();
        jmiCadProf = new javax.swing.JMenuItem();
        jmiCadDisc = new javax.swing.JMenuItem();
        jmiCadTurma = new javax.swing.JMenuItem();
        jmiCadAdm = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiConsDisc = new javax.swing.JMenuItem();
        jmiConsTurma = new javax.swing.JMenuItem();
        jmiConsProf = new javax.swing.JMenuItem();
        jmiConsuAluno = new javax.swing.JMenuItem();
        jmiCnsuAdm = new javax.swing.JMenuItem();
        jmManutencao = new javax.swing.JMenu();
        jmiManuProf = new javax.swing.JMenuItem();
        jmiManuAluno = new javax.swing.JMenuItem();
        jmiManuTurma = new javax.swing.JMenuItem();
        jmiManuDisc = new javax.swing.JMenuItem();
        jmiManuAdm = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Administrador");
        setResizable(false);
        getContentPane().setLayout(null);

        jtNomeAdm.setEnabled(false);
        jScrollPane1.setViewportView(jtNomeAdm);

        jdpPrincipalAdm.add(jScrollPane1);
        jScrollPane1.setBounds(610, 11, 120, 30);

        getContentPane().add(jdpPrincipalAdm);
        jdpPrincipalAdm.setBounds(0, 0, 740, 440);

        jmCadastro.setText("Cadastro");
        jmCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroActionPerformed(evt);
            }
        });

        jmiCadAluno.setText("Cadastro Aluno");
        jmiCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadAlunoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadAluno);

        jmiCadProf.setText("Cadastro Professor");
        jmiCadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadProfActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadProf);

        jmiCadDisc.setText("Cadastro Disciplina");
        jmiCadDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadDiscActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadDisc);

        jmiCadTurma.setText("Cadastro Turma");
        jmiCadTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadTurmaActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadTurma);

        jmiCadAdm.setText("Cadastro ADM");
        jmiCadAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadAdmActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadAdm);

        jmbTelaAdm.add(jmCadastro);

        jmConsultas.setText("Consultas");

        jmiConsDisc.setText("Disciplina");
        jmiConsDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsDiscActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiConsDisc);

        jmiConsTurma.setText("Turma");
        jmConsultas.add(jmiConsTurma);

        jmiConsProf.setText("Professor");
        jmiConsProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsProfActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiConsProf);

        jmiConsuAluno.setText("Aluno");
        jmiConsuAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsuAlunoActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiConsuAluno);

        jmiCnsuAdm.setText("Adm");
        jmiCnsuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCnsuAdmActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiCnsuAdm);

        jmbTelaAdm.add(jmConsultas);

        jmManutencao.setText("Manutenção");

        jmiManuProf.setText("Professor");
        jmManutencao.add(jmiManuProf);

        jmiManuAluno.setText("Aluno");
        jmManutencao.add(jmiManuAluno);

        jmiManuTurma.setText("Turma");
        jmManutencao.add(jmiManuTurma);

        jmiManuDisc.setText("Disciplina");
        jmManutencao.add(jmiManuDisc);

        jmiManuAdm.setText("Adm");
        jmManutencao.add(jmiManuAdm);

        jmbTelaAdm.add(jmManutencao);

        jMenu1.setText("Sair");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jmbTelaAdm.add(jMenu1);

        setJMenuBar(jmbTelaAdm);

        setSize(new java.awt.Dimension(762, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadProfActionPerformed
        // TODO add your handling code here:
        jofCadastroProfessor telaCadastroProfessor = new jofCadastroProfessor(fachada);
        jdpPrincipalAdm.add(telaCadastroProfessor);
        telaCadastroProfessor.setVisible(true);
    }//GEN-LAST:event_jmiCadProfActionPerformed

    private void jmiCnsuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCnsuAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiCnsuAdmActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        TelaLogin telalogin = new TelaLogin();
        this.setVisible(false);
        telalogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jmiCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadAlunoActionPerformed
        // TODO add your handling code here:
        
        jofCadastroAluno telaCadastroAluno = new jofCadastroAluno(fachada);
        jdpPrincipalAdm.add(telaCadastroAluno);
        telaCadastroAluno.setVisible(true);
        
    }//GEN-LAST:event_jmiCadAlunoActionPerformed

    private void jmCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jmCadastroActionPerformed

    private void jmiCadDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadDiscActionPerformed
        // TODO add your handling code here:
        jofCadastroDisciplina telaCadDisciplina = new jofCadastroDisciplina(fachada);
        jdpPrincipalAdm.add(telaCadDisciplina);
        telaCadDisciplina.setVisible(true);
    }//GEN-LAST:event_jmiCadDiscActionPerformed

    private void jmiCadTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadTurmaActionPerformed
        // TODO add your handling code here:
        jofCadastroTurma telaCadastroTurma = new jofCadastroTurma(fachada);
        jdpPrincipalAdm.add(telaCadastroTurma);
        telaCadastroTurma.setVisible(true);
    }//GEN-LAST:event_jmiCadTurmaActionPerformed

    private void jmiCadAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadAdmActionPerformed
        // TODO add your handling code here:
        jofCadastroAdm telaCadastroAdm = new jofCadastroAdm(fachada);
        jdpPrincipalAdm.add(telaCadastroAdm);
        telaCadastroAdm.setVisible(true);
    }//GEN-LAST:event_jmiCadAdmActionPerformed

    private void jmiConsuAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsuAlunoActionPerformed
        // TODO add your handling code here:
        jofConsultaAluno telaConsultaAluno = new jofConsultaAluno(fachada, 1);
        jdpPrincipalAdm.add(telaConsultaAluno);
        telaConsultaAluno.setVisible(true);
    }//GEN-LAST:event_jmiConsuAlunoActionPerformed

    private void jmiConsDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsDiscActionPerformed
        // TODO add your handling code here:
        jofConsultaDisciplina telaConsultaDisciplina = new jofConsultaDisciplina(fachada, 1);
        jdpPrincipalAdm.add(telaConsultaDisciplina); 
        telaConsultaDisciplina.setVisible(true);
    }//GEN-LAST:event_jmiConsDiscActionPerformed

    private void jmiConsProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsProfActionPerformed
        // TODO add your handling code here:
        
        jofConsultaProfessor telaConsultaProfessor = new jofConsultaProfessor(fachada, 1);
        jdpPrincipalAdm.add(telaConsultaProfessor);
        telaConsultaProfessor.setVisible(true);
        
    }//GEN-LAST:event_jmiConsProfActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /*new TelaPrincipalAdm().setVisible(true);*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane jdpPrincipalAdm;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmManutencao;
    private javax.swing.JMenuBar jmbTelaAdm;
    private javax.swing.JMenuItem jmiCadAdm;
    private javax.swing.JMenuItem jmiCadAluno;
    private javax.swing.JMenuItem jmiCadDisc;
    private javax.swing.JMenuItem jmiCadProf;
    private javax.swing.JMenuItem jmiCadTurma;
    private javax.swing.JMenuItem jmiCnsuAdm;
    private javax.swing.JMenuItem jmiConsDisc;
    private javax.swing.JMenuItem jmiConsProf;
    private javax.swing.JMenuItem jmiConsTurma;
    private javax.swing.JMenuItem jmiConsuAluno;
    private javax.swing.JMenuItem jmiManuAdm;
    private javax.swing.JMenuItem jmiManuAluno;
    private javax.swing.JMenuItem jmiManuDisc;
    private javax.swing.JMenuItem jmiManuProf;
    private javax.swing.JMenuItem jmiManuTurma;
    private javax.swing.JTextPane jtNomeAdm;
    // End of variables declaration//GEN-END:variables
}
