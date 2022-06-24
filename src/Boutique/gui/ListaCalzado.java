package Boutique.gui;

import Boutique.io.Calzado;
import Boutique.io.Producto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class ListaCalzado extends javax.swing.JPanel implements ListaProductos{
    private ArrayList<Calzado> productoSelecioandos;
    private ArrayList<Calzado> calzados;
    public ListaCalzado(ArrayList<Calzado> calzados) {
        initComponents();
        this.calzados = calzados;
        productoSelecioandos = new ArrayList();
        mostrarCalzados(calzados);
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int indice = jTable1.getSelectedRow();
        System.out.println(indice);
        añadirProductoSelecionado(indice);
    }//GEN-LAST:event_jTable1MouseClicked

    public void mostrarCalzados(List<Calzado> calzados){
        DefaultTableModel tableProductos = (DefaultTableModel) jTable1.getModel();
        Iterator<Calzado> it = calzados.iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Calzado next = it.next();
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
        for(Calzado calzado: productoSelecioandos){
            productos.add(calzado);
        }
        return productos;
    }

    private void añadirProductoSelecionado(int indice) {
        productoSelecioandos.add((Calzado) calzados.get(indice));
        mostrarProductoSelecionados();
    }
    
    private void mostrarProductoSelecionados(){
        DefaultTableModel tableProductos = (DefaultTableModel) jTable2.getModel();
        jTable2.removeAll();
        Iterator<Calzado> it = productoSelecioandos.iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Calzado next = it.next();
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
}
