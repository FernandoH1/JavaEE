package Boutique.gui;

import Boutique.io.Accesorio;
import Boutique.io.Calzado;
import Boutique.io.Combo;
import Boutique.io.CombosProducto;
import Boutique.io.Indumentaria;
import Boutique.persistencia.Conexion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CrearCombos extends javax.swing.JFrame {

    private TableRowSorter trsfiltro = new TableRowSorter();
    private ArrayList<CombosProducto> listaComboProducto = new ArrayList();

    public CrearCombos() {
        initComponents();
        mostrarCombo();
        cargarTablaCalzado();
        cargarTablaInd();
        cargarTablaAcc();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupI = new javax.swing.ButtonGroup();
        groupC = new javax.swing.ButtonGroup();
        groupA = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        buscarC = new javax.swing.JTextField();
        nombreC = new javax.swing.JRadioButton();
        tipoC = new javax.swing.JRadioButton();
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
        combosT = new javax.swing.JTable();
        foto = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listProductos = new javax.swing.JTable();
        crearCombo = new javax.swing.JButton();
        quitar = new javax.swing.JButton();
        precio = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 31, -1, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 29, 145, -1));
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 54, 145, -1));

        jLabel2.setText("Descripcion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 56, -1, -1));

        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 81, -1, -1));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anterior.png"))); // NOI18N
        Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anteriorr.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 60, 50));

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

        TablaCalzado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio Venta", "Marca", "Tipo", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaCalzado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCalzadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TablaCalzadoMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCalzado);
        if (TablaCalzado.getColumnModel().getColumnCount() > 0) {
            TablaCalzado.getColumnModel().getColumn(4).setMinWidth(0);
            TablaCalzado.getColumnModel().getColumn(4).setPreferredWidth(0);
            TablaCalzado.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 870, 190));

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

        TablaIndumentaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio Venta", "Marca", "Tipo", "Categoria", "Genero", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        if (TablaIndumentaria.getColumnModel().getColumnCount() > 0) {
            TablaIndumentaria.getColumnModel().getColumn(6).setMinWidth(0);
            TablaIndumentaria.getColumnModel().getColumn(6).setPreferredWidth(0);
            TablaIndumentaria.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 870, 190));

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
                "Nombre", "Precio Venta", "Marca", "Textura", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        if (TablaAccesorio.getColumnModel().getColumnCount() > 0) {
            TablaAccesorio.getColumnModel().getColumn(4).setMinWidth(0);
            TablaAccesorio.getColumnModel().getColumn(4).setPreferredWidth(0);
            TablaAccesorio.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 870, 180));

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

        getContentPane().add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 910, 310));

        combosT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(combosT);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 1320, 250));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 40, 40));

        listProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(listProductos);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 370, 300));

        crearCombo.setText("Crear Combo");
        crearCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearComboActionPerformed(evt);
            }
        });
        getContentPane().add(crearCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        quitar.setText("Quitar");
        quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarActionPerformed(evt);
            }
        });
        getContentPane().add(quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        precio.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 90, -1));

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

    private void TablaCalzadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCalzadoMouseClicked

    }//GEN-LAST:event_TablaCalzadoMouseClicked

    private void agregarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarCMouseClicked

    }//GEN-LAST:event_agregarCMouseClicked

    private void agregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCActionPerformed
        String nombre = (String) TablaCalzado.getValueAt(TablaCalzado.getSelectedRow(), 0);
        String codigo = (String) TablaCalzado.getValueAt(TablaCalzado.getSelectedRow(), 4);
        int cantidad = (int) cantidadC.getValue();
        agregar_a_Combo(nombre, codigo, cantidad);
        cargarProductoSelecionado();
        estimarPrecio();
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

    private void TablaIndumentariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaIndumentariaMouseClicked

    }//GEN-LAST:event_TablaIndumentariaMouseClicked

    private void agregarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIActionPerformed
        String nombre = (String) TablaIndumentaria.getValueAt(TablaIndumentaria.getSelectedRow(), 0);
        String codigo = (String) TablaIndumentaria.getValueAt(TablaIndumentaria.getSelectedRow(), 6);
        int cantidad = (int) cantidadI.getValue();
        agregar_a_Combo(nombre, codigo, cantidad);
        cargarProductoSelecionado();
        estimarPrecio();
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

    }//GEN-LAST:event_TablaAccesorioMouseClicked

    private void agregarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAActionPerformed
        String nombre = (String) TablaAccesorio.getValueAt(TablaAccesorio.getSelectedRow(), 0);
        String codigo = (String) TablaAccesorio.getValueAt(TablaAccesorio.getSelectedRow(), 4);
        int cantidad = (int) cantidadA.getValue();
        agregar_a_Combo(nombre, codigo, cantidad);
        cargarProductoSelecionado();
        estimarPrecio();
    }//GEN-LAST:event_agregarAActionPerformed

    private void jTabbedPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane5MouseClicked
        TablaCalzado.clearSelection();
        TablaAccesorio.clearSelection();
        TablaIndumentaria.clearSelection();
    }//GEN-LAST:event_jTabbedPane5MouseClicked

    private void agregarIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarIMouseClicked

    }//GEN-LAST:event_agregarIMouseClicked

    private void crearComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearComboActionPerformed
        if(listaComboProducto.size() !=0){
        Combo c = new Combo();
        c.setNombre(nombre.getText());
        SpinnerNumberModel modeloSpinner = (SpinnerNumberModel) precio.getModel();
        modeloSpinner.setMinimum(0);
        double precioC = (double) precio.getValue();
        c.setPrecio(precioC);
        c.setDescripcion(descripcion.getText());
        Conexion.getInstance().guardar(c);
        for (CombosProducto cp : listaComboProducto) {
            cp.setCombo(c);
            Conexion.getInstance().guardar(cp);
        }
        mostrarCombo();
        }else{
        JOptionPane.showMessageDialog(this, "No se Puede Crear un combo sin prodcutos");
        }
    }//GEN-LAST:event_crearComboActionPerformed

    private void quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarActionPerformed

        quitarElemento();

    }//GEN-LAST:event_quitarActionPerformed

    private void TablaCalzadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCalzadoMouseEntered

    }//GEN-LAST:event_TablaCalzadoMouseEntered

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
        Iterator<Calzado> it = Conexion.getInstance().listarCalzadoPorCodigo().iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Calzado next = it.next();
            Object[] fila = new Object[5];
            fila[0] = next.getNombre();
            fila[1] = next.getPrecioVenta();
            fila[2] = next.getMarca();
            fila[3] = next.getTipo();
            fila[4] = next.getCodigo();
            tableProductos.addRow(fila);
        }
    }

    public void cargarTablaInd() {
        DefaultTableModel tableProductos = (DefaultTableModel) TablaIndumentaria.getModel();
        Iterator<Indumentaria> it = Conexion.getInstance().listarIndumentariaPorCodigo().iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Indumentaria next = it.next();
            Object[] fila = new Object[7];
            fila[0] = next.getNombre();
            fila[1] = next.getPrecioVenta();
            fila[2] = next.getMarca();
            fila[3] = next.getTipo();
            fila[4] = next.getCategoria();
            fila[5] = next.getSexo();
            fila[6] = next.getCodigo();
            tableProductos.addRow(fila);
        }
    }

    public void cargarTablaAcc() {
        DefaultTableModel tableProductos = (DefaultTableModel) TablaAccesorio.getModel();
        Iterator<Accesorio> it = Conexion.getInstance().listarAccesorioPorCodigo().iterator();
        tableProductos.setRowCount(0);
        while (it.hasNext()) {
            Accesorio next = it.next();
            Object[] fila = new Object[5];
            fila[0] = next.getNombre();
            fila[1] = next.getPrecioVenta();
            fila[2] = next.getMarca();
            fila[3] = next.getTextura();
            fila[4] = next.getCodigo();
            tableProductos.addRow(fila);
        }
    }

    public void filtroCalzado() {
        String filtro = buscarC.getText();
        if (nombreC.isSelected()) {
            int columna = 0;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        } else if (tipoC.isSelected()) {
            int columna = 3;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        }
    }

    public void filtroIndumentaria() {
        String filtro = buscarI.getText();
        if (nombreI.isSelected()) {
            int columna = 0;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        } else if (tipoI.isSelected()) {
            int columna = 3;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        }
    }

    public void filtroAccesorio() {
        String filtro = buscarA.getText();
        if (nombreA.isSelected()) {
            int columna = 0;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        } else if (textura.isSelected()) {
            int columna = 3;
            trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        }
    }

    public void cargarProductoSelecionado() {
        limpiarTabla(listProductos);
        DefaultTableModel tableDetalle = (DefaultTableModel) listProductos.getModel();
        for (CombosProducto cp : listaComboProducto) {
            Object[] fila = new Object[3];
            fila[0] = cp.getNombreProducto();
            fila[1] = cp.getCantidad();
            fila[2] = cp.getCodigoProducto();
            tableDetalle.addRow(fila);
        }
    }

    private void agregar_a_Combo(String nombre, String codigo, int cantidad) {
        int index = estaListaProducto(codigo);
        if (index == -1) {
            CombosProducto cp = new CombosProducto();
            cp.setCantidad(cantidad);
            cp.setCodigoProducto(codigo);
            cp.setNombreProducto(nombre);
            listaComboProducto.add(cp);
        } else {
            listaComboProducto.get(index).setCantidad(listaComboProducto.get(index).getCantidad() + cantidad);
        }
    }

    public int estaListaProducto(String codigo) {
        for (int i = 0; i < listaComboProducto.size(); i++) {
            if (listaComboProducto.get(i).getCodigoProducto().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    private void mostrarCombo() {
        limpiarTabla(combosT);
        DefaultTableModel tableDetalle = (DefaultTableModel) combosT.getModel();
        for (Combo cp : Conexion.getInstance().getAllCombo()) {
            Object[] fila = new Object[3];
            fila[0] = cp;
            fila[1] = cp.getDescripcion();
            fila[2] = cp.getPrecio();
            tableDetalle.addRow(fila);
        }
    }

    public void limpiarTabla(JTable tabla) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            int filas = tabla.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }

    private void estimarPrecio() {
        double precio_estimado = 0;
        System.out.println("CONTADOR: " + listProductos.getRowCount());
        for (int i = 0; i < listProductos.getRowCount(); i++) {
            String codigo = (String) listProductos.getValueAt(i, 2);
            System.out.println("CODIGO: " + codigo);
            int cant = (int) listProductos.getValueAt(i, 1);
            double precio = Conexion.getInstance().precioDeProductos(codigo);
            System.out.println("PRECIO: " + precio);
            precio_estimado += precio * cant;
        }
        precio.setValue(precio_estimado);
    }

    private void quitarElemento() {
        int index = estaListaProducto((String) listProductos.getValueAt(listProductos.getSelectedRow(), 2));
        if (index != -1) {
            listaComboProducto.remove(index);
            DefaultTableModel tableDetalle = (DefaultTableModel) listProductos.getModel();
            tableDetalle.removeRow(listProductos.getSelectedRow());
        }
        estimarPrecio();
    }


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
    private javax.swing.JTable combosT;
    private javax.swing.JButton crearCombo;
    private javax.swing.JTextField descripcion;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable listProductos;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton nombreA;
    private javax.swing.JRadioButton nombreC;
    private javax.swing.JRadioButton nombreI;
    private javax.swing.JSpinner precio;
    private javax.swing.JButton quitar;
    private javax.swing.JRadioButton textura;
    private javax.swing.JRadioButton tipoC;
    private javax.swing.JRadioButton tipoI;
    // End of variables declaration//GEN-END:variables
}
