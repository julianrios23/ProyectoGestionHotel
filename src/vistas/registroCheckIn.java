package vistas;

import conexion.InsertarActualizarEliminar;
import conexion.Consultas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian Rios
 */
public class registroCheckIn extends javax.swing.JFrame {

    public registroCheckIn() {
        initComponents();
        txtFecha.setEditable(false);
        txtPrecio.setEditable(false);

         SimpleDateFormat x = new SimpleDateFormat("dd MMMM, yyyy");
        Calendar cal = Calendar.getInstance();
        String form = x.format(cal.getTime());// fecha formateada
        txtFecha.setText(form);
    }

    String plazas;
    String habTipo;
    String numHab;
    String precio;

    public void detalleHabitacion() {
        cmbHabNro.removeAllItems();
        txtPrecio.setText("");
        plazas = (String) cmbCamas.getSelectedItem();
        habTipo = (String) cmbTipoHab.getSelectedItem();

        try {
            ResultSet rs = Consultas.getResultSet("select *from habitaciones where plazas='" + plazas + "' and hab_tipo='" + habTipo + "' and estado='Disponible'");

            while (rs.next()) {
                cmbHabNro.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbGene = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNac = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbCamas = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbTipoHab = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnAlojar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cmbHabNro = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\Customer Registration & Check IN.png")); // NOI18N
        jLabel1.setText("Registro Check In");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 300, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\close.png")); // NOI18N
        btnSalir.setToolTipText("Cierra Ventana");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1181, 22, 48, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 107, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 142, 303, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Domicilio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 183, 72, -1));

        txtDom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 218, 303, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Teléfono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 259, -1, -1));

        txtTel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 294, 303, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Género");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 335, -1, -1));

        cmbGene.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbGene.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "OTRO", " " }));
        cmbGene.setSelectedIndex(-1);
        cmbGene.setToolTipText("Seleccione Genero");
        getContentPane().add(cmbGene, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 370, 303, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mail");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 411, -1, -1));

        txtMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 446, 303, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("DNI - Pasaporte");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 107, -1, -1));

        txtDNI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 142, 303, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nacionalidad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 183, -1, -1));

        txtNac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 218, 303, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Check In (Fecha)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 259, -1, -1));

        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 294, 303, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("Julian Rios Developer - @Todos los derechos reservados - 2023");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 528, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Plazas");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 107, -1, -1));

        cmbCamas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbCamas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Doble", "Triple" }));
        cmbCamas.setSelectedIndex(-1);
        cmbCamas.setToolTipText("Cantidad de Plazas");
        cmbCamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCamasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 142, 303, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Habitación Servicio");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 183, -1, -1));

        cmbTipoHab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbTipoHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC C/SERV HAB", "AC+ PISCINA/GIMNASIO", "AC - PISCINA/GIMNASIO", "S/AC", "FULL", " " }));
        cmbTipoHab.setSelectedIndex(-1);
        cmbTipoHab.setToolTipText("Tipo Habitación");
        cmbTipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoHabActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipoHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 218, 303, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Habitación Número");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 259, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Precio Por Noche $");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 335, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 370, 303, -1));

        btnAlojar.setBackground(new java.awt.Color(102, 51, 0));
        btnAlojar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAlojar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlojar.setText("Alojar Huesped");
        btnAlojar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlojarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlojar, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 446, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(102, 51, 0));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 446, -1, -1));

        cmbHabNro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbHabNro.setToolTipText("Número de Habitación");
        cmbHabNro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHabNroActionPerformed(evt);
            }
        });
        getContentPane().add(cmbHabNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 310, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\all pages background.png")); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbCamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCamasActionPerformed
        detalleHabitacion();
    }//GEN-LAST:event_cmbCamasActionPerformed

    private void cmbTipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoHabActionPerformed
        detalleHabitacion();
    }//GEN-LAST:event_cmbTipoHabActionPerformed

    private void cmbHabNroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHabNroActionPerformed
        numHab = (String) cmbHabNro.getSelectedItem();
        try {
            ResultSet rs = Consultas.getResultSet("select *from habitaciones where hab_num='" + numHab + "'");
            while (rs.next()) {
                txtPrecio.setText(rs.getString(4));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cmbHabNroActionPerformed

    private void btnAlojarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlojarActionPerformed

        int id = 1;
        String nom = txtNombre.getText();
        String dom = txtDom.getText();
        String tel = txtTel.getText();
        String gen = (String) cmbGene.getSelectedItem();
        String mail = txtMail.getText();
        String dni = txtDNI.getText();
        String nac = txtNac.getText();
        String checkIn = txtFecha.getText();
        String cam = (String) cmbCamas.getSelectedItem();
        String habTip = (String) cmbTipoHab.getSelectedItem();
        String habNro = (String) cmbHabNro.getSelectedItem();
        String prec_dia = txtPrecio.getText();

        if (nom.isEmpty() || dom.isEmpty() || tel.isEmpty() || gen.isEmpty() || mail.isEmpty() || dni.isEmpty() || nac.isEmpty() || checkIn.isEmpty() || cam.isEmpty() || habTip.isEmpty() || habNro.isEmpty() || prec_dia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!isValidEmail(mail)) {
            JOptionPane.showMessageDialog(this, "El correo electrónico no es válido.", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } else {
            String consulta = "select max(id) from check_in";

            try {
                ResultSet rs = Consultas.getResultSet(consulta);
                while (rs.next()) {
                    id = rs.getInt(1);
                    id = id + 1;

                    consulta = "update habitaciones set estado='No Disponible' where hab_num='" + habNro + "'";
                    InsertarActualizarEliminar.setData(consulta, "");

                    consulta = "insert into check_in(id, nombre, domicilio, telefono, genero, mail, dni, nacionalidad, check_in, hab_num, plazas, hab_tipo, precio_noche) values "
                            + "(" + id + ", '" + nom + "', '" + dom + "', '" + tel + "', '" + gen + "', '" + mail 
                            + "', '" + dni + "', '" + nac + "', '" + checkIn + "', '" + habNro + "', '" + cam + "', '" 
                            + habTip + "', '" + prec_dia + "')";

                    InsertarActualizarEliminar.setData(consulta, "El check IN se realizó correctamente");
                    setVisible(false);
                    new registroCheckIn().setVisible(true);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al acceder a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Formato de número incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado.", "Error", JOptionPane.ERROR_MESSAGE);
            }


    }//GEN-LAST:event_btnAlojarActionPerformed

    }

    private boolean isValidEmail(String email) {

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        setVisible(false);
        new registroCheckIn().setVisible(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
//            java.util.logging.Logger.getLogger(registroCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(registroCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(registroCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(registroCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new registroCheckIn().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlojar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCamas;
    private javax.swing.JComboBox<String> cmbGene;
    private javax.swing.JComboBox<String> cmbHabNro;
    private javax.swing.JComboBox<String> cmbTipoHab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDom;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNac;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
