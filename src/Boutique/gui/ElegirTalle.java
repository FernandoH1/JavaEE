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
        this.setSize(540, 615);
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
        index = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 52, 87, 21));

        index.setText("0");
        getContentPane().add(index, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 14, 20, -1));

        total.setText("0");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 35, 20, -1));

        jLabel1.setText("Indice:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, -1, -1));

        jLabel2.setText("Total:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 35, -1, -1));

        panel.setLayout(null);
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 490, 430));

        jPanel1.setBackground(new java.awt.Color(240, 218, 168));

        next.setText("Siguiente");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(405, Short.MAX_VALUE)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(537, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(148, 148, 148))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 710));

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
        System.out.println("Indice: "+this.indice);
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
                System.out.println("ESTE ES AC: "+producto.getClass().getSimpleName());
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
    private javax.swing.JPanel jPanel1;
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
