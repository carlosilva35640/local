
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class ProductosDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
   public boolean RegistrarProductos(Productos pro) throws SQLIntegrityConstraintViolationException {
    String sql = "INSERT INTO productos (Producto, codigo, CantCompra, CantVenta, Merma, PrecioCompra, PrecioVenta, Stock) VALUES (?,?,?,?,?,?,?,?)";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, pro.getProducto());
        ps.setString(2, pro.getCodigo());
        ps.setDouble(3, pro.getCantCompra());
        ps.setDouble(4, pro.getCantVenta());
        ps.setDouble(5, pro.getMerma());
        ps.setDouble(6, pro.getPrecioCompra());
        ps.setDouble(7, pro.getPrecioVenta());
        ps.setDouble(8, pro.getStock());
        ps.execute();
        return true;
    } catch (SQLException e) {
        if (e instanceof SQLIntegrityConstraintViolationException) {
            throw new SQLIntegrityConstraintViolationException("Error: El código de producto ya existe.");
        } else {
            System.out.println(e.toString());
            return false;
        }
    }
}
     
   public boolean RegistrarFactura(Productos pro) throws SQLIntegrityConstraintViolationException {
    String sql = "INSERT INTO facturas (factura, fecha, proveedor, Cantidad, producto, peso, Precio,total) VALUES (?,?,?,?,?,?,?,?)";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, pro.getFactura());
        ps.setString(2, pro.getFecha());
        ps.setString(3, pro.getProveedor());
        ps.setDouble(4, pro.getCantidadFactura());
        ps.setString(5, pro.getProducto());
        ps.setDouble(6, pro.getCantCompra());
        ps.setDouble(7, pro.getPrecioCompra());
        ps.setDouble(8, pro.getTotal());
        ps.execute();
        return true;
    } catch (SQLException e) {
        if (e instanceof SQLIntegrityConstraintViolationException) {
            throw new SQLIntegrityConstraintViolationException("Error: El código de producto ya existe.");
        } else {
            System.out.println(e.toString());
            return false;
        }
    }
}
    public boolean RegistrarProductos$(Cuentas cu) throws SQLIntegrityConstraintViolationException {
    String sql = "INSERT INTO cuentas (Producto$, codigo$, CantVentaKg, CantVenta$, PagoProvee,Merma, Merma$, PrecioCompra$, PrecioVenta$, Ganancia$,Proveedor) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, cu.getProducto$());
        ps.setString(2, cu.getCodigo$());
        ps.setDouble(3, cu.getCantVentaKg());
        ps.setDouble(4, cu.getCantVenta$());
        ps.setDouble(5, cu.getPagoProvee());
        ps.setDouble(6, cu.getMerma());
        ps.setDouble(7, cu.getMerma$());
        ps.setDouble(8, cu.getPrecioCompra$());
        ps.setDouble(9, cu.getPrecioVenta$());
        ps.setDouble(10, cu.getGanancia$());
        ps.setString(11, cu.getProveedor());
        ps.execute();
        return true;
    } catch (SQLException e) {
        if (e instanceof SQLIntegrityConstraintViolationException) {
            throw new SQLIntegrityConstraintViolationException("Error: El código de producto ya existe.");
        } else {
            System.out.println(e.toString());
            return false;
        }
    }
}

    
    public List<Productos> ListarProductos() {
    List<Productos> listaProductos = new ArrayList<>();
    String sql = "SELECT * FROM productos ORDER BY id DESC";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {               
            Productos pro = new Productos();
             pro.setId(rs.getInt("id"));
            pro.setProducto(rs.getString("Producto"));
            pro.setCodigo(rs.getString("Codigo"));
            pro.setCantCompra(rs.getDouble("CantCompra"));
            pro.setCantVenta(rs.getDouble("CantVenta"));
            pro.setMerma(rs.getDouble("Merma"));
            pro.setPrecioCompra(rs.getDouble("PrecioCompra"));
            pro.setPrecioVenta(rs.getDouble("PrecioVenta"));
            pro.setStock(rs.getDouble("Stock"));
            listaProductos.add(pro);
        }
    } catch (SQLException e) {
        System.out.println(e.toString());
    }
    return listaProductos;
}
     public List<Cuentas> ListarCuentas() {
    List<Cuentas> listaCuentas = new ArrayList<>();
    String sql = "SELECT * FROM Cuentas ORDER BY id DESC";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {               
            Cuentas cu = new Cuentas();
             cu.setId(rs.getInt("id"));
            cu.setProducto$(rs.getString("Producto$"));
            cu.setCodigo$(rs.getString("Codigo$"));
             cu.setCantVentaKg(rs.getDouble("CantVentaKg"));
            cu.setCantVenta$(rs.getDouble("CantVenta$"));
            cu.setMerma$(rs.getDouble("Merma$"));
            cu.setPagoProvee(rs.getDouble("PagoProvee"));
            cu.setGanancia$(rs.getDouble("Ganancia$"));
            listaCuentas.add(cu);
        }
    } catch (SQLException e) {
        System.out.println(e.toString());
    }
    return listaCuentas;
     }
    
    public boolean EliminarProductos(int id){
       String sql = "DELETE FROM productos WHERE id = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }
   }
     public boolean EliminarCuentas(String codigo){
       String sql = "DELETE FROM cuentas WHERE codigo$ = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setString(1, codigo);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
   }
   
    
   public boolean ModificarProductos(Productos pro) {
    String sql = "UPDATE productos  SET producto=?, codigo=?, cantCompra=?, cantVenta=?, merma=?, precioCompra=?, precioVenta=?, stock=? WHERE id=?"; 
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, pro.getProducto());
        ps.setString(2, pro.getCodigo());
        ps.setDouble(3, pro.getCantCompra());
        ps.setDouble(4, pro.getCantVenta());
        ps.setDouble(5, pro.getMerma());
        ps.setDouble(6, pro.getPrecioCompra());
        ps.setDouble(7, pro.getPrecioVenta());
        ps.setDouble(8, pro.getStock());
        ps.setInt(9, pro.getId());
        ps.execute();
        return true;
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    }
}
     public boolean ModificarCuentasCompleto(Cuentas cu) {
    String sql = "UPDATE cuentas  SET producto$=?, Proveedor=?, cantVentaKg=?, PagoProvee=?, cantVenta$=?, Merma=? ,merma$=?, PrecioCompra$=?, PrecioVenta$=?, Ganancia$=? WHERE codigo$=?"; 
    try {
        ps = con.prepareStatement(sql);
      
        ps.setString(1, cu.getProducto$());
        ps.setString(2, cu.getProveedor());
        ps.setDouble(3, cu.getPagoProvee());
        ps.setDouble(4, cu.getCantVenta$());
        ps.setDouble(5, cu.getCantVentaKg());
        ps.setDouble(6, cu.getMerma());
        ps.setDouble(7, cu.getMerma$());
        ps.setDouble(8, cu.getPrecioCompra$());
        ps.setDouble(9, cu.getPrecioVenta$());
        ps.setDouble(10, cu.getGanancia$());
        ps.setString(11, cu.getCodigo$());
        
        ps.execute();
        return true;
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    } 
    
}public boolean ModificarCuentas(Cuentas cu) {
    String sql = "UPDATE cuentas SET cantVentakg=?, PagoProvee=?, cantVenta$=?, merma=?, merma$=?, Ganancia$=?";
    try {
        // Abre el PreparedStatement
        ps = con.prepareStatement(sql);
        ps.setDouble(1, cu.getCantVentaKg());
        ps.setDouble(2, cu.getPagoProvee());
        ps.setDouble(3, cu.getCantVenta$());
        ps.setDouble(4, cu.getMerma());
        ps.setDouble(5, cu.getMerma$());
        ps.setDouble(6, cu.getGanancia$());
        ps.execute();
        return true;
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    }
}


    
    
    public Productos BuscarPro(String cod){
        Productos producto = new Productos();
        String sql = "SELECT * FROM productos WHERE codigo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto.setId(rs.getInt("id"));
                producto.setProducto(rs.getString("producto"));
                producto.setPrecioCompra(rs.getDouble("precioCompra"));
                producto.setPrecioVenta(rs.getDouble("precioVenta"));
                producto.setStock(rs.getDouble("stock"));
                producto.setCantCompra(rs.getDouble("CantCompra"));
                producto.setMerma(rs.getDouble("Merma"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
     }
    
    


    
   
    public boolean ActualizarCantCompra(double CantCompra, int id) {
    String sqlSelect = "SELECT CantCompra FROM productos WHERE id = ?";
    String sqlUpdate = "UPDATE productos SET CantCompra = ? WHERE id = ?";
    try {
        con = cn.getConnection();
        
        // Obtener la cantidad actual de stock del producto
        ps = con.prepareStatement(sqlSelect);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        
        double CantCompraActual = 0.0;
        if (rs.next()) {
            CantCompraActual = rs.getDouble("CantCompra");
        }
        
        // Sumar la cantidad nueva a la cantidad anterior
        double nuevaCantCompra = CantCompraActual + CantCompra;
        
        // Actualizar el stock en la base de datos
        ps = con.prepareStatement(sqlUpdate);
        ps.setDouble(1, nuevaCantCompra);
        ps.setInt(2, id);
        ps.executeUpdate();
        
        return true;
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    } finally {
        // Cerrar recursos
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
  }
   public boolean ActualizarStockCompra(double Stock,double CantCompra, int id) {
    String sqlSelect = "SELECT Stock FROM productos WHERE id = ?";
    String sqlUpdate = "UPDATE productos SET Stock = ? WHERE id = ?";
    try {
        con = cn.getConnection();
        
        // Obtener la cantidad actual de stock del producto
        ps = con.prepareStatement(sqlSelect);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        
        double StockActual = 0.0;
        if (rs.next()) {
            StockActual = rs.getDouble("Stock");
        }
        
        // Sumar la cantidad nueva a la cantidad anterior
        double nuevoStock = StockActual + CantCompra ;
      
        
        // Actualizar el stock en la base de datos
        ps = con.prepareStatement(sqlUpdate);
        ps.setDouble(1, nuevoStock);
        ps.setInt(2, id);
        ps.executeUpdate();
        
        return true;
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    } finally {
        // Cerrar recursos
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
  }
    public boolean ActualizarCantMerma(double CantMerma, int id) {
    String sqlSelect = "SELECT Merma FROM productos WHERE id = ?";
    String sqlUpdate = "UPDATE productos SET Merma = ? WHERE id = ?";
    try {
        con = cn.getConnection();
        
        // Obtener la cantidad actual de stock del producto
        ps = con.prepareStatement(sqlSelect);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        
        double CantMermaActual = 0.0;
        if (rs.next()) {
            CantMermaActual = rs.getDouble("Merma");
        }
        
        // Sumar la cantidad nueva a la cantidad anterior
        double nuevaCantMerma = CantMermaActual + CantMerma;
        
        // Actualizar el stock en la base de datos
        ps = con.prepareStatement(sqlUpdate);
        ps.setDouble(1, nuevaCantMerma);
        ps.setInt(2, id);
        ps.executeUpdate();
        
        return true;
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    } finally {
        // Cerrar recursos
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
  }
     public boolean ActualizarCantMermaCuentas(double CantMerma, String codigo) {
    String sqlSelect = "SELECT Merma,PrecioCompra$,Ganancia$ FROM cuentas WHERE codigo$ = ?";
    String sqlUpdate = "UPDATE cuentas SET Merma = ?,merma$ =?,Ganancia$ =? WHERE codigo$ = ?";
    try {
        con = cn.getConnection();
        
        // Obtener la cantidad actual de stock del producto
        ps = con.prepareStatement(sqlSelect);
        ps.setString(1, codigo);
        rs = ps.executeQuery();
        
        double CantMermaActual = 0.0;
        double PrecioMerma = 0.0;
        double Ganancia = 0.0;
        if (rs.next()) {
             CantMermaActual = rs.getDouble("Merma");
             PrecioMerma = rs.getDouble("PrecioCompra$");
             Ganancia = rs.getDouble("Ganancia$");
        }
        
        // Sumar la cantidad nueva a la cantidad anterior
        double nuevaCantMerma = CantMermaActual + CantMerma;
        double nuevaCantMerma$ = nuevaCantMerma * PrecioMerma;
        double nuevaGanancia = Ganancia - nuevaCantMerma$;
        
        // Actualizar el stock en la base de datos
        ps = con.prepareStatement(sqlUpdate);
        ps.setDouble(1, nuevaCantMerma);
        ps.setDouble(2, nuevaCantMerma$);
        ps.setDouble(3, nuevaGanancia);
        ps.setString(4, codigo);
        ps.executeUpdate();
        
        return true;
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    } finally {
        // Cerrar recursos
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
  }
   public boolean ActualizarStockMerma(double Stock,double CantMerma, int id) {
    String sqlSelect = "SELECT Stock FROM productos WHERE id = ?";
    String sqlUpdate = "UPDATE productos SET Stock = ? WHERE id = ?";
    try {
        con = cn.getConnection();
        
        // Obtener la cantidad actual de stock del producto
        ps = con.prepareStatement(sqlSelect);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        
        double StockActual = 0.0;
        if (rs.next()) {
            StockActual = rs.getDouble("Stock");
        }
        
        // Sumar la cantidad nueva a la cantidad anterior
        double nuevoStock = StockActual - CantMerma ;
      
        
        // Actualizar el stock en la base de datos
        ps = con.prepareStatement(sqlUpdate);
        ps.setDouble(1, nuevoStock);
        ps.setInt(2, id);
        ps.executeUpdate();
        
        return true;
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    } finally {
        // Cerrar recursos
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
  }
   
   public Productos BuscarId(int id) {
    String sql = "SELECT * FROM productos WHERE id = ?";
    Productos producto = null;
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        if (rs.next()) {
            producto = new Productos();
            producto.setId(rs.getInt("id"));
            producto.setProducto(rs.getString("Producto"));
            producto.setCodigo(rs.getString("codigo"));
            producto.setCantCompra(rs.getDouble("CantCompra"));
            producto.setCantVenta(rs.getDouble("CantVenta"));
            producto.setMerma(rs.getDouble("merma"));
            producto.setPrecioCompra(rs.getDouble("PrecioCompra"));
            producto.setPrecioVenta(rs.getDouble("PrecioVenta"));
            producto.setStock(rs.getDouble("Stock"));
        }
    } catch (SQLException e) {
        System.out.println(e.toString());
    }
    return producto;
}
    public Cuentas BuscarCodigoCuentas(String codigo) {
    String sql = "SELECT * FROM cuentas WHERE codigo$ = ?";
    Cuentas cuentas = null;
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1,codigo);
        rs = ps.executeQuery();
        if (rs.next()) {
            cuentas = new Cuentas();
            cuentas.setId(rs.getInt("id"));
            cuentas.setCodigo$(rs.getString("codigo$"));
            cuentas.setProducto$(rs.getString("Producto$"));
            cuentas.setPagoProvee(rs.getDouble("PagoProvee"));
            cuentas.setCantVentaKg(rs.getDouble("CantVentaKg"));
            cuentas.setCantVenta$(rs.getDouble("CantVenta$"));
            cuentas.setMerma(rs.getDouble("merma"));
            cuentas.setMerma$(rs.getDouble("merma$"));
            cuentas.setPrecioCompra$(rs.getDouble("PrecioCompra$"));
            cuentas.setPrecioVenta$(rs.getDouble("PrecioVenta$"));
            cuentas.setGanancia$(rs.getDouble("Ganancia$"));
        }
    } catch (SQLException e) {
        System.out.println(e.toString());
    }
    return cuentas;
}
   public List<Cuentas> BuscarProveedorPorNombre(String nombreProveedor) {
    List<Cuentas> Listaproveedor = new ArrayList<>();
    String sql = "SELECT * FROM Cuentas WHERE Proveedor =?";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreProveedor);
        
        rs = ps.executeQuery();

        while (rs.next()) {
            Cuentas proveedor = new Cuentas();
            proveedor.setId(rs.getInt("id"));
            proveedor.setCodigo$(rs.getString("codigo$"));
            proveedor.setProducto$(rs.getString("Producto$"));
            proveedor.setCantVentaKg(rs.getDouble("CantVentaKg"));
            proveedor.setCantVenta$(rs.getDouble("CantVenta$"));
            proveedor.setMerma$(rs.getDouble("Merma$"));
            proveedor.setPagoProvee(rs.getDouble("PagoProvee"));
            proveedor.setGanancia$(rs.getDouble("Ganancia$"));
            Listaproveedor.add(proveedor);
        }
    } catch (SQLException e) {
        // Imprimir el error en la consola
        
    }

    return Listaproveedor;
}

     
}
