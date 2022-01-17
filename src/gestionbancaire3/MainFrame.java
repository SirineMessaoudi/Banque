/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbancaire3;

import MyFrames.FrameAgence;
import MyFrames.FrameClient;
import MyFrames.FrameCompte;
import MyFrames.FrameEmployé;
import static java.awt.SystemColor.desktop;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus pro
 */
public class MainFrame extends javax.swing.JFrame {

    private FrameClient frameClient = FrameClient.getInstance();
    private FrameCompte frameCompte = FrameCompte.getInstance();
    private FrameAgence frameAgence = FrameAgence.getInstance();
    private FrameEmployé frameEmployé = FrameEmployé.getInstance();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        if (Authentification.code_agence == 1) {
            agence_menu.setEnabled(true);
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

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFichier = new javax.swing.JMenu();
        menuQuitter = new javax.swing.JMenuItem();
        menuClient = new javax.swing.JMenu();
        menuNouveauClient = new javax.swing.JMenuItem();
        MenuVisionnerClient = new javax.swing.JMenuItem();
        menuModification = new javax.swing.JMenuItem();
        menuSuppressionClient = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuFichier1 = new javax.swing.JMenu();
        menuNouveauCompte = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuEmployé = new javax.swing.JMenu();
        menuNouveauEmployé = new javax.swing.JMenuItem();
        MenuVisionnerEmployé = new javax.swing.JMenuItem();
        menuModificationEmployé = new javax.swing.JMenuItem();
        menuSuppressionEmployé = new javax.swing.JMenuItem();
        agence_menu = new javax.swing.JMenu();
        menuNouveauCompte1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 999, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 153));

        menuFichier.setBackground(new java.awt.Color(255, 204, 153));
        menuFichier.setText("File");
        menuFichier.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        menuFichier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFichierActionPerformed(evt);
            }
        });

        menuQuitter.setText("Quitter");
        menuQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuitterActionPerformed(evt);
            }
        });
        menuFichier.add(menuQuitter);

        jMenuBar1.add(menuFichier);

        menuClient.setText("Client");
        menuClient.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        menuNouveauClient.setText("Nouveau");
        menuNouveauClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNouveauClientActionPerformed(evt);
            }
        });
        menuClient.add(menuNouveauClient);

        MenuVisionnerClient.setText("Visionner");
        MenuVisionnerClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVisionnerClientActionPerformed(evt);
            }
        });
        menuClient.add(MenuVisionnerClient);

        menuModification.setText("Modification");
        menuModification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificationActionPerformed(evt);
            }
        });
        menuClient.add(menuModification);

        menuSuppressionClient.setText("Suppression");
        menuSuppressionClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSuppressionClientActionPerformed(evt);
            }
        });
        menuClient.add(menuSuppressionClient);

        jMenuItem6.setText("Fiche Client");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuClient.add(jMenuItem6);

        jMenuBar1.add(menuClient);

        menuFichier1.setText("Compte");
        menuFichier1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        menuFichier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFichier1ActionPerformed(evt);
            }
        });

        menuNouveauCompte.setText("Nouveau");
        menuNouveauCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNouveauCompteActionPerformed(evt);
            }
        });
        menuFichier1.add(menuNouveauCompte);

        jMenuItem1.setText("Supprimer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuFichier1.add(jMenuItem1);

        jMenuItem2.setText("Visionner opérations");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuFichier1.add(jMenuItem2);

        jMenuItem3.setText("Opération");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuFichier1.add(jMenuItem3);

        jMenuBar1.add(menuFichier1);

        menuEmployé.setText("Employé");
        menuEmployé.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N

        menuNouveauEmployé.setLabel("Nouveau");
        menuNouveauEmployé.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNouveauEmployéActionPerformed(evt);
            }
        });
        menuEmployé.add(menuNouveauEmployé);

        MenuVisionnerEmployé.setLabel("Visionner");
        MenuVisionnerEmployé.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVisionnerEmployéActionPerformed(evt);
            }
        });
        menuEmployé.add(MenuVisionnerEmployé);

        menuModificationEmployé.setLabel("Modification");
        menuModificationEmployé.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificationEmployéActionPerformed(evt);
            }
        });
        menuEmployé.add(menuModificationEmployé);

        menuSuppressionEmployé.setLabel("Suppression");
        menuSuppressionEmployé.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSuppressionEmployéActionPerformed(evt);
            }
        });
        menuEmployé.add(menuSuppressionEmployé);

        jMenuBar1.add(menuEmployé);

        agence_menu.setText("Agence");
        agence_menu.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        agence_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agence_menuActionPerformed(evt);
            }
        });

        menuNouveauCompte1.setText("Nouveau");
        menuNouveauCompte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNouveauCompte1ActionPerformed(evt);
            }
        });
        agence_menu.add(menuNouveauCompte1);

        jMenuItem5.setText("Modifier");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        agence_menu.add(jMenuItem5);

        jMenuItem4.setText("Supprimer");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        agence_menu.add(jMenuItem4);

        jMenuBar1.add(agence_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFichierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFichierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuFichierActionPerformed

    private void menuQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuQuitterActionPerformed

    private void menuNouveauClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNouveauClientActionPerformed

        if (frameClient.isVisible()) {
        } else {
            desktop.add(frameClient);
            frameClient.setVisible(true);
        }
        try {

            frameClient.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameClient.toFront();
        frameClient.afficherPanelNouveauClient();
    }//GEN-LAST:event_menuNouveauClientActionPerformed

    private void MenuVisionnerClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVisionnerClientActionPerformed

        if (frameClient.isVisible()) {
        } else {
            desktop.add(frameClient);
            frameClient.setVisible(true);
        }
        try {

            frameClient.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameClient.toFront();
        frameClient.afficherPanelVisionnerClient();
    }//GEN-LAST:event_MenuVisionnerClientActionPerformed

    private void menuModificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificationActionPerformed

        if (frameClient.isVisible()) {
        } else {
            desktop.add(frameClient);
            frameClient.setVisible(true);
        }
        try {

            frameClient.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameClient.toFront();
        frameClient.afficherPanelModificationClient();
    }//GEN-LAST:event_menuModificationActionPerformed

    private void menuSuppressionClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSuppressionClientActionPerformed
        if (frameClient.isVisible()) {
        } else {
            desktop.add(frameClient);
            frameClient.setVisible(true);
        }
        try {

            frameClient.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameClient.toFront();
        frameClient.afficherPanelSuppressionClient();
    }//GEN-LAST:event_menuSuppressionClientActionPerformed

    private void menuNouveauCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNouveauCompteActionPerformed
        if (frameCompte.isVisible()) {
        } else {
            desktop.add(frameCompte);
            frameCompte.setVisible(true);
        }
        try {

            frameCompte.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameCompte.toFront();
        frameCompte.afficherPanelNouveauCompte();
    }//GEN-LAST:event_menuNouveauCompteActionPerformed

    private void menuFichier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFichier1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuFichier1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (frameCompte.isVisible()) {
        } else {
            desktop.add(frameCompte);
            frameCompte.setVisible(true);
        }
        try {

            frameCompte.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameCompte.toFront();
        frameCompte.afficherPanelSuppressionCompte();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (frameCompte.isVisible()) {
        } else {
            desktop.add(frameCompte);
            frameCompte.setVisible(true);
        }
        try {

            frameCompte.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameCompte.toFront();
        frameCompte.afficherPanelOpérationsTable();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (frameCompte.isVisible()) {
        } else {
            desktop.add(frameCompte);
            frameCompte.setVisible(true);
        }
        try {

            frameCompte.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameCompte.toFront();
        frameCompte.afficherPanelOpérations();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menuNouveauCompte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNouveauCompte1ActionPerformed
        if (frameAgence.isVisible()) {
        } else {
            desktop.add(frameAgence);
            frameAgence.setVisible(true);
        }
        try {

            frameAgence.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameAgence.toFront();
        frameAgence.afficherNouveauAgencePanel();
    }//GEN-LAST:event_menuNouveauCompte1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (frameAgence.isVisible()) {
        } else {
            desktop.add(frameAgence);
            frameAgence.setVisible(true);
        }
        try {

            frameAgence.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameAgence.toFront();
        frameAgence.afficherSupprimerAgencePanel();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void agence_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agence_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agence_menuActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if (frameAgence.isVisible()) {
        } else {
            desktop.add(frameAgence);
            frameAgence.setVisible(true);
        }
        try {

            frameAgence.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameAgence.toFront();
        frameAgence.afficherModifierAgencePanel();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if (frameClient.isVisible()) {
        } else {
            desktop.add(frameClient);
            frameClient.setVisible(true);
        }
        try {

            frameClient.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameClient.toFront();
        frameClient.afficherFicheClientPanel();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void menuNouveauEmployéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNouveauEmployéActionPerformed
        // TODO add your handling code here:
         if (frameEmployé.isVisible()) {
        } else {
            desktop.add(frameEmployé);
            frameEmployé.setVisible(true);
        }
        try {

            frameEmployé.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameEmployé.toFront();
        frameEmployé.afficherPanelNouveauEmployé();
        
    }//GEN-LAST:event_menuNouveauEmployéActionPerformed

    private void MenuVisionnerEmployéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVisionnerEmployéActionPerformed
        // TODO add your handling code here:
 if (frameEmployé.isVisible()) {
        } else {
            desktop.add(frameEmployé);
            frameEmployé.setVisible(true);
        }
        try {

            frameEmployé.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameEmployé.toFront();
        frameEmployé.afficherPanelVisionnerEmployé();
                                          
    }//GEN-LAST:event_MenuVisionnerEmployéActionPerformed

    private void menuModificationEmployéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificationEmployéActionPerformed
        // TODO add your handling code here:
        if (frameEmployé.isVisible()) {
        } else {
            desktop.add(frameEmployé);
            frameEmployé.setVisible(true);
        }
        try {

            frameEmployé.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameEmployé.toFront();
        frameEmployé.afficherPanelModificationEmployé();
    }//GEN-LAST:event_menuModificationEmployéActionPerformed

    private void menuSuppressionEmployéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSuppressionEmployéActionPerformed
        // TODO add your handling code here:
        if (frameEmployé.isVisible()) {
        } else {
            desktop.add(frameEmployé);
            frameEmployé.setVisible(true);
        }
        try {

            frameEmployé.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        frameEmployé.toFront();
        frameEmployé.afficherPanelSuppressionEmployé();
    }//GEN-LAST:event_menuSuppressionEmployéActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuVisionnerClient;
    private javax.swing.JMenuItem MenuVisionnerEmployé;
    private javax.swing.JMenu agence_menu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu menuClient;
    private javax.swing.JMenu menuEmployé;
    private javax.swing.JMenu menuFichier;
    private javax.swing.JMenu menuFichier1;
    private javax.swing.JMenuItem menuModification;
    private javax.swing.JMenuItem menuModificationEmployé;
    private javax.swing.JMenuItem menuNouveauClient;
    private javax.swing.JMenuItem menuNouveauCompte;
    private javax.swing.JMenuItem menuNouveauCompte1;
    private javax.swing.JMenuItem menuNouveauEmployé;
    private javax.swing.JMenuItem menuQuitter;
    private javax.swing.JMenuItem menuSuppressionClient;
    private javax.swing.JMenuItem menuSuppressionEmployé;
    // End of variables declaration//GEN-END:variables
}
