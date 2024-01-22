package vistas;


import javax.swing.JOptionPane;
import conexion.InsertarActualizarEliminar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Lenovo
 */
public class registroUsuarios extends javax.swing.JFrame {

    public registroUsuarios() {
        initComponents();
    }
    private boolean isValidEmail(String email) {

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private void limpiar() {
        txtDireccion.setText("");
        txtMail.setText("");
        txtNombre.setText("");
        txtRespuesta.setText("");
        passPass.setText("");
        cmbPregunta.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        passPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbPregunta = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnPass = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\close.png")); // NOI18N
        btnSalir.setToolTipText("Salir del Sistema");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrarse");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre y Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 255, 130, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 295, 114, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 335, -1, 20));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setToolTipText("Ingrese Nombre y Apellido");
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 350, -1));

        txtMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMail.setToolTipText("Ingrese Mail");
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 350, -1));

        passPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passPass.setToolTipText("Pasword");
        getContentPane().add(passPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 350, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pregunta de Seguridad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Respuesta");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, 20));

        txtRespuesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRespuesta.setToolTipText("Respuesta Pregunta Seguridad");
        getContentPane().add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 350, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dirección");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, 20));

        cmbPregunta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre de la primer mascota", "Nombre de su madre", "Nombre escuela primaria", "Color favorito", " " }));
        cmbPregunta.setSelectedIndex(-1);
        cmbPregunta.setToolTipText("Seleccione Pregunta Seguridad");
        getContentPane().add(cmbPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 350, -1));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDireccion.setToolTipText("Ingrese Dirección");
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 350, -1));

        btnRegistro.setBackground(new java.awt.Color(102, 51, 0));
        btnRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrarse");
        btnRegistro.setToolTipText("Oprima para Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, -1, -1));

        btnLogin.setBackground(new java.awt.Color(102, 51, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setToolTipText("Oprima para Loguearse");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, -1));

        btnPass.setBackground(new java.awt.Color(102, 51, 0));
        btnPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPass.setForeground(new java.awt.Color(255, 255, 255));
        btnPass.setText("Olvidó su Password?");
        btnPass.setToolTipText("Ingrese para recuperar pass");
        btnPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassActionPerformed(evt);
            }
        });
        getContentPane().add(btnPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\signup.PNG")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        String nom = txtNombre.getText();
    String mail = txtMail.getText();
    String pass = passPass.getText();
    String preSeg = (String) cmbPregunta.getSelectedItem();
    String resp = txtRespuesta.getText();
    String dir = txtDireccion.getText();

    if (nom.isEmpty() || mail.isEmpty() || pass.isEmpty() || preSeg.isEmpty() || resp.isEmpty() || dir.isEmpty()) {
        JOptionPane.showMessageDialog(registroUsuarios.this, "Campos Incompletos", "ATENCIÓN!!!", DISPOSE_ON_CLOSE);
    } else if (!isValidEmail(mail)) {
        JOptionPane.showMessageDialog(registroUsuarios.this, "El correo electrónico no es válido", "ATENCIÓN!!!", DISPOSE_ON_CLOSE);
    } else {
        String consulta;
        consulta = "insert into usuarios values('" + nom + "','" + mail + "','" + pass + "','" + preSeg + "', '" + resp + "','" + dir + "','false')";
        InsertarActualizarEliminar.setData(consulta, "Registro Exitoso!");
        setVisible(false);
        new registroUsuarios().setVisible(true);
    }
    limpiar();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int option = JOptionPane.showConfirmDialog(registroUsuarios.this, "¿Desea salir del sistema?", "A T E N C I O N ! !", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        setVisible(false);
        new loginUsuarios().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassActionPerformed
        setVisible(false);
        new passOlvidado().setVisible(true);
    }//GEN-LAST:event_btnPassActionPerformed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(registroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(registroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(registroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(registroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new registroUsuarios().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPass;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbPregunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField passPass;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
