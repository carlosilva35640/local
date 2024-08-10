package Modelo;



public class Proveedor {
    private int id;
    private String fecha;
    private String nombre;
    private double pagos;
    private double deuda;
    private String factura;
    
    public Proveedor(){
        
    }

    public Proveedor(int id, String fecha, String nombre, double pagos, double deuda,String factura) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.pagos = pagos;
        this.deuda = deuda;
        this.factura = factura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPagos() {
        return pagos;
    }

    public void setPagos(double pagos) {
        this.pagos = pagos;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

}
