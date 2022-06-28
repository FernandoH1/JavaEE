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
        this.setSize(500, 432);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 167));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Color", "Talle", "id", "stock"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 167));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Productos Selecionados:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cantidad:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("0");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 10, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/fondo.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 450));
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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

