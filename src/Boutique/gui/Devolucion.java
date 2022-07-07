package Boutique.gui;

import Boutique.io.DetalleDeVenta;
import Boutique.io.Producto;
import Boutique.persistencia.Conexion;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Devolucion extends javax.swing.JFrame {
    
    private String fechaInicio;
    private String fechaFin;

    public Devolucion() {
        initComponents();
        Volver.setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Boutique/Image/Logo1.png")).getImage());
        this.setTitle("Devolución");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Volver = new javax.swing.JButton();
        fechaIni = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalleVenta = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        producto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        total = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fechaF = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anterior.png"))); // NOI18N
        Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anteriorr.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 50, 50));
        getContentPane().add(fechaIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, -1));

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Tipo de Pago", "Metodo de Pago", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 660, 120));

        detalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        detalleVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detalleVentaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(detalleVenta);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 660, 90));

        producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(producto);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 660, 90));

        jButton1.setText("Devolver");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        total.setEditable(false);
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 120, -1));

        jLabel1.setText("TOTAL:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel2.setText("Desde:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(240, 218, 168));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 130, -1));

        jLabel3.setText("Hasta:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 640, 50));

        jPanel2.setBackground(new java.awt.Color(240, 218, 168));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 500, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(fechaIni.getDate() != null && fechaF.getDate() != null){
            SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
            fechaInicio = date.format(fechaIni.getDate());
            fechaFin = date.format(fechaF.getDate());
            cargarTabla(fechaInicio,fechaFin); 
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar las Fechas Antes para poder ver las Estadísticas"); 
        }
        
        if(fechaF.getDate().before(fechaIni.getDate())){
           JOptionPane.showMessageDialog(this, "La fecha inicio debe de ser menor a la fecha final"); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaVentasMouseClicked
        Boutique.io.Venta venta = (Boutique.io.Venta) TablaVentas.getValueAt(TablaVentas.getSelectedRow(), 3);      
        cargarTablaDetalleVenta(venta.getId());
    }//GEN-LAST:event_TablaVentasMouseClicked

    private void detalleVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detalleVentaMouseClicked
        DetalleDeVenta dv = (DetalleDeVenta) detalleVenta.getValueAt(detalleVenta.getSelectedRow(), 0);      
        cargarTablaProducto(dv.getProducto().getId());
    }//GEN-LAST:event_detalleVentaMouseClicked


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
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devolucion().setVisible(true);
            }
        });
    }
    
    public void cargarTabla(String fechaInicio, String fechaFin){
        DefaultTableModel tablaDeVentas = new DefaultTableModel();
        tablaDeVentas = (DefaultTableModel) TablaVentas.getModel();
        Iterator<Boutique.io.Venta> it = Conexion.getInstance().listarVentas(fechaInicio, fechaFin).iterator();
        tablaDeVentas.setRowCount(0);
        while(it.hasNext()){
        Boutique.io.Venta next = it.next();
        Object[] fila = new Object[4];
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        fila[0]= date.format(next.getFechaVenta());
        fila[1]= next.getTipoPago();
        fila[2]= next.getMetodoPago();
        fila[3]= next;
        tablaDeVentas.addRow(fila);
        }
    }
    
    public void cargarTablaDetalleVenta(Long id){
        DefaultTableModel detalleDeVenta = new DefaultTableModel();
        detalleDeVenta = (DefaultTableModel) detalleVenta.getModel();
        Iterator<DetalleDeVenta> it = Conexion.getInstance().listarDetallesDeVenta(id).iterator();
        detalleDeVenta.setRowCount(0);
        while(it.hasNext()){
        DetalleDeVenta next = it.next();
        Object[] fila = new Object[4];
        fila[0]= next;
        fila[1]= next.getCantidad();
        fila[2]= next.getPrecioUnitario();
        fila[3]= next.getPrecioCompra();
        detalleDeVenta.addRow(fila);
        }
    }
    
    public void cargarTablaProducto(Long id){
        DefaultTableModel producto1 = new DefaultTableModel();
        producto1 = (DefaultTableModel) producto.getModel();
        Iterator<Producto> it = Conexion.getInstance().listarProductosPorId(id).iterator();
        producto1.setRowCount(0);
        while(it.hasNext()){
        Producto next = it.next();
        Object[] fila = new Object[2];
        fila[0]= next.getNombre();
        fila[1]= next.getPrecioVenta();
        producto1.addRow(fila);
        }
    }
    
    public void calcularTotal(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    private javax.swing.JButton Volver;
    private javax.swing.JTable detalleVenta;
    private com.toedter.calendar.JDateChooser fechaF;
    private com.toedter.calendar.JDateChooser fechaIni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable producto;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
