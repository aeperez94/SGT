/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

/**
 *
 * @author Agustin
 */
public class PanelAdmin extends javax.swing.JFrame {

    /**
     * Creates new form PanelAdmin
     */
    public PanelAdmin() {
        initComponents();
        setTitle("Panel de Administrador");
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarPac = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnModPac = new javax.swing.JButton();
        btnBorrarPac = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnDeslogearse = new javax.swing.JButton();
        btnRegTurno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrarPac.setText("Registrar Paciente");
        btnRegistrarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPacActionPerformed(evt);
            }
        });

        jLabel1.setText("Panel de Administrador");

        btnModPac.setText("Modificar Paciente");
        btnModPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModPacActionPerformed(evt);
            }
        });

        btnBorrarPac.setText("Borrar Paciente");
        btnBorrarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPacActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir Programa");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnDeslogearse.setText("Deslogearse");
        btnDeslogearse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogearseActionPerformed(evt);
            }
        });

        btnRegTurno.setText("Registrar Turno");
        btnRegTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrarPac)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnBorrarPac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModPac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnDeslogearse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarPac)
                    .addComponent(btnRegTurno))
                .addGap(18, 18, 18)
                .addComponent(btnModPac)
                .addGap(18, 18, 18)
                .addComponent(btnBorrarPac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnDeslogearse)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPacActionPerformed
        // TODO add your handling code here:
        RegistrarPaciente rp = new RegistrarPaciente();
        rp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarPacActionPerformed

    private void btnModPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModPacActionPerformed
        // TODO add your handling code here:
        ModPaciente mp = new ModPaciente();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModPacActionPerformed

    private void btnBorrarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPacActionPerformed
        // TODO add your handling code here:
        EliPaciente mp = new EliPaciente();
        mp.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_btnBorrarPacActionPerformed

    private void btnDeslogearseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogearseActionPerformed
        // TODO add your handling code here:
        RootLogin rl = new RootLogin();
        rl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeslogearseActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegTurnoActionPerformed
        // TODO add your handling code here:
        AltaTurno at = new AltaTurno();
        at.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegTurnoActionPerformed

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
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarPac;
    private javax.swing.JButton btnDeslogearse;
    private javax.swing.JButton btnModPac;
    private javax.swing.JButton btnRegTurno;
    private javax.swing.JButton btnRegistrarPac;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
