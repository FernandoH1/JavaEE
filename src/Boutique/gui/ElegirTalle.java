package Boutique.gui;

import Boutique.io.Accesorio;
import Boutique.io.Calzado;
import Boutique.io.Combo;
import Boutique.io.CombosProducto;
import Boutique.io.CombosProductosProductos;
import Boutique.io.Indumentaria;
import Boutique.io.Producto;
import Boutique.io.ProductosCombo;
import Boutique.persistencia.Conexion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class ElegirTalle extends javax.swing.JDialog {
    private Venta venta;
    private Combo combo;
    private List<Producto> productos;
    private ArrayList<CombosProductosProductos> combosProductosProductos;
    private ListaProductos listaProductos;
    private List<CombosProducto> codigosProducto;
    private int indice = 0;
    private Combo c = null;
    public ElegirTalle(java.awt.Frame parent, boolean modal, Combo combos, Venta ventas) {
        super(parent, modal);
        initComponents();
        this.setSize(1224, 755);
        this.venta = ventas;
        this.combo = combos;
        combosProductosProductos = new ArrayList();
        codigosProducto = combos.getCombosProductos();
        total.setText(codigosProducto.size()+"");
        index.setText((indice+1)+"");
        c = combos;
        if(indice == codigosProducto.size() ){
            next.setText("Finalizar");   
        }
        mostrarListaProducto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        index = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        next.setText("Siguiente");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        index.setText("0");

        total.setText("0");

        jLabel1.setText("Indice:");

        jLabel2.setText("Total:");

        panel.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(1013, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(next)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(index)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(next)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        CombosProducto cp = combo.getCombosProductos().get(indice);
        CombosProductosProductos cpp = new CombosProductosProductos(cp, listaProductos.getProductoSelecionado());
        combosProductosProductos.add(cpp);
        indice++;
        index.setText((indice+1)+"");
        if(indice+1 == codigosProducto.size() ){
            next.setText("Finalizar");
            mostrarListaProducto(); 
        }else if(indice+1 > codigosProducto.size()){
            cerrar();
            confirmarCombo();
        }else{
        mostrarListaProducto(); 
        }
    }//GEN-LAST:event_nextActionPerformed

    public ArrayList<Producto> buscarProductos(String codigoCombo){
       return (ArrayList<Producto>) Conexion.getInstance().listarProductos(codigoCombo);   
    }
    
    public void mostrarListaProducto(){
        productos = buscarProductos(codigosProducto.get(indice).getCodigoProducto());
        panel.removeAll();
        JPanel jpanel = null;
        String tipo =  getTipoProductoPorCodigo(this.indice);
        System.out.println("TIPO:"+tipo);
        if(tipo.equals("Calzado")){
            ListaCalzado lc = new ListaCalzado(getProductoCodigoCalzado(this.indice));
            jpanel = lc;
            listaProductos = lc;
        }else if(tipo.equals("Accesorio")){
             ListaAccesorio la = new ListaAccesorio(getProductoCodigoAccesorio(this.indice));
             jpanel = la;
             listaProductos = la;
        }else if(tipo.equals("Indumentaria")){
             ListarIndumentaria li = new ListarIndumentaria(getProductoCodigoIndumentaria(this.indice));
             jpanel = li;
             listaProductos = li;
        }
        System.out.println(jpanel);
        jpanel.setVisible(true);
        panel.add(jpanel);
    }
    
    public String getTipoProductoPorCodigo(int indice){
        System.out.println("SiZE:"+this.productos.size()); 
        for(Producto producto : this.productos){
            System.out.println("NASHEE");
            System.out.println(codigosProducto.get(indice).getCodigoProducto());
            System.out.println("ACAAA:"+productos.get(0).getClass().getSimpleName());
            System.out.println("CODIGO:"+producto.getCodigo());
            if(producto.getCodigo().equals(codigosProducto.get(indice).getCodigoProducto())){
                System.out.println("ACAAA1:"+producto.getClass().getSimpleName());
                if(producto.getClass().getSimpleName().equals("Calzado")){
                    return "Calzado";
                }else if(producto.getClass().getSimpleName().equals("Accesorio")){
                    return "Accesorio";
                }else if(producto.getClass().getSimpleName().equals("Indumentaria")){
                    return "Indumentaria";
                }
            }
        }
        return null;
    }
    
    public ArrayList<Calzado> getProductoCodigoCalzado(int indice){
        ArrayList<Calzado> calzados = new ArrayList();
        for(Producto producto : this.productos){
            if(producto.getCodigo().equals(codigosProducto.get(indice).getCodigoProducto())){
                calzados.add((Calzado) producto);
            }
        }
        return calzados;
    }
    
    public ArrayList<Accesorio> getProductoCodigoAccesorio(int indice){
        ArrayList<Accesorio> accesorio = new ArrayList();
        for(Producto producto : this.productos){
            if(producto.getCodigo().equals(codigosProducto.get(indice).getCodigoProducto())){
                accesorio.add((Accesorio) producto);
            }
        }
        return accesorio;
    }
    
    public ArrayList<Indumentaria> getProductoCodigoIndumentaria(int indice){
        ArrayList<Indumentaria> indumentaria = new ArrayList();
        for(Producto producto : this.productos){
            if(producto.getCodigo().equals(codigosProducto.get(indice).getCodigoProducto())){
                indumentaria.add((Indumentaria) producto);
            }
        }
        return indumentaria;
    }
    
    public void cerrar(){
        this.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel index;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JButton next;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel total;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables

    private void confirmarCombo() {
       ProductosCombo productosCombo = new ProductosCombo(this.combo,this.combosProductosProductos);
       this.venta.agregarProductoCombos(productosCombo);
    }
}
