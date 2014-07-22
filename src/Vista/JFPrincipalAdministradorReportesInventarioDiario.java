/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.ConexionBasesdeDatos;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class JFPrincipalAdministradorReportesInventarioDiario extends javax.swing.JInternalFrame {
ConexionBasesdeDatos conexion;
    DefaultTableModel modelo;

    /**
     * Creates new form JFPrincipalAdministradorReportesInventarioDiario
     */
    public JFPrincipalAdministradorReportesInventarioDiario(ConexionBasesdeDatos conexion) {
        initComponents();
        this.closable=true;
        this.iconable=true;
        this.conexion=conexion;
                modelo = (DefaultTableModel) jtproducto.getModel();

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
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtproductoid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtproducto = new javax.swing.JTable();

        setBackground(java.awt.SystemColor.activeCaption);
        setTitle("Reporte  Inventario Diario");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/product-sales-report-icon.png"))); // NOI18N

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jButton3.setBackground(new java.awt.Color(224, 224, 224));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButton3.setText("Generar PDF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(224, 224, 224));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButton2.setText("Consultar todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(224, 224, 224));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtproductoid.setBackground(new java.awt.Color(224, 224, 224));
        txtproductoid.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setText("Codigo del producto");

        jtproducto.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Serial", "Precio", "Cantidad Existente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtproducto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtproductoid, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtproductoid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        modelo.setNumRows(0);
 try {
            if (!txtproductoid.getText().equals("")) {
                if (conexion.consultarexistencia("PRODUCTO", "prod_nombre", "prod_id", txtproductoid.getText())) {

                    
                    
                    
           int info1 = conexion.consultarsuma("INVENTARIO", " inve_cantidad ", " WHERE prod_id= " + txtproductoid.getText(),1);
          //  System.out.println(info1+"OPERACION LOS QUE QUEDAN--<");

            int info2 = conexion.consultarsuma("VENTA", " DISTINCT  fact_id,venta_cantidad ", " WHERE prod_id= " + txtproductoid.getText(),2);
            //System.out.println(info1+"OPERACION LOS QUE QUEDAN-->"+info2);
            int operacion = info1 - info2;
                      // System.out.println("OPERACION -->"+operacion);
                    ResultSet info3 = conexion.consultarconcondicion("PRODUCTO ", " prod_nombre,prod_serial,prod_precio ", " prod_id= " + txtproductoid.getText());
                    info3.next();
                    Object a[] = {txtproductoid.getText(), info3.getString(1), info3.getString(2), info3.getDouble(3),operacion};
                    modelo.addRow(a);
                    
                    
                    
                } else {
                    JOptionPane.showMessageDialog(this, "El producto no existe");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El campo producto esta vacio");
            }

        } catch (Exception e) {
     System.out.println("ERROR CON LA BASE DE DATOS");
        }







// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
ResultSet info3 =null;
ResultSet info0=null;

     
            modelo.setNumRows(0);
            
           
        
        try{
        info0=conexion.consultarsincondicion("PRODUCTO", "prod_id");
       while(info0.next()){
           String id=info0.getString(1);
           info3 = conexion.consultarconcondicion("PRODUCTO ", " prod_nombre,prod_serial,prod_precio ", " prod_id= " + id);

                               info3.next();
               String nombre=info3.getString(1);
               String serial=info3.getString(2);
               String precio=info3.getString(3);
           System.out.println("ID PRODUCTO--]>"+id);
            int info1 = conexion.consultarsuma("INVENTARIO", " inve_cantidad ", " WHERE prod_id= " + id,1);
          //  System.out.println(info1+"OPERACION LOS QUE QUEDAN--<");

            int info2 = conexion.consultarsuma("VENTA", " DISTINCT  fact_id,venta_cantidad ", " WHERE prod_id= " + id,2);
            System.out.println(info1+"OPERACION LOS QUE QUEDAN-->"+info2);
            int operacion = info1 - info2;
                      // System.out.println("OPERACION -->"+operacion);
                    Object a[] = {id, nombre,serial, precio,operacion};
                    modelo.addRow(a);
           
       }


        }catch(Exception e){
            System.out.println("error en la conexion"+e.toString());
    }




// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   Calendar calendario=new  GregorianCalendar();
   String  fecha = calendario.get(Calendar.DAY_OF_MONTH) + "/" + (calendario.get(Calendar.MONTH) + 1) + "/" + calendario.get(Calendar.YEAR);
String digite=JOptionPane.showInputDialog(rootPane, "Digite nombre del archivo");

try{
    FileOutputStream archivo = new FileOutputStream("C:\\Documentos Empresa\\REPORTES PDF INVENTARIOS\\"+fecha.replace("/","-")+" -- "+digite+".pdf");
      Document documento = new Document();
      PdfWriter.getInstance(documento, archivo);
      documento.open();
            documento.add(new Paragraph("\n\nREPORTE DE INVENTARIOS GENERADO "+calendario.get(Calendar.DAY_OF_MONTH)+" - "+
                    (calendario.get(Calendar.MONTH)+1)+ " - "+ calendario.get(Calendar.YEAR)+"\n\n\n PRODUCTO(S):\n\n\n"));

       PdfPTable table = new PdfPTable(5);
       
       table.addCell("ID");
            table.addCell("NOMBRE");
            table.addCell("SERIAL");
                        table.addCell("PRECIO");

                        table.addCell("CANTIDAD EXISTENTE");

           for(int i=0;i<jtproducto.getRowCount();i++ ){
                           for(int j=0;j<jtproducto.getColumnCount();j++ ){
                            
                                                    table.addCell(jtproducto.getValueAt(i, j).toString());

                            
                        } 
                            
                            
                        }
                        
                   
            documento.add(table);
      documento.add(new Paragraph("\n\nREPORTE GENERADO EXITOSAMENTE"));
      JOptionPane.showMessageDialog(this,"PDF generedao exitosamente");
      
      if(JOptionPane.showConfirmDialog(this, "Desea abrir el reporte de inventario que acabo de crear")==0){
      File archivoabrir=new File("C:\\Documentos Empresa\\REPORTES PDF INVENTARIOS\\"+fecha.replace("/","-")+" -- "+digite+".pdf");
      Desktop.getDesktop().open(archivoabrir);
      }
    
      
      documento.close();
    
    
}   catch(Exception e){
    
    
    
}     









// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtproducto;
    private javax.swing.JTextField txtproductoid;
    // End of variables declaration//GEN-END:variables
}
