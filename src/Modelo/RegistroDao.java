
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
import javax.swing.JTable;
import javax.swing.filechooser.FileSystemView;

public class RegistroDao {
     Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    double R;
   
    
    
    public double RegistrarVenta(Registro Rv){
       String sql = "INSERT INTO registroVenta (id,fecha, descripcion, cantidad, totalBs, totalPunto, total$,Inversion) VALUES (?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, Rv.getId());
            ps.setString(2, Rv.getFecha());
            ps.setString(3, Rv.getDescripcion());
            ps.setDouble(4, Rv.getCantidad());
            ps.setDouble(5, Rv.getTotalBs());
            ps.setDouble(6, Rv.getTotalPunto());
            ps.setDouble(7, Rv.getTotal$());
             ps.setDouble(8, Rv.getInversion());
           
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return R;
    }
    

     public double RegistrarGasto(Registro g){
        String sql = "INSERT INTO registroventa (fecha,descripcion,gasto) VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, g.getFecha());
            ps.setString(2, g.getDescripcion());
            ps.setDouble(3, g.getGasto());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return R;
     }
         public double RegistroPagoProveedor(Proveedor p){
        String sql = "INSERT INTO registroventa (fecha,descripcion,pagoProvee) VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getFecha());
            ps.setString(2, p.getNombre());
            ps.setDouble(3, p.getPagos());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return R;
    }
          public double RegistroPagoClietne(Cliente c){
        String sql = "INSERT INTO registroventa (fecha,descripcion,pagoCliente) VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getFecha());
            ps.setString(2, c.getNombre());
            ps.setDouble(3, c.getPagos());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return R;
    }
         
   public List<Registro> ListarRegistroPorFecha(String fecha) {
    List<Registro> listaRegistro = new ArrayList<>();
    String sql = "SELECT * FROM registroventa WHERE fecha = ?";
    
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, fecha);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            Registro registro = new Registro();
            registro.setId(rs.getInt("id"));
            registro.setFecha(rs.getString("fecha"));
            registro.setDescripcion(rs.getString("descripcion"));
            registro.setCantidad(rs.getDouble("cantidad"));
            registro.setTotalBs(rs.getDouble("totalBs"));
            registro.setTotalPunto(rs.getDouble("totalPunto"));
            registro.setTotal$(rs.getDouble("total$"));
            registro.setGasto(rs.getDouble("gasto"));
            registro.setPagoProvee(rs.getDouble("pagoProvee"));
            registro.setPagoCliente(rs.getDouble("pagoCliente"));
            registro.setInversion(rs.getDouble("Inversion"));
            listaRegistro.add(registro);
        }
        
        rs.close();
        ps.close();
        con.close();
    } catch (SQLException e) {
        System.out.println("Error al listar registros por fecha: " + e.getMessage());
    }
    
    return listaRegistro;
}
   public List<Registro> ListarRegistroPorSemana(String fechaInicio,String fechaFinal) {
    List<Registro> listaRegistro = new ArrayList<>();
     String sql = "SELECT * FROM registroventa WHERE fecha BETWEEN ? AND ? ORDER BY fecha ASC";
    
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, fechaInicio);
          ps.setString(2, fechaFinal);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            Registro registro = new Registro();
            registro.setId(rs.getInt("id"));
            registro.setFecha(rs.getString("fecha"));
            registro.setDescripcion(rs.getString("descripcion"));
            registro.setCantidad(rs.getDouble("cantidad"));
            registro.setTotalBs(rs.getDouble("totalBs"));
            registro.setTotalPunto(rs.getDouble("totalPunto"));
            registro.setTotal$(rs.getDouble("total$"));
            registro.setGasto(rs.getDouble("gasto"));
            registro.setPagoProvee(rs.getDouble("pagoProvee"));
            registro.setPagoCliente(rs.getDouble("pagoCliente"));
            registro.setInversion(rs.getDouble("Inversion"));
            listaRegistro.add(registro);
        }
        
        rs.close();
        ps.close();
        con.close();
    } catch (SQLException e) {
        System.out.println("Error al listar registros por semana: " + e.getMessage());
    }
    
    return listaRegistro;
}
  public void RegistroPorFechaPDF(JTable tabla, String nombreArchivo,String Fecha,String Venta,String PagoCliente,String PagoProveedor,String Gastos,String Inversion) throws BadElementException, IOException {
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
        EncabezadoRegistroPorFecha(doc,Fecha);
        agregarTablaPdf(doc, tabla);
        agregarTotales(doc,Venta, PagoCliente,PagoProveedor,Gastos,Inversion);
       
        
        
        
       
        
        // Cerrar el documento
        doc.close();
        
        // Abrir el archivo PDF generado
       
      
      // Abrir el archivo PDF generado
        Desktop.getDesktop().open(archivoPDF);
    } catch (DocumentException | IOException e) {
        System.out.println("Error al generar el documento PDF: " + e);
    }
  }
    
    public void EncabezadoRegistroPorFecha(Document doc, String Fecha) throws DocumentException, BadElementException, IOException {
      
       // Crear un párrafo para el encabezado
       Paragraph encabezado = new Paragraph();
       Image img = Image.getInstance(getClass().getResource("/Img/logo.png"));
       // Configurar fuente y estilo para el encabezado
       Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
      
       // Agregar información al encabezado con estilo negrita
       encabezado.setFont(fuenteNegrita);
       encabezado.add(img);
       encabezado.add(new Chunk(Fecha+"\n\n"));
      
      
       
       encabezado.setAlignment(Element.ALIGN_CENTER);
       doc.add(encabezado);
       
       // Agregar la tabla del encabezado al documento
       // Mensaje de depuración
       System.out.println("Encabezado agregado correctamente.");
}
    

public void agregarTablaPdf(Document doc, JTable tabla) {
    try {
        // Crear una tabla en el documento PDF
        PdfPTable pdfTabla = new PdfPTable(tabla.getColumnCount() -2);
        pdfTabla.setWidthPercentage(110);
        // Crear un objeto Font para controlar el tamaño de la fuente
       Font fuenteAzul = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD, BaseColor.BLUE);
        Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD, BaseColor.BLACK);
        
        // Agregar las cabeceras de la tabla con fuente más pequeña, excluyendo la primera y la cuarta columna
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            if (i != 0 && i != 3) { // Excluir la primera y la cuarta columna
                PdfPCell cell = new PdfPCell(new Phrase(tabla.getColumnName(i), fuenteAzul)); // Usar el objeto Font
                cell.setHorizontalAlignment(Element.ALIGN_CENTER); // Alinear el contenido al centro de la celda
                pdfTabla.addCell(cell);
            }
        }
        
        // Agregar los datos de la tabla al documento PDF con fuente más pequeña, excluyendo la primera y la cuarta columna
        for (int fila = 0; fila < tabla.getRowCount(); fila++) {
            for (int columna = 0; columna < tabla.getColumnCount(); columna++) {
                if (columna != 0 && columna != 3) { // Excluir la primera y la cuarta columna
                    PdfPCell cell = new PdfPCell(new Phrase(tabla.getValueAt(fila, columna).toString(),fuenteNegrita)); // Usar el objeto Font
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER); // Alinear el contenido al centro de la celda
                    pdfTabla.addCell(cell);
                }
            }
        }
        
        // Agregar la tabla al documento
        doc.add(pdfTabla);
        
    } catch (DocumentException e) {
        System.out.println("Error al agregar la tabla al documento PDF: " + e);
    }
}

private void agregarTotales(Document doc,String Venta, String PagoCliente,String PagoProveedor,String Gastos,String Inversion) throws DocumentException {
    try {
        // Crear un párrafo para el total de la venta
        Paragraph totalVenta= new Paragraph();
        Paragraph totalPagoCliente = new Paragraph();
        Paragraph totalPagoProveedor = new Paragraph();
        Paragraph totalGastos= new Paragraph();
        Paragraph totalInversion = new Paragraph();
        
        // Configurar fuente y estilo para el total de la venta
        
        Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD, BaseColor.BLUE);
        
        // Agregar información del total de la venta al párrafo
        totalVenta.setFont(fuenteNegrita);
        totalPagoCliente.setFont(fuenteNegrita);
        totalPagoProveedor.setFont(fuenteNegrita);
        totalGastos.setFont(fuenteNegrita);
        totalInversion.setFont(fuenteNegrita);
        totalVenta.add("Total Venta: " + Venta );
        totalPagoCliente.add("Total Pago Clientes: " + PagoCliente );
        totalPagoProveedor.add("Total Pago Proveedores: " + PagoProveedor);
        totalGastos.add("Total Gastos: " + Gastos);
        totalInversion.add("Total Inversion: " + Inversion);
        
        totalVenta.setAlignment(Element.ALIGN_CENTER);
        totalPagoCliente.setAlignment(Element.ALIGN_CENTER);
        totalPagoProveedor.setAlignment(Element.ALIGN_CENTER);
        totalGastos.setAlignment(Element.ALIGN_CENTER);
       totalInversion.setAlignment(Element.ALIGN_CENTER);
        
        // Agregar el párrafo del total de la venta al documento
    
        doc.add(totalVenta);
        doc.add(totalPagoCliente);
        doc.add(totalPagoProveedor);
        doc.add(totalGastos);
        doc.add(totalInversion);
    } catch (DocumentException e) {
        System.out.println("Error al agregar el total de la venta al documento PDF: " + e);
    }
}

     
      
}
