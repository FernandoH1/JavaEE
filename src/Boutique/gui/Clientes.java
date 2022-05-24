package Boutique.gui;
import Boutique.io.Cliente;
import Boutique.persistencia.Conexion;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {

    public Clientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Boutique/Image/LogoAnita.png")).getImage());
        cargarTabla();  
        modificarbtn.setEnabled(false);
        cleanBtn.setEnabled(false);
        Volver.setBackground(new Color(0,0,0,0));
        this.setSize(689, 355);
        this.setTitle("Clientes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        ci = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        dir = new javax.swing.JTextField();
        guardarbtn = new javax.swing.JButton();
        modificarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDatos = new javax.swing.JTable();
        cleanBtn = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel3.setText("C.I:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel4.setText("Teléfono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel5.setText("Dirección:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 181, -1));
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 181, -1));
        getContentPane().add(ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 181, -1));
        getContentPane().add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 181, -1));
        getContentPane().add(dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 181, -1));

        guardarbtn.setText("Guardar");
        guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        modificarbtn.setText("Modificar");
        modificarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(modificarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        TableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "CI", "Teléfono", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 630, 110));

        cleanBtn.setText("Limpiar Campos");
        cleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cleanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anterior.png"))); // NOI18N
        Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anteriorr.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 50, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 710, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void guardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtnActionPerformed
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre.getText());
        cliente.setApellido(apellido.getText());
        cliente.setCi(ci.getText());
        ArrayList telefono = new ArrayList();
        telefono.add(tel.getText());
        cliente.setTelefonos(telefono);
        cliente.setDireccion(dir.getText());
        Conexion.getInstance().guardar(cliente); 
        cargarTabla();
        limpiarCampos();
    }//GEN-LAST:event_guardarbtnActionPerformed

    private void TableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDatosMouseClicked
        Cliente cliente = (Cliente) TableDatos.getValueAt(TableDatos.getSelectedRow(),2);
        nombre.setText(cliente.getNombre());
        apellido.setText(cliente.getApellido());
        ci.setText(cliente.getCi());
        tel.setText(cliente.getTelefonos().toString());
        dir.setText(cliente.getDireccion());
        guardarbtn.setEnabled(false);
        modificarbtn.setEnabled(true);
        cleanBtn.setEnabled(true);
    }//GEN-LAST:event_TableDatosMouseClicked

    private void modificarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarbtnActionPerformed
        Cliente cliente = (Cliente) TableDatos.getValueAt(TableDatos.getSelectedRow(),2);
        cliente.setNombre(nombre.getText());
        cliente.setApellido(apellido.getText());
        cliente.setCi(ci.getText());
        ArrayList telefono = new ArrayList();
        telefono.add(tel.getText());
        cliente.setTelefonos(telefono);
        cliente.setDireccion(dir.getText());
        Conexion.getInstance().guardar(cliente);  
        cargarTabla();
        limpiarCampos();
        guardarbtn.setEnabled(true);
        modificarbtn.setEnabled(false);
    }//GEN-LAST:event_modificarbtnActionPerformed

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        limpiarCampos();
        guardarbtn.setEnabled(true);
        modificarbtn.setEnabled(false);
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    public void cargarTabla(){
        DefaultTableModel tablaClientes = new DefaultTableModel();
        tablaClientes = (DefaultTableModel) TableDatos.getModel();
        Iterator<Cliente> it = Conexion.getInstance().listarClientes().iterator();
        tablaClientes.setRowCount(0);
        while(it.hasNext()){
        Cliente next = it.next();
        Object[] fila = new Object[5];
        fila[0]= next.getNombre();
        fila[1]= next.getApellido();
        fila[2]= next;
        fila[3]= next.getTelefonos();
        fila[4]= next.getDireccion();
        tablaClientes.addRow(fila);
        }
    }
    
    public void limpiarCampos(){
        nombre.setText("");
        apellido.setText("");
        ci.setText("");
        tel.setText("");
        dir.setText("");}
    
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableDatos;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField ci;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JTextField dir;
    private javax.swing.JButton guardarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarbtn;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
