package Boutique.gui;
import Boutique.io.Cliente;
import Boutique.persistencia.Conexion;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {

    public Clientes() {
        initComponents();
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
        cargardatosBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("C.I:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("Dirección:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        guardarbtn.setText("Guardar");
        guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtnActionPerformed(evt);
            }
        });

        modificarbtn.setText("Modificar");
        modificarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarbtnActionPerformed(evt);
            }
        });

        cargardatosBtn.setText("Cargar Datos");
        cargardatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargardatosBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cargardatosBtn)
                            .addComponent(guardarbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modificarbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(apellido)
                                    .addComponent(ci)
                                    .addComponent(tel)
                                    .addComponent(dir))))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarbtn)
                    .addComponent(modificarbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cargardatosBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
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
    }//GEN-LAST:event_guardarbtnActionPerformed

    private void TableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDatosMouseClicked
        nombre.setText(TableDatos.getValueAt(TableDatos.getSelectedRow(),0).toString());
        apellido.setText(TableDatos.getValueAt(TableDatos.getSelectedRow(),1).toString());
        ci.setText(TableDatos.getValueAt(TableDatos.getSelectedRow(),2).toString());
        tel.setText(TableDatos.getValueAt(TableDatos.getSelectedRow(),3).toString());
        dir.setText(TableDatos.getValueAt(TableDatos.getSelectedRow(),4).toString());
    }//GEN-LAST:event_TableDatosMouseClicked

    private void cargardatosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargardatosBtnActionPerformed
        DefaultTableModel tablaClientes = new DefaultTableModel();
        tablaClientes = (DefaultTableModel) TableDatos.getModel();
        Iterator<Cliente> it = Conexion.getInstance().listarClientes().iterator();
        tablaClientes.setRowCount(0);
        while(it.hasNext()){
        Cliente next = it.next();
        Object[] fila = new Object[5];
        fila[0]= next.getNombre();
        fila[1]= next.getApellido();
        fila[2]= next.getCi();
        fila[3]= next.getTelefonos();
        fila[4]= next.getDireccion();
        tablaClientes.addRow(fila);
        }
        
    }//GEN-LAST:event_cargardatosBtnActionPerformed

    private void modificarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarbtnActionPerformed
        Cliente cliente = (Cliente) TableDatos.getValueAt(TableDatos.getSelectedRow(),0);
        cliente.setNombre(nombre.getText());
        cliente.setApellido(apellido.getText());
        cliente.setCi(ci.getText());
        ArrayList telefono = new ArrayList();
        telefono.add(tel.getText());
        cliente.setTelefonos(telefono);
        cliente.setDireccion(dir.getText());
        
        Conexion.getInstance().guardar(cliente);  
    }//GEN-LAST:event_modificarbtnActionPerformed

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
    private javax.swing.JTextField apellido;
    private javax.swing.JButton cargardatosBtn;
    private javax.swing.JTextField ci;
    private javax.swing.JTextField dir;
    private javax.swing.JButton guardarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarbtn;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
