
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
import java.util.List;
import javax.swing.JOptionPane;
import java.util.HashSet;
import java.util.Set;
import javax.swing.filechooser.FileSystemView;

public class ClienteDao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
   public boolean RegistrarCliente(Cliente cl){
    String sql = "INSERT INTO clientes (fecha, nombre, pagos, deuda) VALUES (?,?,?,?)";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, cl.getFecha());
        ps.setString(2, cl.getNombre());
        ps.setDouble(3, cl.getPagos());
        ps.setDouble(4, cl.getDeuda());
        ps.execute();
        return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
        return false;
    } finally {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}

    
   public List ListarCliente(){
       List<Cliente> ListaCl = new ArrayList();
       String sql = "SELECT * FROM clientes";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Cliente cl = new Cliente();
                cl.setId(rs.getInt("id"));
            cl.setFecha(rs.getString("fecha"));
            cl.setNombre(rs.getString("nombre"));
            cl.setPagos(rs.getDouble("pagos"));
            cl.setDeuda(rs.getDouble("deuda"));
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaCl;
   }
   
  public boolean EliminarCliente(int id) {
    String sql = "DELETE FROM clientes WHERE id = ?";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
        return true;
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    } finally {
        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
   
  public boolean ModificarCliente(Cliente cl){
       String sql = "UPDATE clientes SET fecha=?, nombre=?, pagos=?, deuda=? WHERE id=?";
       try {
           ps = con.prepareStatement(sql);   
           ps.setString(1, cl.getFecha());
           ps.setString(2, cl.getNombre());
           ps.setDouble(3, cl.getPagos());
           ps.setDouble(4, cl.getDeuda());
           ps.setInt(5, cl.getId());           
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
 public List<Cliente> BuscarClientePorNombre(String nombreCliente) {
    List<Cliente> clientes = new ArrayList<>();
    String sql = "SELECT * FROM clientes WHERE nombre = ?";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreCliente);
        rs = ps.executeQuery();

        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setFecha(rs.getString("fecha"));
            cliente.setNombre(rs.getString("nombre"));
            cliente.setPagos(rs.getDouble("pagos"));
            cliente.setDeuda(rs.getDouble("deuda"));
            clientes.add(cliente);
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

    return clientes;
}
 
 public Double sumarPagosCliente(String nombreCliente) {
    double totalPagos = 0;
    String sql = "SELECT SUM(pagos) AS totalPagos FROM clientes WHERE nombre = ?";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreCliente);
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
    
 public Double sumarDeudasCliente(String nombreCliente) {
    double totalDeuda = 0;
    String sql = "SELECT SUM(deuda) AS totaldeuda FROM clientes WHERE nombre = ?";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreCliente);
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
public Set<String> BuscarNombresClientes() {
    Set<String> nombresClientes = new HashSet<>();
    nombresClientes.add(""); // Agrega una cadena vacía como primer elemento

    String sql = "SELECT nombre FROM clientes";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            nombresClientes.add(rs.getString("nombre"));
        }
    } catch (SQLException e) {
        // Manejar la excepción según sea necesario
    } finally {
        // Cerrar recursos (ResultSet, PreparedStatement, Connection)
    }

    return nombresClientes;
}
public List<Cliente> buscarClientePorFecha(String fechaInicio, String fechaFinal) throws SQLException {
    List<Cliente> Clientes = new ArrayList<>();
    String sql = "SELECT * FROM clientes WHERE fecha BETWEEN ? AND ? ORDER BY fecha ASC";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        
        ps.setString(1, fechaInicio);
        ps.setString(2, fechaFinal);
        rs = ps.executeQuery();

        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setFecha(rs.getString("fecha"));
            cliente.setNombre(rs.getString("nombre"));
            cliente.setPagos(rs.getDouble("pagos"));
            cliente.setDeuda(rs.getDouble("deuda"));
         
            Clientes.add(cliente);
        }
         // Cerrar recursos (ResultSet, PreparedStatement, Connection)
        rs.close();
        ps.close();
        con.close();
    } catch (SQLException e) {
        // Manejar la excepción según sea necesario
        System.out.println(e.toString());
    }
    return Clientes;
}
 
    public List<Cliente> ListarClientes() {
    List<Cliente> listaClientes = new ArrayList<>();
    String sql = "SELECT * FROM clientes ORDER BY id DESC";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {               
            Cliente cl = new Cliente();
            cl.setId(rs.getInt("id"));
            cl.setFecha(rs.getString("fecha"));
            cl.setNombre(rs.getString("nombre"));
            cl.setPagos(rs.getDouble("pagos"));
            cl.setDeuda(rs.getDouble("deuda"));
            listaClientes.add(cl);
        }
    } catch (SQLException e) {
        System.out.println(e.toString());
    }
    return listaClientes;
    }
    
 public void ReciboPagoClientePDF(String cliente, String pago,String usuario,String deuda) {
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
       
        EncabezadoReciboPagoCliente(doc, usuario);
        DatosReciboPagoCliente(doc, cliente);
        agregartotalPago(doc, pago);
        agregarTotalDeuda(doc, deuda);
       
        
        
       
        
        // Cerrar el documento
        doc.close();
        
        // Abrir el archivo PDF generado
        Desktop.getDesktop().open(archivoPDF);
    } catch (DocumentException | IOException e) {
        System.out.println("Error al generar el documento PDF: " + e);
    }
  }private void EncabezadoReciboPagoCliente(Document doc, String usuario) throws DocumentException, BadElementException, IOException {
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
} private void DatosReciboPagoCliente(Document doc, String cliente) throws DocumentException {
    try {
        // Crear un párrafo para los datos del proveedor
        Paragraph datosCliente = new Paragraph();
        
        // Configurar fuente y estilo para los datos del proveedor
        Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD, BaseColor.BLACK);
        
       
       datosCliente.setFont(fuenteNegrita);
       datosCliente.add("Cliente "+"\n\n" + cliente +"\n\n\n\n\n");
        
        
        // Agregar el párrafo de los datos del proveedor al documento
        datosCliente.setAlignment(Element.ALIGN_CENTER);
        doc.add(datosCliente);
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
      
        totalDeuda.add(new Chunk("Deuda Pendiente: " + deuda + "\n\n",fuenteNegrita));
        totalDeuda.add("RECARGO DE UN 10% POR CREDITO");
        
        // Agregar el párrafo del total de la venta al documento
        totalDeuda.setAlignment(Element.ALIGN_CENTER);
        doc.add(totalDeuda);
    } catch (DocumentException e) {
        System.out.println("Error al agregar el total de la venta al documento PDF: " + e);
    }
}
}
