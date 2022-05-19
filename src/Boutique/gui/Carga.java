package Boutique.gui;

import Boutique.persistencia.Conexion;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Carga extends javax.swing.JFrame implements Runnable {

   private Thread tiempo = null;

    public Carga() {
        initComponents();
        this.setAlwaysOnTop(true);
        this.setSize(500,300);
        this.setIconImage(new ImageIcon(getClass().getResource("/Boutique/Image/LogoAnita.png")).getImage());
        this.setBackground(new Color(0,0,0,0));
        this.setLocationRelativeTo(null);
        //System.out.println(getClass().getResource("/Boutique/Image/GifCarga.gif"));
        ImageIcon icono2 = new ImageIcon(getClass().getResource("/Boutique/Image/GifCarga.gif"));
        jLabel1.setIcon(icono2);
        jLabel1.setSize(400,300);
        jLabel1.setLocation(0, 0);
        tiempo = new Thread(this);
        new Inicio().start();
        tiempo.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 140, 34, 15);

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        if (tiempo != null) {
            try {
                Principal p = new Principal();
//                this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
//                p.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                Thread.sleep(4000);
                p.setVisible(true);

                this.dispose();
//                Thread.sleep(1000);

            } catch (InterruptedException ex) {

            }
        }
    }
    
    public final class Inicio extends Thread {

    public Inicio() {

    }

    @Override
    public void run() {
        Conexion.getInstance().getEntity();
//        p.setVisible(true);
    }
    }  
    
}
