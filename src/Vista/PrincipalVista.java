
package Vista;

import Modelo.login;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class PrincipalVista extends javax.swing.JFrame {
    private static VentaVista venta;
    private static ClienteVista cliente;
    private static ProductosVista productos;
    private static ProveedorVista proveedor;
    private static RegistroVista RegistroVentas;
  
    DefaultTableModel modelo = new DefaultTableModel();
   
    
   
    public PrincipalVista() {
        initComponents();
    }
    public PrincipalVista(login priv) {
        initComponents();
        BotonesTrasparencia();
        this.setLocationRelativeTo(null);
    }
      public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
      public void BotonesTrasparencia(){
          btnClientes.setOpaque(false);
          btnClientes.setContentAreaFilled(true);
          btnConfig.setOpaque(false);
          btnConfig.setContentAreaFilled(false);
          btnProductos.setOpaque(false);
          btnProductos.setContentAreaFilled(false);
          btnProveedor.setOpaque(false);
          btnProveedor.setContentAreaFilled(false);
          btnVentas.setOpaque(false);
          btnVentas.setContentAreaFilled(false);
          btnUsuarios.setOpaque(false);
          btnUsuarios.setContentAreaFilled(false);
          btnNuevaVenta.setOpaque(false);
          btnNuevaVenta.setContentAreaFilled(false);
      }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUsuarios = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        LabelVendedor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuarios.setBackground(new java.awt.Color(153, 153, 153));
        btnUsuarios.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        btnUsuarios.setForeground(java.awt.Color.cyan);
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios.setFocusable(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 427, 40));

        btnConfig.setBackground(new java.awt.Color(153, 153, 153));
        btnConfig.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        btnConfig.setForeground(java.awt.Color.cyan);
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/config.png"))); // NOI18N
        btnConfig.setText("Config");
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConfig.setFocusable(false);
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 427, 40));

        btnVentas.setBackground(new java.awt.Color(153, 153, 153));
        btnVentas.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        btnVentas.setForeground(java.awt.Color.cyan);
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/compras.png"))); // NOI18N
        btnVentas.setText("Registro Ventas");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVentas.setFocusable(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 427, 40));

        btnProductos.setBackground(new java.awt.Color(153, 153, 153));
        btnProductos.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        btnProductos.setForeground(java.awt.Color.cyan);
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProductos.setFocusable(false);
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
        });
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 427, 40));

        btnProveedor.setBackground(new java.awt.Color(153, 153, 153));
        btnProveedor.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        btnProveedor.setForeground(java.awt.Color.cyan);
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/proveedor.png"))); // NOI18N
        btnProveedor.setText("Proveedor");
        btnProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProveedor.setFocusable(false);
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 427, 40));

        btnClientes.setBackground(new java.awt.Color(153, 153, 153));
        btnClientes.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        btnClientes.setForeground(java.awt.Color.cyan);
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Clientes.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClientes.setFocusable(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 427, 40));

        btnNuevaVenta.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevaVenta.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        btnNuevaVenta.setForeground(java.awt.Color.cyan);
        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nventa.png"))); // NOI18N
        btnNuevaVenta.setText("Ventas");
        btnNuevaVenta.setBorder(btnNuevaVenta.getBorder());
        btnNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevaVenta.setFocusable(false);
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 427, 40));

        LabelVendedor.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        LabelVendedor.setForeground(java.awt.Color.cyan);
        LabelVendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelVendedor.setText("Charcuteria CYG");
        getContentPane().add(LabelVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 570, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo_Embutidos.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
       if (venta == null || !venta.isVisible()) {
        venta = new VentaVista();
        venta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        venta.setVisible(true);
        venta.setLocationRelativeTo(null);
       }else{
            JOptionPane.showMessageDialog(null, "Hay una ventana Abierta");
       }
        
        
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
  if (cliente == null || !cliente.isVisible()) {
    // Si no hay ninguna instancia de la ventana o la ventana existente no es visible
    cliente = new ClienteVista();
    cliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    cliente.setVisible(true);
    cliente.setLocationRelativeTo(null);
} else {
    // Si la ventana ya está abierta y visible, simplemente enfócala
      JOptionPane.showMessageDialog(null, "Hay una ventana Abierta");
}

    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
     if (proveedor == null || !proveedor.isVisible()) {
    // Si no hay ninguna instancia de la ventana o la ventana existente no es visible
    proveedor = new ProveedorVista();
    proveedor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    proveedor.setVisible(true);
    proveedor.setLocationRelativeTo(null);
} else {
    // Si la ventana ya está abierta y visible, simplemente enfócala
      JOptionPane.showMessageDialog(null, "Hay una ventana Abierta");
}

    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked

    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed

      if (productos == null || !productos.isVisible()) {
    // Si no hay ninguna instancia de la ventana o la ventana existente no es visible
    productos = new ProductosVista();
    productos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    productos.setVisible(true);
    productos.setLocationRelativeTo(null);
} else {
    // Si la ventana ya está abierta y visible, simplemente enfócala
      JOptionPane.showMessageDialog(null, "Hay una ventana Abierta");
}

    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
      if (RegistroVentas == null || !RegistroVentas.isVisible()) {
    // Si no hay ninguna instancia de la ventana o la ventana existente no es visible
    RegistroVentas = new RegistroVista();
    RegistroVentas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    RegistroVentas.setVisible(true);
    RegistroVentas.setLocationRelativeTo(null);
} else {
    // Si la ventana ya está abierta y visible, simplemente enfócala
      JOptionPane.showMessageDialog(null, "Hay una ventana Abierta");
}
      
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed

    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        LimpiarTable();

    }//GEN-LAST:event_btnUsuariosActionPerformed

 

     
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
