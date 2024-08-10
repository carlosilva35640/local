
package Modelo;

public class Registro {
    private int id;
    private String descripcion;
    private String fecha;
    private double cantidad;
    private double totalBs;
    private double totalPunto;
    private double total$;
    private double gasto;
    private double pagoProvee;
    private double pagoCliente;
     private double Inversion;
  
  
     
    
    public Registro(){
        
    }

    public Registro(int id, String descripcion, String fecha, double cantidad, double Inversion, double totalBs, double totalPunto, double total$, double gasto, double pagoProvee, double pagoCliente) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.totalBs = totalBs;
        this. totalPunto =  totalPunto;
        this.total$ =  total$;
        this.gasto =  gasto;
        this.pagoProvee =  pagoProvee;
        this.pagoCliente =  pagoCliente;
        this.Inversion =  Inversion;
      
       
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalBs() {
        return totalBs;
    }

    public void setTotalBs(double totalBs) {
        this.totalBs = totalBs;
    }

    public double getTotalPunto() {
        return  totalPunto;
    }

    public void setTotalPunto(double totalPunto) {
        this. totalPunto =  totalPunto;
        
    }
     public double getTotal$() {
        return  total$;
    }

    public void setTotal$(double total$) {
        this. total$ =  total$;
    }
     public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }
     public double getPagoProvee() {
        return pagoProvee;
    }

    public void setPagoProvee(double pagoProvee) {
        this.pagoProvee = pagoProvee;
    }
     public double getPagoCliente() {
        return pagoCliente;
    }

    public void setPagoCliente(double pagoCliente) {
        this.pagoCliente = pagoCliente;
    }

      public double getInversion() {
        return Inversion;
    }

    public void setInversion(double Inversion) {
        this.Inversion = Inversion;
    }

}
