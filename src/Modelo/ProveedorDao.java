
package Modelo;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.filechooser.FileSystemView;

public class ProveedorDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public boolean RegistrarProveedor(Proveedor pr){
        String sql = "INSERT INTO proveedor(fecha, nombre, pagos, deuda, factura) VALUES (?,?,?,?,?)";
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setString(1, pr.getFecha());
           ps.setString(2, pr.getNombre());
           ps.setDouble(3, pr.getPagos());
           ps.setDouble(4, pr.getDeuda());
           ps.setString(5, pr.getFactura());
           ps.execute();
           return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public List ListarProveedor(){
        List<Proveedor> Listapr = new ArrayList();
        String sql = "SELECT * FROM proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Proveedor pr = new Proveedor();
                pr.setId(rs.getInt("id"));
                pr.setFecha(rs.getString("fecha"));
                pr.setNombre(rs.getString("nombre"));
                pr.setPagos(rs.getDouble("pagos"));
                pr.setDeuda(rs.getDouble("deuda"));
                pr.setFactura(rs.getString("factura"));
                Listapr.add(pr);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapr;
    }
    
    public boolean EliminarProveedor(int id){
        String sql = "DELETE FROM proveedor WHERE id = ? ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public boolean ModificarProveedor(Proveedor pr){
        String sql = "UPDATE proveedor SET fecha=?, nombre=?, pagos=?, deuda=?, factura=? WHERE id = ? ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getFecha());
            ps.setString(2, pr.getNombre());
            ps.setDouble(3, pr.getPagos());
            ps.setDouble(4, pr.getDeuda());
            ps.setString(5, pr.getFactura());
            ps.setInt(6, pr.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
     public Double sumarPagosProveedor(String nombreProveedor,String fechaInicio, String fechaFinal) {
    double totalPagos = 0;
    String sql = "SELECT SUM(pagos) AS totalPagos FROM proveedor WHERE nombre = ? OR fecha BETWEEN ? AND ?";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreProveedor);
        ps.setString(2, fechaInicio);
        ps.setString(3, fechaFinal);
        rs = ps.executeQuery();

        if (rs.next()) {
            totalPagos = rs.getDouble("totalPagos");
        }
    } catch (SQLException e) {
        // Manejar la excepción según sea necesario
    } finally {
        // Cerrar recursos (ResultSet, PreparedStatement, Connection)
    }

    return totalPagos;
}
       public Double sumarPagosProveedor2(String nombreProveedor) {
    double totalPagos = 0;
    String sql = "SELECT SUM(pagos) AS totalPagos FROM proveedor WHERE nombre = ? ";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreProveedor);
        rs = ps.executeQuery();

        if (rs.next()) {
            totalPagos = rs.getDouble("totalPagos");
        }
    } catch (SQLException e) {
        // Manejar la excepción según sea necesario
    } finally {
        // Cerrar recursos (ResultSet, PreparedStatement, Connection)
    }

    return totalPagos;
}
    
 public Double sumarDeudasProveedor(String nombreProveedor,String fechaInicio, String fechaFinal) {
    double totalDeuda = 0;
    String sql = "SELECT SUM(deuda) AS totaldeuda FROM proveedor WHERE nombre = ? OR fecha BETWEEN ? AND ?";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreProveedor);
        ps.setString(2, fechaInicio);
        ps.setString(3, fechaFinal);
        rs = ps.executeQuery();

        if (rs.next()) {
            totalDeuda = rs.getDouble("totaldeuda");
        }
    } catch (SQLException e) {
        // Manejar la excepción según sea necesario
    } finally {
        // Cerrar recursos (ResultSet, PreparedStatement, Connection)
    }

    return totalDeuda;
}
 
 
  public List<Proveedor> BuscarProveedorPorNombreYFecha(String nombreProveedor,String fechaInicio, String fechaFinal) {
    List<Proveedor> Listaproveedor = new ArrayList<>();
    String sql = "SELECT * FROM proveedor WHERE nombre = ? AND fecha BETWEEN ? AND ? ORDER BY fecha ASC";


    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreProveedor);
        ps.setString(2, fechaInicio);
        ps.setString(3, fechaFinal);
        rs = ps.executeQuery();

        while (rs.next()) {
           Proveedor proveedor = new Proveedor();
            proveedor.setId(rs.getInt("id"));
            proveedor.setFecha(rs.getString("fecha"));
            proveedor.setNombre(rs.getString("nombre"));
            proveedor.setPagos(rs.getDouble("pagos"));
            proveedor.setDeuda(rs.getDouble("deuda"));
            proveedor.setFactura(rs.getString("factura"));
            Listaproveedor.add( proveedor);
        }
    } catch (SQLException e) {
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
        }
    }

    return Listaproveedor;
}
  public List<Productos> BuscarFacturaPorNombreYNumero(String nombreProveedor,String NumeroFactura) {
    List<Productos> Listaproductos = new ArrayList<>();
    String sql = "SELECT * FROM Facturas WHERE proveedor = ? AND factura  = ?  ORDER BY fecha ASC";


    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreProveedor);
        ps.setString(2, NumeroFactura);
        rs = ps.executeQuery();

        while (rs.next()) {
           Productos factura = new Productos();
           factura .setId(rs.getInt("id"));
           factura .setFactura(rs.getString("factura"));
           factura .setFecha(rs.getString("fecha"));
           factura .setProveedor(rs.getString("proveedor"));
           factura .setCantidadFactura(rs.getDouble("cantidad"));
           factura .setProducto(rs.getString("producto"));
           factura .setCantCompra(rs.getDouble("peso"));
           factura .setPrecioCompra(rs.getDouble("precio"));
           factura .setTotal(rs.getDouble("total"));
            
            Listaproductos.add( factura);
        }
    } catch (SQLException e) {
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
        }
    }

    return Listaproductos;
}
  public List<Proveedor> BuscarProveedorPorNombre(String nombreProveedor) {
    List<Proveedor> Listaproveedor = new ArrayList<>();
    String sql = "SELECT * FROM proveedor WHERE nombre =  ?  ORDER BY fecha ASC";


    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreProveedor);
        
        rs = ps.executeQuery();

        while (rs.next()) {
           Proveedor proveedor = new Proveedor();
            proveedor.setId(rs.getInt("id"));
            proveedor.setFecha(rs.getString("fecha"));
            proveedor.setNombre(rs.getString("nombre"));
            proveedor.setPagos(rs.getDouble("pagos"));
            proveedor.setDeuda(rs.getDouble("deuda"));
            proveedor.setFactura(rs.getString("factura"));
            Listaproveedor.add( proveedor);
        }
    } catch (SQLException e) {
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
        }
    }

    return Listaproveedor;
}
  public Set<String> BuscarNombreProveedor() {
    Set<String> nombreProveedor = new HashSet<>();
    nombreProveedor.add(""); // Agrega una cadena vacía como primer elemento

    String sql = "SELECT nombre FROM proveedor";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            nombreProveedor.add(rs.getString("nombre"));
        }
    } catch (SQLException e) {
        // Manejar la excepción según sea necesario
    } finally {
        // Cerrar recursos (ResultSet, PreparedStatement, Connection)
    }

    return nombreProveedor;
}
 public List<Proveedor> buscarProveedorPorFecha(String fechaInicio, String fechaFinal) throws SQLException {
    List<Proveedor> proveedores = new ArrayList<>();
    String sql = "SELECT * FROM proveedor WHERE fecha BETWEEN ? AND ? ORDER BY fecha ASC";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        
        ps.setString(1, fechaInicio);
        ps.setString(2, fechaFinal);
        rs = ps.executeQuery();

        while (rs.next()) {
            Proveedor proveedor = new Proveedor();
            proveedor.setId(rs.getInt("id"));
            proveedor.setFecha(rs.getString("fecha"));
            proveedor.setNombre(rs.getString("nombre"));
            proveedor.setPagos(rs.getDouble("pagos"));
            proveedor.setDeuda(rs.getDouble("deuda"));
            proveedor.setFactura(rs.getString("factura"));
            proveedores.add(proveedor);
        }
         // Cerrar recursos (ResultSet, PreparedStatement, Connection)
        rs.close();
        ps.close();
        con.close();
    } catch (SQLException e) {
        // Manejar la excepción según sea necesario
        System.out.println(e.toString());
    }
    return proveedores;
}
  public void ProveedorPorMesesPDF(JTable tabla, String nombreArchivo,String deuda,String mes) throws BadElementException, IOException {
    try {
        // Configurar la ruta y el nombre del archivo PDF
        Document doc = new Document();
        String url = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
        File archivoPDF = new File(url, nombreArchivo + ".pdf");
        PdfWriter.getInstance(doc, new FileOutputStream(archivoPDF));
        doc.open();
        
        // Inicializar el documento PDF
        
       
      
        
        // Crear un flujo de salida para escribir en el archivo PDF
        FileOutputStream archivo = new FileOutputStream(archivoPDF);
        PdfWriter.getInstance(doc, archivo);
     
        // Abrir el documento para empezar a escribir en él
        doc.open();
        
        // Llamar a las funciones que generan el contenido del documento
        EncabezadoProveedorPorMeses(doc,mes);
        agregarTablaPdf(doc, tabla);
        agregarTotalDeuda(doc, deuda);
        
        
       
        
        // Cerrar el documento
        doc.close();
        
        // Abrir el archivo PDF generado
       
      
      // Abrir el archivo PDF generado
        Desktop.getDesktop().open(archivoPDF);
    } catch (DocumentException | IOException e) {
        System.out.println("Error al generar el documento PDF: " + e);
    }
}
  public void ReciboPagoProveedorPDF(String proveedor, String pago,String usuario) {
    try {
        // Configurar la ruta y el nombre del archivo PDF
        String url = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
        String nombreArchivo = "venta.pdf";
        File archivoPDF = new File(url + nombreArchivo);
        
        // Inicializar el documento PDF
        Document doc = new Document();
        
        // Crear un flujo de salida para escribir en el archivo PDF
        FileOutputStream archivo = new FileOutputStream(archivoPDF);
        PdfWriter.getInstance(doc, archivo);
        
        // Abrir el documento para empezar a escribir en él
        doc.open();
        
        // Llamar a las funciones que generan el contenido del documento
       
        EncabezadoReciboPagoProveedor(doc, usuario);
        DatosReciboPagoProveedor(doc, proveedor);
        agregartotalPago(doc, pago);
       
        
        
       
        
        // Cerrar el documento
        doc.close();
        
        // Abrir el archivo PDF generado
        Desktop.getDesktop().open(archivoPDF);
    } catch (DocumentException | IOException e) {
        System.out.println("Error al generar el documento PDF: " + e);
    }
  }
   private void EncabezadoReciboPagoProveedor(Document doc, String usuario) throws DocumentException, BadElementException, IOException {
       // Mensaje de depuración
       System.out.println("Agregando encabezado al documento...");
       // Obtener la fecha actual
       Date fechaActual = new Date();
       // Crear un párrafo para el encabezado
       Paragraph encabezado = new Paragraph();
       Image img = Image.getInstance(getClass().getResource("/Img/logo.png"));
       // Configurar fuente y estilo para el encabezado
       Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
      
       // Agregar información al encabezado con estilo negrita
       encabezado.setFont(fuenteNegrita);
       encabezado.add(img);
       encabezado.add(new Chunk("Trabajador " + "\n", fuenteNegrita ));
       encabezado.add(usuario +"\n");
       encabezado.add(new Chunk("Fecha: ", fuenteNegrita));
       encabezado.add(new SimpleDateFormat("MM/dd/yyyy").format(fechaActual) + "\n\n\n\n\n");
      
       
       encabezado.setAlignment(Element.ALIGN_CENTER);
       doc.add(encabezado);
       
       // Agregar la tabla del encabezado al documento
       // Mensaje de depuración
       System.out.println("Encabezado agregado correctamente.");
}
    private void EncabezadoProveedorPorMeses(Document doc, String mes) throws DocumentException, BadElementException, IOException {
       // Mensaje de depuración
       System.out.println("Agregando encabezado al documento...");
       // Obtener la fecha actual
       Date fechaActual = new Date();
       // Crear un párrafo para el encabezado
       Paragraph encabezado = new Paragraph();
       Image img = Image.getInstance(getClass().getResource("/Img/logo.png"));
       // Configurar fuente y estilo para el encabezado
       Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
      
       // Agregar información al encabezado con estilo negrita
       encabezado.setFont(fuenteNegrita);
       encabezado.add(img);
       encabezado.add(new Chunk("Charcuteria CA " + "\n\n", fuenteNegrita ));
       encabezado.add(new Chunk(mes +"\n\n"));
       encabezado.add(new Chunk("Fecha de Emision: ", fuenteNegrita));
       encabezado.add(new SimpleDateFormat("MM/dd/yyyy").format(fechaActual) + "\n\n");
      
       
       encabezado.setAlignment(Element.ALIGN_CENTER);
       doc.add(encabezado);
       
       // Agregar la tabla del encabezado al documento
       // Mensaje de depuración
       System.out.println("Encabezado agregado correctamente.");
}


    

   private void DatosReciboPagoProveedor(Document doc, String proveedor) throws DocumentException {
    try {
        // Crear un párrafo para los datos del proveedor
        Paragraph datosProveedor = new Paragraph();
        
        // Configurar fuente y estilo para los datos del proveedor
        Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD, BaseColor.BLACK);
        
       
       datosProveedor.setFont(fuenteNegrita);
       datosProveedor.add("Proveedor "+"\n\n" + proveedor +"\n\n\n\n\n");
        
        
        // Agregar el párrafo de los datos del proveedor al documento
        datosProveedor.setAlignment(Element.ALIGN_CENTER);
        doc.add(datosProveedor);
    } catch (DocumentException e) {
        System.out.println("Error al agregar los datos del proveedor al documento PDF: " + e);
    }
}
   private void agregartotalPago(Document doc,String pago) throws DocumentException {
    try {
        // Crear un párrafo para el total de la venta
        Paragraph totalPago = new Paragraph();
        DottedLineSeparator dottedLine = new DottedLineSeparator();
        dottedLine.setPercentage(40);
        dottedLine.setLineWidth(2);
        
        // Configurar fuente y estilo para el total de la venta
        
        Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK);
        
        // Agregar información del total de la venta al párrafo
        totalPago.setFont(fuenteNegrita);
        totalPago.add("Total Pago: " + pago + "\n\n\n\n");
        totalPago.add(new Chunk(dottedLine));
        totalPago.add(Chunk.NEWLINE);
        totalPago.add("Firma "+ "\n\n\n\n");
      
        
        // Agregar el párrafo del total de la venta al documento
        
        totalPago.setAlignment(Element.ALIGN_CENTER);
        doc.add(totalPago);
    } catch (DocumentException e) {
        System.out.println("Error al agregar el total de la venta al documento PDF: " + e);
    }
}
private void agregarTotalDeuda(Document doc,String deuda) throws DocumentException {
    try {
        // Crear un párrafo para el total de la venta
        Paragraph totalDeuda = new Paragraph();
        
        // Configurar fuente y estilo para el total de la venta
        
        Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK);
        
        // Agregar información del total de la venta al párrafo
        totalDeuda.setFont(fuenteNegrita);
        totalDeuda.add("Deuda Pendiente: " + deuda + "\n\n");
        
        // Agregar el párrafo del total de la venta al documento
        totalDeuda.setAlignment(Element.ALIGN_CENTER);
        doc.add(totalDeuda);
    } catch (DocumentException e) {
        System.out.println("Error al agregar el total de la venta al documento PDF: " + e);
    }
}

public void agregarTablaPdf(Document doc,JTable tabla) {
    try {
        // Crear una tabla en el documento PDF
        PdfPTable pdfTabla = new PdfPTable(tabla.getColumnCount());
        
        // Agregar las cabeceras de la tabla
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            pdfTabla.addCell(new PdfPCell(new Phrase(tabla.getColumnName(i))));
        }
        
        // Agregar los datos de la tabla al documento PDF
        for (int fila = 0; fila < tabla.getRowCount(); fila++) {
            for (int columna = 0; columna < tabla.getColumnCount(); columna++) {
                pdfTabla.addCell(tabla.getValueAt(fila, columna).toString());
            }
        }
        
        // Agregar la tabla al documento
        doc.add(pdfTabla);
        
    } catch (DocumentException e) {
        System.out.println("Error al agregar la tabla al documento PDF: " + e);
    }
} 


}


 
    





    