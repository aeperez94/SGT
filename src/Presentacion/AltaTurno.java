/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Daos.EspecialidadDao;
import Daos.MedicoDao;
import Entidades.Especialidad;
import Entidades.Medico;
import Negocio.admEspecialidad;
import Negocio.admMedico;
import Negocio.admRelMedEsp;
import Negocio.admTurno;
import Presentacion.PanelAdmin;
import javax.swing.DefaultComboBoxModel;;
/**
 *
 * @author Martin
 */
public class AltaTurno extends javax.swing.JFrame {

    /**
     * Creates new form AltaTurno
     */
    public admEspecialidad admEsp = new admEspecialidad();
    public Especialidad esp1 = new Especialidad();
    public admMedico admMed = new admMedico();
    public Medico med1 = new Medico();
    public PanelAdmin pAdminGral = new PanelAdmin();
    public admTurno tTurnoGral = new admTurno();
    public admRelMedEsp relGral = new admRelMedEsp();
    Integer cont = 0;
    Integer indiceEspecialidad=0;
    
    
    
    private void AddItemEsp(String str1)
    {
        DefaultComboBoxModel yourModel = (DefaultComboBoxModel) cmbEsp.getModel();
        yourModel.addElement(str1);
    }
        private void AddItemMed(String str1)
    {
        DefaultComboBoxModel yourModel = (DefaultComboBoxModel) cmbMedico.getModel();
        yourModel.addElement(str1);
    }
    public AltaTurno() {
        initComponents();
        String nombre;
        
        //OCULTO INTERFAZ
        cmbEsp.setVisible(false);
        cmbMedico.setVisible(false);
        btnX.setVisible(false);
        
        for (int i=0; i<admEsp.especialidades().size();i++)
        {
            nombre = (admEsp.especialidades().get(i).getNombre());
            AddItemEsp(nombre);
        }
        for (int i=0; i<admMed.listarMedicos().size();i++)
        {
            nombre = (admMed.listarMedicos().get(i).getNombre());
            AddItemMed(nombre);
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

        lblReservar = new javax.swing.JLabel();
        lblExp = new javax.swing.JLabel();
        cmbEsp = new javax.swing.JComboBox();
        lblMedico = new javax.swing.JLabel();
        cmbMedico = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFecha = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnEsp = new javax.swing.JButton();
        btnMedico = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblReservar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblReservar.setText("Reservar Turno");

        lblExp.setText("Especialidad");

        cmbEsp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEspItemStateChanged(evt);
            }
        });
        cmbEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEspActionPerformed(evt);
            }
        });

        lblMedico.setText("Medico");

        tableFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableFecha);

        btnAceptar.setText("Aceptar");

        btnVolver.setText("Volver");

        btnEsp.setText("Por Especialidad");
        btnEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspActionPerformed(evt);
            }
        });

        btnMedico.setText("Por Medico");

        btnX.setText("X");

        btnBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblReservar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAceptar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblExp)
                                    .addComponent(lblMedico))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbEsp, 0, 176, Short.MAX_VALUE)
                                    .addComponent(cmbMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnX)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblReservar)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEsp)
                    .addComponent(btnMedico)
                    .addComponent(btnX))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblExp)
                            .addComponent(cmbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMedico)
                            .addComponent(cmbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnVolver))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspActionPerformed
        // TODO add your handling code here:
        //MODIFICO INTERFAZ
        cmbEsp.setVisible(true);
        btnMedico.setVisible(false);
        btnX.setVisible(true);
        
    }//GEN-LAST:event_btnEspActionPerformed

    private void cmbEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEspActionPerformed
        // TODO add your handling code here:
        //cmbMedico.removeAllItems();

        
        
    }//GEN-LAST:event_cmbEspActionPerformed

    private void cmbEspItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEspItemStateChanged
        // TODO add your handling code here:
        
                String espCmb = (String)cmbEsp.getSelectedItem();
        String medCmb;
        Boolean visible=false;
        
        
        for(int i=0; i<admEsp.especialidades().size();  i++){
            if(admEsp.especialidades().get(i).getNombre().equals(espCmb)){
                indiceEspecialidad=i;     
            }          
        }
        
        
        
        for(int i=0; i<relGral.mostrarRelacion().size();i++){
            
            if(relGral.mostrarRelacion().get(i).getIdEspecialidad().equals(indiceEspecialidad)){
            
                medCmb = relGral.mostrarRelacion().get(i).getIdMedico().getNombre();
                AddItemMed(medCmb);
                visible=true;
            
            }
            
    
        }
        
            cmbMedico.setVisible(true);
    }//GEN-LAST:event_cmbEspItemStateChanged
    
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
            java.util.logging.Logger.getLogger(AltaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaTurno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEsp;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnX;
    private javax.swing.JComboBox cmbEsp;
    private javax.swing.JComboBox cmbMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExp;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblReservar;
    private javax.swing.JTable tableFecha;
    // End of variables declaration//GEN-END:variables
}
