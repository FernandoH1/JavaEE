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
        this.setSize(489, 432);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 62, -1, 152));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 257, -1, 163));

        jLabel1.setText("Cantidad:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("0");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 20, -1, -1));

        jLabel3.setText("Productos Selecionados:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 230, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, 20));

        fondo.setBackground(new java.awt.Color(240, 218, 168));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/fondo.jpg"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 450));
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
            jTable1.setDefaultRenderer(Object.class, new ImgTabla());
            jTable1.setRowHeight(40);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
            jTable2.setDefaultRenderer(Object.class, new ImgTabla());
            jTable2.setRowHeight(40);
        }
    }
}
