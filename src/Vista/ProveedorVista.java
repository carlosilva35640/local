
package Vista;

import Modelo.Productos;
import Modelo.Proveedor;
import Modelo.ProveedorDao;
import Modelo.RegistroDao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProveedorVista extends javax.swing.JFrame {
    Date fechaVenta = new Date();
    String fechaActual = new SimpleDateFormat("MM/dd/yyyy").format(fechaVenta);
    Proveedor pr = new Proveedor();
    ProveedorDao PrDao = new ProveedorDao();
    RegistroDao Rdao = new RegistroDao();
    DefaultTableModel modelo = new DefaultTableModel();
 
    
    public ProveedorVista() {
        initComponents();
        MidateProveedor.setDate(fechaVenta);
        llenarComboBox();
        llenarComboBox1();
        llenarComboBox2();
    }
    double item;
    double TotalDeuda;
    double TotalPago;
    double Total;
    
    
     
    
    public void LimpiarTable() {
    if (modelo.getRowCount() > 0) { // Verificar si la tabla tiene filas
        modelo.setRowCount(0); // Limpiar el modelo de la tabla
    }
}
    private void llenarComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        cbxBuscarProveedor.setModel(model);
       
        for (String nombre : PrDao.BuscarNombreProveedor()) {
            model.addElement(nombre);
        }
    }
     private void llenarComboBox1() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        cbxBuscarProveedor1.setModel(model);

        for (String nombre : PrDao.BuscarNombreProveedor()) {
            model.addElement(nombre);
        }
     }
         private void llenarComboBox2() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        cbxBuscarProveedor2.setModel(model);

        for (String nombre : PrDao.BuscarNombreProveedor()) {
            model.addElement(nombre);
        }
         }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        cbxBuscarProveedor2 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableFacturas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableProveedor = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtFechaProveedor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPagosProveedor = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtDeudaProveedor = new javax.swing.JTextField();
        btnguardarProveedor = new javax.swing.JButton();
        btnEditarProveedor = new javax.swing.JButton();
        btnNuevoProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        txtIdProveedor = new javax.swing.JTextField();
        txtFacturaProveedor = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cbxBuscarProveedor1 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        txtTotalFactura = new javax.swing.JTextField();
        txtxBuscarFactura = new javax.swing.JTextField();
        btnBuscarFactura = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDeudas = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtPagos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxBuscarProveedor = new javax.swing.JComboBox<>();
        btnBusProveeFecha = new javax.swing.JButton();
        btnBorrarTable = new javax.swing.JButton();
        MidateProveedor = new com.toedter.calendar.JDateChooser();
        MidateFinal = new com.toedter.calendar.JDateChooser();
        MidateInicio = new com.toedter.calendar.JDateChooser();
        btnSeleccionarTodo = new javax.swing.JButton();
        btnBusProvee = new javax.swing.JButton();
        btnBusProvee2 = new javax.swing.JButton();
        txtNombreTrabajador = new javax.swing.JTextField();
        txtPagosProveedor1 = new javax.swing.JTextField();
        btnPagoProveedor = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        btnPdf = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxBuscarProveedor2.setMaximumRowCount(30);
        cbxBuscarProveedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBuscarProveedor2ActionPerformed(evt);
            }
        });
        jPanel4.add(cbxBuscarProveedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 710, 140, -1));

        TableFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FACTURA", "FECHA", "PROVEEDOR", "CANTIDAD", "PRODUCTO", "PESO", "PRECIO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFacturasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TableFacturas);
        if (TableFacturas.getColumnModel().getColumnCount() > 0) {
            TableFacturas.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 880, 180));

        TableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FECHA", "NOMBRE", "PAGOS", "DEUDA", "FACTURA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProveedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableProveedor);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 880, 150));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nuevo Proveedor"));
        jPanel10.setOpaque(false);

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Fecha :");

        txtFechaProveedor.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaProveedor.setOpaque(false);
        txtFechaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaProveedorActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Nuevo provee :");

        txtNombreProveedor.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreProveedor.setOpaque(false);
        txtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveedorActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Pago :");

        txtPagosProveedor.setForeground(new java.awt.Color(255, 255, 255));
        txtPagosProveedor.setOpaque(false);
        txtPagosProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagosProveedorActionPerformed(evt);
            }
        });
        txtPagosProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagosProveedorKeyTyped(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Deuda :");

        txtDeudaProveedor.setForeground(new java.awt.Color(255, 255, 255));
        txtDeudaProveedor.setOpaque(false);
        txtDeudaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeudaProveedorActionPerformed(evt);
            }
        });
        txtDeudaProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDeudaProveedorKeyTyped(evt);
            }
        });

        btnguardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        btnguardarProveedor.setText("Guardar");
        btnguardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarProveedorActionPerformed(evt);
            }
        });

        btnEditarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Actualizar (2).png"))); // NOI18N
        btnEditarProveedor.setText("Editar");
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });

        btnNuevoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btnNuevoProveedor.setText("Borrar");
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarProveedor.setText("Eliminar");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        txtIdProveedor.setBackground(new java.awt.Color(0, 0, 0));
        txtIdProveedor.setOpaque(false);

        txtFacturaProveedor.setForeground(new java.awt.Color(255, 255, 255));
        txtFacturaProveedor.setOpaque(false);

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Factura :");

        cbxBuscarProveedor1.setMaximumRowCount(30);
        cbxBuscarProveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBuscarProveedor1ActionPerformed(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Bus Provee :");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguardarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFacturaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFechaProveedor)
                                .addComponent(txtNombreProveedor)
                                .addComponent(txtDeudaProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(txtPagosProveedor))
                            .addComponent(cbxBuscarProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxBuscarProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPagosProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeudaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFacturaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarProveedor)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEditarProveedor)
                .addGap(18, 18, 18)
                .addComponent(btnNuevoProveedor)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 780));

        txtTotalFactura.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalFactura.setOpaque(false);
        txtTotalFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalFacturaActionPerformed(evt);
            }
        });
        txtTotalFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalFacturaKeyTyped(evt);
            }
        });
        jPanel4.add(txtTotalFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 740, 110, 30));

        txtxBuscarFactura.setForeground(new java.awt.Color(255, 255, 255));
        txtxBuscarFactura.setOpaque(false);
        txtxBuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtxBuscarFacturaActionPerformed(evt);
            }
        });
        txtxBuscarFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtxBuscarFacturaKeyTyped(evt);
            }
        });
        jPanel4.add(txtxBuscarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 750, 110, 30));

        btnBuscarFactura.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBuscarFactura.setText("Buscar");
        btnBuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFacturaActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 730, 90, 33));

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Proveedor :");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 720, -1, -1));

        jLabel33.setBackground(new java.awt.Color(204, 204, 204));
        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Total Factura :");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 750, -1, -1));

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Nro. Factura :");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 760, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Credito :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 100, 40));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Pagos : ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 120, 40));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Total Deuda : ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 120, 40));

        txtDeudas.setForeground(new java.awt.Color(255, 255, 255));
        txtDeudas.setOpaque(false);
        jPanel4.add(txtDeudas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 120, 30));

        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setOpaque(false);
        jPanel4.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, 120, 30));

        txtPagos.setForeground(new java.awt.Color(255, 255, 255));
        txtPagos.setOpaque(false);
        txtPagos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagosKeyTyped(evt);
            }
        });
        jPanel4.add(txtPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 120, 30));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Buscar Deuda o Pagar Proveedor :");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 370, -1));

        cbxBuscarProveedor.setMaximumRowCount(30);
        cbxBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBuscarProveedorActionPerformed(evt);
            }
        });
        jPanel4.add(cbxBuscarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 140, -1));

        btnBusProveeFecha.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnBusProveeFecha.setText("BUSCAR");
        btnBusProveeFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusProveeFechaActionPerformed(evt);
            }
        });
        jPanel4.add(btnBusProveeFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 180, 80, 33));

        btnBorrarTable.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBorrarTable.setText("Borrar");
        btnBorrarTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTableActionPerformed(evt);
            }
        });
        jPanel4.add(btnBorrarTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 80, 33));

        MidateProveedor.setDateFormatString("MMM dd yyyy");
        MidateProveedor.setOpaque(false);
        jPanel4.add(MidateProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 130, 30));

        MidateFinal.setDateFormatString("MMM dd yyyy");
        MidateFinal.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        MidateFinal.setOpaque(false);
        jPanel4.add(MidateFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 130, 90, 20));

        MidateInicio.setDateFormatString(" MMM dd yyyy");
        MidateInicio.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        MidateInicio.setOpaque(false);
        jPanel4.add(MidateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 90, 20));

        btnSeleccionarTodo.setText("Seleccionar Todo");
        btnSeleccionarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarTodoActionPerformed(evt);
            }
        });
        jPanel4.add(btnSeleccionarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        btnBusProvee.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBusProvee.setText("Buscar");
        btnBusProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusProveeActionPerformed(evt);
            }
        });
        jPanel4.add(btnBusProvee, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 80, 33));

        btnBusProvee2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnBusProvee2.setText("BUSCAR");
        btnBusProvee2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusProvee2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBusProvee2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 180, 80, 33));

        txtNombreTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreTrabajador.setOpaque(false);
        txtNombreTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTrabajadorActionPerformed(evt);
            }
        });
        txtNombreTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreTrabajadorKeyTyped(evt);
            }
        });
        jPanel4.add(txtNombreTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 110, 30));

        txtPagosProveedor1.setForeground(new java.awt.Color(255, 255, 255));
        txtPagosProveedor1.setOpaque(false);
        txtPagosProveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagosProveedor1ActionPerformed(evt);
            }
        });
        txtPagosProveedor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagosProveedor1KeyTyped(evt);
            }
        });
        jPanel4.add(txtPagosProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 110, 30));

        btnPagoProveedor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnPagoProveedor.setText("Pagar");
        btnPagoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoProveedorActionPerformed(evt);
            }
        });
        jPanel4.add(btnPagoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 90, 33));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Proveedores por fecha ");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 160, -1, -1));

        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf.png"))); // NOI18N
        btnPdf.setText("Guardar Pdf");
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });
        jPanel4.add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 250, 120, 40));

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Buscar proveedor");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Proveedor por fecha ");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, -1, -1));

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Trabajador :");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Pago :");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, -1, -1));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Nombre :");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Fecha Actual :");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 100, -1));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Hasta :");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, -1, -1));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Desde :");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salchichas.jpg"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 800));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProveedorMouseClicked
       
       
        btnEditarProveedor.setEnabled(true);
        btnEliminarProveedor.setEnabled(true);
        btnguardarProveedor.setEnabled(true);
        int fila = TableProveedor.rowAtPoint(evt.getPoint());
        txtIdProveedor.setText(TableProveedor.getValueAt(fila, 0).toString());
        txtFechaProveedor.setText(TableProveedor.getValueAt(fila, 1).toString());
        String valor = TableProveedor.getValueAt(fila, 2).toString();
        cbxBuscarProveedor1.setSelectedItem(valor);
        txtPagosProveedor.setText(TableProveedor.getValueAt(fila, 3).toString());
        txtDeudaProveedor.setText(TableProveedor.getValueAt(fila, 4).toString());
        txtFacturaProveedor.setText(TableProveedor.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_TableProveedorMouseClicked

    private void txtNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProveedorActionPerformed

    }//GEN-LAST:event_txtNombreProveedorActionPerformed

    private void txtDeudaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeudaProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeudaProveedorActionPerformed

    private void btnguardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarProveedorActionPerformed
 Date fechaActualDate = MidateProveedor.getDate();
 String fecha = new SimpleDateFormat("MM/dd/yyyy").format(fechaActualDate);
// Verifica si hay un elemento seleccionado en el JComboBox o si el JTextField no está vacío
if ( cbxBuscarProveedor1.getSelectedItem() != null && !cbxBuscarProveedor1.getSelectedItem().toString().isEmpty() || !txtNombreProveedor.getText().isEmpty()) {
    // Si hay un elemento seleccionado en el JComboBox, lo usamos como nombreProveedor
    // Si no, usamos el texto del JTextField
    String nombreProveedor = (cbxBuscarProveedor1.getSelectedItem() != null && !cbxBuscarProveedor1.getSelectedItem().toString().isEmpty()) ? cbxBuscarProveedor1.getSelectedItem().toString() : txtNombreProveedor.getText();


    String deudaText = txtDeudaProveedor.getText();
    String facturaText = txtFacturaProveedor.getText();

    // Verifica si deuda, factura y fecha no están vacíos
    if (!deudaText.isEmpty() && !facturaText.isEmpty() && fechaActualDate != null) {
        try {
            double deuda = Double.parseDouble(deudaText);
             double Pago = 0.0;
            String factura = facturaText;
            
          
            
            pr.setFecha(fecha);
            pr.setNombre(nombreProveedor);
            pr.setDeuda(deuda);
            pr.setPagos(Pago);
            pr.setFactura(factura);
            
            // Realiza el registro del proveedor
            PrDao.RegistrarProveedor(pr);
            
            // Limpia los campos y actualiza la interfaz
            llenarComboBox();
            llenarComboBox1();
            JOptionPane.showMessageDialog(null, "Proveedor Registrado");
            LimpiarTable();
            LimpiarProveedor();
            txtPagos.setEditable(false);
            txtDeudas.setEditable(false);
            txtTotal.setEditable(false);
            llenarProveedor(nombreProveedor);
            TotalDeudaYPago();
            btnEditarProveedor.setEnabled(false);
            btnEliminarProveedor.setEnabled(false);
            btnguardarProveedor.setEnabled(true);
        } catch (NumberFormatException e) {
            // Manejar una excepción en caso de que los valores no puedan ser convertidos a números
            JOptionPane.showMessageDialog(null, "Los campos de deuda o factura no son válidos");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Los campos de deuda, factura o fecha están vacíos");
    }
} else {
    JOptionPane.showMessageDialog(null, "Por favor, seleccione un proveedor o ingrese un nombre de proveedor válido");
}


        
    }//GEN-LAST:event_btnguardarProveedorActionPerformed

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
  String nombreProveedor = cbxBuscarProveedor1.getSelectedItem().toString();
String pagosText = txtPagosProveedor.getText();
String deudaText = txtDeudaProveedor.getText();
String facturaText = txtFacturaProveedor.getText();

if ("".equals(txtIdProveedor.getText())) {
    JOptionPane.showMessageDialog(null, "Seleccione una fila");
} else {
    if (!"".equals(txtFechaProveedor.getText()) && !"".equals(nombreProveedor) && !pagosText.isEmpty() && !deudaText.isEmpty() && !facturaText.isEmpty()) {
        try {
            double pagos = Double.parseDouble(pagosText);
            double deuda = Double.parseDouble(deudaText);
            String factura = facturaText;
            
            pr.setFecha(txtFechaProveedor.getText());
            pr.setNombre(nombreProveedor);
            pr.setPagos(pagos);
            pr.setDeuda(deuda);
            pr.setFactura(factura);
            pr.setId(Integer.parseInt(txtIdProveedor.getText()));
            PrDao.ModificarProveedor(pr);
            JOptionPane.showMessageDialog(null, "Proveedor Modificado");
            LimpiarTable();
            LimpiarProveedor();
            llenarProveedor(nombreProveedor);
            btnEditarProveedor.setEnabled(false);
            btnEliminarProveedor.setEnabled(false);
            btnguardarProveedor.setEnabled(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos para pagos, deuda y factura");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos");
    }
}


    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        // TODO add your handling code here:
        LimpiarProveedor();
        btnEditarProveedor.setEnabled(false);
        btnEliminarProveedor.setEnabled(false);
        btnguardarProveedor.setEnabled(true);
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        // TODO add your handling code here:
       String nombreProveedor = cbxBuscarProveedor1.getSelectedItem().toString();
if (TableProveedor.getSelectedRowCount() > 0) {
    int pregunta = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar?,Guardaste el archivo pdf?");
    if (pregunta == 0) {
        // Eliminar las filas seleccionadas de la tabla
        int[] filasSeleccionadas = TableProveedor.getSelectedRows();
        for (int fila : filasSeleccionadas) {
            int idFila = Integer.parseInt(TableProveedor.getValueAt(fila, 0).toString());
            PrDao.EliminarProveedor(idFila);
        }
        // Actualizar la tabla después de eliminar las filas seleccionadas
        LimpiarTable();
        LimpiarProveedor();
        llenarComboBox();
        llenarComboBox1();
        llenarProveedor(nombreProveedor);
        TotalDeudaYPago();
        btnguardarProveedor.setEnabled(true);
    }
} else {
    JOptionPane.showMessageDialog(null, "Seleccione una fila");
}
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnBusProveeFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusProveeFechaActionPerformed
  // Obtener la fecha de inicio ingresada por el usuario desde el campo MidateInicio
Date fechaInicioDate = MidateInicio.getDate();
// Obtener la fecha final ingresada por el usuario desde el campo MidateFinal
Date fechaFinalDate = MidateFinal.getDate();

// Verificar si las fechas de inicio y fin no están vacías
  if (fechaInicioDate != null && fechaFinalDate != null) {
          String fechaInicio = new SimpleDateFormat("MM/dd/yyyy").format(fechaInicioDate);
          String fechaFinal = new SimpleDateFormat("MM/dd/yyyy").format(fechaFinalDate);
    try {
        // Llamar al método para buscar proveedores por fecha
        List<Proveedor> proveedoresEncontrados2 = PrDao.buscarProveedorPorFecha(fechaInicio, fechaFinal);
        
        // Mostrar mensaje si no se encontraron proveedores en las fechas especificadas
        if (proveedoresEncontrados2.isEmpty()) {
           
            JOptionPane.showMessageDialog(null, "No se encontraron proveedores en las fechas especificadas");
        } else {
            // Procesar los proveedores encontrados por fecha
           
            llenarProveedorFecha(fechaInicio, fechaFinal);
           TotalDeudaYPagoSemana();
        }
    } catch (SQLException ex) {
        Logger.getLogger(ProveedorVista.class.getName()).log(Level.SEVERE, null, ex);
    }
} else {
    // Mostrar mensaje si se ingresaron fechas inválidas
   
    JOptionPane.showMessageDialog(null, "Ingrese fechas válidas");
}



    }//GEN-LAST:event_btnBusProveeFechaActionPerformed

    private void btnBorrarTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTableActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableProveedor.getModel();
        model.setRowCount(0);
        txtPagos.setText("");
        txtTotal.setText("");
        txtDeudas.setText("");
        cbxBuscarProveedor.setSelectedIndex(-1);
    }//GEN-LAST:event_btnBorrarTableActionPerformed

    private void txtPagosProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagosProveedorKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPagosProveedorKeyTyped

    private void txtDeudaProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeudaProveedorKeyTyped
       char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDeudaProveedorKeyTyped

    private void cbxBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBuscarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBuscarProveedorActionPerformed

    private void txtFechaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaProveedorActionPerformed

    }//GEN-LAST:event_txtFechaProveedorActionPerformed

    private void btnBusProvee2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusProvee2ActionPerformed

           String nombreProveedor = cbxBuscarProveedor.getSelectedItem() != null ? cbxBuscarProveedor.getSelectedItem().toString().trim() : "";
            Date fechaInicioDate = MidateInicio.getDate();
            Date fechaFinalDate = MidateFinal.getDate();          
// Verificar si nombreProveedor no está vacío
if (!nombreProveedor.isEmpty()) {
    // Verificar si los campos de fecha inicio y fecha final no están vacíos
    if (fechaInicioDate != null && fechaFinalDate != null) {
          String fechaInicio = new SimpleDateFormat("MM/dd/yyyy").format(fechaInicioDate);
          String fechaFinal = new SimpleDateFormat("MM/dd/yyyy").format(fechaFinalDate);
        // Ejecutar el código existente para buscar por nombre de proveedor
        List<Proveedor> ProveedoresEncontrados = PrDao.BuscarProveedorPorNombreYFecha(nombreProveedor,fechaInicio,fechaFinal);
        if (ProveedoresEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún proveedor para el rango de fechas especificado");
        } else {
            // Procesar los proveedores encontrados
            llenarProveedorPorFecha(nombreProveedor, fechaInicio, fechaFinal);
          TotalDeudaYPagoSemana();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese el rango de fechas.");
    }
} else {
    JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre de proveedor válido.");
}

    }//GEN-LAST:event_btnBusProvee2ActionPerformed

    private void btnSeleccionarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarTodoActionPerformed
   int numFilas = TableProveedor.getRowCount();

if (numFilas > 0) {
    // Seleccionar todas las filas
    TableProveedor.setRowSelectionInterval(0, numFilas - 1);
} else {
    JOptionPane.showMessageDialog(null, "La tabla está vacía", "Error", JOptionPane.ERROR_MESSAGE);
}
   
    }//GEN-LAST:event_btnSeleccionarTodoActionPerformed

    private void btnBusProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusProveeActionPerformed
  Object seleccion = cbxBuscarProveedor.getSelectedItem();
  if (seleccion != null) {
    String nombreProveedor = seleccion.toString().trim();
    if (!nombreProveedor.isEmpty()) {
        // Ejecutar el código existente para buscar por nombre de proveedor
        List<Proveedor> ProveedoresEncontrados = PrDao.BuscarProveedorPorNombre(nombreProveedor);
        if (ProveedoresEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún proveedor con el nombre especificado");
        } else {
            // Procesar los proveedores encontrados
            llenarProveedor(nombreProveedor);
            TotalDeudaYPago();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre de proveedor válido.");
    }
} else {
    JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún proveedor.");
}

    }//GEN-LAST:event_btnBusProveeActionPerformed

    private void txtPagosProveedor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagosProveedor1KeyTyped
   
    }//GEN-LAST:event_txtPagosProveedor1KeyTyped

    private void btnPagoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoProveedorActionPerformed

        Date fechaDate = MidateProveedor.getDate();
String Fecha = new SimpleDateFormat("MM/dd/yyyy").format(fechaDate);
String Factura = "xxx";
String nombreProveedor = cbxBuscarProveedor.getSelectedItem() != null ? cbxBuscarProveedor.getSelectedItem().toString().trim() : "";

if (!nombreProveedor.isEmpty() && !txtNombreTrabajador.getText().isEmpty() && !txtPagosProveedor1.getText().isEmpty()){
    List<Proveedor> proveedoresEncontrados = PrDao.BuscarProveedorPorNombre(nombreProveedor);
    if (proveedoresEncontrados.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontró el usuario");
    } else {
        double Pago = Double.parseDouble(txtPagosProveedor1.getText());
         double Deuda = 0.0 ;
        pr.setFecha(Fecha);
        pr.setFactura(Factura);
        pr.setNombre(nombreProveedor);
        pr.setPagos(Pago);
        pr.setDeuda(Deuda);
        PrDao.RegistrarProveedor(pr);
        Rdao.RegistroPagoProveedor(pr);
        LimpiarTable();
        llenarProveedor(nombreProveedor);
        TotalDeudaYPago();
        FacturaPago();
        LimpiarProveedor();
        JOptionPane.showMessageDialog(null, "Pago Exitoso");
    }
} else {
    JOptionPane.showMessageDialog(null, "Debes buscar un cliente,un Trabajador e Ingresar el Monto a Pagar");
}

    }//GEN-LAST:event_btnPagoProveedorActionPerformed

    private void cbxBuscarProveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBuscarProveedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBuscarProveedor1ActionPerformed

    private void txtPagosProveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagosProveedor1ActionPerformed

    }//GEN-LAST:event_txtPagosProveedor1ActionPerformed

    private void txtPagosProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagosProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagosProveedorActionPerformed

    private void txtPagosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagosKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPagosKeyTyped

    private void txtNombreTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTrabajadorActionPerformed

    private void txtNombreTrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreTrabajadorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTrabajadorKeyTyped

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        


    }//GEN-LAST:event_btnPdfActionPerformed

    private void TableFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFacturasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TableFacturasMouseClicked

    private void txtxBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtxBuscarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtxBuscarFacturaActionPerformed

    private void txtxBuscarFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtxBuscarFacturaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtxBuscarFacturaKeyTyped

    private void btnBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFacturaActionPerformed
        String nombreProveedor = cbxBuscarProveedor2.getSelectedItem().toString();
        String numeroFactura = (txtxBuscarFactura.getText());
        
         if (!nombreProveedor.isEmpty() && !numeroFactura.isEmpty()) {
           List<Productos> listaFacturas = PrDao.BuscarFacturaPorNombreYNumero(nombreProveedor,numeroFactura);
        if (listaFacturas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún Factura con el nombre especificado");
        } else {   
        
            llenarTablaFacturas(nombreProveedor, numeroFactura);
        }
        
        } else {
    JOptionPane.showMessageDialog(null, "Debes buscar un cliente y una factura");
         }
    }//GEN-LAST:event_btnBuscarFacturaActionPerformed

    private void txtTotalFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalFacturaActionPerformed

    private void txtTotalFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalFacturaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalFacturaKeyTyped

    private void cbxBuscarProveedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBuscarProveedor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBuscarProveedor2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser MidateFinal;
    private com.toedter.calendar.JDateChooser MidateInicio;
    private com.toedter.calendar.JDateChooser MidateProveedor;
    private javax.swing.JTable TableFacturas;
    private javax.swing.JTable TableProveedor;
    private javax.swing.JButton btnBorrarTable;
    private javax.swing.JButton btnBusProvee;
    private javax.swing.JButton btnBusProvee2;
    private javax.swing.JButton btnBusProveeFecha;
    private javax.swing.JButton btnBuscarFactura;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JButton btnPagoProveedor;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnSeleccionarTodo;
    private javax.swing.JButton btnguardarProveedor;
    private javax.swing.JComboBox<String> cbxBuscarProveedor;
    private javax.swing.JComboBox<String> cbxBuscarProveedor1;
    private javax.swing.JComboBox<String> cbxBuscarProveedor2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtDeudaProveedor;
    private javax.swing.JTextField txtDeudas;
    private javax.swing.JTextField txtFacturaProveedor;
    private javax.swing.JTextField txtFechaProveedor;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtNombreTrabajador;
    private javax.swing.JTextField txtPagos;
    private javax.swing.JTextField txtPagosProveedor;
    private javax.swing.JTextField txtPagosProveedor1;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalFactura;
    private javax.swing.JTextField txtxBuscarFactura;
    // End of variables declaration//GEN-END:variables
 private void LimpiarProveedor() {
        txtFacturaProveedor.setText("");
        txtNombreProveedor.setText("");
        txtPagosProveedor.setText("");
        txtDeudaProveedor.setText("");
        txtPagosProveedor1.setText("");
        txtPagosProveedor.setText("");
         txtNombreTrabajador.setText("");
        txtFechaProveedor.setText("");
        cbxBuscarProveedor1.setSelectedIndex(-1);
        cbxBuscarProveedor.setSelectedIndex(-1);
        
       
    }
 
 
    private void llenarProveedor(String nombreProveedor) {
    // Obtener la lista de proveedores que coinciden con el nombre proporcionado
    List<Proveedor> listaProveedores = PrDao.BuscarProveedorPorNombre(nombreProveedor);

    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) TableProveedor.getModel();

    // Limpiar el modelo de la tabla antes de agregar nuevos datos
    modelo.setRowCount(0);

    // Iterar sobre la lista de proveedores y agregar cada uno como una fila en la tabla
    for (Proveedor proveedor : listaProveedores) {
        Object[] fila = {proveedor.getId(), proveedor.getFecha(), proveedor.getNombre(), proveedor.getPagos(), proveedor.getDeuda(), proveedor.getFactura()};
        modelo.addRow(fila);
    }
    
    // Establecer el modelo actualizado en la tabla
    TableProveedor.setModel(modelo);
   }
    
    
private void llenarProveedorPorFecha(String nombreProveedor,String fechaInicio, String fechaFinal) {
    // Obtener la lista de proveedores que coinciden con el nombre proporcionado
    List<Proveedor> listaProveedores = PrDao.BuscarProveedorPorNombreYFecha(nombreProveedor,fechaInicio,fechaFinal);

    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) TableProveedor.getModel();

    // Limpiar el modelo de la tabla antes de agregar nuevos datos
    modelo.setRowCount(0);

    // Iterar sobre la lista de proveedores y agregar cada uno como una fila en la tabla
    for (Proveedor proveedor : listaProveedores) {
        Object[] fila = {proveedor.getId(), proveedor.getFecha(), proveedor.getNombre(), proveedor.getPagos(), proveedor.getDeuda(), proveedor.getFactura()};
        modelo.addRow(fila);
    }
    
    // Establecer el modelo actualizado en la tabla
    TableProveedor.setModel(modelo);
   }
private void llenarProveedorFecha(String fechaInicio, String fechaFinal) throws SQLException {
    // Obtener la lista de proveedores que coinciden con el nombre proporcionado
    List<Proveedor> listaProveedores = PrDao.buscarProveedorPorFecha(fechaInicio,fechaFinal);

    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) TableProveedor.getModel();

    // Limpiar el modelo de la tabla antes de agregar nuevos datos
    modelo.setRowCount(0);

    // Iterar sobre la lista de proveedores y agregar cada uno como una fila en la tabla
    for (Proveedor proveedor : listaProveedores) {
        Object[] fila = {proveedor.getId(), proveedor.getFecha(), proveedor.getNombre(), proveedor.getPagos(), proveedor.getDeuda(), proveedor.getFactura()};
        modelo.addRow(fila);
    }
    
    // Establecer el modelo actualizado en la tabla
    TableProveedor.setModel(modelo);
   }
private void llenarTablaFacturas(String nombreProveedor,String numeroFacura) {
    // Obtener la lista de proveedores que coinciden con el nombre proporcionado
    List<Productos> listaFacturas = PrDao.BuscarFacturaPorNombreYNumero(nombreProveedor,numeroFacura);

    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) TableFacturas.getModel();

    // Limpiar el modelo de la tabla antes de agregar nuevos datos
    modelo.setRowCount(0);

    // Iterar sobre la lista de proveedores y agregar cada uno como una fila en la tabla
    for (Productos factura : listaFacturas) {
        Object[] fila = {factura.getId(), factura.getFactura(), factura.getFecha(), factura.getProveedor(), factura.getCantidadFactura(), factura.getProducto(),factura.getCantCompra(),factura.getPrecioCompra(),factura.getTotal()};
        modelo.addRow(fila);
    }
    
    // Establecer el modelo actualizado en la tabla
    TableFacturas.setModel(modelo);
   }
public void TotalDeudaYPago() {
         TotalDeuda = 0.00;
         TotalPago = 0.00;
         Total = 0.00;
        int numFila = TableProveedor.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double Deuda = Double.parseDouble(String.valueOf(TableProveedor.getModel().getValueAt(i, 4)));
            double Pago = Double.parseDouble(String.valueOf(TableProveedor.getModel().getValueAt(i, 3)));
            
            TotalDeuda = TotalDeuda + Deuda;
            TotalPago = TotalPago + Pago;
            Total =   TotalDeuda - TotalPago ;
          
     }   
        txtDeudas.setText(String.format("%.2f",TotalDeuda));
          txtPagos.setText(String.format("%.2f",TotalPago));
          txtTotal.setText(String.format("%.2f",Total));
}
public void TotalDeudaYPagoSemana() {
         TotalDeuda = 0.00;
         TotalPago = 0.00;
         Total = 0.00;
        int numFila = TableProveedor.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double Deuda = Double.parseDouble(String.valueOf(TableProveedor.getModel().getValueAt(i, 4)));
            double Pago = Double.parseDouble(String.valueOf(TableProveedor.getModel().getValueAt(i, 3)));
            
            TotalDeuda = TotalDeuda + Deuda;
            TotalPago = TotalPago + Pago;
          
          
     }   
        txtDeudas.setText(String.format("%.2f",TotalDeuda));
          txtPagos.setText(String.format("%.2f",TotalPago));
         
}

  private void FacturaPago(){

   // Implementa este método para obtener el ID de la compra
    String proveedor = cbxBuscarProveedor.getSelectedItem().toString();
    String usuario = txtNombreTrabajador.getText();
    String pago =(txtPagosProveedor1.getText());
 
    // Llama a la función para generar el documento PDF
    PrDao.ReciboPagoProveedorPDF(proveedor,pago,usuario);
  }
  
}

