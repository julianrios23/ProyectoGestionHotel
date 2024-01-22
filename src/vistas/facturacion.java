package vistas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import conexion.*;
import java.io.File;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Julian Rios
 */
public class facturacion extends javax.swing.JFrame {

    public facturacion() {
        initComponents();
        SimpleDateFormat x = new SimpleDateFormat("dd MMMM, yyyy");
        Calendar cal = Calendar.getInstance();
        String form = x.format(cal.getTime());// fecha formateada
        txtBusca.setText(form);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Domicilio", "Teléfono", "Género", "Mail", "Dni/Pasap", "Nacionalidad", "Check IN", "Nro. Hab.", "Plazas", "Tipo Hab.", "Precio x Noche", "Estadia", "Precio Total", "Check OUT"
            }
        ));
        tab1.setToolTipText("CLICK EN HUESPED");
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab1);
        if (tab1.getColumnModel().getColumnCount() > 0) {
            tab1.getColumnModel().getColumn(15).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 164, 1190, 348));

        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\close.png")); // NOI18N
        btnSalir.setToolTipText("Cierra Ventana");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 17, 48, 48));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\Customer Details Bill.png")); // NOI18N
        jLabel1.setText("Facturación - Detalles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 238, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Julian Rios Developre @Todos los derechos reservados - 2023");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 524, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Busqueda por Check Out");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 88, -1, -1));

        txtBusca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 85, 180, -1));

        btnBuscar.setBackground(new java.awt.Color(102, 51, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 85, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Click Sobre Ciente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\all pages background.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ResultSet rs = Consultas.getResultSet("select *from check_in where check_out is not NULL");
        DefaultTableModel m = (DefaultTableModel) tab1.getModel();
        try {
            while (rs.next()) {
                m.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                    rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11),
                    rs.getString(12), rs.getString(12), rs.getString(14), rs.getString(15), rs.getString(16)});

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_formComponentShown

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String fechaOut = txtBusca.getText();

        ResultSet rs = Consultas.getResultSet("select *from check_in where check_out='" + fechaOut + "'");
        DefaultTableModel m = (DefaultTableModel) tab1.getModel();
        m.setRowCount(0);
        try {
            while (rs.next()) {
                m.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                    rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11),
                    rs.getString(12), rs.getString(12), rs.getString(14), rs.getString(15), rs.getString(16)});

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked

        String ruta = "D:\\factura-";
        int index = tab1.getSelectedRow();
        TableModel m = tab1.getModel();
        String nom = m.getValueAt(index, 1).toString();
        try {
            String rutaPDF = ruta + nom + ".pdf";

            if (new File(rutaPDF).exists()) {

                String rutaAdobe = "C:\\Program Files\\Adobe\\Acrobat DC\\Acrobat\\Acrobat.exe";

                File adobeReader = new File(rutaAdobe);
                if (adobeReader.exists()) {

                    Process pro = Runtime.getRuntime().exec(new String[]{rutaAdobe, rutaPDF});
                } else {
                    JOptionPane.showMessageDialog(null, "Adobe Reader no está instalado o la ruta es incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al imprimir la factura: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_tab1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tab1;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
