
package Modelo;


public class Productos {
    private int id;
    private String Producto;
    private String codigo;
    private String fecha;
    private String factura;
    private String Proveedor;
    private double CantCompra;
    private double CantidadFactura;
    private double CantVenta;
    private double Merma;
    private double PrecioCompra;
    private double PrecioVenta;
    private double Stock;
    private double total;
   
    
                              
    public Productos(){
        
    }
    public Productos(int id, String Producto,String Proveedor,String factura,String fecha, String codigo, Double CantVenta, Double CantCompra,Double Merma, Double PrecioVenta, Double PrecioCompra,Double Stock, Double CantidadFactura,Double total) {
        this.id = id;
        this.Producto = Producto;
        this.codigo = codigo;
        this.CantVenta = CantVenta;
        this.CantCompra = CantCompra;
        this.Merma = Merma;
        this.PrecioVenta = PrecioVenta;
        this.PrecioCompra = PrecioCompra;
        this.Stock = Stock;
        this.fecha = fecha;
        this.factura = factura;
        this.Proveedor = Proveedor;
        this.total = total;
        this.CantidadFactura = CantidadFactura;
    }

    public double getCantidadFactura() {
        return CantidadFactura;
    }

    public void setCantidadFactura(double CantidadFactura) {
        this.CantidadFactura = CantidadFactura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getCantVenta() {
        return CantVenta;
    }

    public void setCantVenta(Double CantVenta) {
        this.CantVenta = CantVenta;
    }

    public Double getCantCompra() {
        return CantCompra;
    }

    public void setCantCompra(Double CantCompra) {
        this.CantCompra = CantCompra;
    }

    public Double getMerma() {
        return Merma;
    }

    public void setMerma(Double Merma) {
        this.Merma = Merma;
    }

    public Double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(Double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public Double getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(Double PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public Double getStock() {
        return Stock;
    }

    public void setStock(Double Stock) {
        this.Stock = Stock;
    }
      public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }
     public double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

   
}