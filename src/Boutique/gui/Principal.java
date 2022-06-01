package Boutique.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Boutique/Image/LogoAnita.png")).getImage());
        this.setTitle("Boutique Anita");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Productos = new javax.swing.JButton();
        CLIENTES = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        VENTA = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(240, 196, 129));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.GridLayout(2, 4, 12, 12));

        Productos.setBackground(new java.awt.Color(240, 218, 168));
        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/productos.png"))); // NOI18N
        Productos.setText("PRODUCTOS");
        Productos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Productos.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        jPanel1.add(Productos);

        CLIENTES.setBackground(new java.awt.Color(240, 218, 168));
        CLIENTES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/clientes.png"))); // NOI18N
        CLIENTES.setText("CLIENTES");
        CLIENTES.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CLIENTES.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        CLIENTES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLIENTESActionPerformed(evt);
            }
        });
        jPanel1.add(CLIENTES);

        jButton5.setBackground(new java.awt.Color(240, 218, 168));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/Combo.png"))); // NOI18N
        jButton5.setText("COMBOS");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jButton5);

        VENTA.setBackground(new java.awt.Color(240, 218, 168));
        VENTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/Venta.png"))); // NOI18N
        VENTA.setText("VENTA");
        VENTA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VENTA.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        VENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VENTAActionPerformed(evt);
            }
        });
        jPanel1.add(VENTA);

        jButton4.setBackground(new java.awt.Color(240, 218, 168));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/gastos.png"))); // NOI18N
        jButton4.setText("GASTOS");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jButton4);

        jButton6.setBackground(new java.awt.Color(240, 218, 168));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/compra.png"))); // NOI18N
        jButton6.setText("COMPRA");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jButton6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CLIENTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLIENTESActionPerformed
        Clientes c = new Clientes();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CLIENTESActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        Productos p = new Productos();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductosActionPerformed

    private void VENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VENTAActionPerformed
        Venta v = new Venta();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VENTAActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLIENTES;
    private javax.swing.JButton Productos;
    private javax.swing.JButton VENTA;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
