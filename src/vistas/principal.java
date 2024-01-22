package vistas;


import javax.swing.JOptionPane;

/**
 *
 * @author Julian Rios
 */
public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdmin = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();
        btnDetalles = new javax.swing.JButton();
        btnCerrarSes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdmin.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(102, 51, 0));
        btnAdmin.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\manage room.png")); // NOI18N
        btnAdmin.setText("Administrar Habitación");
        btnAdmin.setToolTipText("Administrar Habitación");
        btnAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 21, 240, -1));

        btnIn.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        btnIn.setForeground(new java.awt.Color(102, 51, 0));
        btnIn.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\Customer Registration & Check IN.png")); // NOI18N
        btnIn.setText("Registro Check In");
        btnIn.setToolTipText("Registro Check In");
        btnIn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });
        getContentPane().add(btnIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 200, -1));

        btnOut.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        btnOut.setForeground(new java.awt.Color(102, 51, 0));
        btnOut.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\Customer Check Out.png")); // NOI18N
        btnOut.setText("Registro Check Out");
        btnOut.setToolTipText("Registro Check Out");
        btnOut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 220, -1));

        btnDetalles.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        btnDetalles.setForeground(new java.awt.Color(102, 51, 0));
        btnDetalles.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\Customer Details Bill.png")); // NOI18N
        btnDetalles.setText("Facturación");
        btnDetalles.setToolTipText("Factura Cliente");
        btnDetalles.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 200, -1));

        btnCerrarSes.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        btnCerrarSes.setForeground(new java.awt.Color(102, 51, 0));
        btnCerrarSes.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\logout.png")); // NOI18N
        btnCerrarSes.setText("Cerrar Sesión");
        btnCerrarSes.setToolTipText("Cierra Sesión");
        btnCerrarSes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCerrarSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 180, -1));

        btnSalir.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(102, 51, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\exit.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Salir del Sistema");
        btnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\home.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Esta seguro de cerrar sesión?", "ATENCION !!!", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            setVisible(false);
            new loginUsuarios().setVisible(true);
        }
    }//GEN-LAST:event_btnCerrarSesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Esta seguro de cerrar la aplicación?", "ATENCION !!!", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
       
        new gestionHabitaciones().setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        new registroCheckIn().setVisible(true);
    }//GEN-LAST:event_btnInActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        
        new registroCheckOut().setVisible(true);
    }//GEN-LAST:event_btnOutActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        new facturacion().setVisible(true);
    }//GEN-LAST:event_btnDetallesActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCerrarSes;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
