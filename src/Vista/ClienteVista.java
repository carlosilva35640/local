
package Vista;
import Modelo.Cliente;
import Modelo.ClienteDao;
import Modelo.RegistroDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Productos;
import Modelo.ProductosDao;
import Modelo.login;
import Modelo.LoginDAO;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;



public class ClienteVista extends javax.swing.JFrame {
     Productos pro = new Productos();
     ProductosDao proDao = new ProductosDao();
     Date fechaVenta = new Date();
     String fechaActual = new SimpleDateFormat("dd/MM/yyyy").format(fechaVenta);
     Cliente cl = new Cliente();
     ClienteDao ClDao = new ClienteDao();
     RegistroDao Rdao = new RegistroDao();
     DefaultTableModel modelo = new DefaultTableModel();
     login lg = new login();
     LoginDAO login = new LoginDAO();
     DecimalFormat df = new DecimalFormat("#.##");
     
        
    public ClienteVista() {
        initComponents();
        MidateCliente.setDate(fechaVenta);
         llenarComboBox();
    }
    
     public ClienteVista (login priv){
     initComponents(); 
    }
         double TotalDeuda;
         double TotalPago;
         double Total;
      private void llenarComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        cbxBuscarCliente.setModel(model);

        for (String nombre : ClDao.BuscarNombresClientes()) {
            model.addElement(nombre);
        }
    }


      
   
   public void LimpiarTable() {
    if (modelo.getRowCount() > 0) { // Verificar si la tabla tiene filas
        modelo.setRowCount(0); // Limpiar el modelo de la tabla
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtCreditoCliente = new javax.swing.JTextField();
        btnguardarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtPagosCliente = new javax.swing.JTextField();
        MidateCliente = new com.toedter.calendar.JDateChooser();
        txtFechaCliente = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        btnSeleccionarTodo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBorrarCliente2 = new javax.swing.JButton();
        btnBusCliente = new javax.swing.JButton();
        btnPagoCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        MidateFinal = new com.toedter.calendar.JDateChooser();
        MidateInicio = new com.toedter.calendar.JDateChooser();
        txtPagosCliente2 = new javax.swing.JTextField();
        txtTrabajador = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPagos = new javax.swing.JTextField();
        txtDeudas = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        cbxBuscarCliente = new javax.swing.JComboBox<>();
        btnBusClienteTodo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(820, 300));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        TableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableClienteMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TableCliente);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 530, 180));

        jPanel12.setBackground(java.awt.Color.darkGray);
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel12.setOpaque(false);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Fecha :");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Nombre:");

        txtNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setOpaque(false);
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Pago :");

        txtCreditoCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCreditoCliente.setOpaque(false);
        txtCreditoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditoClienteActionPerformed(evt);
            }
        });
        txtCreditoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreditoClienteKeyTyped(evt);
            }
        });

        btnguardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        btnguardarCliente.setText("Guardar");
        btnguardarCliente.setOpaque(false);
        btnguardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Actualizar (2).png"))); // NOI18N
        btnEditarCliente.setText("Editar");
        btnEditarCliente.setOpaque(false);
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btnNuevoCliente.setText("Borrar");
        btnNuevoCliente.setOpaque(false);
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.setOpaque(false);
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        txtIdCliente.setBackground(java.awt.Color.darkGray);
        txtIdCliente.setOpaque(false);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Credito :");

        txtPagosCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtPagosCliente.setOpaque(false);
        txtPagosCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagosClienteKeyTyped(evt);
            }
        });

        MidateCliente.setDateFormatString("MMM dd yyyy");
        MidateCliente.setOpaque(false);

        txtFechaCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaCliente.setOpaque(false);
        txtFechaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaClienteActionPerformed(evt);
            }
        });
        txtFechaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaClienteKeyTyped(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Fecha :");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(txtCreditoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPagosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(MidateCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(MidateCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPagosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCreditoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)))
                .addComponent(btnguardarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 660));

        btnSeleccionarTodo.setText("Seleccionar Todo");
        btnSeleccionarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarTodoActionPerformed(evt);
            }
        });
        jPanel6.add(btnSeleccionarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Credito :");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 100, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Pagos : ");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 70, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Total Deuda : ");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 120, 40));

        btnBorrarCliente2.setText("Borrar");
        btnBorrarCliente2.setOpaque(false);
        btnBorrarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCliente2ActionPerformed(evt);
            }
        });
        jPanel6.add(btnBorrarCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 93, 33));

        btnBusCliente.setText("Buscar");
        btnBusCliente.setOpaque(false);
        btnBusCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusClienteActionPerformed(evt);
            }
        });
        jPanel6.add(btnBusCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 90, 33));

        btnPagoCliente.setText("Pagar");
        btnPagoCliente.setOpaque(false);
        btnPagoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoClienteActionPerformed(evt);
            }
        });
        jPanel6.add(btnPagoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 90, 30));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 80, 30));

        MidateFinal.setDateFormatString("MMM dd yyyy");
        MidateFinal.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        MidateFinal.setOpaque(false);
        jPanel6.add(MidateFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 90, 20));

        MidateInicio.setDateFormatString(" MMM dd yyyy");
        MidateInicio.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        MidateInicio.setOpaque(false);
        jPanel6.add(MidateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 90, 20));

        txtPagosCliente2.setForeground(new java.awt.Color(255, 255, 255));
        txtPagosCliente2.setOpaque(false);
        txtPagosCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagosCliente2ActionPerformed(evt);
            }
        });
        txtPagosCliente2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagosCliente2KeyTyped(evt);
            }
        });
        jPanel6.add(txtPagosCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 95, -1));

        txtTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        txtTrabajador.setOpaque(false);
        txtTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrabajadorActionPerformed(evt);
            }
        });
        txtTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrabajadorKeyTyped(evt);
            }
        });
        jPanel6.add(txtTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 95, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Trabajador");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Buscar todos los clientes por fechas :");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 200, 20));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Buscar o Pagar deuda de un Cliente : ");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 410, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Monto a pagar ");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Buscar Cliente ");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        txtPagos.setForeground(new java.awt.Color(255, 255, 255));
        txtPagos.setOpaque(false);
        jPanel6.add(txtPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 120, 30));

        txtDeudas.setForeground(new java.awt.Color(255, 255, 255));
        txtDeudas.setOpaque(false);
        txtDeudas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeudasActionPerformed(evt);
            }
        });
        jPanel6.add(txtDeudas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 120, 30));

        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTotal.setOpaque(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalKeyTyped(evt);
            }
        });
        jPanel6.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 120, 30));

        cbxBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBuscarClienteActionPerformed(evt);
            }
        });
        jPanel6.add(cbxBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 110, -1));

        btnBusClienteTodo.setText("Buscar Todo");
        btnBusClienteTodo.setOpaque(false);
        btnBusClienteTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusClienteTodoActionPerformed(evt);
            }
        });
        jPanel6.add(btnBusClienteTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 140, 33));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/JAMONES.jpg"))); // NOI18N
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 820, 680));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPagosCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagosCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagosCliente2ActionPerformed

    private void btnPagoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoClienteActionPerformed
        Date fechaActualDate = MidateCliente.getDate();
        String fecha = new SimpleDateFormat("MM/dd/yyyy").format(fechaActualDate);
        String nombreCliente = cbxBuscarCliente.getSelectedItem().toString();

if (!"".equals(nombreCliente)) {
    // Verificar si txtPagosCliente2 está vacío
    if (!txtPagosCliente2.getText().isEmpty()) {
        double Pago = Double.parseDouble(txtPagosCliente2.getText());

        cl.setFecha(fecha);
        cl.setNombre(nombreCliente);
        cl.setPagos(Pago);
        ClDao.RegistrarCliente(cl);
        Rdao.RegistroPagoClietne(cl);
        LimpiarTable();
        LimpiarCliente();
        llenarCliente(nombreCliente);
        TotalDeudaYPago();
        FacturaPago();
        txtPagosCliente2.setText("");

        JOptionPane.showMessageDialog(null, "Pago Exitoso");
    } else {
        JOptionPane.showMessageDialog(null, "El campo de pagos está vacío. Por favor, ingresa un valor.");
    }
} else {
    JOptionPane.showMessageDialog(null, "Debes buscar un cliente");
}


            
    }//GEN-LAST:event_btnPagoClienteActionPerformed

    private void btnBusClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusClienteActionPerformed
    String nombreCliente =  cbxBuscarCliente.getSelectedItem().toString();
    if (!"".equals(nombreCliente)) {
        List<Cliente> clientesEncontrados = ClDao.BuscarClientePorNombre(nombreCliente);
    if (clientesEncontrados.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontró el usuario");
    } else {
        // Procesa los clientes encontrados como desees
        llenarCliente(nombreCliente);
        double totalPagos = ClDao.sumarPagosCliente(nombreCliente);
        double subtotalDeudas = ClDao.sumarDeudasCliente(nombreCliente);
        double totalDeuda = subtotalDeudas - totalPagos;
        

       
          txtDeudas.setText(String.format("%.2f",subtotalDeudas));
          txtPagos.setText(String.format("%.2f",totalPagos));
          txtTotal.setText(String.format("%.2f",totalDeuda));

        // Asigna los valores a los campos de texto
    }
} else {
    JOptionPane.showMessageDialog(null, "Ingrese un nombre de cliente válido");
}
elim();

    }//GEN-LAST:event_btnBusClienteActionPerformed

    private void btnBorrarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCliente2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableCliente.getModel();
        model.setRowCount(0);
        txtPagos.setText("");
        txtTotal.setText("");
        txtDeudas.setText("");
    }//GEN-LAST:event_btnBorrarCliente2ActionPerformed

    private void TableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableClienteMouseClicked
        // TODO add your handling code here:
        btnEditarCliente.setEnabled(true);
        btnEliminarCliente.setEnabled(true);
        btnguardarCliente.setEnabled(false);
        int fila = TableCliente.rowAtPoint(evt.getPoint());
        txtIdCliente.setText(TableCliente.getValueAt(fila, 0).toString());
        txtFechaCliente.setText(TableCliente.getValueAt(fila, 1).toString());
        String valor = TableCliente.getValueAt(fila, 2).toString();
        cbxBuscarCliente.setSelectedItem(valor);
        txtPagosCliente.setText(TableCliente.getValueAt(fila, 3).toString());
        txtCreditoCliente.setText(TableCliente.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_TableClienteMouseClicked

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        String nombreCliente = cbxBuscarCliente.getSelectedItem().toString();
      if (TableCliente.getSelectedRowCount() > 0) {
    int pregunta = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar?,Guardaste el archivo pdf?");
    if (pregunta == 0) {
        // Eliminar las filas seleccionadas de la tabla
        int[] filasSeleccionadas = TableCliente.getSelectedRows();
        for (int fila : filasSeleccionadas) {
            int idFila = Integer.parseInt(TableCliente.getValueAt(fila, 0).toString());
            ClDao.EliminarCliente(idFila);
        }
        // Actualizar la tabla después de eliminar las filas seleccionadas
        LimpiarTable();
        LimpiarCliente();
        llenarComboBox();
        TotalDeudaYPago();
       
    }
} else {
    JOptionPane.showMessageDialog(null, "Seleccione una fila");
}
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        // TODO add your handling code here:
        LimpiarCliente();
         btnEditarCliente.setEnabled(true);
        btnEliminarCliente.setEnabled(true);
        btnguardarCliente.setEnabled(true);
       
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
     String nombreProveedor = cbxBuscarCliente.getSelectedItem().toString();
     String pagosText = txtPagosCliente.getText();
     String deudaText = txtCreditoCliente.getText();


if ("".equals(txtIdCliente.getText())) {
    JOptionPane.showMessageDialog(null, "Seleccione una fila");
} else {
    if (!"".equals(txtFechaCliente.getText()) && !"".equals(nombreProveedor) && !pagosText.isEmpty() && !deudaText.isEmpty()) {
        try {
            double pagos = Double.parseDouble(pagosText);
            double deuda = Double.parseDouble(deudaText);
          
            
            cl.setFecha(txtFechaCliente.getText());
            cl.setNombre(nombreProveedor);
            cl.setPagos(pagos);
            cl.setDeuda(deuda);
            cl.setId(Integer.parseInt(txtIdCliente.getText()));
            ClDao.ModificarCliente(cl);
            JOptionPane.showMessageDialog(null, "Proveedor Modificado");
            LimpiarTable();
            LimpiarCliente();
            llenarCliente(nombreProveedor);
            btnEditarCliente.setEnabled(true);
            btnEliminarCliente.setEnabled(true);
            btnguardarCliente.setEnabled(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos para pagos, deuda y factura");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos");
    }
}

    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnguardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarClienteActionPerformed
       Date fechaActualDate = MidateCliente.getDate();
       String fecha = new SimpleDateFormat("MMM dd yyyy").format(fechaActualDate);
       // Verifica si hay un elemento seleccionado en el JComboBox o si el JTextField no está vacío
       if ( cbxBuscarCliente.getSelectedItem() != null && !cbxBuscarCliente.getSelectedItem().toString().isEmpty() || !txtNombreCliente.getText().isEmpty()) {
       // Si hay un elemento seleccionado en el JComboBox, lo usamos como nombreProveedor
       // Si no, usamos el texto del JTextField
       String nombreProveedor = (cbxBuscarCliente.getSelectedItem() != null && !cbxBuscarCliente.getSelectedItem().toString().isEmpty()) ? cbxBuscarCliente.getSelectedItem().toString() : txtNombreCliente.getText();


       String deudaText = txtCreditoCliente.getText();
 

       // Verifica si deuda, factura y fecha no están vacíos
       if (!deudaText.isEmpty() && fechaActualDate != null) {
        try {
            double deuda = Double.parseDouble(deudaText);
           
            
          
            
            cl.setFecha(fecha);
            cl.setNombre(nombreProveedor);
            cl.setDeuda(deuda);
           
            
            // Realiza el registro del proveedor
            ClDao.RegistrarCliente(cl);
            
            // Limpia los campos y actualiza la interfaz
            llenarComboBox();
            
            JOptionPane.showMessageDialog(null, "Proveedor Registrado");
            LimpiarTable();
            LimpiarCliente();
            txtPagos.setEditable(false);
            txtDeudas.setEditable(false);
            txtTotal.setEditable(false);
            llenarCliente(nombreProveedor);
            TotalDeudaYPago();
            btnEditarCliente.setEnabled(false);
            btnEliminarCliente.setEnabled(false);
            btnguardarCliente.setEnabled(true);
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
    }//GEN-LAST:event_btnguardarClienteActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed

    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtCreditoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditoClienteActionPerformed

    private void txtPagosCliente2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagosCliente2KeyTyped
      char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPagosCliente2KeyTyped

    private void txtPagosClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagosClienteKeyTyped
       char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPagosClienteKeyTyped

    private void txtCreditoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditoClienteKeyTyped
      char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCreditoClienteKeyTyped

    private void cbxBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBuscarClienteActionPerformed
     
    }//GEN-LAST:event_cbxBuscarClienteActionPerformed

    private void txtDeudasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeudasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeudasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // Obtener la fecha de inicio ingresada por el usuario desde el campo MidateInicio
Date fechaInicioDate = MidateInicio.getDate();
// Obtener la fecha final ingresada por el usuario desde el campo MidateFinal
Date fechaFinalDate = MidateFinal.getDate();

// Verificar si las fechas de inicio y fin no están vacías
  if (fechaInicioDate != null && fechaFinalDate != null) {
          String fechaInicio = new SimpleDateFormat("MMM dd yyyy").format(fechaInicioDate);
          String fechaFinal = new SimpleDateFormat("MMM dd yyyy").format(fechaFinalDate);
    try {
        // Llamar al método para buscar proveedores por fecha
        List<Cliente> ClientesEncontrados2 = ClDao.buscarClientePorFecha(fechaInicio, fechaFinal);
        
        // Mostrar mensaje si no se encontraron proveedores en las fechas especificadas
        if ( ClientesEncontrados2.isEmpty()) {
           
            JOptionPane.showMessageDialog(null, "No se encontraron proveedores en las fechas especificadas");
        } else {
            // Procesar los proveedores encontrados por fecha
           
            llenarClienteFecha(fechaInicio, fechaFinal);
           TotalDeudaYPago();
        }
    } catch (SQLException ex) {
        Logger.getLogger(ProveedorVista.class.getName()).log(Level.SEVERE, null, ex);
    }
} else {
    // Mostrar mensaje si se ingresaron fechas inválidas
   
    JOptionPane.showMessageDialog(null, "Ingrese fechas válidas");
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFechaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaClienteActionPerformed

    private void txtFechaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaClienteKeyTyped

    private void txtTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrabajadorActionPerformed

    private void txtTrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrabajadorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrabajadorKeyTyped

    private void btnSeleccionarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarTodoActionPerformed
     int numFilas = TableCliente.getRowCount();

if (numFilas > 0) {
    // Seleccionar todas las filas
    TableCliente.setRowSelectionInterval(0, numFilas - 1);
} else {
    JOptionPane.showMessageDialog(null, "La tabla está vacía", "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_btnSeleccionarTodoActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
       
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyTyped
         char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTotalKeyTyped

    private void btnBusClienteTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusClienteTodoActionPerformed
       llenarClienteTodo();
       TotalDeudaYPago();
       
        

       
    }//GEN-LAST:event_btnBusClienteTodoActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser MidateCliente;
    private com.toedter.calendar.JDateChooser MidateFinal;
    private com.toedter.calendar.JDateChooser MidateInicio;
    private javax.swing.JTable TableCliente;
    private javax.swing.JButton btnBorrarCliente2;
    private javax.swing.JButton btnBusCliente;
    private javax.swing.JButton btnBusClienteTodo;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnPagoCliente;
    private javax.swing.JButton btnSeleccionarTodo;
    private javax.swing.JButton btnguardarCliente;
    private javax.swing.JComboBox<String> cbxBuscarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtCreditoCliente;
    private javax.swing.JTextField txtDeudas;
    private javax.swing.JTextField txtFechaCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPagos;
    private javax.swing.JTextField txtPagosCliente;
    private javax.swing.JTextField txtPagosCliente2;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTrabajador;
    // End of variables declaration//GEN-END:variables
private void LimpiarCliente() {
        txtNombreCliente.setText("");
        txtCreditoCliente.setText("");
      
        txtIdCliente.setText("");
        
       
    }
    private void elim(){
         
    }
   public void TotalDeudaYPago() {
         TotalDeuda = 0.00;
         TotalPago = 0.00;
         Total = 0.00;
        int numFila = TableCliente.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double Deuda = Double.parseDouble(String.valueOf(TableCliente.getModel().getValueAt(i, 4)));
            double Pago = Double.parseDouble(String.valueOf(TableCliente.getModel().getValueAt(i, 3)));
            TotalDeuda = TotalDeuda + Deuda;
            TotalPago = TotalPago + Pago;
            Total =   TotalDeuda - TotalPago ;      
          
     }
          txtDeudas.setText(String.format("%.2f",TotalDeuda));
          txtPagos.setText(String.format("%.2f",TotalPago));
          txtTotal.setText(String.format("%.2f",Total));
}
    
private void llenarClienteFecha(String fechaInicio, String fechaFinal) throws SQLException {
    // Obtener la lista de proveedores que coinciden con el nombre proporcionado
    List<Cliente> listaCliente = ClDao.buscarClientePorFecha(fechaInicio,fechaFinal);

    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) TableCliente.getModel();

    // Limpiar el modelo de la tabla antes de agregar nuevos datos
    modelo.setRowCount(0);

    // Iterar sobre la lista de proveedores y agregar cada uno como una fila en la tabla
    for (Cliente cliente : listaCliente) {
        Object[] fila = {cliente.getId(),cliente.getFecha(), cliente.getNombre(), cliente.getPagos(), cliente.getDeuda()};
        modelo.addRow(fila);
    }
    
    // Establecer el modelo actualizado en la tabla
    TableCliente.setModel(modelo);
   }
         
private void llenarCliente(String nombreCliente) {
    // Obtener la lista de proveedores que coinciden con el nombre proporcionado
    List<Cliente> listaCliente = (List<Cliente>) ClDao.BuscarClientePorNombre(nombreCliente);

    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) TableCliente.getModel();

    // Limpiar el modelo de la tabla antes de agregar nuevos datos
    modelo.setRowCount(0);

    // Iterar sobre la lista de proveedores y agregar cada uno como una fila en la tabla
    for (Cliente cliente : listaCliente) {
        Object[] fila = {cliente.getId(), cliente.getFecha(),cliente.getNombre(), cliente.getPagos(), cliente.getDeuda()};
        modelo.addRow(fila);
    }
    
    // Establecer el modelo actualizado en la tabla
    TableCliente.setModel(modelo);
   }
private void llenarClienteTodo() {
    // Obtener la lista de proveedores que coinciden con el nombre proporcionado
    List<Cliente> listaCliente = (List<Cliente>) ClDao.ListarClientes();

    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) TableCliente.getModel();

    // Limpiar el modelo de la tabla antes de agregar nuevos datos
    modelo.setRowCount(0);

    // Iterar sobre la lista de proveedores y agregar cada uno como una fila en la tabla
    for (Cliente cliente : listaCliente) {
        Object[] fila = {cliente.getId(), cliente.getFecha(),cliente.getNombre(), cliente.getPagos(), cliente.getDeuda()};
        modelo.addRow(fila);
    }
    
    // Establecer el modelo actualizado en la tabla
    TableCliente.setModel(modelo);
   }
 private void FacturaPago(){

   // Implementa este método para obtener el ID de la compra
    String cliente = cbxBuscarCliente.getSelectedItem().toString();
    String usuario = txtTrabajador.getText();
    String pago = (txtPagosCliente2.getText());
    String deuda = (txtTotal.getText());
 
    // Llama a la función para generar el documento PDF
    ClDao.ReciboPagoClientePDF(cliente,pago,usuario,deuda);
  }

}


