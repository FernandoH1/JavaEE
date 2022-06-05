package Boutique.gui;

import Boutique.io.Accesorio;
import Boutique.io.Calzado;
import Boutique.io.DetalleDeVenta;
import Boutique.io.Indumentaria;
import Boutique.io.Producto;
import Boutique.persistencia.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CrearCombos extends javax.swing.JFrame {
    
    private TableRowSorter trsfiltro = new TableRowSorter();

    public CrearCombos() {
        initComponents();
        
        //cargarTablaCalzado();
        cargarTablaInd();
        //cargarTablaAcc();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupI = new javax.swing.ButtonGroup();
        groupC = new javax.swing.ButtonGroup();
        groupA = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        buscarC = new javax.swing.JTextField();
        nombreC = new javax.swing.JRadioButton();
        tipoC = new javax.swing.JRadioButton();
        talleC = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCalzado = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        agregarC = new javax.swing.JButton();
        cantidadC = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        buscarI = new javax.swing.JTextField();
        nombreI = new javax.swing.JRadioButton();
        tipoI = new javax.swing.JRadioButton();
        talleI = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaIndumentaria = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        agregarI = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cantidadI = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        buscarA = new javax.swing.JTextField();
        nombreA = new javax.swing.JRadioButton();
        textura = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaAccesorio = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        agregarA = new javax.swing.JButton();
        cantidadA = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        foto = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 31, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 29, 145, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 54, 145, -1));

        jLabel2.setText("Descripcion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 56, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 79, 145, -1));

        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 81, -1, -1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 104, 41, -1));

        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 106, -1, -1));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anterior.png"))); // NOI18N
        Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anteriorr.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 60, 50));

        jTabbedPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane5MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 218, 168));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarCKeyTyped(evt);
            }
        });
        jPanel1.add(buscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 270, -1));

        groupC.add(nombreC);
        nombreC.setText("Nombre");
        nombreC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreCMouseClicked(evt);
            }
        });
        jPanel1.add(nombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        groupC.add(tipoC);
        tipoC.setText("Tipo");
        tipoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipoCMouseClicked(evt);
            }
        });
        jPanel1.add(tipoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        groupC.add(talleC);
        talleC.setText("Talle");
        talleC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                talleCMouseClicked(evt);
            }
        });
        talleC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talleCActionPerformed(evt);
            }
        });
        jPanel1.add(talleC, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 870, 220));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Cantidad:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Buscar :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        agregarC.setText("Agregar");
        agregarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarCMouseClicked(evt);
            }
        });
        agregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCActionPerformed(evt);
            }
        });
        jPanel1.add(agregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 150, -1));

        cantidadC.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        jPanel1.add(cantidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 60, -1));

        jTabbedPane5.addTab("Calzado", jPanel1);

        jPanel2.setBackground(new java.awt.Color(240, 218, 168));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarIKeyReleased(evt);
            }
        });
        jPanel2.add(buscarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 270, -1));

        groupI.add(nombreI);
        nombreI.setText("Nombre");
        nombreI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreIMouseClicked(evt);
            }
        });
        jPanel2.add(nombreI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        groupI.add(tipoI);
        tipoI.setText("Tipo");
        tipoI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipoIMouseClicked(evt);
            }
        });
        jPanel2.add(tipoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        groupI.add(talleI);
        talleI.setText("Talle");
        talleI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                talleIMouseClicked(evt);
            }
        });
        jPanel2.add(talleI, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

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

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 870, 220));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Buscar :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        agregarI.setText("Agregar");
        agregarI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarIMouseClicked(evt);
            }
        });
        agregarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarIActionPerformed(evt);
            }
        });
        jPanel2.add(agregarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 160, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Cantidad:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, 20));

        cantidadI.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        jPanel2.add(cantidadI, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 50, -1));

        jTabbedPane5.addTab("Indumentaria", jPanel2);

        jPanel3.setBackground(new java.awt.Color(240, 218, 168));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarAKeyReleased(evt);
            }
        });
        jPanel3.add(buscarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 270, -1));

        groupA.add(nombreA);
        nombreA.setText("Nombre");
        nombreA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreAMouseClicked(evt);
            }
        });
        jPanel3.add(nombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        groupA.add(textura);
        textura.setText("Textura");
        textura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texturaMouseClicked(evt);
            }
        });
        jPanel3.add(textura, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

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

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 870, 210));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cantidad:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, 20));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Buscar :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        agregarA.setText("Agregar");
        agregarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAActionPerformed(evt);
            }
        });
        jPanel3.add(agregarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 160, -1));

        cantidadA.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        jPanel3.add(cantidadA, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 70, -1));

        jTabbedPane5.addTab("Accesorios", jPanel3);

        getContentPane().add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 910, 310));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 910, 270));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 40, 40));

        listProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(listProductos);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 370, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void buscarCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarCKeyReleased

        if (groupC.getSelection() == null) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Debe seleccionar una opción del filtro", "Menaje de Error", JOptionPane.ERROR_MESSAGE);
        } else {
            buscarC.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(final KeyEvent e) {
                    filtroCalzado();
                }
            });
            trsfiltro = new TableRowSorter((DefaultTableModel) TablaCalzado.getModel());
            TablaCalzado.setRowSorter(trsfiltro);
        }
    }//GEN-LAST:event_buscarCKeyReleased

    private void buscarCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarCKeyTyped

    }//GEN-LAST:event_buscarCKeyTyped

    private void nombreCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreCMouseClicked
        this.buscarC.enable();
    }//GEN-LAST:event_nombreCMouseClicked

    private void tipoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoCMouseClicked
        this.buscarC.enable();
    }//GEN-LAST:event_tipoCMouseClicked

    private void talleCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talleCMouseClicked
        this.buscarC.enable();
    }//GEN-LAST:event_talleCMouseClicked

    private void talleCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talleCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talleCActionPerformed

    private void TablaCalzadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCalzadoMouseClicked
        Calzado calzado = (Calzado) TablaCalzado.getValueAt(TablaCalzado.getSelectedRow(), 5);
        SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadC.getModel();
        modeloSpinner.setMaximum(calzado.getStock());
        modeloSpinner.setMinimum(1);
        cantidadC.setEnabled(true);
    }//GEN-LAST:event_TablaCalzadoMouseClicked

    private void agregarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarCMouseClicked

    }//GEN-LAST:event_agregarCMouseClicked

    private void agregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCActionPerformed
        Calzado calzado = (Calzado) TablaCalzado.getValueAt(TablaCalzado.getSelectedRow(), 5);
        //añadirProductoSelecionado(calzado);
    }//GEN-LAST:event_agregarCActionPerformed

    private void buscarIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarIKeyReleased
        if (groupI.getSelection() == null) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Debe seleccionar una opción del filtro", "Menaje de Error", JOptionPane.ERROR_MESSAGE);
        } else {
            buscarI.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(final KeyEvent e) {
                    filtroIndumentaria();
                }
            });
            trsfiltro = new TableRowSorter((DefaultTableModel) TablaIndumentaria.getModel());
            TablaIndumentaria.setRowSorter(trsfiltro);
        }
    }//GEN-LAST:event_buscarIKeyReleased

    private void nombreIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreIMouseClicked
        this.buscarI.enable();
    }//GEN-LAST:event_nombreIMouseClicked

    private void tipoIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoIMouseClicked
        this.buscarI.enable();
    }//GEN-LAST:event_tipoIMouseClicked

    private void talleIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talleIMouseClicked
        this.buscarI.enable();
    }//GEN-LAST:event_talleIMouseClicked

    private void TablaIndumentariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaIndumentariaMouseClicked
        Indumentaria ind = (Indumentaria) TablaIndumentaria.getValueAt(TablaIndumentaria.getSelectedRow(), 5);
        SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadI.getModel();
        modeloSpinner.setMaximum(ind.getStock());
        modeloSpinner.setMinimum(1);
        cantidadI.setEnabled(true);
    }//GEN-LAST:event_TablaIndumentariaMouseClicked

    private void agregarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIActionPerformed
        Indumentaria indumentaria = (Indumentaria) TablaIndumentaria.getValueAt(TablaIndumentaria.getSelectedRow(), 5);
        añadirProductoSelecionado(indumentaria);
    }//GEN-LAST:event_agregarIActionPerformed

    private void buscarAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarAKeyReleased
        if (groupA.getSelection() == null) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Debe seleccionar una opción del filtro", "Menaje de Error", JOptionPane.ERROR_MESSAGE);
        } else {
            buscarA.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(final KeyEvent e) {
                    filtroAccesorio();
                }
            });
            trsfiltro = new TableRowSorter((DefaultTableModel) TablaAccesorio.getModel());
            TablaAccesorio.setRowSorter(trsfiltro);
        }
    }//GEN-LAST:event_buscarAKeyReleased

    private void nombreAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreAMouseClicked
        this.buscarA.enable();
    }//GEN-LAST:event_nombreAMouseClicked

    private void texturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texturaMouseClicked
        this.buscarA.enable();
    }//GEN-LAST:event_texturaMouseClicked

    private void TablaAccesorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAccesorioMouseClicked
        Accesorio acc = (Accesorio) TablaAccesorio.getValueAt(TablaAccesorio.getSelectedRow(), 5);
        SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadA.getModel();
        modeloSpinner.setMaximum(acc.getStock());
        modeloSpinner.setMinimum(0);
        cantidadA.setEnabled(true);
    }//GEN-LAST:event_TablaAccesorioMouseClicked

    private void agregarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAActionPerformed
        Accesorio accesorio = (Accesorio) TablaAccesorio.getValueAt(TablaAccesorio.getSelectedRow(), 5);
        //añadirProductoSelecionado(accesorio);
    }//GEN-LAST:event_agregarAActionPerformed

    private void jTabbedPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane5MouseClicked
        TablaCalzado.clearSelection();
        TablaAccesorio.clearSelection();
        TablaIndumentaria.clearSelection();
    }//GEN-LAST:event_jTabbedPane5MouseClicked

    private void agregarIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarIMouseClicked
       
    }//GEN-LAST:event_agregarIMouseClicked

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
            java.util.logging.Logger.getLogger(CrearCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCombos().setVisible(true);
            }
        });
    }
    
    
     public void cargarTablaCalzado() {
        DefaultTableModel tableProductos = (DefaultTableModel) TablaCalzado.getModel();
        Iterator<Calzado> it = Conexion.getInstance().listarCalzado().iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Calzado next = it.next();
            Object[] fila = new Object[9];
            fila[0] = next.getNombre();
            fila[1] = next.getPrecioProveedor();
            fila[2] = next.getPrecioVenta();
            fila[3] = next.getMarca();
            fila[4] = new JLabel(getFotoImage(next.getFoto()));
            fila[5] = next;
            fila[6] = next.getTipo();
            JLabel lbl = new JLabel();
            lbl.setOpaque(true);
            lbl.setBackground(new Color(Integer.valueOf(next.getColor())));
            fila[7] = lbl;
            fila[8] = next.getStock();
            tableProductos.addRow(fila);
            TablaCalzado.setDefaultRenderer(Object.class, new ImgTabla());
            TablaCalzado.setRowHeight(40);
        }
    }

    public void cargarTablaInd() {
        DefaultTableModel tableProductos = (DefaultTableModel) TablaIndumentaria.getModel();
        Iterator<Indumentaria> it = Conexion.getInstance().listarIndumentaria().iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Indumentaria next = it.next();
            Object[] fila = new Object[11];
            fila[0] = next.getNombre();
            fila[1] = next.getPrecioProveedor();
            fila[2] = next.getPrecioVenta();
            fila[3] = next.getMarca();
            fila[4] = new JLabel(getFotoImage(next.getFoto()));
            fila[5] = next;
            fila[6] = next.getTipo();
            fila[7] = next.getCategoria();
            fila[8] = next.getSexo();
            JLabel lbl = new JLabel();
            lbl.setOpaque(true);
            lbl.setBackground(new Color(Integer.valueOf(next.getColor())));
            fila[9] = lbl;
            fila[10] = next.getStock();
            tableProductos.addRow(fila);
            TablaIndumentaria.setDefaultRenderer(Object.class, new ImgTabla());
            TablaIndumentaria.setRowHeight(40);
        }
    }

    public void cargarTablaAcc() {
        DefaultTableModel tableProductos = (DefaultTableModel) TablaAccesorio.getModel();
        Iterator<Accesorio> it = Conexion.getInstance().listarAccesorio().iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Accesorio next = it.next();
            Object[] fila = new Object[8];
            fila[0] = next.getNombre();
            fila[1] = next.getPrecioProveedor();
            fila[2] = next.getPrecioVenta();
            fila[3] = next.getMarca();
            fila[4] = new JLabel(getFotoImage(next.getFoto()));
            fila[5] = next;
            JLabel lbl = new JLabel();
            lbl.setOpaque(true);
            lbl.setBackground(new Color(Integer.valueOf(next.getColor())));
            fila[6] = lbl;
            fila[7] = next.getStock();
            tableProductos.addRow(fila);
            TablaAccesorio.setDefaultRenderer(Object.class, new ImgTabla());
            TablaAccesorio.setRowHeight(40);
        }
    }

    public void filtroCalzado() {
        String filtro = buscarC.getText();
        if (nombreC.isSelected()) {
            int columna = 0;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        } else if (tipoC.isSelected()) {
            int columna = 6;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        } else if (talleC.isSelected()) {
            int columna = 5;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        }
    }

    public void filtroIndumentaria() {
        String filtro = buscarI.getText();
        if (nombreI.isSelected()) {
            int columna = 0;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        } else if (tipoI.isSelected()) {
            int columna = 6;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        } else if (talleI.isSelected()) {
            int columna = 5;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        }
    }

    public void filtroAccesorio() {
        String filtro = buscarA.getText();
        if (nombreA.isSelected()) {
            int columna = 0;
            int columna2 = 5;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna, columna2));
        } else if (textura.isSelected()) {
            int columna = 5;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        }
    }

    public ImageIcon getFotoImage(byte[] foto) {
        Image aux = new ImageIcon(foto).getImage();
        ImageIcon perfil = new ImageIcon(aux.getScaledInstance(this.foto.getWidth(), this.foto.getHeight(), Image.SCALE_DEFAULT));
        return perfil;
    }
    
    public void añadirProductoSelecionado(Indumentaria indumentaria) {
        DefaultTableModel tableDetalle = (DefaultTableModel) listProductos.getModel();
        if (listProductos.getRowCount() == 0) {
            Object[] fila = new Object[1];
            Producto dv = new Producto();
            int cantidad = (int) cantidadI.getValue();
            fila[0] = dv.getNombre();
            
            tableDetalle.addRow(fila);
            int nuevaCantidad = (int) TablaIndumentaria.getValueAt(TablaIndumentaria.getSelectedRow(), 10) - cantidad;
            TablaIndumentaria.setValueAt(nuevaCantidad, TablaIndumentaria.getSelectedRow(), 10);
            cantidadI.setValue(1);
            SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadI.getModel();
            modeloSpinner.setMaximum(nuevaCantidad);
        } else {
            boolean flag = false;
            for (int i = 0; i < listProductos.getRowCount(); i++) {
                Producto dv = (Producto) listProductos.getValueAt(i, 0);
                if (dv.getId() == indumentaria.getId()) {
                    int catidadActual = (int) listProductos.getValueAt(i, 1);
                    int cantidad = (int) cantidadI.getValue();

                    int nuevaCantidad = (int) TablaIndumentaria.getValueAt(TablaIndumentaria.getSelectedRow(), 10) - cantidad;
                    TablaIndumentaria.setValueAt(nuevaCantidad, TablaIndumentaria.getSelectedRow(), 10);
                    cantidadI.setValue(1);
                    SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadI.getModel();
                    modeloSpinner.setMaximum(nuevaCantidad);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                Object[] fila = new Object[1];
                Producto dv = new Producto();
                int cantidad = (int) cantidadI.getValue();

                fila[0] = dv;

                tableDetalle.addRow(fila);
                int nuevaCantidad = (int) TablaIndumentaria.getValueAt(TablaIndumentaria.getSelectedRow(), 10) - cantidad;
                TablaIndumentaria.setValueAt(nuevaCantidad, TablaIndumentaria.getSelectedRow(), 10);
                cantidadI.setValue(1);
                SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadI.getModel();
                modeloSpinner.setMaximum(nuevaCantidad);
            }
        }
    }
    
    /*public void añadirProductoSelecionado(Accesorio accesorio) {
        DefaultTableModel tableDetalle = (DefaultTableModel) detalleDeVenta.getModel();
        if (detalleDeVenta.getRowCount() == 0) {
            Object[] fila = new Object[4];
            DetalleDeVenta dv = new DetalleDeVenta();
            int cantidad = (int) cantidadA.getValue();
            dv.setPrecioCompra(accesorio.getPrecioVenta() * cantidad);
            dv.setCantidad(cantidad);
            dv.setPrecioUnitario(accesorio.getPrecioVenta());
            dv.setProducto(accesorio);
            fila[0] = dv;
            fila[1] = cantidad;
            fila[2] = accesorio.getPrecioVenta();
            fila[3] = accesorio.getPrecioVenta() * cantidad;
            tableDetalle.addRow(fila);
            int nuevaCantidad = (int) TablaAccesorio.getValueAt(TablaAccesorio.getSelectedRow(), 7) - cantidad;
            TablaAccesorio.setValueAt(nuevaCantidad, TablaAccesorio.getSelectedRow(), 7);
            cantidadA.setValue(1);
            SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadA.getModel();
            modeloSpinner.setMaximum(nuevaCantidad);
        } else {
            boolean flag = false;
            for (int i = 0; i < detalleDeVenta.getRowCount(); i++) {
                DetalleDeVenta dv = (DetalleDeVenta) detalleDeVenta.getValueAt(i, 0);
                if (dv.getProducto().getId() == accesorio.getId()) {
                    int catidadActual = (int) detalleDeVenta.getValueAt(i, 1);
                    int cantidad = (int) cantidadA.getValue();
                    detalleDeVenta.setValueAt((catidadActual + cantidad), i, 1);
                    detalleDeVenta.setValueAt((catidadActual + cantidad) * accesorio.getPrecioVenta(), i, 3);
                    dv.setCantidad((catidadActual + cantidad));
                    dv.setPrecioCompra((catidadActual + cantidad) * accesorio.getPrecioVenta());
                    int nuevaCantidad = (int) TablaAccesorio.getValueAt(TablaAccesorio.getSelectedRow(), 7) - cantidad;
                    TablaAccesorio.setValueAt(nuevaCantidad, TablaAccesorio.getSelectedRow(), 7);
                    cantidadA.setValue(1);
                    SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadA.getModel();
                    modeloSpinner.setMaximum(nuevaCantidad);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                Object[] fila = new Object[4];
                DetalleDeVenta dv = new DetalleDeVenta();
                int cantidad = (int) cantidadA.getValue();
                dv.setPrecioCompra(accesorio.getPrecioVenta() * cantidad);
                dv.setCantidad(cantidad);
                dv.setPrecioUnitario(accesorio.getPrecioVenta());
                dv.setProducto(accesorio);
                fila[0] = dv;
                fila[1] = cantidad;
                fila[2] = accesorio.getPrecioVenta();
                fila[3] = accesorio.getPrecioVenta() * cantidad;
                tableDetalle.addRow(fila);
                int nuevaCantidad = (int) TablaAccesorio.getValueAt(TablaAccesorio.getSelectedRow(), 7) - cantidad;
                TablaAccesorio.setValueAt(nuevaCantidad, TablaAccesorio.getSelectedRow(), 7);
                cantidadA.setValue(1);
                SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadA.getModel();
                modeloSpinner.setMaximum(nuevaCantidad);
            }
        }
    }
    
    public void añadirProductoSelecionado(Calzado calzado) {
        DefaultTableModel tableDetalle = (DefaultTableModel) detalleDeVenta.getModel();
        if (detalleDeVenta.getRowCount() == 0) {
            Object[] fila = new Object[4];
            DetalleDeVenta dv = new DetalleDeVenta();
            int cantidad = (int) cantidadC.getValue();
            dv.setPrecioCompra(calzado.getPrecioVenta() * cantidad);
            dv.setCantidad(cantidad);
            dv.setPrecioUnitario(calzado.getPrecioVenta());
            dv.setProducto(calzado);
            fila[0] = dv;
            fila[1] = cantidad;
            fila[2] = calzado.getPrecioVenta();
            fila[3] = calzado.getPrecioVenta() * cantidad;
            tableDetalle.addRow(fila);
            int nuevaCantidad = (int) TablaCalzado.getValueAt(TablaCalzado.getSelectedRow(), 8) - cantidad;
            TablaCalzado.setValueAt(nuevaCantidad, TablaCalzado.getSelectedRow(), 8);
            cantidadC.setValue(1);
            SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadC.getModel();
            modeloSpinner.setMaximum(nuevaCantidad);
        } else {
            boolean flag = false;
            for (int i = 0; i < detalleDeVenta.getRowCount(); i++) {
                DetalleDeVenta dv = (DetalleDeVenta) detalleDeVenta.getValueAt(i, 0);
                if (dv.getProducto().getId() == calzado.getId()) {
                    int catidadActual = (int) detalleDeVenta.getValueAt(i, 1);
                    int cantidad = (int) cantidadC.getValue();
                    detalleDeVenta.setValueAt((catidadActual + cantidad), i, 1);
                    detalleDeVenta.setValueAt((catidadActual + cantidad) * calzado.getPrecioVenta(), i, 3);
                    dv.setCantidad((catidadActual + cantidad));
                    dv.setPrecioCompra((catidadActual + cantidad) * calzado.getPrecioVenta());
                    int nuevaCantidad = (int) TablaCalzado.getValueAt(TablaCalzado.getSelectedRow(), 8) - cantidad;
                    TablaCalzado.setValueAt(nuevaCantidad, TablaCalzado.getSelectedRow(), 8);
                    cantidadC.setValue(1);
                    SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadC.getModel();
                    modeloSpinner.setMaximum(nuevaCantidad);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                Object[] fila = new Object[4];
                DetalleDeVenta dv = new DetalleDeVenta();
                int cantidad = (int) cantidadC.getValue();
                dv.setPrecioCompra(calzado.getPrecioVenta() * cantidad);
                dv.setCantidad(cantidad);
                dv.setPrecioUnitario(calzado.getPrecioVenta());
                dv.setProducto(calzado);
                fila[0] = dv;
                fila[1] = cantidad;
                fila[2] = calzado.getPrecioVenta();
                fila[3] = calzado.getPrecioVenta() * cantidad;
                tableDetalle.addRow(fila);
                int nuevaCantidad = (int) TablaCalzado.getValueAt(TablaCalzado.getSelectedRow(), 8) - cantidad;
                TablaCalzado.setValueAt(nuevaCantidad, TablaCalzado.getSelectedRow(), 8);
                cantidadC.setValue(1);
                SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) cantidadC.getModel();
                modeloSpinner.setMaximum(nuevaCantidad);
            }
        }
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaAccesorio;
    private javax.swing.JTable TablaCalzado;
    private javax.swing.JTable TablaIndumentaria;
    private javax.swing.JButton Volver;
    private javax.swing.JButton agregarA;
    private javax.swing.JButton agregarC;
    private javax.swing.JButton agregarI;
    private javax.swing.JTextField buscarA;
    private javax.swing.JTextField buscarC;
    private javax.swing.JTextField buscarI;
    private javax.swing.JSpinner cantidadA;
    private javax.swing.JSpinner cantidadC;
    private javax.swing.JSpinner cantidadI;
    private javax.swing.JLabel foto;
    private javax.swing.ButtonGroup groupA;
    private javax.swing.ButtonGroup groupC;
    private javax.swing.ButtonGroup groupI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable listProductos;
    private javax.swing.JRadioButton nombreA;
    private javax.swing.JRadioButton nombreC;
    private javax.swing.JRadioButton nombreI;
    private javax.swing.JRadioButton talleC;
    private javax.swing.JRadioButton talleI;
    private javax.swing.JRadioButton textura;
    private javax.swing.JRadioButton tipoC;
    private javax.swing.JRadioButton tipoI;
    // End of variables declaration//GEN-END:variables
}
