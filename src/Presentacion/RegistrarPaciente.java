/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import Daos.PacienteDao;
import Entidades.Plan;
import Negocio.admPaciente;
import Negocio.admPlan;
import javax.swing.JOptionPane;

/**
 *
 * @author Agustin
 */
public class RegistrarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarPaciente
     */
    
    Long idPaciente;
    admPlan planes = new admPlan();
    PacienteDao pdao = new PacienteDao();  
    public PanelAdmin panelGral = new PanelAdmin();
    public admPaciente pacienteGral = new admPaciente();
    public ModPaciente modGral = new ModPaciente();
    String setCmb;
    Boolean existePaciente=false;
    
    public RegistrarPaciente() {
        initComponents();
        setTitle("Registrar Paciente");
        setLocationRelativeTo(null);
        setResizable(false);
        btnModificar.setVisible(false);
        
        //POPULAR COMBOBOX        
        for(int i=0; i<planes.plan().size(); i++){
            cmbPlan.insertItemAt(planes.plan().get(i).getNombre(), i);
        }
         
    }
    
    public RegistrarPaciente(long dni) {
     
        for(int i=0; i<pacienteGral.pacientes().size();i++)
        {
            if(pacienteGral.pacientes().get(i).getDni() == dni)
            {
						initComponents();
        		setLocationRelativeTo(null);
        		setResizable(false);
        		setTitle("Modificar Paciente");
        

        
        		//MODIFICO LA INTERFAZ DE LA VENTANA
        		lbl1.setText("Modificar Paciente");
        		btnModificar.setVisible(true);
        		btnAceptar.setVisible(false);
        
        		//POPULAR COMBOBOX
        		for(int y=0; y<planes.plan().size(); y++){
                            
                            cmbPlan.insertItemAt(planes.plan().get(y).getNombre(), y);
                            
                            if(planes.plan().get(y).getIdPlan().equals(pacienteGral.pacientes().get(i).getIdPlan())){
                                    cmbPlan.setSelectedItem(planes.plan().get(y).getNombre());
                            }
        		}
        
                        
                
      		//TRAIGO LOS DATOS
      
                txtNombre.setText(pacienteGral.pacientes().get(i).getNombre());
                txtApellido.setText(pacienteGral.pacientes().get(i).getApellido());
                txtDni.setText(String.valueOf(pacienteGral.pacientes().get(i).getDni()));
                txtMail.setText(pacienteGral.pacientes().get(i).getMail());
                txtTelefono.setText(pacienteGral.pacientes().get(i).getTelefono());
                cmbPlan.setSelectedItem(pacienteGral.pacientes().get(i).getIdPlan());
                idPaciente = pacienteGral.pacientes().get(i).getIdPaciente();
                
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
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        cmbPlan = new javax.swing.JComboBox();
        lbl1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblPlan = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cmbPlan.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Sin plan"}));

        lbl1.setText("Registrar Paciente");

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblDni.setText("DNI");

        lblTelefono.setText("Telefono");

        lblMail.setText("Mail");

        lblPlan.setText("Plan");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido)
                            .addComponent(lblDni)
                            .addComponent(lblTelefono)
                            .addComponent(lblMail)
                            .addComponent(lblPlan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMail)
                            .addComponent(txtTelefono)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(cmbPlan, 0, 262, Short.MAX_VALUE)
                            .addComponent(txtDni))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnVolver)
                    .addComponent(btnModificar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        
        if(txtNombre.getText().length()==0 || txtApellido.getText().length()==0 || txtDni.getText().length()==0 || txtMail.getText().length()==0 || txtTelefono.getText().length()==0){
        
            JOptionPane.showMessageDialog(null, "Llenar todos los campos", "Campo/s vacios", JOptionPane.ERROR_MESSAGE);
        }else{
                
            try{
                Plan plan = new Plan();
                plan.setIdPlan(planes.numeroPlan((String)cmbPlan.getSelectedItem()));
                existePaciente=false;
                for(int i=0; i<pacienteGral.pacientes().size(); i++){
                    if(pacienteGral.pacientes().get(i).getDni() == Long.parseLong(txtDni.getText()))
                    {
                        existePaciente=true;
                    }
                }
                
                if(existePaciente){
                    JOptionPane.showMessageDialog(null, "Paciente ya existente", "Paciente existente", JOptionPane.ERROR_MESSAGE);
                }else{
                pacienteGral.insertarPaciente(txtNombre.getText(), txtApellido.getText(), Long.parseLong(txtDni.getText()), txtMail.getText(), txtTelefono.getText(), plan);
                JOptionPane.showMessageDialog(null, "Paciente Satisfactoriamente Registrado", "Paciente Registrado", JOptionPane.INFORMATION_MESSAGE);
                panelGral.setVisible(true);
                this.dispose();
                }
                    
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El DNI debe ser numerico. Por favor ingresar nuevamente.", "Error #002", JOptionPane.ERROR_MESSAGE);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error general", "Error #001", JOptionPane.ERROR_MESSAGE);
            }
        }
    
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        
        
        setTitle("Modificar Paciente");
        try{
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            Long dni = Long.parseLong(txtDni.getText());
            String telefono = txtTelefono.getText();
            String mail = txtMail.getText();
            Plan plan = new Plan();
            plan.setIdPlan(planes.numeroPlan((String)cmbPlan.getSelectedItem()));
            
            
            pacienteGral.UpdatePaciente(idPaciente, nombre, apellido, dni, telefono, mail, plan);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Hubo un error modificando el Paciente", "Error", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Paciente Satisfactoriamente Modificado", "Paciente Modificado", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        panelGral.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        panelGral.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox cmbPlan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPlan;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
