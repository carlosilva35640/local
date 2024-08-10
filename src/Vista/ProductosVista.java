
package Vista;
import Modelo.Cuentas;
import Modelo.Productos;
import Modelo.ProductosDao;
import Modelo.Eventos;
import Modelo.ProveedorDao;
import java.awt.event.KeyEvent;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ProductosVista extends javax.swing.JFrame {
    Date fechaVenta = new Date();
    Productos pro = new Productos();
    Cuentas cu = new Cuentas();
    ProductosDao proDao = new ProductosDao();
    ProveedorDao PrDao = new ProveedorDao();
    DefaultTableModel modelo = new DefaultTableModel();
    Eventos event = new Eventos();
    
    public ProductosVista() {
        initComponents();
          MidateProductos.setDate(fechaVenta);
          ListarProductos();
          ListarCuentas();
          llenarComboBox();
          llenarComboBox1();
          TotalSumaTableCuentas();
         
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
   
  
     
    
      public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpProducto = new javax.swing.JPanel();
        MidateProductos = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        cbxBuscarProveedor1 = new javax.swing.JComboBox<>();
        txtIdProducto = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtCodigoPro = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnGuardarpro = new javax.swing.JButton();
        btnEditarpro = new javax.swing.JButton();
        btnEliminarPro = new javax.swing.JButton();
        btnNuevoPro = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtMerma = new javax.swing.JTextField();
        sss = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtCantCompra = new javax.swing.JTextField();
        sss1 = new javax.swing.JLabel();
        txtPorcentaje = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbxBuscarProveedor = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtCantUnid = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableCuentas = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableProducto = new javax.swing.JTable();
        txtVentas = new javax.swing.JTextField();
        txtPerdida = new javax.swing.JTextField();
        txtPagar = new javax.swing.JTextField();
        txtGanancia = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpProducto.setBackground(java.awt.Color.lightGray);
        jpProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MidateProductos.setDateFormatString("MMM dd yyyy");
        MidateProductos.setOpaque(false);
        jpProducto.add(MidateProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 130, 30));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpProducto.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        cbxBuscarProveedor1.setMaximumRowCount(30);
        cbxBuscarProveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBuscarProveedor1ActionPerformed(evt);
            }
        });
        jpProducto.add(cbxBuscarProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 120, -1));

        txtIdProducto.setOpaque(false);
        jpProducto.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jPanel11.setBackground(java.awt.Color.lightGray);
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel11.setOpaque(false);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Código:");

        txtCodigoPro.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoPro.setOpaque(false);
        txtCodigoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProActionPerformed(evt);
            }
        });
        txtCodigoPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoProKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Producto :");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Peso :");

        btnGuardarpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        btnGuardarpro.setText("Guardar");
        btnGuardarpro.setOpaque(false);
        btnGuardarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarproActionPerformed(evt);
            }
        });

        btnEditarpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Actualizar (2).png"))); // NOI18N
        btnEditarpro.setText("Editar");
        btnEditarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarproActionPerformed(evt);
            }
        });

        btnEliminarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarPro.setText("Eliminar");
        btnEliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProActionPerformed(evt);
            }
        });

        btnNuevoPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btnNuevoPro.setText("Borrar");
        btnNuevoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Merma :");

        txtProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtProducto.setOpaque(false);
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });

        txtPrecioVenta.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioVenta.setOpaque(false);
        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });
        txtPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioVentaKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("PrecioC:");

        txtMerma.setForeground(new java.awt.Color(255, 255, 255));
        txtMerma.setOpaque(false);
        txtMerma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMermaActionPerformed(evt);
            }
        });
        txtMerma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMermaKeyTyped(evt);
            }
        });

        sss.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sss.setForeground(new java.awt.Color(204, 204, 204));
        sss.setText("PrecioV :");

        txtPrecioCompra.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioCompra.setOpaque(false);
        txtPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCompraKeyTyped(evt);
            }
        });

        txtStock.setOpaque(false);

        txtCantCompra.setForeground(new java.awt.Color(255, 255, 255));
        txtCantCompra.setOpaque(false);
        txtCantCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantCompraActionPerformed(evt);
            }
        });
        txtCantCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantCompraKeyTyped(evt);
            }
        });

        sss1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sss1.setForeground(new java.awt.Color(204, 204, 204));
        sss1.setText("% Produc:");

        txtPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        txtPorcentaje.setOpaque(false);
        txtPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorcentajeActionPerformed(evt);
            }
        });
        txtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyTyped(evt);
            }
        });

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jButton1.setText("Descontar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbxBuscarProveedor.setMaximumRowCount(30);
        cbxBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBuscarProveedorActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Proveedor :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Cant Unid :");

        txtCantUnid.setForeground(new java.awt.Color(255, 255, 255));
        txtCantUnid.setOpaque(false);
        txtCantUnid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantUnidActionPerformed(evt);
            }
        });
        txtCantUnid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantUnidKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Factura:");

        txtFactura.setForeground(new java.awt.Color(255, 255, 255));
        txtFactura.setOpaque(false);
        txtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturaActionPerformed(evt);
            }
        });
        txtFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFacturaKeyTyped(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Stock :");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(txtMerma, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(btnComprar)
                        .addGap(30, 30, 30))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditarpro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarpro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel30)
                                            .addComponent(sss1)
                                            .addComponent(jLabel26))
                                        .addGap(44, 44, 44))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(42, 42, 42))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel28)
                                            .addComponent(sss)
                                            .addComponent(jLabel24))
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel33))))
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPorcentaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantUnid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(52, 52, 52)
                                .addComponent(txtCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(15, 15, 15)))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantUnid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sss1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sss))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(17, 17, 17)
                .addComponent(btnComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMerma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(42, 42, 42)
                .addComponent(btnGuardarpro)
                .addGap(18, 18, 18)
                .addComponent(btnEditarpro)
                .addGap(18, 18, 18)
                .addComponent(btnNuevoPro)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jpProducto.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 760));

        jScrollPane6.setOpaque(false);

        TableCuentas.setBackground(new java.awt.Color(51, 255, 255));
        TableCuentas.setForeground(new java.awt.Color(0, 0, 0));
        TableCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "DESCRIPCIÓN", "VENTAKG", "VENTA$", "MERMA$", "PAGAR", "GANANCIA"
            }
        ));
        TableCuentas.getTableHeader().setReorderingAllowed(false);
        TableCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCuentasMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TableCuentas);
        if (TableCuentas.getColumnModel().getColumnCount() > 0) {
            TableCuentas.getColumnModel().getColumn(2).setMinWidth(200);
            TableCuentas.getColumnModel().getColumn(2).setMaxWidth(600);
        }

        jpProducto.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 730, 270));

        jScrollPane5.setOpaque(false);

        TableProducto.setBackground(new java.awt.Color(51, 255, 255));
        TableProducto.setForeground(new java.awt.Color(0, 0, 0));
        TableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "DESCRIPCIÓN", "COMPRA", "VENTA", "MERMA", "PRECIOC", "PRECIOV", "STOCK"
            }
        ));
        TableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProductoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TableProducto);
        if (TableProducto.getColumnModel().getColumnCount() > 0) {
            TableProducto.getColumnModel().getColumn(2).setMinWidth(200);
            TableProducto.getColumnModel().getColumn(2).setMaxWidth(600);
            TableProducto.getColumnModel().getColumn(3).setHeaderValue("COMPRA");
            TableProducto.getColumnModel().getColumn(4).setHeaderValue("VENTAKG");
            TableProducto.getColumnModel().getColumn(8).setHeaderValue("STOCK");
        }

        jpProducto.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 730, 270));
        jpProducto.add(txtVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 700, 100, -1));
        jpProducto.add(txtPerdida, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, 100, -1));
        jpProducto.add(txtPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 700, 100, -1));
        jpProducto.add(txtGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 700, 110, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Total Perdida :");
        jpProducto.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 670, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Total Ganancia :");
        jpProducto.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 670, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Total Pagar :");
        jpProducto.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 670, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Total Ventas :");
        jpProducto.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, -1, -1));

        jButton3.setText("Reiniciar Cuentas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jpProducto.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 140, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tipos-queso-fresco.jpg"))); // NOI18N
        jpProducto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProActionPerformed
        // Establecemos una bandera para indicar si la búsqueda ya se realizó
        String cod1 = txtCodigoPro.getText();
        if (!cod1.isEmpty()) {
            pro = proDao.BuscarPro(cod1);
            if (pro != null && pro.getProducto() != null) {
                txtIdProducto.setText("" + pro.getId());
                txtProducto.setText("" + pro.getProducto());
                txtPrecioCompra.setText("" + pro.getPrecioCompra());
                txtPrecioVenta.setText("" + pro.getPrecioVenta());
                txtStock.setText("" + pro.getStock());
                txtMerma.setText("" + pro.getMerma());
                txtCantCompra.setText("" + pro.getCantCompra());
              
                btnEditarpro.setEnabled(true);
                btnEliminarPro.setEnabled(true);
                btnGuardarpro.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún producto con el código ingresado.");
                txtCodigoPro.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el código del producto.");
            txtCodigoPro.requestFocus();
        }

    }//GEN-LAST:event_txtCodigoProActionPerformed

    private void txtCodigoProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProKeyTyped

    }//GEN-LAST:event_txtCodigoProKeyTyped

    private void btnGuardarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarproActionPerformed
         String Proveedor =(String) (cbxBuscarProveedor.getSelectedItem());
        
        try {
        if (!"".equals(txtCodigoPro.getText()) && !"".equals(txtProducto.getText())
            && !"".equals(txtPrecioVenta.getText())
            && !"".equals(txtCantCompra.getText())  && !"".equals(txtMerma.getText()) && Proveedor != null && !cbxBuscarProveedor.getSelectedItem().toString().isEmpty() ) {
            
               RegistrarFactura();
      

          
            pro.setProducto(txtProducto.getText());
            pro.setCantCompra(Double.valueOf(txtCantCompra.getText()));
          
            pro.setMerma(Double.valueOf(txtMerma.getText()));
            pro.setPrecioVenta(Double.valueOf(txtPrecioVenta.getText()));
            pro.setPrecioCompra(Double.valueOf(txtPrecioCompra.getText()));
            pro.setStock(Double.valueOf(txtCantCompra.getText()));
            pro.setCodigo(txtCodigoPro.getText());
            pro.setProducto(txtProducto.getText());
          
            
            cu.setCodigo$(txtCodigoPro.getText());
            cu.setProducto$(txtProducto.getText());
          
            cu.setMerma(Double.parseDouble(txtMerma.getText()));
            cu.setProveedor(Proveedor);
            cu.setPrecioVenta$(Double.parseDouble(txtPrecioVenta.getText()));
            cu.setPrecioCompra$(Double.parseDouble(txtPrecioCompra.getText()));
            
            proDao.RegistrarProductos(pro);
            proDao.RegistrarProductos$(cu);
            
            JOptionPane.showMessageDialog(null, "Producto y cuentas registrados correctamente");
            LimpiarTable();
            ListarProductos();
            LimpiarProductos();
            btnEditarpro.setEnabled(false);
            btnEliminarPro.setEnabled(false);
            btnGuardarpro.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Los campos están vacíos");
        }
    } catch (SQLIntegrityConstraintViolationException e) {
        JOptionPane.showMessageDialog(null, "Error: El código de producto ya existe.");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Error: Por favor, ingresa números válidos en los campos numéricos.");
    }
         
               

    }//GEN-LAST:event_btnGuardarproActionPerformed

    private void btnEditarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarproActionPerformed
        // TODO add your handling code here:
            String Proveedor =(String) (cbxBuscarProveedor.getSelectedItem());
        if ("".equals(txtIdProducto.getText()) && "".equals(txtCodigoPro.getText()) && "".equals(txtProducto.getText()) && "".equals(txtPrecioCompra.getText()) && "".equals(txtPrecioVenta.getText()) && "".equals(Proveedor)) {
            JOptionPane.showMessageDialog(null, "Por Favor llenar los campos Necesarios");
} else {
           
                pro.setCodigo(txtCodigoPro.getText());
                pro.setProducto(txtProducto.getText());
                pro.setMerma(Double.valueOf(txtMerma.getText()));
                pro.setPrecioCompra(Double.valueOf(txtPrecioCompra.getText()));
                pro.setPrecioVenta(Double.valueOf(txtPrecioVenta.getText()));
                pro.setCantCompra(Double.valueOf(txtCantCompra.getText()));
                pro.setStock(Double.valueOf(txtStock.getText()));
                pro.setId(Integer.parseInt(txtIdProducto.getText()));
                proDao.ModificarProductos(pro);
                
            
                cu.setProveedor(Proveedor);
                cu.setCodigo$(txtCodigoPro.getText());
                cu.setProducto$(txtProducto.getText());
                cu.setMerma(Double.parseDouble(txtMerma.getText()));
                cu.setPrecioCompra$(Double.parseDouble(txtPrecioCompra.getText()));
                cu.setPrecioVenta$(Double.parseDouble(txtPrecioVenta.getText()));
              
                  
                proDao.ModificarCuentasCompleto(cu);
             

                JOptionPane.showMessageDialog(null, "Producto Modificado");
                LimpiarTable();
                ListarProductos();
                LimpiarProductos();
                btnEditarpro.setEnabled(false);
                btnEliminarPro.setEnabled(false);
                btnGuardarpro.setEnabled(true);
            }
  
    }//GEN-LAST:event_btnEditarproActionPerformed

    private void btnEliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtIdProducto.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtIdProducto.getText());
                String codigo = (txtCodigoPro.getText());
                proDao.EliminarProductos(id);
                proDao.EliminarCuentas(codigo);
                LimpiarTable();
                LimpiarProductos();
                ListarProductos();
                ListarCuentas();
                btnEditarpro.setEnabled(true);
                btnEliminarPro.setEnabled(true);
                btnGuardarpro.setEnabled(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        }
    }//GEN-LAST:event_btnEliminarProActionPerformed

    private void btnNuevoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProActionPerformed
        // TODO add your handling code here:
        LimpiarProductos();
    }//GEN-LAST:event_btnNuevoProActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed

    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped

    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtMermaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMermaKeyTyped
       char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMermaKeyTyped

    private void txtPrecioCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCompraKeyTyped
       char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioCompraKeyTyped

    private void TableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProductoMouseClicked
       
    }//GEN-LAST:event_TableProductoMouseClicked

    private void txtPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioVentaKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioVentaKeyTyped

    private void txtCantCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantCompraKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantCompraKeyTyped

    private void txtPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcentajeKeyTyped

    private void txtPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorcentajeActionPerformed
   if ("".equals(txtPrecioCompra.getText()) || "".equals(txtPorcentaje.getText())) {
    JOptionPane.showMessageDialog(null, "Campos de Precio Compra o Porcentaje Vacío");
} else {
    double precioCompra = Double.parseDouble(txtPrecioCompra.getText());
    double porcentaje = Double.parseDouble(txtPorcentaje.getText());
    double subPrecio  = (precioCompra * porcentaje) / 100;
    double precioVenta =subPrecio + precioCompra;
    txtPrecioVenta.setText(String.valueOf(precioVenta));
     }
    
     
    }//GEN-LAST:event_txtPorcentajeActionPerformed

    private void txtCantCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantCompraActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaActionPerformed

    private void txtMermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMermaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMermaActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        String Proveedor =(String) (cbxBuscarProveedor.getSelectedItem()); 
      
        Date fechaActualDate = MidateProductos.getDate();
        String fecha = new SimpleDateFormat("MM/dd/yyyy").format(fechaActualDate);
        int id = Integer.parseInt(txtIdProducto.getText());
        double compra = Double.parseDouble(txtCantCompra.getText());
        double Stock = Double.parseDouble(txtStock.getText());
        
      if (!"".equals(fecha) && !"".equals(txtProducto.getText())
            && !"".equals(txtPrecioCompra.getText())
            && !"".equals(txtCantCompra.getText())  && !"".equals(txtCantUnid.getText())  && !"".equals(txtFactura.getText()) && Proveedor != null && !cbxBuscarProveedor.getSelectedItem().toString().isEmpty() ) {
        proDao.ActualizarCantCompra(compra,id);
        proDao.ActualizarStockCompra(Stock,compra,id);
            try {
                RegistrarFactura();
            } catch (SQLIntegrityConstraintViolationException ex) {
                Logger.getLogger(ProductosVista.class.getName()).log(Level.SEVERE, null, ex);
            }
         LimpiarTable();
         ListarProductos();
           JOptionPane.showMessageDialog(null, "Compra Exitosa");
    }else{
             JOptionPane.showMessageDialog(null, "Campos Vacíos");
            }   
    
    }//GEN-LAST:event_btnComprarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo = (txtCodigoPro.getText());
        int id = Integer.parseInt(txtIdProducto.getText());
        double merma = Double.parseDouble(txtMerma.getText());
        double Stock = Double.parseDouble(txtStock.getText());
        
        if (!"".equals(txtIdProducto.getText()) || !"".equals(txtMerma.getText())){
        proDao.ActualizarCantMerma(merma,id);
        proDao.ActualizarStockMerma(Stock,merma,id);
        proDao.ActualizarCantMermaCuentas(merma,codigo);
         LimpiarTable();
         ListarProductos();
           JOptionPane.showMessageDialog(null, "Merma Agregada con Exito");
    }else{
             JOptionPane.showMessageDialog(null, "Campos de id Compra o Vacío");
            }   
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TableCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCuentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TableCuentasMouseClicked

    private void cbxBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBuscarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBuscarProveedorActionPerformed

    private void cbxBuscarProveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBuscarProveedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBuscarProveedor1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Object seleccion = cbxBuscarProveedor1.getSelectedItem();
  if (seleccion != null) {
    String nombreProveedor = seleccion.toString().trim();
    if (!nombreProveedor.isEmpty()) {
        // Ejecutar el código existente para buscar por nombre de proveedor
        List<Cuentas> ProveedoresEncontrados = proDao.BuscarProveedorPorNombre(nombreProveedor);
        if (ProveedoresEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún proveedor con el nombre especificado");
        } else {
            // Procesar los proveedores encontrados
          ListarCuentasPorProveedor(nombreProveedor);
          TotalSumaTableCuentas();
            
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre de proveedor válido.");
    }
} else {
    JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún proveedor.");
  }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCantUnidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantUnidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantUnidActionPerformed

    private void txtCantUnidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantUnidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantUnidKeyTyped

    private void txtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacturaActionPerformed

    private void txtFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFacturaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacturaKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       int pregunta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de reiniciar las cuentas para una semana nueva?");
            if (pregunta == 0) {
      double CantVentaKg = 0.00;
      double Pagoprovee = 0.00;
      double CantVenta$ = 0.00;
      double merma = 0.00;
      double merma$ = 0.00;
      double Ganancia$ = 0.00;
      cu.setCantVentaKg(CantVentaKg);
      cu.setPagoProvee(Pagoprovee);
      cu.setCantVenta$(CantVenta$);
      cu.setMerma(merma);
      cu.setMerma$(merma$);
      cu.setGanancia$(Ganancia$);
      proDao.ModificarCuentas(cu);
      ListarCuentas();
      TotalSumaTableCuentas();
            }else{
                  JOptionPane.showMessageDialog(null, "No se efectuo ningun cambio");
            }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser MidateProductos;
    private javax.swing.JTable TableCuentas;
    private javax.swing.JTable TableProducto;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEditarpro;
    private javax.swing.JButton btnEliminarPro;
    private javax.swing.JButton btnGuardarpro;
    private javax.swing.JButton btnNuevoPro;
    private javax.swing.JComboBox<String> cbxBuscarProveedor;
    private javax.swing.JComboBox<String> cbxBuscarProveedor1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel jpProducto;
    private javax.swing.JLabel sss;
    private javax.swing.JLabel sss1;
    private javax.swing.JTextField txtCantCompra;
    private javax.swing.JTextField txtCantUnid;
    private javax.swing.JTextField txtCodigoPro;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtGanancia;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtMerma;
    private javax.swing.JTextField txtPagar;
    private javax.swing.JTextField txtPerdida;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtVentas;
    // End of variables declaration//GEN-END:variables
void LimpiarProductos() {
        txtCodigoPro.setText("");
        txtProducto.setText("");
        txtCantCompra.setText("");
        txtProducto.setText("");
        txtPrecioVenta.setText("");
        txtPrecioCompra.setText("");
        txtMerma.setText("");
        
        
    }

void RegistrarFactura() throws SQLIntegrityConstraintViolationException {
         String Proveedor =(String) (cbxBuscarProveedor.getSelectedItem());
         Date fechaActualDate = MidateProductos.getDate();
         String fecha = new SimpleDateFormat("MM/dd/yyyy").format(fechaActualDate);
         Double peso =Double.valueOf(txtCantCompra.getText());
         Double Precio = Double.valueOf(txtPrecioCompra.getText());
         Double total = peso * Precio;
         if (!"".equals(fecha) && !"".equals(txtProducto.getText())
            && !"".equals(txtPrecioCompra.getText())
            && !"".equals(txtCantCompra.getText())  && !"".equals(txtCantUnid.getText())  && !"".equals(txtFactura.getText()) && Proveedor != null && !cbxBuscarProveedor.getSelectedItem().toString().isEmpty() ) {
         
            pro.setFecha(fecha);
            pro.setCantidadFactura(Double.parseDouble(txtCantUnid.getText()));
            pro.setProducto(txtProducto.getText());
            pro.setFactura(txtFactura.getText());
            pro.setCantCompra(peso);
            pro.setProveedor(Proveedor);
            pro.setPrecioCompra(Precio);
            pro.setTotal(total);
            proDao.RegistrarFactura(pro);
         }else {
               JOptionPane.showMessageDialog(null, "Los campos están vacíos");
         }
        
    }

 
public final  void ListarProductos() {
    List<Productos> ListarPro = proDao.ListarProductos();
    
    // Para la primera tabla (TableProducto)
    DefaultTableModel modeloTabla1 = (DefaultTableModel) TableProducto.getModel();
    Object[] obTabla1 = new Object[9];
    
    // Borrar las filas existentes en el modelo de la primera tabla
    modeloTabla1.setRowCount(0);
    
    
   for (int i = 0; i < ListarPro.size(); i++) {
    // Para la primera tabla
    obTabla1[0] = ListarPro.get(i).getId();
    obTabla1[1] = ListarPro.get(i).getCodigo();
    obTabla1[2] = ListarPro.get(i).getProducto();
    obTabla1[3] = ListarPro.get(i).getCantCompra();
    obTabla1[4] = ListarPro.get(i).getCantVenta();
    obTabla1[5] = ListarPro.get(i).getMerma();
    obTabla1[6] = ListarPro.get(i).getPrecioCompra();
    obTabla1[7] = ListarPro.get(i).getPrecioVenta();
    obTabla1[8] = ListarPro.get(i).getStock();
    
    
    modeloTabla1.addRow(obTabla1);
    
}
}
   public  void ListarCuentasPorProveedor(String Proveedor) {
    List<Cuentas> ListarCuentasProvee = proDao.BuscarProveedorPorNombre(Proveedor);
    
    // Para la primera tabla (TableProducto)
    DefaultTableModel modelo = (DefaultTableModel) TableCuentas.getModel();
  
    
    // Borrar las filas existentes en el modelo de la primera tabla
    modelo.setRowCount(0);
    
 for (Cuentas cuentas : ListarCuentasProvee) {
        Object[] fila = {cuentas.getId(), cuentas.getCodigo$(), cuentas.getProducto$(), cuentas.getCantVentaKg(), cuentas.getCantVenta$(), cuentas.getMerma$(),cuentas.getPagoProvee(),cuentas.getGanancia$()};
        modelo.addRow(fila);
    }
    
     // Establecer los modelos de las tablas
    TableCuentas.setModel(modelo);
   
  }

public final  void ListarCuentas() {
    List<Cuentas> ListarCu = proDao.ListarCuentas();
    
    // Para la primera tabla (TableProducto)
    DefaultTableModel modeloTabla1 = (DefaultTableModel) TableCuentas.getModel();
    Object[] obTabla1 = new Object[8];
    
    // Borrar las filas existentes en el modelo de la primera tabla
    modeloTabla1.setRowCount(0);
    
    
   for (int i = 0; i < ListarCu.size(); i++) {
    // Para la primera tabla
    obTabla1[0] = ListarCu.get(i).getId();
    obTabla1[1] = ListarCu.get(i).getCodigo$();
    obTabla1[2] = ListarCu.get(i).getProducto$();
    obTabla1[3] = ListarCu.get(i).getCantVentaKg();
    obTabla1[4] = ListarCu.get(i).getCantVenta$();
    obTabla1[5] = ListarCu.get(i).getMerma$();
    obTabla1[6] = ListarCu.get(i).getPagoProvee();
    obTabla1[7] = ListarCu.get(i).getGanancia$();
   
    
    
    modeloTabla1.addRow(obTabla1);
    
}
    
    // Establecer los modelos de las tablas
    TableCuentas.setModel(modeloTabla1);
   
  }
public final  void ListarCuentasProveedor() {
    List<Cuentas> ListarCu = proDao.ListarCuentas();
    
    // Para la primera tabla (TableProducto)
    DefaultTableModel modeloTabla1 = (DefaultTableModel) TableCuentas.getModel();
    Object[] obTabla1 = new Object[8];
    
    // Borrar las filas existentes en el modelo de la primera tabla
    modeloTabla1.setRowCount(0);
    
    
   for (int i = 0; i < ListarCu.size(); i++) {
    // Para la primera tabla
    obTabla1[0] = ListarCu.get(i).getId();
    obTabla1[1] = ListarCu.get(i).getCodigo$();
    obTabla1[2] = ListarCu.get(i).getProducto$();
    obTabla1[3] = ListarCu.get(i).getCantVentaKg();
    obTabla1[4] = ListarCu.get(i).getCantVenta$();
    obTabla1[5] = ListarCu.get(i).getMerma$();
    obTabla1[6] = ListarCu.get(i).getPagoProvee();
    obTabla1[7] = ListarCu.get(i).getGanancia$();
   
    
    
    modeloTabla1.addRow(obTabla1);
    
}
    
    // Establecer los modelos de las tablas
    TableCuentas.setModel(modeloTabla1);
   
  }
private void TotalSumaTableCuentas() {
         double  TotalVentas = 0.00;
         double TotalPerdida = 0.00;
         double TotalPagar = 0.00;
         double TotalGanancia = 0.00;
         
        int numFila = TableCuentas.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double Ventas = Double.parseDouble(String.valueOf(TableCuentas.getModel().getValueAt(i, 4)));
            double Perdida = Double.parseDouble(String.valueOf(TableCuentas.getModel().getValueAt(i, 5)));
            double Pagar = Double.parseDouble(String.valueOf(TableCuentas.getModel().getValueAt(i, 6)));
            double Ganancia = Double.parseDouble(String.valueOf(TableCuentas.getModel().getValueAt(i, 7)));
            
            TotalVentas = TotalVentas + Ventas;
            TotalPerdida = TotalPerdida + Perdida;
            TotalPagar = TotalPagar + Pagar;
            TotalGanancia = TotalGanancia + Ganancia;
          
     }   
          txtVentas.setText(String.format("%.2f",TotalVentas));
          txtPerdida.setText(String.format("%.2f",TotalPerdida));
          txtPagar.setText(String.format("%.2f",TotalPagar));
          txtGanancia.setText(String.format("%.2f",TotalGanancia));
}

}
