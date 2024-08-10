
package Vista;
import Modelo.Cliente;
import Modelo.ClienteDao;
import Modelo.Cuentas;
import Modelo.Registro;
import Modelo.RegistroDao;
import Modelo.Eventos;
import Modelo.Productos;
import Modelo.ProductosDao;
import Modelo.Venta;
import Modelo.VentaDao;
import Reportes.Grafico;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
public final class VentaVista extends javax.swing.JFrame {
   
    Date fechaVenta = new Date();
    String fechaActual = new SimpleDateFormat("MMM dd yyyy").format(fechaVenta);
    Cliente cl = new Cliente();
    ClienteDao ClDao = new ClienteDao();
    Productos pro = new Productos();
    Cuentas cu = new Cuentas();
    ProductosDao proDao = new ProductosDao();
    Venta v = new Venta();
    VentaDao Vdao = new VentaDao();
    Registro Rv = new Registro();
    RegistroDao Rdao = new RegistroDao();
    Eventos event = new Eventos();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tmp = new DefaultTableModel();
    
  
   
    double item;
    double Totalpagar = 0.00;
    
    
    public VentaVista() {
        initComponents();
        BotonesTrasparencia2();
        Midate.setDate(fechaVenta);
        llenarComboBox();
        cbxBuscarCliente.setEditable(true);
        
     
    }
     public void setRegistroVista(RegistroVista registroVista) {
       
    }

        // Método para formatear el número con dos decimales
public String formatDecimal(double number) {
    DecimalFormat df = new DecimalFormat("#.##");
    return df.format(number);
}
 public void BotonesTrasparencia2(){
      btnCredito1.setOpaque(false);
      btnCredito1.setContentAreaFilled(true);
      btnCredito1.setBorderPainted(false);
 }
  private void llenarComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        cbxBuscarCliente.setModel(model);

        for (String nombre : ClDao.BuscarNombresClientes()) {
            model.addElement(nombre);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtConversorBsa$ = new javax.swing.JTextField();
        txtVuelto = new javax.swing.JTextField();
        txtPago1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdCV = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnCredito1 = new javax.swing.JButton();
        btnGenerarVenta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTotalBs = new javax.swing.JTextField();
        txtTotal$ = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVenta = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPrecioDolar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnAbrirCaja = new javax.swing.JButton();
        txtCodigoVenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcionVenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidadVentaKg = new javax.swing.JTextField();
        txtCantidadVenta$ = new javax.swing.JTextField();
        txtCantidadVentaBs = new javax.swing.JTextField();
        txtPrecioVenta$ = new javax.swing.JTextField();
        txtPrecioVentaBs = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStockDisponible = new javax.swing.JTextField();
        txtIdPro = new javax.swing.JTextField();
        btnEliminarventa = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        Midate = new com.toedter.calendar.JDateChooser();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cbxBuscarCliente = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtConversor$ = new javax.swing.JTextField();
        txtPorcentaje = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtConversorBsa$.setBackground(new java.awt.Color(102, 102, 102));
        txtConversorBsa$.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtConversorBsa$.setForeground(new java.awt.Color(255, 255, 255));
        txtConversorBsa$.setOpaque(false);
        txtConversorBsa$.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConversorBsa$ActionPerformed(evt);
            }
        });
        txtConversorBsa$.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConversorBsa$KeyPressed(evt);
            }
        });
        getContentPane().add(txtConversorBsa$, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 40, 30));

        txtVuelto.setBackground(new java.awt.Color(102, 102, 102));
        txtVuelto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtVuelto.setForeground(new java.awt.Color(255, 255, 255));
        txtVuelto.setOpaque(false);
        txtVuelto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVueltoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVueltoKeyTyped(evt);
            }
        });
        getContentPane().add(txtVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 70, 30));

        txtPago1.setBackground(new java.awt.Color(102, 102, 102));
        txtPago1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtPago1.setForeground(new java.awt.Color(255, 255, 255));
        txtPago1.setOpaque(false);
        txtPago1.setSelectedTextColor(new java.awt.Color(255, 0, 0));
        txtPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPago1ActionPerformed(evt);
            }
        });
        txtPago1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPago1KeyTyped(evt);
            }
        });
        getContentPane().add(txtPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 70, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Pagas con :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Vuelto :");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Conversor  :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));
        getContentPane().add(txtIdCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Contado :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, -1, -1));

        btnCredito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nventa.png"))); // NOI18N
        btnCredito1.setBorder(null);
        btnCredito1.setMaximumSize(new java.awt.Dimension(52, 48));
        btnCredito1.setMinimumSize(new java.awt.Dimension(52, 48));
        btnCredito1.setPreferredSize(new java.awt.Dimension(52, 48));
        btnCredito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCredito1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCredito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, 45));

        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/print.png"))); // NOI18N
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 50, 45));

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money.png"))); // NOI18N
        jLabel10.setText("Total a Pagar Bs:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 550, 130, -1));

        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money.png"))); // NOI18N
        jLabel17.setText("Total a Pagar $:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 510, -1, -1));

        txtTotalBs.setBackground(new java.awt.Color(102, 102, 102));
        txtTotalBs.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtTotalBs.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalBs.setOpaque(false);
        getContentPane().add(txtTotalBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 550, 60, -1));

        txtTotal$.setBackground(new java.awt.Color(102, 102, 102));
        txtTotal$.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtTotal$.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal$.setOpaque(false);
        txtTotal$.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal$ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal$, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 510, 60, -1));

        jScrollPane1.setOpaque(false);

        TableVenta.setBackground(new java.awt.Color(102, 102, 102));
        TableVenta.setForeground(new java.awt.Color(204, 204, 204));
        TableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "DESCRIPCIÓN", "CANTIDAD", "PRECIO UNI$", "PRECIO UNI.Bs", "TOTAL $", "TOTAL BS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableVenta.setOpaque(false);
        jScrollPane1.setViewportView(TableVenta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 1160, 191));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Fecha :");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("PRECIO DOLAR HOY :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        txtPrecioDolar.setBackground(new java.awt.Color(102, 102, 102));
        txtPrecioDolar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPrecioDolar.setForeground(new java.awt.Color(204, 0, 0));
        txtPrecioDolar.setOpaque(false);
        txtPrecioDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioDolarActionPerformed(evt);
            }
        });
        txtPrecioDolar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioDolarKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecioDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 60, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Bs");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("INICIO DE CAJA :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 130, 20));

        txtCaja.setBackground(new java.awt.Color(102, 102, 102));
        txtCaja.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCaja.setForeground(new java.awt.Color(204, 0, 0));
        txtCaja.setOpaque(false);
        txtCaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 60, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("$");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        btnAbrirCaja.setText("Abrir Caja");
        btnAbrirCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCajaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbrirCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 100, 20));

        txtCodigoVenta.setBackground(new java.awt.Color(102, 102, 102));
        txtCodigoVenta.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoVenta.setOpaque(false);
        txtCodigoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVentaActionPerformed(evt);
            }
        });
        txtCodigoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCodigoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 102, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Código");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, -1));

        txtDescripcionVenta.setBackground(new java.awt.Color(102, 102, 102));
        txtDescripcionVenta.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcionVenta.setOpaque(false);
        txtDescripcionVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionVentaKeyTyped(evt);
            }
        });
        getContentPane().add(txtDescripcionVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 191, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Descripción");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        txtCantidadVentaKg.setBackground(new java.awt.Color(102, 102, 102));
        txtCantidadVentaKg.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidadVentaKg.setOpaque(false);
        txtCantidadVentaKg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVentaKgActionPerformed(evt);
            }
        });
        txtCantidadVentaKg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKgKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKgKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidadVentaKg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 40, 30));

        txtCantidadVenta$.setBackground(new java.awt.Color(102, 102, 102));
        txtCantidadVenta$.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidadVenta$.setOpaque(false);
        txtCantidadVenta$.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVenta$ActionPerformed(evt);
            }
        });
        txtCantidadVenta$.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVenta$KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVenta$KeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidadVenta$, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 40, 30));

        txtCantidadVentaBs.setBackground(new java.awt.Color(102, 102, 102));
        txtCantidadVentaBs.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidadVentaBs.setOpaque(false);
        txtCantidadVentaBs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVentaBsActionPerformed(evt);
            }
        });
        txtCantidadVentaBs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVentaBsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVentaBsKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidadVentaBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 40, 30));

        txtPrecioVenta$.setEditable(false);
        txtPrecioVenta$.setBackground(new java.awt.Color(102, 102, 102));
        txtPrecioVenta$.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioVenta$.setOpaque(false);
        txtPrecioVenta$.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVenta$ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioVenta$, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 50, 30));

        txtPrecioVentaBs.setEditable(false);
        txtPrecioVentaBs.setBackground(new java.awt.Color(102, 102, 102));
        txtPrecioVentaBs.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioVentaBs.setOpaque(false);
        txtPrecioVentaBs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaBsActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioVentaBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 50, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Precio Bs");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Precio $");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Cant Bs");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Cant $");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Cant KG");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Stock Disponible");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtStockDisponible.setEditable(false);
        txtStockDisponible.setBackground(new java.awt.Color(102, 102, 102));
        txtStockDisponible.setForeground(new java.awt.Color(255, 255, 255));
        txtStockDisponible.setOpaque(false);
        txtStockDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockDisponibleActionPerformed(evt);
            }
        });
        getContentPane().add(txtStockDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 79, 30));

        txtIdPro.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtIdPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 10, -1));

        btnEliminarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarventa.setOpaque(false);
        btnEliminarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarventaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, -1, 50));

        btnGraficar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/torta.png"))); // NOI18N
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 190, -1, 50));

        Midate.setDateFormatString("MMM dd yyyy");
        Midate.setOpaque(false);
        getContentPane().add(Midate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 160, 30));

        txtNombreCliente.setBackground(new java.awt.Color(102, 102, 102));
        txtNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setOpaque(false);
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 116, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Clientes Registrados :");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 566, -1, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Credito :");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, -1, -1));

        cbxBuscarCliente.setToolTipText("");
        cbxBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBuscarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(cbxBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 590, 100, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("$ a Bs");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("% Credito :");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, -1, -1));

        txtConversor$.setBackground(new java.awt.Color(102, 102, 102));
        txtConversor$.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtConversor$.setForeground(new java.awt.Color(255, 255, 255));
        txtConversor$.setOpaque(false);
        txtConversor$.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConversor$ActionPerformed(evt);
            }
        });
        txtConversor$.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConversor$KeyPressed(evt);
            }
        });
        getContentPane().add(txtConversor$, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 40, 30));

        txtPorcentaje.setBackground(new java.awt.Color(102, 102, 102));
        txtPorcentaje.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        txtPorcentaje.setOpaque(false);
        txtPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorcentajeActionPerformed(evt);
            }
        });
        txtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyPressed(evt);
            }
        });
        getContentPane().add(txtPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 40, 30));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Bs a $");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Nuevo Cliente :");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salchichas.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoVentaActionPerformed

    private void txtCodigoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(!txtCaja.getText().isEmpty()&& !txtPrecioDolar.getText().isEmpty() && !txtCaja.isEditable() && !txtPrecioDolar.isEditable()){
                if (!"".equals(txtCodigoVenta.getText())) {
                    String cod = txtCodigoVenta.getText();
                    pro = proDao.BuscarPro(cod);
                    if (pro.getProducto() != null) {
                        txtIdPro.setText("" + pro.getId());
                        txtDescripcionVenta.setText("" + pro.getProducto());
                        txtPrecioVenta$.setText("" +pro.getPrecioVenta());
                        txtStockDisponible.setText("" + pro.getStock());
                        double precio$ = Double.parseDouble(txtPrecioVenta$.getText());
                        double tipoCambio = Double.parseDouble(txtPrecioDolar.getText());

                        // Calcular el precio del producto en bolívares

                        double precioBs = precio$ * tipoCambio;
                        long precioBsRedondeado = Math.round(precioBs);

                        // Mostrar el precio en bolívares en el campo correspondiente
                        txtPrecioVentaBs.setText(String.valueOf(precioBsRedondeado));
                        txtCantidadVentaKg.requestFocus();
                    } else {
                        LimpiarVenta();
                        txtCodigoVenta.requestFocus();
                         JOptionPane.showMessageDialog(null, "Codigo no Registrado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese el codigo del productos");
                    txtCodigoVenta.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Caja Cerrada");

            }
        }
    }//GEN-LAST:event_txtCodigoVentaKeyPressed

    private void txtCodigoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCodigoVentaKeyTyped

    private void txtDescripcionVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionVentaKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDescripcionVentaKeyTyped

    private void txtCantidadVentaKgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVentaKgActionPerformed
            
    }//GEN-LAST:event_txtCantidadVentaKgActionPerformed

    private void txtCantidadVentaKgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKgKeyPressed
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCantidadVentaKg.getText()) &&!"".equals(txtStockDisponible.getText()) && !"".equals(txtCodigoVenta.getText()) &&!"".equals (txtDescripcionVenta.getText())) {
                    VentaKg();
            }else{
                 JOptionPane.showMessageDialog(null, "Cantidad,Codigo,Producto o Stock no Asignado");
            }  
        }
    }//GEN-LAST:event_txtCantidadVentaKgKeyPressed

    private void txtCantidadVentaKgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKgKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadVentaKgKeyTyped

    private void txtPrecioVenta$ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVenta$ActionPerformed

    }//GEN-LAST:event_txtPrecioVenta$ActionPerformed

    private void txtStockDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockDisponibleActionPerformed

    }//GEN-LAST:event_txtStockDisponibleActionPerformed

    private void btnEliminarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarventaActionPerformed
        // TODO add your handling code here:
       DefaultTableModel modelo = (DefaultTableModel) TableVenta.getModel();

if (TableVenta.getSelectedRow() != -1) {
    modelo.removeRow(TableVenta.getSelectedRow());
    TotalPagar$();
    TotalPagarBs();
    txtCodigoVenta.requestFocus();
   
} else {
    JOptionPane.showMessageDialog(null, "No hay productos seleccionados para eliminar");
}
    }//GEN-LAST:event_btnEliminarventaActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        if (TableVenta.getRowCount() > 0) {
            RegistrarTableVenta(); 
            ActualizarStock();
            ActualizarCantidadVentaCuentas();
            LimpiarTableVenta();
            LimpiarVenta2();
            txtTotal$.setText("");
            txtTotalBs.setText("");
            JOptionPane.showMessageDialog(null, "Venta Exitosa");
        } else{
            JOptionPane.showMessageDialog(null, "Noy productos en la venta");
        }
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        // TODO add your handling code here:

        String fechaReporte = new SimpleDateFormat("dd/MM/yyyy").format(Midate.getDate());
        Grafico.Graficar(fechaReporte);
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void txtCantidadVentaBsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaBsKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCantidadVentaBs.getText()) &&!"".equals(txtStockDisponible.getText()) && !"".equals(txtCodigoVenta.getText()) &&!"".equals (txtDescripcionVenta.getText())) {
                    VentaBs();
            }else{
                 JOptionPane.showMessageDialog(null, "Cantidad,Codigo,Producto o Stock no Asignado");
            }  
        }
    }//GEN-LAST:event_txtCantidadVentaBsKeyPressed

    private void txtPrecioVentaBsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaBsActionPerformed

    }//GEN-LAST:event_txtPrecioVentaBsActionPerformed

    private void txtPrecioDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioDolarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioDolarActionPerformed

    private void txtCantidadVenta$ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVenta$ActionPerformed

    }//GEN-LAST:event_txtCantidadVenta$ActionPerformed

    private void txtCantidadVenta$KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVenta$KeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCantidadVenta$.getText()) &&!"".equals(txtStockDisponible.getText()) && !"".equals(txtCodigoVenta.getText()) &&!"".equals (txtDescripcionVenta.getText())) {
                    Venta$();
            }else{
                 JOptionPane.showMessageDialog(null, "Cantidad,Codigo,Producto o Stock no Asignado");
            }  
        }
    }//GEN-LAST:event_txtCantidadVenta$KeyPressed

    private void btnAbrirCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCajaActionPerformed
        txtCaja.setEditable(false);
        txtPrecioDolar.setEditable(false);
        txtTotal$.setEditable(false);
        txtTotalBs.setEditable(false);
        

    }//GEN-LAST:event_btnAbrirCajaActionPerformed

    private void txtCantidadVentaBsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVentaBsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadVentaBsActionPerformed

    private void txtVueltoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVueltoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVueltoKeyPressed

    private void txtVueltoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVueltoKeyTyped
       char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtVueltoKeyTyped

    private void txtPago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPago1ActionPerformed

        if (!"".equals(txtPago1.getText())){
            if(!"".equals(txtTotal$.getText())){
            double Vuelto = 0.00;
            double Pago = Double.parseDouble(txtPago1.getText());
            double TotalPagar =  TotalPagar$();
            Vuelto = Pago - TotalPagar;
            txtVuelto.setText(String.valueOf(Vuelto));
            }else{
               JOptionPane.showMessageDialog(null,"No hay total a Pagar,por favor Ingrese una Compra");  
            }
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese una Cantidad Valida");
        }

    }//GEN-LAST:event_txtPago1ActionPerformed

    private void txtConversorBsa$ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConversorBsa$ActionPerformed
     if (!"".equals(txtConversorBsa$.getText())){ 
      if (!"".equals(txtCaja.getText())){
      double VueltoBs = Double.parseDouble(txtConversorBsa$.getText());
      double PrecioDolar = Double.parseDouble(txtPrecioDolar.getText());
      double Vuelto$ = VueltoBs / PrecioDolar;
    String vueltoFormateado = formatDecimal(Vuelto$);
      txtConversorBsa$.setText(vueltoFormateado);
      
       }else{
            JOptionPane.showMessageDialog(null, "Caja Cerrada");
        }
     }else{
         JOptionPane.showMessageDialog(null, "Ingrese una Cantidad Valida");
     }
    }//GEN-LAST:event_txtConversorBsa$ActionPerformed

    private void txtConversorBsa$KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConversorBsa$KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConversorBsa$KeyPressed

    private void txtTotal$ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal$ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal$ActionPerformed

    private void txtNombreClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteKeyPressed

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void btnCredito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCredito1ActionPerformed
    if(!txtPorcentaje.getText().isEmpty()){
    if ( cbxBuscarCliente.getSelectedItem() != null && !cbxBuscarCliente.getSelectedItem().toString().isEmpty() || !txtNombreCliente.getText().isEmpty()) { 
    
        String nombreCliente = (cbxBuscarCliente.getSelectedItem() != null && !cbxBuscarCliente.getSelectedItem().toString().isEmpty()) ? cbxBuscarCliente.getSelectedItem().toString() : txtNombreCliente.getText();
        double totalPagos = ClDao.sumarPagosCliente(nombreCliente);
        double subtotalDeudas = ClDao.sumarDeudasCliente(nombreCliente);
        double totalDeuda = subtotalDeudas - totalPagos;
        String DeudaFormateada = String.format("%.2f", totalDeuda);
       
   
        if (TableVenta.getRowCount() > 0) {
        
            double subTotal = TotalPagar$();
            double Porcentaje = Double.parseDouble(txtPorcentaje.getText());
            double Incremento = (TotalPagar$() * Porcentaje)/100;
            double deuda = TotalPagar$() + Incremento;
            String Fecha = fechaActual;
            String TVenta = "Credito";
            JTable tabla = TableVenta;
            cl.setFecha(Fecha);
            cl.setNombre(nombreCliente);
            cl.setDeuda(deuda);
            ClDao.RegistrarCliente(cl);
            ActualizarStock();
            ActualizarCantidadVentaCuentas();
            int pregunta = JOptionPane.showConfirmDialog(null, "¿Deseas imprimir factura?");
            if (pregunta == 0) {
            Vdao.ReciboCreditoClientePDF(nombreCliente,deuda,subTotal,TVenta,tabla);
            LimpiarTableVenta();
            LimpiarClienteventa();
            LimpiarVenta2();
            llenarComboBox();
            JOptionPane.showMessageDialog(null, "Venta Existosa");
            }else{
            LimpiarTableVenta();
            LimpiarClienteventa();
            LimpiarVenta2();
            llenarComboBox();
             JOptionPane.showMessageDialog(null, "Venta Existosa sin Factura");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos en la venta");
        }
    }
 else {
    JOptionPane.showMessageDialog(null, "Debes buscar un cliente");
}
     }else{
         JOptionPane.showMessageDialog(null, "Por favor ingresa el porcentaje");
    }
    }//GEN-LAST:event_btnCredito1ActionPerformed

    private void txtCantidadVenta$KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVenta$KeyTyped
 char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadVenta$KeyTyped

    private void txtCantidadVentaBsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaBsKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadVentaBsKeyTyped

    private void txtPago1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPago1KeyTyped
      char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPago1KeyTyped

    private void txtPrecioDolarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioDolarKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioDolarKeyTyped

    private void txtCajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCajaKeyTyped

    private void txtConversor$ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConversor$ActionPerformed
       if (!"".equals(txtConversor$.getText())){ 
       if (!"".equals(txtCaja.getText())){
      double Vuelto$ = Double.parseDouble(txtConversor$.getText());
      double PrecioDolar = Double.parseDouble(txtPrecioDolar.getText());
      double VueltoBs = Vuelto$ * PrecioDolar;
      double VueltoR = Math.round(VueltoBs);
      txtConversor$.setText(String.valueOf(VueltoR));
      
       }else{
            JOptionPane.showMessageDialog(null, "Caja Cerrada");
        }
       }else{
           JOptionPane.showMessageDialog(null, "Ingrese una Cantidad Valida");
       }
    }//GEN-LAST:event_txtConversor$ActionPerformed

    private void txtConversor$KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConversor$KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConversor$KeyPressed

    private void cbxBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBuscarClienteActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcentajeActionPerformed

    private void txtPorcentajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcentajeKeyPressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Midate;
    private javax.swing.JTable TableVenta;
    private javax.swing.JButton btnAbrirCaja;
    private javax.swing.JButton btnCredito1;
    private javax.swing.JButton btnEliminarventa;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JComboBox<String> cbxBuscarCliente;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtCantidadVenta$;
    private javax.swing.JTextField txtCantidadVentaBs;
    private javax.swing.JTextField txtCantidadVentaKg;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtConversor$;
    private javax.swing.JTextField txtConversorBsa$;
    private javax.swing.JTextField txtDescripcionVenta;
    private javax.swing.JTextField txtIdCV;
    private javax.swing.JTextField txtIdPro;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPago1;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextField txtPrecioDolar;
    private javax.swing.JTextField txtPrecioVenta$;
    private javax.swing.JTextField txtPrecioVentaBs;
    private javax.swing.JTextField txtStockDisponible;
    private javax.swing.JTextField txtTotal$;
    private javax.swing.JTextField txtTotalBs;
    private javax.swing.JTextField txtVuelto;
    // End of variables declaration//GEN-END:variables
public double TotalPagar$() {
         Totalpagar = 0.00;
        int numFila = TableVenta.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(TableVenta.getModel().getValueAt(i, 6)));
            Totalpagar = Totalpagar + cal;
        }
        txtTotal$.setText(String.format("%.2f",Totalpagar));
        return Totalpagar;
    }
public double TotalPagarBs() {
         Totalpagar = 0.00;
        int numFila = TableVenta.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(TableVenta.getModel().getValueAt(i, 7)));
            Totalpagar = Totalpagar + cal;
            txtTotalBs.setText(String.format("%.2f",Totalpagar));
        }
       
        return Totalpagar;
    }


    private void LimpiarVenta() {
        txtCodigoVenta.setText("");
        txtDescripcionVenta.setText("");
        txtCantidadVentaKg.setText("");
        txtCantidadVenta$.setText("");
        txtCantidadVentaBs.setText("");
        txtStockDisponible.setText("");
        txtPrecioVenta$.setText("");
        txtPrecioVentaBs.setText("");
    }
     private void LimpiarVenta2() {
        txtTotal$.setText("");
        txtTotalBs.setText("");
        txtPago1.setText("");
        txtVuelto.setText("");
        txtConversorBsa$.setText("");
     }

    private void RegistrarVenta() {
        int cliente = Integer.parseInt(txtIdCV.getText());
        double monto = Totalpagar;
        v.setCliente(cliente);
        v.setTotal(monto);
        v.setFecha(fechaActual);
        Vdao.RegistrarVenta(v);
    }

    private void LimpiarTableVenta() {
        tmp = (DefaultTableModel) TableVenta.getModel();
        int fila = TableVenta.getRowCount();
        for (int i = 0; i < fila; i++) {
            tmp.removeRow(0);
        }
    }
   

    private void LimpiarClienteventa() {
        txtNombreCliente.setText("");
        txtNombreCliente.setText("");
        txtIdCV.setText("");
        
    }

    private void ActualizarStock() {
        for (int i = 0; i < TableVenta.getRowCount(); i++) {
            int id = Integer.parseInt(TableVenta.getValueAt(i, 0).toString());
            double CantVenta = Double.parseDouble(TableVenta.getValueAt(i,3).toString());
            pro = proDao.BuscarId(id);
            double Stock = pro.getStock();
            Vdao.ActualizarCantVenta(CantVenta, id);
            Vdao.ActualizarStockVenta(Stock,CantVenta, id);

        }
    }
     private void ActualizarCantidadVentaCuentas() {
        for (int i = 0; i < TableVenta.getRowCount(); i++) {
            String codigo = (TableVenta.getValueAt(i, 1).toString());
            double CantVentaKg = Double.parseDouble(TableVenta.getValueAt(i,3).toString());
            cu = proDao.BuscarCodigoCuentas(codigo);
            
            Vdao.ActualizarCantVentaCuentas(CantVentaKg, codigo);
           

        }
    }
    
    
   

      private void VentaBs() {
           int id = Integer.parseInt(txtIdPro.getText());
                String descripcion = txtDescripcionVenta.getText();
                String codigo = txtCodigoVenta.getText();
                double cantBs = Double.parseDouble(txtCantidadVentaBs.getText());
                double precioBs = Double.parseDouble(txtPrecioVentaBs.getText());
                double precio$ = Double.parseDouble(txtPrecioVenta$.getText());
                double cant = cantBs / precioBs;
                double totalBs = cant * precioBs;
                double total$ =0.0;
                double stock = Double.parseDouble(txtStockDisponible.getText());
                if (stock >= cant) {
                    item = item + 1;
                    tmp = (DefaultTableModel) TableVenta.getModel();
                    for (int i = 0; i < TableVenta.getRowCount(); i++) {
                        if (TableVenta.getValueAt(i, 1).equals(txtDescripcionVenta.getText())) {
                            JOptionPane.showMessageDialog(null, "El producto ya esta registrado");
                            return;
                        }
                    }
                    ArrayList lista = new ArrayList();
                    lista.add(item);
                    lista.add(id);
                    lista.add(codigo);
                    lista.add(descripcion);
                    lista.add(cant);
                    lista.add(precio$);
                    lista.add(precioBs);
                    lista.add(total$);
                    lista.add(totalBs);
                    Object[] O = new Object[8];
                    O[0] = lista.get(1);
                    O[1] = lista.get(2);
                    O[2] = lista.get(3);
                    O[3] = lista.get(4);
                    O[4] = lista.get(5);
                    O[5] = lista.get(6);
                    O[6] = lista.get(7);
                    O[7] = lista.get(8);
                    tmp.addRow(O);
                    TableVenta.setModel(tmp);
                    TotalPagarBs();
                    LimpiarVenta();
                    txtCodigoVenta.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Stock no disponible");
                }
      }
       private void Venta$() {
                int id = Integer.parseInt(txtIdPro.getText());
                String descripcion = txtDescripcionVenta.getText();
                String codigo = txtCodigoVenta.getText();
                double cant$ = Double.parseDouble(txtCantidadVenta$.getText());
                double precioBs = Double.parseDouble(txtPrecioVentaBs.getText());
                double precio$ = Double.parseDouble(txtPrecioVenta$.getText());
                double cant = cant$ / precio$;
                double total$ = cant * precio$;
                double totalBs =0.0;
                double stock = Double.parseDouble(txtStockDisponible.getText());
                if (stock >= cant) {
                    item = item + 1;
                    tmp = (DefaultTableModel) TableVenta.getModel();
                    for (int i = 0; i < TableVenta.getRowCount(); i++) {
                        if (TableVenta.getValueAt(i, 1).equals(txtDescripcionVenta.getText())) {
                            JOptionPane.showMessageDialog(null, "El producto ya esta registrado");
                            return;
                        }
                    }
                    ArrayList lista = new ArrayList();
                    lista.add(item);
                    lista.add(id);
                     lista.add(codigo);
                    lista.add(descripcion);
                    lista.add(cant);
                    lista.add(precio$);
                    lista.add(precioBs);
                    lista.add(total$);
                    lista.add(totalBs);
                    Object[] O = new Object[8];
                    O[0] = lista.get(1);
                    O[1] = lista.get(2);
                    O[2] = lista.get(3);
                    O[3] = lista.get(4);
                    O[4] = lista.get(5);
                    O[5] = lista.get(6);
                    O[6] = lista.get(7);
                    O[7] = lista.get(8);
                    tmp.addRow(O);
                    TableVenta.setModel(tmp);
                    TotalPagar$();
                    LimpiarVenta();
                    txtCodigoVenta.requestFocus();
         } else {
                    JOptionPane.showMessageDialog(null, "Stock no disponible");
      }
       }
        
        private void VentaKg() {
        int id = Integer.parseInt(txtIdPro.getText());
        String descripcion = txtDescripcionVenta.getText();
        String codigo = txtCodigoVenta.getText();
        double cant = Double.parseDouble(txtCantidadVentaKg.getText());
        double precio$ = Double.parseDouble(txtPrecioVenta$.getText());
        double precioBs = Double.parseDouble(txtPrecioVentaBs.getText());
        double total$ = 0.00;
        double totalBs = 0.00;

        String[] opciones = {"Venta en dólares ($)", "Venta en bolívares (BS)"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de venta:", "Venta",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        // Verificar la selección del usuario y calcular los totales correspondientes
        if (seleccion == 0) {
            total$ = cant * precio$;
            totalBs = 0;
        } else if (seleccion == 1) {
            totalBs = cant * precioBs;
            total$ = 0;
        }
        
        // Agregar los elementos a la tabla
        double stock = Double.parseDouble(txtStockDisponible.getText());
        if (stock >= cant) {
            item = item + 1;
            tmp = (DefaultTableModel) TableVenta.getModel();
            for (int i = 0; i < TableVenta.getRowCount(); i++) {
                if (TableVenta.getValueAt(i, 1).equals(txtDescripcionVenta.getText())) {
                    JOptionPane.showMessageDialog(null, "El producto ya está registrado");
                    return;
                }
            }
            ArrayList lista = new ArrayList();
            lista.add(item);
            lista.add(id);
             lista.add(codigo);
            lista.add(descripcion);
            lista.add(cant);
            lista.add(precio$);
            lista.add(precioBs);
            lista.add(total$);
            lista.add(totalBs);
            Object[] O = new Object[8];
            O[0] = lista.get(1);
            O[1] = lista.get(2);
            O[2] = lista.get(3);
            O[3] = lista.get(4);
            O[4] = lista.get(5);
            O[5] = lista.get(6);
            O[6] = lista.get(7);
            O[7] = lista.get(8);
            tmp.addRow(O);
            TableVenta.setModel(tmp);
            
            // Calcular el total según la opción seleccionada
            if (seleccion == 0) {
                TotalPagar$();
            } else if (seleccion == 1) {
                TotalPagarBs();
            }
            
            LimpiarVenta();
            txtCodigoVenta.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Stock no disponible");
        }
   
        }
        
    public void RegistrarTableVenta(){
         Date fechaInicioDate = Midate.getDate();
         String fechaRegistro = new SimpleDateFormat("MM/dd/yyyy").format(fechaInicioDate);
         DefaultTableModel modelo = (DefaultTableModel) TableVenta.getModel();
        int numFilas = modelo.getRowCount();

        for (int fila = 0; fila < numFilas; fila++) {
        double cantidad = (double) modelo.getValueAt(fila, 3);
        String descripcion = (String) modelo.getValueAt(fila, 2);
        double totalBs = (double) modelo.getValueAt(fila, 7);
        double totalDollar = (double) modelo.getValueAt(fila, 6);
        
         Rv.setFecha(fechaRegistro);
         Rv.setCantidad(cantidad);
         Rv.setDescripcion(descripcion);
         Rv.setTotal$(totalDollar);
         Rv.setTotalBs(totalBs);
         Rdao.RegistrarVenta(Rv);

        }
    }
   
}

