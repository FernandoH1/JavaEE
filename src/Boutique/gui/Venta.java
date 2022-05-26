package Boutique.gui;

import Boutique.io.Accesorio;
import Boutique.io.Calzado;
import Boutique.io.Cliente;
import Boutique.io.Indumentaria;
import Boutique.io.Producto;
import Boutique.persistencia.Conexion;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class Venta extends javax.swing.JFrame {


    public Venta() {
        initComponents();
        
        
        
        List<Cliente> clientes = Conexion.getInstance().listarClientes();
        clientes.forEach(cliente -> ClientesCombo.addItem(cliente));
        
        List<Producto> indumentaria = Conexion.getInstance().listarProductos();
        indumentaria.forEach(indumentarias -> comboI.addItem(indumentarias));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        tipoVentaCombo = new javax.swing.JComboBox<>();
        metodoDePagoCombo = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        Valor = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        cliente = new javax.swing.JTextField();
        Producto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        ClientesCombo = new BD.WideComboBox();
        ProductoCombo2 = new BD.WideComboBox();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        nombreA = new javax.swing.JTextField();
        textura = new javax.swing.JTextField();
        colorA = new javax.swing.JLabel();
        comboA = new BD.WideComboBox();
        jPanel1 = new javax.swing.JPanel();
        nombreC = new javax.swing.JTextField();
        tipoC = new javax.swing.JTextField();
        colorC = new javax.swing.JLabel();
        talleC = new javax.swing.JTextField();
        comboC = new BD.WideComboBox();
        jPanel2 = new javax.swing.JPanel();
        nombreI = new javax.swing.JTextField();
        tipoI = new javax.swing.JTextField();
        talleI = new javax.swing.JTextField();
        colorI = new javax.swing.JLabel();
        comboI = new BD.WideComboBox();
        buscarI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fecha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 24, -1, -1));

        jLabel2.setText("Tipo de Venta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 60, -1, -1));

        jLabel3.setText("Metodo de Pago:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 96, -1, -1));

        jLabel4.setText("Descuento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 24, 145, -1));

        getContentPane().add(tipoVentaCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 55, 150, -1));

        getContentPane().add(metodoDePagoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 91, 150, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 730, 146, -1));

        jLabel5.setText("Tipo de Descuento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, -1, -1));

        jRadioButton1.setText("%");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 700, -1, -1));

        Valor.setText("Valor");
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 700, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("/");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 700, 30, -1));

        jButton1.setText("Sacar Desquento");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, -1, -1));

        jLabel7.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 910, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "Sub-Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 890, 190));

        jLabel8.setText("Cliente:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 20));

        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clienteKeyReleased(evt);
            }
        });
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 110, -1));

        Producto.setText("Producto:");
        getContentPane().add(Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 690, -1, -1));

        jLabel9.setText("Cantidad:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 690, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 690, 50, -1));

        jButton2.setText("Agregar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 80, -1));

        jButton3.setText("Quitar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        jLabel10.setText("SUB-TOTAL:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 660, -1, -1));

        jLabel11.setText("TOTAL:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 700, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 60, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 700, 60, -1));

        jButton4.setText("Confirmar Venta");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 760, 180, -1));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anterior.png"))); // NOI18N
        Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anteriorr.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 50, 50));
        getContentPane().add(ClientesCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 90, -1));
        getContentPane().add(ProductoCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 70, -1));

        jTabbedPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane5MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(240, 218, 168));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(nombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));
        jPanel3.add(textura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, -1));

        colorA.setText("jLabel14");
        jPanel3.add(colorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 30));
        jPanel3.add(comboA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 70, -1));

        jTabbedPane5.addTab("Accesorios", jPanel3);

        jPanel1.setBackground(new java.awt.Color(240, 218, 168));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(nombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));
        jPanel1.add(tipoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, -1));

        colorC.setText("jLabel13");
        jPanel1.add(colorC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 30));
        jPanel1.add(talleC, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 130, -1));
        jPanel1.add(comboC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 50, -1));

        jTabbedPane5.addTab("Calzado", jPanel1);

        jPanel2.setBackground(new java.awt.Color(240, 218, 168));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(nombreI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        tipoI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoIActionPerformed(evt);
            }
        });
        jPanel2.add(tipoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 110, -1));
        jPanel2.add(talleI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 110, -1));

        colorI.setText("jLabel12");
        jPanel2.add(colorI, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, 30));

        comboI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboIKeyReleased(evt);
            }
        });
        jPanel2.add(comboI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 60, -1));

        buscarI.setText("jButton5");
        buscarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIActionPerformed(evt);
            }
        });
        jPanel2.add(buscarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        jTabbedPane5.addTab("Indumentaria", jPanel2);

        getContentPane().add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 620, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteKeyReleased
        if (cliente.getText().length() >= 3) {
            DefaultComboBoxModel<Cliente> mdl = new DefaultComboBoxModel<>();
            Iterator<Cliente> it = Conexion.getInstance().listarClientesByName(cliente.getText()).iterator();
            while (it.hasNext()) {
                Cliente next = it.next();
                mdl.addElement(next);
            }
            ClientesCombo.setModel(mdl);
            if(mdl.getSize() > 0){
            ClientesCombo.showPopup();
            }
            
        }
    }//GEN-LAST:event_clienteKeyReleased

    private void jTabbedPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane5MouseClicked

    }//GEN-LAST:event_jTabbedPane5MouseClicked

    private void tipoIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoIActionPerformed

    private void comboIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboIKeyReleased
        
            DefaultComboBoxModel<Indumentaria> ind = new DefaultComboBoxModel<>();
            Iterator<Indumentaria> it = Conexion.getInstance().listarIndumentariaByNombre(nombreI.getText(),tipoI.getText(), talleI.getText()).iterator();
            while (it.hasNext()) {
                Indumentaria next = it.next();
                ind.addElement(next);
            }
            comboI.setModel(ind);
            if(ind.getSize() > 0){
            comboI.showPopup();
            }
            
        
    }//GEN-LAST:event_comboIKeyReleased

    private void buscarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIActionPerformed

       
       Conexion.getInstance().listarIndumentariaByNombre(nombreI.getText(),tipoI.getText(), talleI.getText());
    }//GEN-LAST:event_buscarIActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BD.WideComboBox ClientesCombo;
    private javax.swing.JLabel Producto;
    private BD.WideComboBox ProductoCombo2;
    private javax.swing.JRadioButton Valor;
    private javax.swing.JButton Volver;
    private javax.swing.JButton buscarI;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cliente;
    private javax.swing.JLabel colorA;
    private javax.swing.JLabel colorC;
    private javax.swing.JLabel colorI;
    private BD.WideComboBox comboA;
    private BD.WideComboBox comboC;
    private BD.WideComboBox comboI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JComboBox<String> metodoDePagoCombo;
    private javax.swing.JTextField nombreA;
    private javax.swing.JTextField nombreC;
    private javax.swing.JTextField nombreI;
    private javax.swing.JTextField talleC;
    private javax.swing.JTextField talleI;
    private javax.swing.JTextField textura;
    private javax.swing.JTextField tipoC;
    private javax.swing.JTextField tipoI;
    private javax.swing.JComboBox<String> tipoVentaCombo;
    // End of variables declaration//GEN-END:variables

}
