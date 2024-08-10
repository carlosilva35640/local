
package Vista;


import Modelo.RegistroDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Modelo.Registro;
import com.itextpdf.text.BadElementException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public final class RegistroVista extends javax.swing.JFrame {

    RegistroDao Rdao = new RegistroDao();
    Registro Rg = new Registro();
    Date fechaVenta = new Date();
    String fechaActual = new SimpleDateFormat("MM/dd/yyyy").format(fechaVenta);
    DefaultTableModel tmr = new DefaultTableModel();
    
    public RegistroVista() {
        initComponents();
        MidateRegistro.setDate(fechaVenta);
        llenarRegistro(fechaActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableRegistro = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtGasto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRazon = new javax.swing.JTextField();
        btnGastos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnTotalDia = new javax.swing.JButton();
        txtVentaDia = new javax.swing.JTextField();
        txtTotalClientes = new javax.swing.JTextField();
        txtTotalProvee = new javax.swing.JTextField();
        txtGastos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioDolar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPunto = new javax.swing.JTextField();
        btnPunto = new javax.swing.JButton();
        txtCaja = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtInversion = new javax.swing.JTextField();
        btnInversion = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtInversion1 = new javax.swing.JTextField();
        MidateRegistro = new com.toedter.calendar.JDateChooser();
        btnTotalSemana = new javax.swing.JButton();
        MidateInicio = new com.toedter.calendar.JDateChooser();
        MidateFinal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gastos :");

        jScrollPane1.setOpaque(false);

        TableRegistro.setBackground(new java.awt.Color(102, 102, 102));
        TableRegistro.setForeground(new java.awt.Color(204, 204, 204));
        TableRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FECHA", "DESCRIPCIÓN", "CANTIDAD", "TOTAL BS", "TOTAL PUNTO", "TOTAL $", "GASTOS", "PAGOPROVEE", "PAGOCLIENTE", "INVERSIONES"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableRegistro.setOpaque(false);
        jScrollPane1.setViewportView(TableRegistro);

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Tabla de ventas Diarias");

        jLabel2.setText("Razon :");

        btnGastos.setText("Guardar");
        btnGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastosActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf.png"))); // NOI18N
        jButton2.setText("Guardar pdf");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnTotalDia.setText("Total Dia");
        btnTotalDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalDiaActionPerformed(evt);
            }
        });

        txtVentaDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVentaDiaActionPerformed(evt);
            }
        });

        jLabel3.setText("Venta Dia:");

        jLabel4.setText("Pago Cliente :");

        jLabel5.setText("Pago Provee:");

        jLabel6.setText("Cierre de Caja :");

        txtPrecioDolar.setBackground(new java.awt.Color(102, 102, 102));
        txtPrecioDolar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel8.setText("Precio Dolar :");

        jLabel9.setText("Venta Punto :");

        txtPunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPuntoKeyReleased(evt);
            }
        });

        btnPunto.setText("Guardar");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        jLabel10.setText("Gastos:");

        jLabel11.setText("Inversion :");

        btnInversion.setText("Guardar");
        btnInversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInversionActionPerformed(evt);
            }
        });

        jLabel12.setText("Inversion :");

        MidateRegistro.setDateFormatString("MMM dd yyyy");
        MidateRegistro.setOpaque(false);

        btnTotalSemana.setText("Total por Fechas");
        btnTotalSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalSemanaActionPerformed(evt);
            }
        });

        MidateInicio.setDateFormatString(" MMM dd yyyy");
        MidateInicio.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        MidateInicio.setOpaque(false);

        MidateFinal.setDateFormatString(" MMM dd yyyy");
        MidateFinal.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        MidateFinal.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtVentaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(182, 182, 182)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addComponent(txtTotalProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTotalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnGastos))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addComponent(btnPunto)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnInversion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtInversion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(79, 79, 79))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(67, 67, 67)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtInversion1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(MidateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(MidateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTotalDia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTotalSemana)
                                    .addComponent(jButton2))))))
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtPrecioDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(MidateRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MidateRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecioDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVentaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtInversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPunto)
                                .addComponent(btnInversion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGastos)
                        .addGap(278, 278, 278))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInversion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTotalDia)
                            .addComponent(txtGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MidateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MidateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnTotalSemana)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastosActionPerformed
               Date fechaActualDate = MidateRegistro.getDate();
             
                 
                 if(!"".equals(txtRazon.getText()) && !"".equals(txtGasto.getText())){
                     String fecha = new SimpleDateFormat("MM/dd/yyyy").format(fechaActualDate);
                     String razonGasto = txtRazon.getText();
                     double gasto = Double.parseDouble(txtGasto.getText());
        
                 Rg.setFecha(fecha);
                 Rg.setDescripcion(razonGasto);
                 Rg.setGasto(gasto);
                 Rdao.RegistrarGasto(Rg);
                 txtGasto.setText("");
                 txtRazon.setText("");
                 JOptionPane.showMessageDialog(null,"Gastos guardados correctamente");
                 }else{
                     JOptionPane.showMessageDialog(null,"los campos estan vacios");
                 }
            
    }//GEN-LAST:event_btnGastosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Date fechaInicioDate = MidateInicio.getDate();
       Date fechaFinalDate = MidateFinal.getDate();
       String fechaInicio = new SimpleDateFormat("MM/dd/yyyy").format(fechaInicioDate);
       String fechaFinal = new SimpleDateFormat("MM/dd/yyyy").format(fechaFinalDate);
       String Fecha ="Semana desde el " + fechaInicio +" Hasta el " + fechaFinal;
       String Nombre =  new SimpleDateFormat("MMMM").format(fechaInicioDate);
       String Venta = txtVentaDia.getText();
       String PagoCliente = txtTotalClientes.getText();
       String PagoProveedor = txtTotalProvee.getText();
       String Gastos = txtGastos.getText();
       String Inversion = txtInversion1.getText();
       JTable tablaRegistro = TableRegistro;
        try {
            Rdao.RegistroPorFechaPDF(tablaRegistro,Nombre,Fecha,Venta,PagoCliente,PagoProveedor,Gastos,Inversion);
        } catch (BadElementException | IOException ex) {
            Logger.getLogger(RegistroVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnTotalDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalDiaActionPerformed
         if(!"".equals(txtPrecioDolar.getText())){
             
        llenarRegistro(fechaActual);
         RegistroTotal();
         }else{
              JOptionPane.showMessageDialog(null,"Ingrese el precio del Dolar");
         }
    }//GEN-LAST:event_btnTotalDiaActionPerformed

    private void txtPrecioDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioDolarActionPerformed
        txtPrecioDolar.setEditable(false);
    }//GEN-LAST:event_txtPrecioDolarActionPerformed

    private void txtPrecioDolarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioDolarKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioDolarKeyTyped

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        
         if(!"".equals(txtPunto.getText()) && !"".equals(txtPrecioDolar.getText())){
              String Fecha = fechaActual;
              double VentaPunto =  Double.parseDouble(txtPunto.getText());
              
               
        
                 Rg.setFecha(Fecha);
                 Rg.setDescripcion("total Punto");
                 Rg.setTotalPunto(VentaPunto);
                 Rdao.RegistrarVenta(Rg);
                 txtPunto.setText("");
                
                 JOptionPane.showMessageDialog(null,"guardados correctamente");
                 }else{
                     JOptionPane.showMessageDialog(null,"los campos estan vacios");
                 }
        
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void txtPuntoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuntoKeyReleased
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPuntoKeyReleased

    private void txtVentaDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVentaDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVentaDiaActionPerformed

    private void btnInversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInversionActionPerformed
                  Date fechaActualDate = MidateRegistro.getDate();
             
                 
                 if(!"".equals(txtInversion.getText())){
                     String fecha = new SimpleDateFormat("MM/dd/yyyy").format(fechaActualDate);
                    
                     double Inversion = Double.parseDouble(txtInversion.getText());
                     String Razon = "Inversion";
        
                 Rg.setFecha(fecha);
                 Rg.setInversion(Inversion);
                 Rg.setDescripcion(Razon);
                 Rdao.RegistrarVenta(Rg);
                 txtInversion.setText("");
                
                 JOptionPane.showMessageDialog(null,"Inversion guardados correctamente");
                 }else{
                     JOptionPane.showMessageDialog(null,"los campos estan vacios");
                 }     
    }//GEN-LAST:event_btnInversionActionPerformed

    private void btnTotalSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalSemanaActionPerformed
      Date fechaInicioDate = MidateInicio.getDate();
      Date fechaFinalDate = MidateFinal.getDate();

    // Verificar si las fechas son diferentes de null antes de formatearlas
    if (fechaInicioDate != null && fechaFinalDate != null && !"".equals(txtPrecioDolar.getText())) {
    String fechaInicio = new SimpleDateFormat("MM/dd/yyyy").format(fechaInicioDate);
    String fechaFinal = new SimpleDateFormat("MM/dd/yyyy").format(fechaFinalDate);
    
    llenarRegistroFecha(fechaInicio, fechaFinal);
    RegistroTotal();
} else {
    JOptionPane.showMessageDialog(null, "Fechas o Dolar de hoy sin especificar");
}
    }//GEN-LAST:event_btnTotalSemanaActionPerformed

    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser MidateFinal;
    private com.toedter.calendar.JDateChooser MidateInicio;
    private com.toedter.calendar.JDateChooser MidateRegistro;
    public javax.swing.JTable TableRegistro;
    private javax.swing.JButton btnGastos;
    private javax.swing.JButton btnInversion;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnTotalDia;
    private javax.swing.JButton btnTotalSemana;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtGasto;
    private javax.swing.JTextField txtGastos;
    private javax.swing.JTextField txtInversion;
    private javax.swing.JTextField txtInversion1;
    private javax.swing.JTextField txtPrecioDolar;
    private javax.swing.JTextField txtPunto;
    private javax.swing.JTextField txtRazon;
    private javax.swing.JTextField txtTotalClientes;
    private javax.swing.JTextField txtTotalProvee;
    private javax.swing.JTextField txtVentaDia;
    // End of variables declaration//GEN-END:variables
 public void llenarRegistro(String fecha) {
       // Obtener la lista de proveedores que coinciden con el nombre proporcionado
       Date fechaInicioDate = MidateRegistro.getDate();
       String fechaRegistro = new SimpleDateFormat("MM/dd/yyyy").format(fechaInicioDate);
       List<Registro> listaRegistro = (List<Registro>) Rdao.ListarRegistroPorFecha(fechaRegistro);

      // Obtener el modelo de la tabla
      DefaultTableModel modelo = (DefaultTableModel) TableRegistro.getModel();

     // Limpiar el modelo de la tabla antes de agregar nuevos datos
     modelo.setRowCount(0);

     // Iterar sobre la lista de proveedores y agregar cada uno como una fila en la tabla
     for (Registro registro : listaRegistro) {
        Object[] fila = {registro.getId(), registro.getFecha(), registro.getDescripcion(),registro.getCantidad(), registro.getTotalBs(), registro.getTotalPunto(), registro.getTotal$(), registro.getGasto(), registro.getPagoProvee(), registro.getPagoCliente(), registro.getInversion()};
        modelo.addRow(fila);
     }
    
      // Establecer el modelo actualizado en la tabla
      TableRegistro.setModel(modelo);
    }
  public void llenarRegistroFecha(String FechaInicio,String FechaFinal) {
       // Obtener la lista de proveedores que coinciden con el nombre proporcionado
       
       List<Registro> listaRegistro = (List<Registro>) Rdao.ListarRegistroPorSemana(FechaInicio,FechaFinal);

      // Obtener el modelo de la tabla
      DefaultTableModel modelo = (DefaultTableModel) TableRegistro.getModel();

     // Limpiar el modelo de la tabla antes de agregar nuevos datos
     modelo.setRowCount(0);

     // Iterar sobre la lista de proveedores y agregar cada uno como una fila en la tabla
     for (Registro registro : listaRegistro) {
        Object[] fila = {registro.getId(), registro.getFecha(), registro.getDescripcion(),registro.getCantidad(), registro.getTotalBs(), registro.getTotalPunto(), registro.getTotal$(), registro.getGasto(), registro.getPagoProvee(), registro.getPagoCliente(), registro.getInversion()};
        modelo.addRow(fila);
     }
    
      // Establecer el modelo actualizado en la tabla
      TableRegistro.setModel(modelo);
    }
 
    public void LimpiarTableRegistro() {
        tmr = (DefaultTableModel) TableRegistro.getModel();
        int fila = TableRegistro.getRowCount();
        for (int i = 0; i < fila; i++) {
            tmr.removeRow(0);
         TableRegistro.repaint();
        }
    }
    public void RegistroTotal() {
         double TotalPagoClientes = 0.00;
         double TotalPagoProvee = 0.00;
         double TotalGastos = 0.00;
         double TotalVenta$ = 0.00; 
         double SubTotalVentaBs = 0.00;
         double TotalVentaBs = 0.00;
          double SubTotalPunto = 0.00;
         double TotalVentaPunto = 0.00;
         double VentaDia = 0.00;
         double CajaDia = 0.00;
         double Inversion = 0.00;
         double    DolarHoy = Double.parseDouble(txtPrecioDolar.getText());
        
         
        int numFila = TableRegistro.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double subInversion= Double.parseDouble(String.valueOf(TableRegistro.getModel().getValueAt(i, 10)));
            double Cliente= Double.parseDouble(String.valueOf(TableRegistro.getModel().getValueAt(i, 9)));
            double Proveedor = Double.parseDouble(String.valueOf(TableRegistro.getModel().getValueAt(i, 8)));
            double Gastos = Double.parseDouble(String.valueOf(TableRegistro.getModel().getValueAt(i, 7)));
            double Venta$ = Double.parseDouble(String.valueOf(TableRegistro.getModel().getValueAt(i, 6)));
            double Punto = Double.parseDouble(String.valueOf(TableRegistro.getModel().getValueAt(i, 5)));
            double VentaBs = Double.parseDouble(String.valueOf(TableRegistro.getModel().getValueAt(i, 4)));
           
            Inversion = Inversion + subInversion;
            TotalPagoClientes = TotalPagoClientes + Cliente;
            TotalPagoProvee = TotalPagoProvee + Proveedor;
            TotalGastos = TotalGastos + Gastos;
            TotalVenta$ = TotalVenta$ + Venta$ ;
            SubTotalPunto =  SubTotalPunto  + Punto;
            TotalVentaPunto = SubTotalPunto / DolarHoy;
            SubTotalVentaBs =(SubTotalVentaBs + VentaBs) - SubTotalPunto;
            TotalVentaBs = SubTotalVentaBs /  DolarHoy  ; 
            VentaDia = TotalVentaPunto   + TotalVenta$ + TotalVentaBs + TotalPagoClientes ;
            CajaDia = VentaDia + Inversion -  TotalPagoProvee - TotalGastos;
            
            
            
           
            
           
            
     }
           
          txtInversion1.setText(String.format("%.2f",Inversion));
          txtTotalClientes.setText(String.format("%.2f",TotalPagoClientes));
          txtTotalProvee.setText(String.format("%.2f",TotalPagoProvee));
          txtGastos.setText(String.format("%.2f",TotalGastos));
          txtVentaDia.setText(String.format("%.2f",VentaDia));
          txtCaja.setText(String.format("%.2f",CajaDia));
}
}
