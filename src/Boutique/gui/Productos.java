package Boutique.gui;

import Boutique.io.Accesorio;
import Boutique.io.Calzado;
import Boutique.io.Indumentaria;
import Boutique.persistencia.Conexion;
import Boutique.io.Producto;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class Productos extends javax.swing.JFrame {
String fotoPerfil = "";
    
    public Productos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Boutique/Image/LogoAnita.png")).getImage());
        cargarTablaCalzado();
        cargarTablaInd();
        cargarTablaAcc();
        botonesA();
        ColorIndumentaria.setOpaque(true); 
        ColorIndumentaria.setBackground(new Color(0,0,0,0));
        fondoProducto.setBackground(new Color(240,218,168)); 
        fotoPanel.setVisible(false);
        fotoPanel.setBackground(new Color(240,218,168));
        labelColor.setOpaque(true);
        labelColor.setVisible(false); 
        Volver.setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        proveedor = new javax.swing.JTextField();
        venta = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ColorIndumentaria = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        fotoPanel = new javax.swing.JPanel();
        fondoProducto = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tipoc = new javax.swing.JTextField();
        stockc = new javax.swing.JTextField();
        GuardarC = new javax.swing.JButton();
        EditC = new javax.swing.JButton();
        CleanC = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCalzado = new javax.swing.JTable();
        tallec = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        talle = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        categoria = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        GuardarI = new javax.swing.JButton();
        EditI = new javax.swing.JButton();
        CleanI = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaIndumentaria = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        genero = new javax.swing.JTextField();
        stocki = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        textura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        GuardarA = new javax.swing.JButton();
        EditA = new javax.swing.JButton();
        CleanA = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaAccesorio = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 218, 168));
        setFocusable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anterior.png"))); // NOI18N
        Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anteriorr.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 50, 50));

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("Precio Proveedor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setText("Precio Venta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel4.setText("Marca:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel5.setText("Foto:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });
        getContentPane().add(proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 147, -1));
        getContentPane().add(venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 147, -1));
        getContentPane().add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 147, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/file.png"))); // NOI18N
        jButton1.setText("Selecionar Archivo...");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        ColorIndumentaria.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(ColorIndumentaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 20, 20));

        labelColor.setText("ColorSelecionado:");
        getContentPane().add(labelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 140, 110));
        getContentPane().add(fotoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 180, 140));

        fondoProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("Codigo:");
        fondoProducto.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        fondoProducto.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 147, -1));
        fondoProducto.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 147, -1));

        getContentPane().add(fondoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 550, 140));

        jTabbedPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane5MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 218, 168));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Talle:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel7.setText("Tipo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel8.setText("Color");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel9.setText("Stock:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        tipoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipocActionPerformed(evt);
            }
        });
        jPanel1.add(tipoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 157, -1));
        jPanel1.add(stockc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 157, -1));

        GuardarC.setText("Guardar");
        GuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        EditC.setText("Modificar");
        EditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCActionPerformed(evt);
            }
        });
        jPanel1.add(EditC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        CleanC.setText("Limpiar Datos");
        CleanC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanCActionPerformed(evt);
            }
        });
        jPanel1.add(CleanC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        TablaCalzado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio Proveedor", "Precio Venta", "Marca", "Foto", "Talle", "Tipo", "Color", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaCalzado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCalzadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCalzado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 810, 290));
        jPanel1.add(tallec, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 157, -1));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/color.png"))); // NOI18N
        jButton15.setText("Elegir Color...");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jTabbedPane5.addTab("Calzado", jPanel1);

        jPanel2.setBackground(new java.awt.Color(240, 218, 168));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Talle:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel2.add(talle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 118, -1));

        jLabel15.setText("Tipo:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel2.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 118, -1));

        jLabel16.setText("Categoria:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel2.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 118, -1));

        jLabel17.setText("Color");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/color.png"))); // NOI18N
        jButton11.setText("Elegir Color...");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        GuardarI.setText("Guardar");
        GuardarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarIActionPerformed(evt);
            }
        });
        jPanel2.add(GuardarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        EditI.setText("Modificar");
        EditI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditIActionPerformed(evt);
            }
        });
        jPanel2.add(EditI, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        CleanI.setText("Limpiar Campos");
        CleanI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanIActionPerformed(evt);
            }
        });
        jPanel2.add(CleanI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        TablaIndumentaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio Proveedor", "Precio Venta", "Marca", "Foto", "Talle", "Tipo", "Categoria", "Genero", "Color", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaIndumentaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaIndumentariaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaIndumentaria);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 810, 290));

        jLabel10.setText("Genero:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel2.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 118, -1));
        jPanel2.add(stocki, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 118, -1));

        jLabel18.setText("Stock:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jTabbedPane5.addTab("Indumentaria", jPanel2);

        jPanel3.setBackground(new java.awt.Color(240, 218, 168));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Textura:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        jPanel3.add(textura, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 149, -1));

        jLabel12.setText("Stock:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));
        jPanel3.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 149, -1));

        jLabel13.setText("Color");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/color.png"))); // NOI18N
        jButton7.setText("Elegir Color...");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        GuardarA.setText("Guardar");
        GuardarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarAActionPerformed(evt);
            }
        });
        jPanel3.add(GuardarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        EditA.setText("Modificar");
        EditA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditAActionPerformed(evt);
            }
        });
        jPanel3.add(EditA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        CleanA.setText("Limpiar Campos");
        CleanA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanAActionPerformed(evt);
            }
        });
        jPanel3.add(CleanA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        TablaAccesorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio Proveedor", "Precio Venta", "Marca", "Foto", "Textura", "Color", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaAccesorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAccesorioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaAccesorio);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 790, 290));

        jTabbedPane5.addTab("Accesorios", jPanel3);

        getContentPane().add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1120, 340));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 510));

        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Imágenes", "jpg", "gif", "png");
        jFileChooser1.setFileFilter(filter);
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fotoPerfil = jFileChooser1.getSelectedFile().getPath();
            fotoPanel.setVisible(true);
            Image aux = new ImageIcon(fotoPerfil).getImage();
            ImageIcon perfil = new ImageIcon(aux.getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT)); 
            foto.setIcon(perfil);        
        }
        
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorActionPerformed
        
    }//GEN-LAST:event_proveedorActionPerformed

    private void GuardarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarIActionPerformed
       try {
        Indumentaria producto = new Indumentaria();
        producto.setNombre(nombre.getText());
        double p = Double.parseDouble(proveedor.getText());
        double v = Double.parseDouble(venta.getText());
        producto.setPrecioProveedor(p);
        producto.setPrecioVenta(v);
        producto.setMarca(marca.getText());
        producto.setCodigo(codigo.getText());
        if(!fotoPerfil.equals("")){
        producto.setFoto(convertirImagen(fotoPerfil));
        }
        producto.setTalle(talle.getText());
        producto.setTipo(tipo.getText());
        producto.setCategoria(categoria.getText());
        producto.setSexo(genero.getText());
        producto.setColor(String.valueOf(ColorIndumentaria.getBackground().getRGB()));
        producto.setStock(Integer.valueOf(stocki.getText()));
        Conexion.getInstance().guardar(producto);
        int opcion = JOptionPane.showConfirmDialog(this, "Desea Agregar un Producto similar?", "Consulta", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            talle.setText("");
            stocki.setText("");
            ColorIndumentaria.setBackground(new Color(0,0,0,0));
            foto.setIcon(null);         
        }else{
           limpiarCampos();
        }
        cargarTablaInd();
        fotoPerfil = "";
    } catch (IOException ex) {
        Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
    }  
    }//GEN-LAST:event_GuardarIActionPerformed

    private void GuardarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarAActionPerformed
    try {
        Accesorio producto = new Accesorio();
        producto.setNombre(nombre.getText());
        double p = Double.parseDouble(proveedor.getText());
        double v = Double.parseDouble(venta.getText());
        producto.setPrecioProveedor(p);
        producto.setPrecioVenta(v);
        producto.setMarca(marca.getText());
        producto.setCodigo(codigo.getText());
        if(!fotoPerfil.equals("")){
        producto.setFoto(convertirImagen(fotoPerfil));
        }
        producto.setTextura(textura.getText());
        producto.setColor(String.valueOf(ColorIndumentaria.getBackground().getRGB()));
        producto.setStock(Integer.valueOf(stock.getText()));
        Conexion.getInstance().guardar(producto);
        int opcion = JOptionPane.showConfirmDialog(this, "Desea Agregar un Producto similar?", "Consulta", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            textura.setText("");
            stock.setText("");
            ColorIndumentaria.setBackground(new Color(0,0,0,0));
            foto.setIcon(null);         
        }else{
           limpiarCampos();
        }
        cargarTablaAcc();
    } catch (IOException ex) {
        Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_GuardarAActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ColorChooser();
        labelColor.setVisible(true);
        labelColor.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ColorChooser();
        labelColor.setVisible(true);
        labelColor.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        ColorChooser();
        labelColor.setVisible(true);
        labelColor.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_jButton15ActionPerformed

    private void GuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCActionPerformed
         try {
        Calzado producto = new Calzado();
        producto.setNombre(nombre.getText());
        double p = Double.parseDouble(proveedor.getText());
        double v = Double.parseDouble(venta.getText());
        producto.setPrecioProveedor(p);
        producto.setPrecioVenta(v);
        producto.setMarca(marca.getText());
        producto.setCodigo(codigo.getText());
        if(!fotoPerfil.equals("")){
        producto.setFoto(convertirImagen(fotoPerfil));
        }
        producto.setTalle(tallec.getText());
        producto.setTipo(tipoc.getText());
        producto.setColor(String.valueOf(ColorIndumentaria.getBackground().getRGB()));
        producto.setStock(Integer.valueOf(stockc.getText()));
        Conexion.getInstance().guardar(producto);
        int opcion = JOptionPane.showConfirmDialog(this, "Desea Agregar un Producto similar?", "Consulta", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            tallec.setText("");
            stockc.setText("");
            ColorIndumentaria.setBackground(new Color(0,0,0,0));
            foto.setIcon(null);         
        }else{
           limpiarCampos();
        }
        cargarTablaCalzado();
        fotoPerfil = "";
    } catch (IOException ex) {
        Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);   
    }        
    }//GEN-LAST:event_GuardarCActionPerformed

    private void EditCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCActionPerformed
         try {
        Calzado producto = (Calzado) TablaCalzado.getValueAt(TablaCalzado.getSelectedRow(),5);
        producto.setNombre(nombre.getText());
        double p = Double.parseDouble(proveedor.getText());
        double v = Double.parseDouble(venta.getText());
        producto.setPrecioProveedor(p);
        producto.setPrecioVenta(v);
        producto.setMarca(marca.getText());
        producto.setCodigo(codigo.getText());
        if(!fotoPerfil.equals("")){
           producto.setFoto(convertirImagen(fotoPerfil)); 
        }
        producto.setTalle(tallec.getText());
        producto.setTipo(tipoc.getText());
        producto.setColor(String.valueOf(ColorIndumentaria.getBackground().getRGB()));
        producto.setStock(Integer.valueOf(stockc.getText()));
        Conexion.getInstance().guardar(producto);
        cargarTablaCalzado();
        limpiarCampos();
    } catch (IOException ex) {
        Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);   
    }        
    }//GEN-LAST:event_EditCActionPerformed

    private void CleanCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanCActionPerformed
        limpiarCampos();
        GuardarC.setEnabled(true);
        EditC.setEnabled(false);
    }//GEN-LAST:event_CleanCActionPerformed

    private void CleanIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanIActionPerformed
        limpiarCampos();
        GuardarI.setEnabled(true);
        EditI.setEnabled(false);
    }//GEN-LAST:event_CleanIActionPerformed

    private void CleanAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanAActionPerformed
        limpiarCampos();
        GuardarA.setEnabled(true);
        EditA.setEnabled(false);
    }//GEN-LAST:event_CleanAActionPerformed

    private void tipocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipocActionPerformed

    }//GEN-LAST:event_tipocActionPerformed

    private void TablaCalzadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCalzadoMouseClicked
        Calzado calzado = (Calzado) TablaCalzado.getValueAt(TablaCalzado.getSelectedRow(),5);
        nombre.setText(calzado.getNombre());
        proveedor.setText(String.valueOf(calzado.getPrecioProveedor()));
        venta.setText(String.valueOf(calzado.getPrecioVenta()));
        marca.setText(calzado.getMarca());
        tallec.setText(calzado.getTalle());
        tipoc.setText(calzado.getTipo());
        stockc.setText(String.valueOf(calzado.getStock()));
        foto.setIcon(getFotoImage(calzado.getFoto()));
        ColorIndumentaria.setBackground(new Color(Integer.valueOf(calzado.getColor())));
        labelColor.setVisible(true);
        GuardarC.setEnabled(false);
        EditC.setEnabled(true);
        CleanC.setEnabled(true);
        fotoPanel.setVisible(true);
        codigo.setText(calzado.getCodigo());
    }//GEN-LAST:event_TablaCalzadoMouseClicked

    private void EditAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditAActionPerformed
        try {
        Accesorio producto = (Accesorio) TablaAccesorio.getValueAt(TablaAccesorio.getSelectedRow(),5);
        producto.setNombre(nombre.getText());
        double p = Double.parseDouble(proveedor.getText());
        double v = Double.parseDouble(venta.getText());
        producto.setPrecioProveedor(p);
        producto.setPrecioVenta(v);
        producto.setMarca(marca.getText());
        producto.setCodigo(codigo.getText());
        if(!fotoPerfil.equals("")){
           producto.setFoto(convertirImagen(fotoPerfil)); 
        }
        producto.setTextura(textura.getText());
        producto.setStock(Integer.valueOf(stock.getText()));
        producto.setColor(String.valueOf(ColorIndumentaria.getBackground().getRGB()));
        Conexion.getInstance().guardar(producto);
        cargarTablaAcc();
        limpiarCampos();
    } catch (IOException ex) {
        Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);   
    }        
    }//GEN-LAST:event_EditAActionPerformed

    private void EditIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditIActionPerformed
        try {
        Indumentaria producto = (Indumentaria) TablaIndumentaria.getValueAt(TablaIndumentaria.getSelectedRow(),5);
        producto.setNombre(nombre.getText());
        double p = Double.parseDouble(proveedor.getText());
        double v = Double.parseDouble(venta.getText());
        producto.setPrecioProveedor(p);
        producto.setPrecioVenta(v);
        producto.setMarca(marca.getText());
        producto.setCodigo(codigo.getText());
        if(!fotoPerfil.equals("")){
           producto.setFoto(convertirImagen(fotoPerfil)); 
        }
        producto.setTalle(talle.getText());
        producto.setTipo(tipo.getText());
        producto.setColor(String.valueOf(ColorIndumentaria.getBackground().getRGB()));
        producto.setStock(Integer.valueOf(stocki.getText()));
        producto.setCategoria(categoria.getText());
        producto.setSexo(genero.getText());
        Conexion.getInstance().guardar(producto);
        cargarTablaInd();
        limpiarCampos();
    } catch (IOException ex) {
        Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);   
    }        
    }//GEN-LAST:event_EditIActionPerformed

    private void TablaIndumentariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaIndumentariaMouseClicked
        Indumentaria indumentaria = (Indumentaria)TablaIndumentaria.getValueAt(TablaIndumentaria.getSelectedRow(),5);
        nombre.setText(indumentaria.getNombre());
        proveedor.setText(String.valueOf(indumentaria.getPrecioProveedor()));
        venta.setText(String.valueOf(indumentaria.getPrecioVenta()));
        marca.setText(indumentaria.getMarca());
        talle.setText(indumentaria.getTalle());
        tipo.setText(indumentaria.getTipo());
        categoria.setText(indumentaria.getCategoria());
        genero.setText(indumentaria.getSexo());
        stocki.setText(String.valueOf(indumentaria.getStock()));
        foto.setIcon(getFotoImage(indumentaria.getFoto()));
        ColorIndumentaria.setBackground(new Color(Integer.valueOf(indumentaria.getColor())));
        labelColor.setVisible(true);
        GuardarI.setEnabled(false);
        EditI.setEnabled(true);
        CleanI.setEnabled(true);
        fotoPanel.setVisible(true);
        codigo.setText(indumentaria.getCodigo());
    }//GEN-LAST:event_TablaIndumentariaMouseClicked

    private void TablaAccesorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAccesorioMouseClicked
        Accesorio accesorio = (Accesorio) TablaAccesorio.getValueAt(TablaAccesorio.getSelectedRow(),5);
        nombre.setText(accesorio.getNombre());
        proveedor.setText(String.valueOf(accesorio.getPrecioProveedor()));
        venta.setText(String.valueOf(accesorio.getPrecioVenta()));
        marca.setText(accesorio.getMarca());
        stock.setText(String.valueOf(accesorio.getStock()));
        textura.setText(String.valueOf(accesorio.getStock()));
        foto.setIcon(getFotoImage(accesorio.getFoto()));
        ColorIndumentaria.setBackground(new Color(Integer.valueOf(accesorio.getColor())));
        labelColor.setVisible(true);
        GuardarA.setEnabled(false);
        EditA.setEnabled(true);
        CleanA.setEnabled(true);
        fotoPanel.setVisible(true);
        codigo.setText(accesorio.getCodigo());
    }//GEN-LAST:event_TablaAccesorioMouseClicked

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jTabbedPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane5MouseClicked
        limpiarCampos();
    }//GEN-LAST:event_jTabbedPane5MouseClicked


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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }
    
    public void cargarTablaCalzado(){
        DefaultTableModel tableProductos = (DefaultTableModel) TablaCalzado.getModel();
        Iterator<Calzado> it = Conexion.getInstance().listarCalzado().iterator();
        tableProductos.setRowCount(0);
        while(it.hasNext()){
        Calzado next = it.next();
        Object[] fila = new Object[9];
        fila[0]= next.getNombre();
        fila[1]= next.getPrecioProveedor();
        fila[2]= next.getPrecioVenta();
        fila[3]= next.getMarca();
        fila[4]= new JLabel(getFotoImage(next.getFoto()));
        fila[5]= next;
        fila[6]= next.getTipo();
        JLabel lbl = new JLabel();
        lbl.setOpaque(true);
        lbl.setBackground(new Color(Integer.valueOf(next.getColor())));
        fila[7]= lbl;
        fila[8]= next.getStock();
        tableProductos.addRow(fila);
        TablaCalzado.setDefaultRenderer(Object.class, new ImgTabla());
        TablaCalzado.setRowHeight(85);
        }
    }
    
    public void cargarTablaInd(){
    DefaultTableModel tableProductos = (DefaultTableModel) TablaIndumentaria.getModel();
        Iterator<Indumentaria> it = Conexion.getInstance().listarIndumentaria().iterator();
        tableProductos.setRowCount(0);
        while(it.hasNext()){
        Indumentaria next = it.next();
        Object[] fila = new Object[11];
        fila[0]= next.getNombre();
        fila[1]= next.getPrecioProveedor();
        fila[2]= next.getPrecioVenta();
        fila[3]= next.getMarca();
        fila[4]= new JLabel(getFotoImage(next.getFoto()));
        fila[5]= next;
        fila[6]= next.getTipo();
        fila[7]= next.getCategoria();
        fila[8]= next.getSexo();
        JLabel lbl = new JLabel();
        lbl.setOpaque(true);
        lbl.setBackground(new Color(Integer.valueOf(next.getColor())));
        fila[9]= lbl;
        fila[10]= next.getStock();
        tableProductos.addRow(fila);
        TablaIndumentaria.setDefaultRenderer(Object.class, new ImgTabla());
        TablaIndumentaria.setRowHeight(85);
        }
    }
        
    public void cargarTablaAcc(){
    DefaultTableModel tableProductos = (DefaultTableModel) TablaAccesorio.getModel();
        Iterator<Accesorio> it = Conexion.getInstance().listarAccesorio().iterator();
        tableProductos.setRowCount(0);
        while(it.hasNext()){
        Accesorio next = it.next();
        Object[] fila = new Object[8];
        fila[0]= next.getNombre();
        fila[1]= next.getPrecioProveedor();
        fila[2]= next.getPrecioVenta();
        fila[3]= next.getMarca();
        fila[4]= new JLabel(getFotoImage(next.getFoto()));
        fila[5]= next;
        JLabel lbl = new JLabel();
        lbl.setOpaque(true);
        lbl.setBackground(new Color(Integer.valueOf(next.getColor())));
        fila[6]= lbl;
        fila[7]= next.getStock();
        tableProductos.addRow(fila);
        TablaAccesorio.setDefaultRenderer(Object.class, new ImgTabla());
        TablaAccesorio.setRowHeight(85);
        }
    }
    
    public byte[] convertirImagen(String path) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedImage img = ImageIO.read(new File(path));
        ImageIO.write(img, "png", baos);
        baos.flush();

        String base64String = Base64.encode(baos.toByteArray());
        baos.close();

        return Base64.decode(base64String);
    }
    
    public ImageIcon getFotoImage(byte[] foto) {
        Image aux = new ImageIcon(foto).getImage();
        ImageIcon perfil = new ImageIcon(aux.getScaledInstance(this.foto.getWidth(), this.foto.getHeight(), Image.SCALE_DEFAULT));
        return perfil;
    }
    
    public void limpiarCampos(){
        nombre.setText("");
        proveedor.setText("");
        stock.setText("");
        stocki.setText("");
        stockc.setText("");
        talle.setText("");
        tallec.setText("");
        textura.setText("");
        tipo.setText("");
        tipoc.setText("");
        venta.setText("");
        marca.setText("");
        codigo.setText("");
        genero.setText("");
        categoria.setText("");
        labelColor.setVisible(false);
        ColorIndumentaria.setBackground(new Color(0,0,0,0));
        foto.setIcon(null);
        TablaCalzado.clearSelection();
        TablaAccesorio.clearSelection();
        TablaIndumentaria.clearSelection();   
        fotoPanel.setVisible(false);
    }
    
    
    public void ColorChooser(){
    JColorChooser cc=new JColorChooser();
       Color color1 = cc.showDialog(this,"Selector de color",Color.white);
       ColorIndumentaria.setBackground(color1);
       ColorIndumentaria.repaint();
       ColorIndumentaria.validate();
    }
    
    public void botonesA(){
        EditI.setEnabled(false);
        EditA.setEnabled(false);
        EditC.setEnabled(false);
        CleanI.setEnabled(false);
        CleanA.setEnabled(false);
        CleanC.setEnabled(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CleanA;
    private javax.swing.JButton CleanC;
    private javax.swing.JButton CleanI;
    private javax.swing.JLabel ColorIndumentaria;
    private javax.swing.JButton EditA;
    private javax.swing.JButton EditC;
    private javax.swing.JButton EditI;
    private javax.swing.JButton GuardarA;
    private javax.swing.JButton GuardarC;
    private javax.swing.JButton GuardarI;
    private javax.swing.JTable TablaAccesorio;
    private javax.swing.JTable TablaCalzado;
    private javax.swing.JTable TablaIndumentaria;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel fondoProducto;
    private javax.swing.JLabel foto;
    private javax.swing.JPanel fotoPanel;
    private javax.swing.JTextField genero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton7;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel labelColor;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField proveedor;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField stockc;
    private javax.swing.JTextField stocki;
    private javax.swing.JTextField talle;
    private javax.swing.JTextField tallec;
    private javax.swing.JTextField textura;
    private javax.swing.JTextField tipo;
    private javax.swing.JTextField tipoc;
    private javax.swing.JTextField venta;
    // End of variables declaration//GEN-END:variables
}
