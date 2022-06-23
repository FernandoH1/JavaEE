package Boutique.gui;

import Boutique.io.Combo;
import Boutique.io.Producto;
import Boutique.persistencia.Conexion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElegirTalle extends javax.swing.JDialog {
    private List<Producto> productos;
    private int indice = 0;
    private Combo c = null;
    public ElegirTalle(java.awt.Frame parent, boolean modal, Combo combos) {
        super(parent, modal);
        initComponents();
        productos = new ArrayList();
        c = combos;
        buscarProductos(combos.getCombosProductos().get(0).getCodigoProducto());
        indice++;
        if(indice == c.getCombosProductos().size() ){
            next.setText("Finalizar");   
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        index = new javax.swing.JLabel();
        pactual = new javax.swing.JLabel();
        ptotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        next.setText("Siguiente");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        index.setText("0");

        pactual.setText("0");

        ptotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pactual, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(index, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ptotal, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(index)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pactual)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if(indice < c.getCombosProductos().size() ){
            buscarProductos(c.getCombosProductos().get(indice).getCodigoProducto());
            indice++;
            if(indice == c.getCombosProductos().size()){
                next.setText("Finalizar");   
            }
        }else if(indice == c.getCombosProductos().size()){
            //Agregar al Detalle de Venta
        }
    }//GEN-LAST:event_nextActionPerformed

    public void buscarProductos(String p){
        Iterator<Producto> it = Conexion.getInstance().listarProductos(p).iterator();
        while (it.hasNext()) {
            Producto next1 = it.next();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel index;
    public static javax.swing.JButton next;
    private javax.swing.JLabel pactual;
    private javax.swing.JLabel ptotal;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
