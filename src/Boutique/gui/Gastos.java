package Boutique.gui;

import Boutique.io.DetalleDeVenta;
import Boutique.persistencia.Conexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Gastos extends javax.swing.JFrame {
    private String fechaInicio;
    private String fechaFin;
    public Gastos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Boutique/Image/Logo1.png")).getImage());
        this.setTitle("Estadísticas");
        Volver.setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        showStats = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        compras = new javax.swing.JTextField();
        deudas = new javax.swing.JTextField();
        ganancia = new javax.swing.JTextField();
        fechaIni = new com.toedter.calendar.JDateChooser();
        fechaF = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Jpanel3 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anterior.png"))); // NOI18N
        Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anteriorr.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, 50));

        jLabel1.setText("Periodo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setText("Hasta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        showStats.setText("Ver Estadisticas..");
        showStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStatsActionPerformed(evt);
            }
        });
        getContentPane().add(showStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        jLabel4.setText("Ventas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

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
        jScrollPane1.setViewportView(TablaVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 590, 120));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ingreso Total:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Costo de Compra:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Deuda de Clientes:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ganancia Neta:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        total.setEditable(false);
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 80, -1));

        compras.setEditable(false);
        getContentPane().add(compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 80, -1));

        deudas.setEditable(false);
        getContentPane().add(deudas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 80, -1));

        ganancia.setEditable(false);
        getContentPane().add(ganancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 80, -1));

        fechaIni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaIniMouseClicked(evt);
            }
        });
        getContentPane().add(fechaIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, -1));
        getContentPane().add(fechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 140, -1));

        jPanel1.setBackground(new java.awt.Color(240, 218, 168));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 140, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 250, 180));

        jPanel2.setBackground(new java.awt.Color(240, 218, 168));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Desde:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 60));

        Jpanel3.setBackground(new java.awt.Color(240, 218, 168));
        Jpanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Jpanel3.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 360, 260));

        jButton2.setText("Grafico Circular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Jpanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton3.setText("Grafico de Barras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Jpanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        getContentPane().add(Jpanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 380, 340));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void fechaIniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaIniMouseClicked

    }//GEN-LAST:event_fechaIniMouseClicked

    private void showStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStatsActionPerformed
        if(fechaIni.getDate() != null && fechaF.getDate() != null){
            SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
            fechaInicio = date.format(fechaIni.getDate());
            fechaFin = date.format(fechaF.getDate());
            cargarTabla(fechaInicio,fechaFin);
            cargarValores(); 
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar las Fechas Antes para poder ver las Estadísticas"); 
        }
       
        if(fechaF.getDate().before(fechaIni.getDate())){
           JOptionPane.showMessageDialog(this, "La fecha inicio debe de ser menor a la fecha final"); 
        }
       
    }//GEN-LAST:event_showStatsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        graficarCircular();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        graficarCircular();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        graficarBarras();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gastos().setVisible(true);
            }
        });
    }
    
    public void cargarValores(){
        double precio = 0;
        double precioProvedor = 0;
        double deuda = 0;
        for(int i =0; i < TablaVentas.getRowCount() ; i++ ){
           Boutique.io.Venta v = (Boutique.io.Venta) TablaVentas.getValueAt(i, 3);
           precio += v.getPrecioTotal();
           deuda += v.getDeuda();
           List<DetalleDeVenta> dv = Conexion.getInstance().listarDetallesDeVenta(v.getId());
           for(int x=0; x < dv.size(); x++){
               precioProvedor += dv.get(x).getPrecioProvedor()* dv.get(x).getCantidad();
           }
           
        }
       total.setText(String.valueOf(precio));
       compras.setText(String.valueOf(precioProvedor));
       deudas.setText(String.valueOf(deuda));
       double ganancias = 0;
       
       ganancias = (precio - precioProvedor) - deuda;
       ganancia.setText(String.valueOf(ganancias));
       
       
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
    
    public void graficarCircular(){
    panel1.removeAll();
    String titulo = "Grafico de las Estadisticas";
        
        double total = Double.parseDouble(this.total.getText());
        double compras = Double.parseDouble(this.compras.getText());
        double deudas = Double.parseDouble(this.deudas.getText());
        double ganancia = Double.parseDouble(this.ganancia.getText());
                
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue( "Ingreso Total" , total );  
        dataset.setValue( "Costo de Compras" , compras );   
        dataset.setValue( "Deuda de Clientes" , deudas );    
        dataset.setValue( "Ganancia Neta" , ganancia );  

        JFreeChart grafico_circular = ChartFactory.createPieChart(titulo, dataset);

        ChartPanel panel = new ChartPanel(grafico_circular);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(panel1.getWidth(),panel1.getHeight()));
       
        panel1.setBounds(0,0,panel1.getWidth(),panel1.getHeight());
        panel1.setLayout(new BorderLayout());
        panel1.add(panel,BorderLayout.NORTH);

        pack();
        repaint();
    }
    
    public void graficarBarras(){
    panel1.removeAll();
    String titulo = "Grafico de las Estadisticas";
    String barras = ""; 
    String numeracion = "Cantidad"; 
    
        double total = Double.parseDouble(this.total.getText());
        double compras = Double.parseDouble(this.compras.getText());
        double deudas = Double.parseDouble(this.deudas.getText());
        double ganancia = Double.parseDouble(this.ganancia.getText());
                
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue( total ,numeracion , "Ingreso Total");  
        datos.setValue( compras,numeracion , "Costo de Compras");   
        datos.setValue( deudas,numeracion , "Deuda de Clientes");    
        datos.setValue( ganancia ,numeracion , "Ganancia Neta");  

        
        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
            titulo, //nombre del grafico
            barras, //nombres de las barras
            numeracion,
            datos, //datos del grafico
            PlotOrientation.VERTICAL, //Orientacion
            true, //Leyenda de las barras indibividuales de color
            true, //Herraminetas
            false //url del Grafico
);

        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(panel1.getWidth(),panel1.getHeight()));
       
        panel1.setBounds(0,0,panel1.getWidth(),panel1.getHeight());
        panel1.setLayout(new BorderLayout());
        panel1.add(panel,BorderLayout.NORTH);

        pack();
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel3;
    private javax.swing.JTable TablaVentas;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField compras;
    private javax.swing.JTextField deudas;
    private com.toedter.calendar.JDateChooser fechaF;
    private com.toedter.calendar.JDateChooser fechaIni;
    private javax.swing.JTextField ganancia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JButton showStats;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
