/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import Basicas.Professor;
import Negocio.Fachada;

/**
 *
 * @author Arthur
 */
public class TelaPrincipalProfessor extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalProfessor
     */
    
    private Professor professorUser; 
    Fachada fachada;
    
    public TelaPrincipalProfessor(Professor professorUser) {
        this.professorUser = professorUser;
        this.fachada = Fachada.getInstance();
        initComponents();
        jtNomeprof.setText(professorUser.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpProfessor = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNomeprof = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmConsultas = new javax.swing.JMenu();
        jmiTurma = new javax.swing.JMenuItem();
        jmiAtividadesNotas = new javax.swing.JMenuItem();
        jmStatus = new javax.swing.JMenuItem();
        jmAcoes = new javax.swing.JMenu();
        jmiEntraTurma = new javax.swing.JMenuItem();
        jmiDispensaTurma = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Professor");
        setResizable(false);
        getContentPane().setLayout(null);

        jtNomeprof.setEditable(false);
        jScrollPane1.setViewportView(jtNomeprof);

        jdpProfessor.add(jScrollPane1);
        jScrollPane1.setBounds(680, 10, 140, 30);

        getContentPane().add(jdpProfessor);
        jdpProfessor.setBounds(0, 0, 830, 500);

        jmConsultas.setText("Consultas");

        jmiTurma.setText("Turmas");
        jmConsultas.add(jmiTurma);

        jmiAtividadesNotas.setText("Atividades e Notas");
        jmiAtividadesNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAtividadesNotasActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiAtividadesNotas);

        jmStatus.setText("Status Turma");
        jmConsultas.add(jmStatus);

        jMenuBar1.add(jmConsultas);

        jmAcoes.setText("Ações");

        jmiEntraTurma.setText("Entrar em Turma");
        jmiEntraTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEntraTurmaActionPerformed(evt);
            }
        });
        jmAcoes.add(jmiEntraTurma);

        jmiDispensaTurma.setText("Dispensar Turma");
        jmiDispensaTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDispensaTurmaActionPerformed(evt);
            }
        });
        jmAcoes.add(jmiDispensaTurma);

        jMenuBar1.add(jmAcoes);

        jMenu1.setText("Sair");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(850, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        TelaLogin telalogin = new TelaLogin();
        this.setVisible(false);
        telalogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jmiDispensaTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDispensaTurmaActionPerformed
        // TODO add your handling code here:
        jofConsultaTurmaDisponivel consultaTurmaProfessor = new jofConsultaTurmaDisponivel(professorUser, 2);
        jdpProfessor.add(consultaTurmaProfessor); 
        consultaTurmaProfessor.setVisible(true);
    }//GEN-LAST:event_jmiDispensaTurmaActionPerformed

    private void jmiEntraTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEntraTurmaActionPerformed
        // TODO add your handling code here:
        jofConsultaTurmaDisponivel consultaTurmaProfessor = new jofConsultaTurmaDisponivel(professorUser, 1);
        jdpProfessor.add(consultaTurmaProfessor); 
        consultaTurmaProfessor.setVisible(true);
    }//GEN-LAST:event_jmiEntraTurmaActionPerformed

    private void jmiAtividadesNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAtividadesNotasActionPerformed
        // TODO add your handling code here:
        jofAtividadesProfessor telaAtividadeNota = new jofAtividadesProfessor(professorUser);
        jdpProfessor.add(telaAtividadeNota);
        telaAtividadeNota.setVisible(true);
    }//GEN-LAST:event_jmiAtividadesNotasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               /* new TelaPrincipalProfessor().setVisible(true);*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane jdpProfessor;
    private javax.swing.JMenu jmAcoes;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuItem jmStatus;
    private javax.swing.JMenuItem jmiAtividadesNotas;
    private javax.swing.JMenuItem jmiDispensaTurma;
    private javax.swing.JMenuItem jmiEntraTurma;
    private javax.swing.JMenuItem jmiTurma;
    private javax.swing.JTextPane jtNomeprof;
    // End of variables declaration//GEN-END:variables
}
