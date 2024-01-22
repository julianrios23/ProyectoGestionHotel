package vistas;


import conexion.InsertarActualizarEliminar;
import conexion.Consultas;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Julian Rios
 */
public class adminUsuarios extends javax.swing.JFrame {

    public adminUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabBusqueda = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setText("Bienvenido Administrador!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 26, 549, 92));

        btnSalir.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(102, 51, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\exit.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Salir del Sistema");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Buscar Por Nombre o Mail");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 180, 160, 30));

        txtMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMail.setToolTipText("Busca Datos");
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 182, 250, 30));

        btnBuscar.setBackground(new java.awt.Color(102, 51, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 182, -1, 30));

        jButton2.setBackground(new java.awt.Color(102, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 180, -1, 30));

        tabBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre y Apellido", "Mail", "Pregunta Seguridad", "Dirección", "Estado"
            }
        ));
        tabBusqueda.setToolTipText("Lista Usuarios");
        tabBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabBusquedaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabBusqueda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 224, 1330, 500));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel4.setText("Julian Rios Developer - @Todos los derechos reservados - 2023");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 740, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\admin Home.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Esta seguro de cerrar la aplicación?", "ATENCION !!!", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new adminUsuarios().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        ResultSet rs = Consultas.getResultSet("select *from usuarios");
        DefaultTableModel model = (DefaultTableModel) tabBusqueda.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(6), rs.getString(7)});

            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(adminUsuarios.this, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String nomPorMail = txtMail.getText();

        ResultSet rs = Consultas.getResultSet("select *from usuarios where name like '%" + nomPorMail + "%'");
        DefaultTableModel model = (DefaultTableModel) tabBusqueda.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(6), rs.getString(7)});

            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(adminUsuarios.this, e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tabBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBusquedaMouseClicked

        int index = tabBusqueda.getSelectedRow();
        TableModel model = tabBusqueda.getModel();
        String mail = model.getValueAt(index, 1).toString();
        String estado = model.getValueAt(index, 4).toString();
        if (estado.equals("true")) {
            estado = "false";
        } else {
            estado = "true";
        }
        try {
            int x = JOptionPane.showConfirmDialog(adminUsuarios.this, "Quieres cambiar el estado de " + mail + "", "ATENCION !!", JOptionPane.YES_NO_OPTION);
            if( x == 0){
            InsertarActualizarEliminar.setData("update usuarios set estado ='"+estado+"'", "Estado modificado correctamente !");
                setVisible(false);
                new adminUsuarios().setVisible(true);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tabBusquedaMouseClicked

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
//            java.util.logging.Logger.getLogger(adminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(adminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(adminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(adminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new adminUsuarios().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabBusqueda;
    private javax.swing.JTextField txtMail;
    // End of variables declaration//GEN-END:variables
}
