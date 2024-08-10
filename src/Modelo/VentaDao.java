
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
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.filechooser.FileSystemView;

public class VentaDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int IdVenta(){
        int id = 0;
        String sql = "SELECT MAX(id) FROM ventas";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id;
    }
    
    public int RegistrarVenta(Venta v){
        String sql = "INSERT INTO ventas (cliente, vendedor, total, fecha) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, v.getCliente());
            ps.setString(2, v.getVendedor());
            ps.setDouble(3, v.getTotal());
            ps.setString(4, v.getFecha());
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
        return r;
    }
    
     public boolean ActualizarCantVenta(double CantVenta, int id) {
     String sqlSelect = "SELECT CantVenta FROM productos WHERE id = ?";
     String sqlUpdate = "UPDATE productos SET CantVenta = ? WHERE id = ?";
     try {
        con = cn.getConnection();
        
        // Obtener la cantidad actual de stock del producto
        ps = con.prepareStatement(sqlSelect);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        
        double CantVentaActual = 0.0;
        if (rs.next()) {
           CantVentaActual = rs.getDouble("CantVenta");
        }
        
        // Sumar la cantidad nueva a la cantidad anterior
        double nuevaCantVenta = CantVentaActual + CantVenta;
        
        // Actualizar el stock en la base de datos
        ps = con.prepareStatement(sqlUpdate);
        ps.setDouble(1,  nuevaCantVenta);
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
     public boolean ActualizarCantVentaCuentas(double CantVentaKg, String codigo) {
     String sqlSelect = "SELECT CantVentaKg,PrecioCompra$,PrecioVenta$,merma$,Merma FROM cuentas WHERE codigo$ = ?";
     String sqlUpdate = "UPDATE cuentas SET CantVentaKg = ?, PagoProvee = ?, CantVenta$ = ?,Ganancia$ =? WHERE codigo$ = ?";
     try {
        con = cn.getConnection();
        
        // Obtener la cantidad actual de stock del producto
        ps = con.prepareStatement(sqlSelect);
        ps.setString(1, codigo);
        rs = ps.executeQuery();
        
        double CantVentaActual = 0.0;
        double PrecioC = 0.0;
        double PrecioV = 0.0;
        double CantMer = 0.0;
        double merma = 0.0;
        if (rs.next()) {
            CantVentaActual = rs.getDouble("CantVentaKg");
            PrecioC = rs.getDouble("PrecioCompra$");
            PrecioV = rs.getDouble("PrecioVenta$");
            CantMer= rs.getDouble("merma$");
            merma= rs.getDouble("Merma");
           
        }
        
        // Sumar la cantidad nueva a la cantidad anterior
        double nuevaCantVenta = CantVentaActual + CantVentaKg;
        double PagoProvee =(nuevaCantVenta + merma) * PrecioC;
        double TotalVenta =PrecioV *  nuevaCantVenta ;
        double Ganancia =(PrecioV - PrecioC) * nuevaCantVenta ;
        double TotalGanancia = Ganancia - CantMer; 
        
        // Actualizar el stock en la base de datos
        ps = con.prepareStatement(sqlUpdate);
        ps.setDouble(1,  nuevaCantVenta);
        ps.setDouble(2,  PagoProvee);
        ps.setDouble(3,  TotalVenta);
        ps.setDouble(4,  TotalGanancia);
        ps.setString(5, codigo);
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
     
   public boolean ActualizarStockVenta(double Stock,double CantVenta, int id) {
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
        double nuevoStock = StockActual - CantVenta ;
      
        
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
  
    public Venta BuscarVenta(int id){
        Venta cl = new Venta();
        String sql = "SELECT * FROM ventas WHERE id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                cl.setId(rs.getInt("id"));
                cl.setCliente(rs.getInt("cliente"));
                cl.setTotal(rs.getDouble("total"));
                cl.setVendedor(rs.getString("vendedor"));
                cl.setFecha(rs.getString("fecha"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cl;
    }
     public void ReciboCreditoClientePDF(String cliente, double credito,double subCredito,String tipoVenta,JTable tabla) {
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
       
        EncabezadoReciboCreditoCliente(doc, tipoVenta);
        DatosReciboPagoCliente(doc, cliente);
        agregarTablaPdf(doc,tabla);
        agregartotalCredito(doc, credito,subCredito);
        
       
        
        
       
        
        // Cerrar el documento
        doc.close();
        
        // Abrir el archivo PDF generado
        Desktop.getDesktop().open(archivoPDF);
    } catch (DocumentException | IOException e) {
        System.out.println("Error al generar el documento PDF: " + e);
    }
     }
 
    private void EncabezadoReciboCreditoCliente(Document doc, String tipoVenta) throws DocumentException, BadElementException, IOException {
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
       encabezado.add(new Chunk("Venta" + "\n", fuenteNegrita ));
       encabezado.add(tipoVenta +"\n");
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
private void agregartotalCredito(Document doc,double credito,double subCredito) throws DocumentException {
    try {
        // Crear un párrafo para el total de la venta
        Paragraph totalCredito = new Paragraph();
        DottedLineSeparator dottedLine = new DottedLineSeparator();
        dottedLine.setPercentage(40);
        dottedLine.setLineWidth(2);
        
        // Configurar fuente y estilo para el total de la venta
        
        Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.BLACK);
        
        // Agregar información del total de la venta al párrafo
        totalCredito.setFont(fuenteNegrita);
        totalCredito.add("Sub-Total: " + subCredito +"\n\n");
        totalCredito.add("Recargo por Credito : 10%"+"\n\n");
        totalCredito.add("Total: " + credito + "\n\n\n\n");
        totalCredito.add(new Chunk(dottedLine));
        totalCredito.add(Chunk.NEWLINE);
        totalCredito.add("Firma "+ "\n\n\n\n");
        totalCredito.add("FECHA MAXIMA DE PAGO,LUNES DE LA SIGUIENTE SEMANA");
      
        
        // Agregar el párrafo del total de la venta al documento
        
        totalCredito.setAlignment(Element.ALIGN_CENTER);
        doc.add(totalCredito);
    } catch (DocumentException e) {
        System.out.println("Error al agregar el total de la venta al documento PDF: " + e);
    }
}

public void agregarTablaPdf(Document doc, JTable tabla) {
    try {
        // Crear una tabla en el documento PDF
        PdfPTable pdfTabla = new PdfPTable(tabla.getColumnCount() - 4);
        pdfTabla.setWidthPercentage(110);
        
        // Crear un objeto Font para controlar el tamaño de la fuente
        Font fuenteAzul = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
        Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
        
        // Formatear los valores numéricos para mostrar solo dos decimales
        DecimalFormat df = new DecimalFormat("#.##");
        
        // Agregar las cabeceras de la tabla con fuente más pequeña, excluyendo la primera y la cuarta columna
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            if (i != 0 && i != 1 && i != 5 &&i != 7 ) {
                PdfPCell cell = new PdfPCell(new Phrase(tabla.getColumnName(i), fuenteAzul));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                pdfTabla.addCell(cell);
            }
        }
        
        // Agregar los datos de la tabla al documento PDF con fuente más pequeña, excluyendo la primera y la cuarta columna
        for (int fila = 0; fila < tabla.getRowCount(); fila++) {
            for (int columna = 0; columna < tabla.getColumnCount(); columna++) {
                if (columna != 0 && columna != 1 && columna != 5 && columna != 7 ) {
                    Object valor = tabla.getValueAt(fila, columna);
                    String valorFormateado = valor instanceof Number ? df.format(valor) : valor.toString();
                    PdfPCell cell = new PdfPCell(new Phrase(valorFormateado, fuenteNegrita));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
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


}


