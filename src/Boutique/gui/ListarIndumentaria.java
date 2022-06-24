package Boutique.gui;

import Boutique.io.Indumentaria;
import Boutique.io.Producto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class ListarIndumentaria extends javax.swing.JPanel implements ListaProductos {
    
    private ArrayList<Indumentaria> productoSelecioandos;
    private ArrayList<Indumentaria> indumentarias;
 
    public ListarIndumentaria(ArrayList<Indumentaria> indumentaria) {
        this.indumentarias = indumentaria;
        productoSelecioandos = new ArrayList();
        initComponents();
        mostrarIndumentaria(indumentaria);
        this.setBounds(0, 0, 500, 500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Color", "Talle", "id", "stock"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Color", "Talle", "id", "stock"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("Cantidad:");

        jLabel2.setText("0");

        jLabel3.setText("Productos Selecionados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int indice = jTable1.getSelectedRow();
        System.out.println(indice);
        añadirProductoSelecionado(indice);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    @Override
    public ArrayList<Producto> getProductoSelecionado() {
        ArrayList<Producto> productos = new ArrayList();
        for(Indumentaria indumentaria: productoSelecioandos){
            productos.add(indumentaria);
        }
        return productos;
    }
    
    private void añadirProductoSelecionado(int indice) {
        productoSelecioandos.add((Indumentaria) indumentarias.get(indice));
        mostrarProductoSelecionados();
    }
    
    private void mostrarProductoSelecionados(){
        DefaultTableModel tableProductos = (DefaultTableModel) jTable2.getModel();
        jTable2.removeAll();
        Iterator<Indumentaria> it = productoSelecioandos.iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Indumentaria next = it.next();
            Object[] fila = new Object[4];
            fila[2] = next.getId();
            fila[1] = next;
            JLabel lbl = new JLabel();
            lbl.setOpaque(true);
            lbl.setBackground(new Color(Integer.valueOf(next.getColor())));
            fila[0] = lbl;
            fila[3] = next.getStock();
            tableProductos.addRow(fila);
            jTable2.setRowHeight(40);
        }
    }
    
    public void mostrarIndumentaria(List<Indumentaria> indumentarias){
        DefaultTableModel tableProductos = (DefaultTableModel) jTable1.getModel();
        Iterator<Indumentaria> it = indumentarias.iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Indumentaria next = it.next();
            Object[] fila = new Object[4];
            fila[2] = next.getId();
            fila[1] = next;
            JLabel lbl = new JLabel();
            lbl.setOpaque(true);
            lbl.setBackground(new Color(Integer.valueOf(next.getColor())));
            fila[0] = lbl;
            fila[3] = next.getStock();
            tableProductos.addRow(fila);
            jTable1.setRowHeight(40);
        }
    }
}

