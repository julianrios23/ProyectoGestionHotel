package vistas;


import conexion.InsertarActualizarEliminar;
import conexion.Consultas;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julian Rios Developer
 */
public class gestionHabitaciones extends javax.swing.JFrame {

    public gestionHabitaciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHab = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbHabit = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbCamas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnAgrHab = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\manage room.png")); // NOI18N
        jLabel1.setText("Administrador Habitaciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 27, 332, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\close.png")); // NOI18N
        btnSalir.setToolTipText("Cierra Ventana");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1159, 27, 60, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Julian Rios Developer - @Todos los derechos reservados - 2023");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, -1));

        tableHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Habitación", "Tipo Habitación", "Plazas", "Precio $", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tableHab);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 95, 620, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Número Habitación");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 95, -1, -1));

        txtNum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 128, 320, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tipo Servicio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 167, -1, -1));

        cmbHabit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbHabit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC C/SERV HAB", "AC+ PISCINA/GIMNASIO", "AC - PISCINA/GIMNASIO", "S/AC", "FULL", " ", " " }));
        cmbHabit.setSelectedIndex(-1);
        cmbHabit.setToolTipText("Comodidades Habitación");
        getContentPane().add(cmbHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 200, 320, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Plazas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 239, -1, -1));

        cmbCamas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbCamas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Doble", "Triple", " " }));
        cmbCamas.setSelectedIndex(-1);
        cmbCamas.setToolTipText("Cantidad de Camas");
        getContentPane().add(cmbCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 272, 320, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Precio $");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 311, 67, -1));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 344, 320, -1));

        btnAgrHab.setBackground(new java.awt.Color(102, 51, 0));
        btnAgrHab.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgrHab.setForeground(new java.awt.Color(255, 255, 255));
        btnAgrHab.setText("Agregar Habitación");
        btnAgrHab.setToolTipText("Agrega Habitación");
        btnAgrHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrHabActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgrHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 407, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\all pages background.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgrHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrHabActionPerformed

        String nroHab = txtNum.getText();
        String habTipo = (String) cmbHabit.getSelectedItem();
        String camas = (String) cmbCamas.getSelectedItem();
        String precio = txtPrecio.getText();


        if (nroHab.isEmpty() || habTipo.isEmpty() || camas.isEmpty() || precio.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "ATENCION !!", JOptionPane.ERROR_MESSAGE);
        } else {
            String consulta = "INSERT INTO habitaciones (hab_num, hab_tipo, plazas, precio, estado) VALUES ('" + nroHab + "', '" + habTipo + "', '" + camas + "', '" + precio + "', 'Disponible')";

            InsertarActualizarEliminar.setData(consulta, "Se actualizó correctamente");
            new gestionHabitaciones().setVisible(true);
        }

    }//GEN-LAST:event_btnAgrHabActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        ResultSet rs = Consultas.getResultSet("select *from habitaciones ");
        DefaultTableModel model = (DefaultTableModel) tableHab.getModel();
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});

            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

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
//            java.util.logging.Logger.getLogger(gestionHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(gestionHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(gestionHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(gestionHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new gestionHabitaciones().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrHab;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCamas;
    private javax.swing.JComboBox<String> cmbHabit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHab;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
