package vistas;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.*;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julian Rios Developer
 */
public class registroCheckOut extends javax.swing.JFrame {

    public registroCheckOut() {
        initComponents();

        txtFecIN.setEditable(false);
        txtFecOUT.setEditable(false);
        txtMail.setEditable(false);
        txtNocAloj.setEditable(false);
        txtNom.setEditable(false);
        txtPreFin.setEditable(false);
        txtPrec.setEditable(false);
        txtTel.setEditable(false);

    }
    private static int contadorFacturas = 1001;
    int id = 0;
    String camas;
    String habTipo;
    String habNum;
    String consulta;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFecIN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFecOUT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrec = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNocAloj = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPreFin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        btnOut = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\Customer Check Out.png")); // NOI18N
        jLabel1.setText("Registro Check Out");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 15, 317, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\close.png")); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1197, 15, 44, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel2.setText("Julian Rios Developer @Todos los derechos reservados - 2023");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 565, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Habitación Número");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 82, -1, -1));

        txtBusqueda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 79, 121, -1));

        btnBuscar.setBackground(new java.awt.Color(102, 51, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 77, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Domicilio", "Teléfono", "Género", "Mail", "Dni/Pasaporte", "Nacionalidad", "Check IN", "Nro. Hab.", "Plazas", "Tipo Hab.", "Precio Noche"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 345, 1215, 208));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Registro Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 147, -1, -1));

        txtNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 249, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Fecha Chech IN ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 147, -1, -1));

        txtFecIN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtFecIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 180, 173, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Fecha Check Out");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 147, -1, -1));

        txtFecOUT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtFecOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 180, 227, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Teléfono Registrado");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 147, -1, -1));

        txtTel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 180, 228, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Precio x Noche");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 227, -1, -1));

        txtPrec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtPrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 271, 249, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Noches de Alojamiento");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 227, -1, -1));

        txtNocAloj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtNocAloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 271, 173, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Precio Final a Abonar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 227, -1, -1));

        txtPreFin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtPreFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 271, 227, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Mail");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 227, -1, -1));

        txtMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 271, 228, -1));

        btnOut.setBackground(new java.awt.Color(102, 51, 0));
        btnOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOut.setForeground(new java.awt.Color(255, 255, 255));
        btnOut.setText("Check Out");
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 304, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(102, 51, 0));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 304, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\Proyecto_Gestion_Hotel\\src\\main\\java\\imagenes\\all pages background.png")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ResultSet rs = Consultas.getResultSet("select *from check_in where check_out IS NULL;");
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        try {
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                    rs.getString(8), rs.getString(9), rs.getString(10),
                    rs.getString(11), rs.getString(12), rs.getString(13)

                });
                //System.out.println("ID del cliente: " + id);
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_formComponentShown

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String nroHab = txtBusqueda.getText();
        try {
            ResultSet rs = Consultas.getResultSet("select * from check_in where "
                    + "hab_num='" + nroHab + "' and check_out is NULL");
            if (rs.next()) {
                txtBusqueda.setEditable(false);
                int idd = rs.getInt(1);
                txtNom.setText(rs.getString(2));
                txtFecIN.setText(rs.getString(9));
                txtPrec.setText(rs.getString(13));
                txtTel.setText(rs.getString(4));

                SimpleDateFormat x = new SimpleDateFormat("dd MMMM, yyyy");
                Calendar cal = Calendar.getInstance();
                String form = x.format(cal.getTime());// fecha formateada
                txtFecOUT.setText(form);

                String fecAnt1 = rs.getString(9);
                Date fecAnt2 = x.parse(fecAnt1);
                String fecPos1 = x.format(cal.getTime());
                Date fecPos2 = x.parse(fecPos1);
                double diferencia = (double) (fecPos2.getTime() - fecAnt2.getTime());
                int estadia = (int) (diferencia / (1000 * 60 * 60 * 24));
                if (estadia == 0) {
                    estadia = 1;
                }
                txtNocAloj.setText(String.valueOf(estadia));
                float precio = Float.parseFloat(txtPrec.getText());

                txtPreFin.setText(String.valueOf(estadia * precio));
                txtMail.setText(rs.getString(6));

                habTipo = rs.getString(12);
                camas = rs.getString(11);
            } else {
                JOptionPane.showMessageDialog(this, "El número de habitación no está reservada o no existe");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        setVisible(false);
        new registroCheckOut().setVisible(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        int id = 0;
        String nom = txtNom.getText();
        String tel = txtTel.getText();
        String mail = txtMail.getText();
        String out = txtFecOUT.getText();
        String in = txtFecIN.getText();
        String estadia = txtNocAloj.getText();
        String preFin = txtPreFin.getText();
        habNum = txtBusqueda.getText();

        consulta = "update check_in set dias_estadia='" + estadia + "', precio_total='" + preFin + "', "
                + "check_out='" + out + "' where hab_num='" + habNum + "'";
        InsertarActualizarEliminar.setData(consulta, "");
        consulta = "update habitaciones set estado='Disponible' where hab_num='" + habNum + "'";
        JOptionPane.showMessageDialog(registroCheckOut.this, "Check OUT realizado");
        InsertarActualizarEliminar.setData(consulta, "");

        ///genero el docuemnto
        String ruta = "D:\\factura-";//se guardan aqui las facturas
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();

        try {

            int numFac = contadorFacturas++;
            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "" + nom + ".pdf"));
            doc.open();
            Paragraph para1 = new Paragraph("	   			                         Gestión Hotel Desarrollado por Julian Rios - San Luis - Argentina\n");
            doc.add(para1);
            Paragraph para2 = new Paragraph("************************************************************************************************************");
            doc.add(para2);
            Paragraph para3 = new Paragraph("\tRecibo N°: " + numFac + " NO FISCAL\nDetalles Alojamiento:\nNombre: "
                    + "" + nom + "\nTeléfono : " + tel + "\nEmail: " + mail + "\n ");
            doc.add(para3);
            doc.add(para2);
            Paragraph para4 = new Paragraph("\tHabitación Detalles: \nNúmero: " + txtBusqueda.getText() + "\nHabitación Tipo: "
                    + "" + habTipo + "\nPlazas : " + camas + "\nPrecio x Noche $: " + txtPrec.getText() + "\n ");
            doc.add(para4);
            doc.add(para2);
            PdfPTable tab1 = new PdfPTable(4);
            tab1.addCell("Check IN: " + in);
            tab1.addCell("Check OUT: " + out);
            tab1.addCell("Noches de Alojamiento: " + estadia);
            tab1.addCell("Precio Final $: " + preFin);
            doc.add(tab1);
            doc.add(para2);
            Paragraph para5 = new Paragraph("                         Gracias por alojarse con nosotros!!! -- Esperamos su visita nuevamente");
            doc.add(para5);
            doc.add(para1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();

//        int xx = JOptionPane.showConfirmDialog(null, "Desea imprimir la factura?", "ATENCIÓN!!", JOptionPane.YES_NO_OPTION);
//        if (xx == 0) {
//            try {
//                String rutaPDF = ruta + id + ".pdf";
//
//                if (new File(rutaPDF).exists()) {
//
//                    String rutaAdobe = "C:\\Program Files\\Adobe\\Acrobat DC\\Acrobat\\Acrobat.exe";
//
//                    File adobeReader = new File(rutaAdobe);
//                    if (adobeReader.exists()) {
//
//                        Process pro = Runtime.getRuntime().exec(new String[]{rutaAdobe, rutaPDF});
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Adobe Reader no está instalado o la ruta es incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(null, "El archivo no existe", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Error al imprimir la factura: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//                e.printStackTrace();
//            }
//        }
        setVisible(false);
        new registroCheckOut().setVisible(true);

    }//GEN-LAST:event_btnOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtFecIN;
    private javax.swing.JTextField txtFecOUT;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNocAloj;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPreFin;
    private javax.swing.JTextField txtPrec;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
