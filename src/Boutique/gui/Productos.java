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
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class Productos extends javax.swing.JFrame {
String fotoPerfil = "";
    
    public Productos() {
        initComponents();
        cargarTablaCalzado();
        cargarTablaInd();
        cargarTablaAcc();
        botonesA();
        ColorIndumentaria.setOpaque(true); 
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        proveedor = new javax.swing.JTextField();
        venta = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
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
        jTable4 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        genero = new javax.swing.JTextField();
        stock_ind = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        textura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        GuardarAccessorio = new javax.swing.JButton();
        EditA = new javax.swing.JButton();
        CleanA = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
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
        jTable1 = new javax.swing.JTable();
        tallec = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        foto1 = new javax.swing.JLabel();
        ColorIndumentaria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Precio Proveedor:");

        jLabel3.setText("Precio Venta:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Foto:");

        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/file.png"))); // NOI18N
        jButton1.setText("Selecionar Archivo...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        foto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Talle:");

        jLabel15.setText("Tipo:");

        jLabel16.setText("Categoria:");

        jLabel17.setText("Color");

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/color.png"))); // NOI18N
        jButton11.setText("Elegir Color...");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        GuardarI.setText("Guardar");
        GuardarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarIActionPerformed(evt);
            }
        });

        EditI.setText("Modificar");

        CleanI.setText("Limpiar Campos");
        CleanI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanIActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio Proveedor", "Precio Venta", "Marca", "Foto", "Talle", "Tipo", "Categoria", "Genero", "Stock", "Color"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jLabel10.setText("Genero:");

        jLabel18.setText("Stock:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(jLabel18))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(categoria)
                            .addComponent(talle)
                            .addComponent(genero)
                            .addComponent(stock_ind))
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel17)
                                .addGap(53, 53, 53)
                                .addComponent(jButton11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(GuardarI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CleanI)))
                        .addContainerGap(826, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(talle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stock_ind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11)
                            .addComponent(jLabel17))))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarI)
                    .addComponent(EditI)
                    .addComponent(CleanI))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Indumentaria", jPanel2);

        jLabel11.setText("Textura:");

        jLabel12.setText("Stock:");

        jLabel13.setText("Color");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/color.png"))); // NOI18N
        jButton7.setText("Elegir Color...");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        GuardarAccessorio.setText("Guardar");
        GuardarAccessorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarAccessorioActionPerformed(evt);
            }
        });

        EditA.setText("Modificar");

        CleanA.setText("Limpiar Campos");
        CleanA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanAActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(34, 93, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textura)
                            .addComponent(stock))
                        .addGap(69, 69, 69)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GuardarAccessorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CleanA)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(textura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton7))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarAccessorio)
                    .addComponent(EditA)
                    .addComponent(CleanA))
                .addGap(233, 233, 233))
        );

        jTabbedPane5.addTab("Accesorios", jPanel3);

        jLabel6.setText("Talle:");

        jLabel7.setText("Tipo:");

        jLabel8.setText("Color");

        jLabel9.setText("Stock:");

        GuardarC.setText("Guardar");
        GuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCActionPerformed(evt);
            }
        });

        EditC.setText("Modificar");
        EditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCActionPerformed(evt);
            }
        });

        CleanC.setText("Limpiar Datos");
        CleanC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanCActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/color.png"))); // NOI18N
        jButton15.setText("Elegir Color...");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(7, 7, 7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoc, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(stockc)
                            .addComponent(tallec))
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GuardarC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CleanC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tallec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tipoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(stockc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jButton15))
                        .addGap(46, 46, 46)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarC)
                    .addComponent(EditC)
                    .addComponent(CleanC))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Calzado", jPanel1);

        foto1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(marca, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(venta)
                    .addComponent(proveedor)
                    .addComponent(nombre))
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ColorIndumentaria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))))
            .addComponent(jTabbedPane5)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ColorIndumentaria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Imágenes", "jpg", "gif", "png");
        jFileChooser1.setFileFilter(filter);
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fotoPerfil = jFileChooser1.getSelectedFile().getPath();
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
        producto.setFoto(convertirImagen(fotoPerfil));
        producto.setTalle(talle.getText());
        producto.setTipo(tipo.getText());
        producto.setCategoria(categoria.getText());
        producto.setSexo(genero.getText());
        producto.setColor(String.valueOf(ColorIndumentaria.getBackground().getRGB()));
        producto.setStock(Integer.valueOf(stock_ind.getText()));
        Conexion.getInstance().guardar(producto);
        //jLabel19.setBackground(new Color(-13369549)); Color que esta en la base de datos convertido a int
        //foto1.setIcon(getFotoImage(producto.getFoto()));
    } catch (IOException ex) {
        Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
    }  
    }//GEN-LAST:event_GuardarIActionPerformed

    private void GuardarAccessorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarAccessorioActionPerformed
    try {
        Accesorio producto = new Accesorio();
        producto.setNombre(nombre.getText());
        double p = Double.parseDouble(proveedor.getText());
        double v = Double.parseDouble(venta.getText());
        producto.setPrecioProveedor(p);
        producto.setPrecioVenta(v);
        producto.setMarca(marca.getText());
        producto.setFoto(convertirImagen(fotoPerfil));
        producto.setTextura(textura.getText());
        producto.setColor(String.valueOf(ColorIndumentaria.getBackground().getRGB()));
        producto.setStock(Integer.valueOf(stock.getText()));
        Conexion.getInstance().guardar(producto);
        //jLabel19.setBackground(new Color(-13369549)); Color que esta en la base de datos convertido a int
        foto1.setIcon(getFotoImage(producto.getFoto()));
    } catch (IOException ex) {
        Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_GuardarAccessorioActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ColorChooser();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ColorChooser();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        ColorChooser();
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
        producto.setFoto(convertirImagen(fotoPerfil));
        producto.setTalle(tallec.getText());
        producto.setTipo(tipoc.getText());
        producto.setColor(String.valueOf(ColorIndumentaria.getBackground().getRGB()));
        producto.setStock(Integer.valueOf(stockc.getText()));
        Conexion.getInstance().guardar(producto);
        //jLabel19.setBackground(new Color(-13369549)); Color que esta en la base de datos convertido a int
        foto1.setIcon(getFotoImage(producto.getFoto()));
    } catch (IOException ex) {
        Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_GuardarCActionPerformed

    private void EditCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCActionPerformed
       Calzado calzado = (Calzado) jTable1.getValueAt(jTable1.getSelectedRow(),0);
        calzado.setNombre(nombre.getText());
        calzado.setPrecioProveedor(Double.valueOf(proveedor.getText()));
        calzado.setPrecioVenta(Double.valueOf(venta.getText()));
        calzado.setMarca(marca.getText());
        calzado.setTalle(tallec.getText());
        calzado.setTipo(tipoc.getText());
        calzado.setStock(Integer.valueOf(stockc.getText()));
        /*ArrayList telefono = new ArrayList();
        telefono.add(tel.getText());
        cliente.setTelefonos(telefono);
        cliente.setDireccion(dir.getText());
        Conexion.getInstance().guardar(cliente);  
        cargarTabla();*/
        limpiarCampos();
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
        GuardarAccessorio.setEnabled(true);
        EditA.setEnabled(false);
    }//GEN-LAST:event_CleanAActionPerformed

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
        DefaultTableModel tableProductos = (DefaultTableModel) jTable1.getModel();
        Iterator<Calzado> it = Conexion.getInstance().listarCalzado().iterator();
        tableProductos.setRowCount(0);
        while(it.hasNext()){
        Calzado next = it.next();
        Object[] fila = new Object[9];
        fila[0]= next.getNombre();
        fila[1]= next.getPrecioProveedor();
        fila[2]= next.getPrecioVenta();
        fila[3]= next.getMarca();
        fila[4]= next.getFoto();
        fila[5]= next.getTalle();
        fila[6]= next.getTipo();
        fila[7]= next.getColor();
        fila[8]= next.getStock();
        tableProductos.addRow(fila);
        }
    }
    
    public void cargarTablaInd(){
    DefaultTableModel tableProductos = (DefaultTableModel) jTable4.getModel();
        Iterator<Indumentaria> it = Conexion.getInstance().listarIndumentaria().iterator();
        tableProductos.setRowCount(0);
        while(it.hasNext()){
        Indumentaria next = it.next();
        Object[] fila = new Object[11];
        fila[0]= next.getNombre();
        fila[1]= next.getPrecioProveedor();
        fila[2]= next.getPrecioVenta();
        fila[3]= next.getMarca();
        fila[4]= next.getFoto();
        fila[5]= next.getTalle();
        fila[6]= next.getTipo();
        fila[7]= next.getCategoria();
        fila[8]= next.getSexo();
        fila[9]= next.getColor();
        fila[10]= next.getStock();
        tableProductos.addRow(fila);
        }
    }
        
    public void cargarTablaAcc(){
    DefaultTableModel tableProductos = (DefaultTableModel) jTable3.getModel();
        Iterator<Accesorio> it = Conexion.getInstance().listarAccesorio().iterator();
        tableProductos.setRowCount(0);
        while(it.hasNext()){
        Accesorio next = it.next();
        Object[] fila = new Object[9];
        fila[0]= next.getNombre();
        fila[1]= next.getPrecioProveedor();
        fila[2]= next.getPrecioVenta();
        fila[3]= next.getMarca();
        fila[4]= next.getFoto();
        fila[5]= next.getTextura();
        fila[7]= next.getColor();
        fila[8]= next.getStock();
        tableProductos.addRow(fila);
        }}
    
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
        ImageIcon perfil = new ImageIcon(aux.getScaledInstance(foto1.getWidth(), foto1.getHeight(), Image.SCALE_DEFAULT));
        return perfil;
    }
    
    public void limpiarCampos(){
        nombre.setText("");
        proveedor.setText("");
        stock.setText("");
        stock_ind.setText("");
        stockc.setText("");
        talle.setText("");
        tallec.setText("");
        textura.setText("");
        tipo.setText("");
        tipoc.setText("");
        venta.setText("");
        marca.setText("");   
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
    private javax.swing.JButton GuardarAccessorio;
    private javax.swing.JButton GuardarC;
    private javax.swing.JButton GuardarI;
    private javax.swing.JTextField categoria;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel foto1;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField proveedor;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField stock_ind;
    private javax.swing.JTextField stockc;
    private javax.swing.JTextField talle;
    private javax.swing.JTextField tallec;
    private javax.swing.JTextField textura;
    private javax.swing.JTextField tipo;
    private javax.swing.JTextField tipoc;
    private javax.swing.JTextField venta;
    // End of variables declaration//GEN-END:variables
}
