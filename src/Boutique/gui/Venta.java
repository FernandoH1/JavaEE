package Boutique.gui;

import Boutique.io.Accesorio;
import Boutique.io.Calzado;
import Boutique.io.Cliente;
import Boutique.io.Indumentaria;
import Boutique.io.Producto;
import Boutique.persistencia.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Venta extends javax.swing.JFrame {

    private TableRowSorter trsfiltro = new TableRowSorter();
    private DefaultTableModel tablaDatos;

    public Venta() {
        initComponents();
        Volver.setBackground(new Color(0,0,0,0));
        cargarTablaCalzado();
        cargarTablaInd();
        cargarTablaAcc();
        deshabilitarLabel();
        this.setLocationRelativeTo(null);
        
        
        
        List<Cliente> clientes = Conexion.getInstance().listarClientes();
        clientes.forEach(cliente -> ClientesCombo.addItem(cliente));
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupA = new javax.swing.ButtonGroup();
        buttonGroupInd = new javax.swing.ButtonGroup();
        buttonGroupC = new javax.swing.ButtonGroup();
        buttonGroupDesc = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        tipoVentaCombo = new javax.swing.JComboBox<>();
        metodoDePagoCombo = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        Valor = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        cliente = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        ClientesCombo = new BD.WideComboBox();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        buscarA = new javax.swing.JTextField();
        nombreA = new javax.swing.JRadioButton();
        textura = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaAccesorio = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        agregarA = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        buscarC = new javax.swing.JTextField();
        nombreC = new javax.swing.JRadioButton();
        tipoC = new javax.swing.JRadioButton();
        talleC = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCalzado = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        agregarC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        buscarI = new javax.swing.JTextField();
        nombreI = new javax.swing.JRadioButton();
        tipoI = new javax.swing.JRadioButton();
        talleI = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaIndumentaria = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        agregarI = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fecha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 24, -1, -1));

        jLabel2.setText("Tipo de Venta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 60, -1, -1));

        jLabel3.setText("Metodo de Pago:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 24, 145, -1));

        tipoVentaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contado", "Cuotas" }));
        tipoVentaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVentaComboActionPerformed(evt);
            }
        });
        getContentPane().add(tipoVentaCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 55, 150, -1));

        metodoDePagoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta" }));
        getContentPane().add(metodoDePagoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 160, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 730, 146, -1));

        buttonGroupDesc.add(jRadioButton1);
        jRadioButton1.setText("%");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 700, -1, -1));

        buttonGroupDesc.add(Valor);
        Valor.setText("Valor");
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 700, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("/");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 700, 30, -1));

        jLabel7.setText("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 930, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "Sub-Total"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 910, 190));

        jLabel8.setText("Cliente:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 20));

        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clienteKeyReleased(evt);
            }
        });
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 110, -1));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anterior.png"))); // NOI18N
        Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/anteriorr.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 50, 50));
        getContentPane().add(ClientesCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 160, -1));

        jTabbedPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane5MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(240, 218, 168));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarAKeyReleased(evt);
            }
        });
        jPanel3.add(buscarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 270, -1));

        buttonGroupA.add(nombreA);
        nombreA.setText("Nombre");
        nombreA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreAMouseClicked(evt);
            }
        });
        jPanel3.add(nombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        buttonGroupA.add(textura);
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

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 870, 220));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Buscar :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        agregarA.setText("Agregar");
        jPanel3.add(agregarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 160, -1));

        jTabbedPane5.addTab("Accesorios", jPanel3);

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

        buttonGroupC.add(nombreC);
        nombreC.setText("Nombre");
        nombreC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreCMouseClicked(evt);
            }
        });
        jPanel1.add(nombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        buttonGroupC.add(tipoC);
        tipoC.setText("Tipo");
        tipoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipoCMouseClicked(evt);
            }
        });
        jPanel1.add(tipoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        buttonGroupC.add(talleC);
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

        jTextField2.setText("jTextField2");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jLabel16.setText("jLabel16");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Buscar :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        agregarC.setText("Agregar");
        jPanel1.add(agregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 150, -1));

        jTabbedPane5.addTab("Calzado", jPanel1);

        jPanel2.setBackground(new java.awt.Color(240, 218, 168));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarIKeyReleased(evt);
            }
        });
        jPanel2.add(buscarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 270, -1));

        buttonGroupInd.add(nombreI);
        nombreI.setText("Nombre");
        nombreI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreIMouseClicked(evt);
            }
        });
        jPanel2.add(nombreI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        buttonGroupInd.add(tipoI);
        tipoI.setText("Tipo");
        tipoI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipoIMouseClicked(evt);
            }
        });
        jPanel2.add(tipoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        buttonGroupInd.add(talleI);
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
        jPanel2.add(agregarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 160, -1));

        jTabbedPane5.addTab("Indumentaria", jPanel2);

        getContentPane().add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 910, 330));

        foto.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 40, 40));

        jPanel4.setBackground(new java.awt.Color(240, 218, 168));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 690, 80));

        jPanel5.setBackground(new java.awt.Color(240, 218, 168));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Quitar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setText("Tipo de Descuento:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setText("Descuento:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jButton1.setText("Sacar Desquento");
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jButton4.setText("Confirmar Venta");
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 180, -1));
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 60, -1));
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 60, -1));

        jLabel10.setText("SUB-TOTAL:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jLabel11.setText("TOTAL:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 910, 150));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boutique/Image/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteKeyReleased
        if (cliente.getText().length() >= 3) {
            DefaultComboBoxModel<Cliente> mdl = new DefaultComboBoxModel<>();
            Iterator<Cliente> it = Conexion.getInstance().listarClientesByName(cliente.getText()).iterator();
            while (it.hasNext()) {
                Cliente next = it.next();
                mdl.addElement(next);
            }
            ClientesCombo.setModel(mdl);
            if(mdl.getSize() > 0){
            ClientesCombo.showPopup();
            }
            
        }
    }//GEN-LAST:event_clienteKeyReleased

    private void jTabbedPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane5MouseClicked

    }//GEN-LAST:event_jTabbedPane5MouseClicked

    private void talleCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talleCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talleCActionPerformed

    private void TablaCalzadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCalzadoMouseClicked
       
    }//GEN-LAST:event_TablaCalzadoMouseClicked

    private void TablaIndumentariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaIndumentariaMouseClicked
        
    }//GEN-LAST:event_TablaIndumentariaMouseClicked

    private void TablaAccesorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAccesorioMouseClicked
        
    }//GEN-LAST:event_TablaAccesorioMouseClicked

    private void buscarCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarCKeyTyped
        
    }//GEN-LAST:event_buscarCKeyTyped

    private void buscarCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarCKeyReleased

        if (buttonGroupC.getSelection()==null) {
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

    private void buscarIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarIKeyReleased
        if (buttonGroupInd.getSelection()==null) {
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

    private void buscarAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarAKeyReleased
        if (buttonGroupA.getSelection()==null) {
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

    private void nombreCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreCMouseClicked
        this.buscarC.enable();
    }//GEN-LAST:event_nombreCMouseClicked

    private void tipoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoCMouseClicked
        this.buscarC.enable();
    }//GEN-LAST:event_tipoCMouseClicked

    private void talleCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talleCMouseClicked
        this.buscarC.enable();
    }//GEN-LAST:event_talleCMouseClicked

    private void nombreIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreIMouseClicked
        this.buscarI.enable();
    }//GEN-LAST:event_nombreIMouseClicked

    private void tipoIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoIMouseClicked
        this.buscarI.enable();
    }//GEN-LAST:event_tipoIMouseClicked

    private void talleIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talleIMouseClicked
        this.buscarI.enable(); 
    }//GEN-LAST:event_talleIMouseClicked

    private void nombreAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreAMouseClicked
        this.buscarA.enable();
    }//GEN-LAST:event_nombreAMouseClicked

    private void texturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texturaMouseClicked
        this.buscarA.enable();
    }//GEN-LAST:event_texturaMouseClicked

    private void tipoVentaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVentaComboActionPerformed
        
    }//GEN-LAST:event_tipoVentaComboActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
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
        TablaCalzado.setRowHeight(40);
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
        TablaIndumentaria.setRowHeight(40);
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
    
    public void deshabilitarLabel(){
        this.buscarA.disable();
        this.buscarC.disable();
        this.buscarI.disable();
        
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BD.WideComboBox ClientesCombo;
    private javax.swing.JTable TablaAccesorio;
    private javax.swing.JTable TablaCalzado;
    private javax.swing.JTable TablaIndumentaria;
    private javax.swing.JRadioButton Valor;
    private javax.swing.JButton Volver;
    private javax.swing.JButton agregarA;
    private javax.swing.JButton agregarC;
    private javax.swing.JButton agregarI;
    private javax.swing.JTextField buscarA;
    private javax.swing.JTextField buscarC;
    private javax.swing.JTextField buscarI;
    private javax.swing.ButtonGroup buttonGroupA;
    private javax.swing.ButtonGroup buttonGroupC;
    private javax.swing.ButtonGroup buttonGroupDesc;
    private javax.swing.ButtonGroup buttonGroupInd;
    private javax.swing.JTextField cliente;
    private javax.swing.JLabel foto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JComboBox<String> metodoDePagoCombo;
    private javax.swing.JRadioButton nombreA;
    private javax.swing.JRadioButton nombreC;
    private javax.swing.JRadioButton nombreI;
    private javax.swing.JRadioButton talleC;
    private javax.swing.JRadioButton talleI;
    private javax.swing.JRadioButton textura;
    private javax.swing.JRadioButton tipoC;
    private javax.swing.JRadioButton tipoI;
    private javax.swing.JComboBox<String> tipoVentaCombo;
    // End of variables declaration//GEN-END:variables

}
