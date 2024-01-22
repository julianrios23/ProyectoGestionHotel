package vistas;


import java.sql.ResultSet;
import javax.swing.JOptionPane;
import conexion.Consultas;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Julian Rios
 */
public class loginUsuarios extends javax.swing.JFrame {

    public loginUsuarios() {
        initComponents();
    }
    private boolean isValidEmail(String email) {

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnOlvPass = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        txtMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 220, -1));

        txtPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 220, -1));

        btnLogin.setBackground(new java.awt.Color(102, 51, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        btnRegistro.setBackground(new java.awt.Color(102, 51, 0));
        btnRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));

        btnOlvPass.setBackground(new java.awt.Color(102, 51, 0));
        btnOlvPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOlvPass.setForeground(new java.awt.Color(255, 255, 255));
        btnOlvPass.setText("Olvidó su Password?");
        btnOlvPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvPassActionPerformed(evt);
            }
        });
        getContentPane().add(btnOlvPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\close.png")); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1271, 20, 50, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\login.PNG")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int option = JOptionPane.showConfirmDialog(loginUsuarios.this, "¿Desea salir del sistema?", "A T E N C I O N ! !", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        int check = 0;
        String mail = txtMail.getText();
        String pass = txtPass.getText();

        if (mail.equals("") || pass.equals("")) {
            check = 1;
            JOptionPane.showMessageDialog(loginUsuarios.this, "Se requiere llenar todos los campos");
        } else if (!isValidEmail(mail)) {
            check = 1;
            JOptionPane.showMessageDialog(loginUsuarios.this, "El correo electrónico no es válido");
        } else if (mail.equals("admin@gmail.com") && pass.equals("root")) {
            check = 1;
            setVisible(false);
            new principal().setVisible(true);
        } else {
            ResultSet rs = Consultas.getResultSet("select * from usuarios where mail='" + mail + "' and password = '" + pass + "'");
            try {
                if (rs.next()) {
                    check = 1;
                    if (rs.getString(7).equals("true")) {
                        setVisible(false);
                        new principal().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(loginUsuarios.this, "Espere la aprobación del Administrador");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(loginUsuarios.this, e);
            }
        }

        if (check == 0) {
            JOptionPane.showMessageDialog(loginUsuarios.this, "Email o Password Incorrecto");
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed

        setVisible(false);
        new registroUsuarios().setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnOlvPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvPassActionPerformed

        setVisible(false);
        new passOlvidado().setVisible(true);
    }//GEN-LAST:event_btnOlvPassActionPerformed

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
            java.util.logging.Logger.getLogger(loginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnOlvPass;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
