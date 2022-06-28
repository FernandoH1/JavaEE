package Boutique.gui;

import Boutique.io.Accesorio;
import Boutique.io.Producto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class ListaAccesorio extends javax.swing.JPanel implements ListaProductos{

    private ArrayList<Accesorio> productoSelecioandos;
    private ArrayList<Accesorio> accesorios;
    
    public ListaAccesorio(ArrayList<Accesorio> accesorio) {
        this.accesorios = accesorio;
        productoSelecioandos = new ArrayList();
        initComponents();
        mostrarAccesorio(accesorio);
        this.setBounds(0, 0, 500, 500);
        this.setSize(489, 432);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Color", "id", "stock"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 141));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Color", "id", "stock"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 141));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Cantidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel5.setText("0");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Productos Selecionados:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 20));

        fondo.setBackground(new java.awt.Color(240, 218, 168));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/fondo.jpg"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 500, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int indice = jTable1.getSelectedRow();
        System.out.println(indice);
        añadirProductoSelecionado(indice);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
        for(Accesorio accesorio: productoSelecioandos){
            productos.add(accesorio);
        }
        return productos;
    }
    
    private void añadirProductoSelecionado(int indice) {
        productoSelecioandos.add((Accesorio) accesorios.get(indice));
        mostrarProductoSelecionados();
    }
    
    private void mostrarProductoSelecionados(){
        DefaultTableModel tableProductos = (DefaultTableModel) jTable2.getModel();
        jTable2.removeAll();
        Iterator<Accesorio> it = productoSelecioandos.iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Accesorio next = it.next();
            Object[] fila = new Object[3];
            fila[1] = next.getId();
            JLabel lbl = new JLabel();
            lbl.setOpaque(true);
            lbl.setBackground(new Color(Integer.valueOf(next.getColor())));
            fila[0] = lbl;
            fila[2] = next.getStock();
            tableProductos.addRow(fila);
            jTable2.setRowHeight(40);
        }
    }
    
    public void mostrarAccesorio(List<Accesorio> accesorio){
        DefaultTableModel tableProductos = (DefaultTableModel) jTable1.getModel();
        Iterator<Accesorio> it = accesorio.iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Accesorio next = it.next();
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
