
package Modelo;

public class Cuentas {
    private int id;
    private String Producto$;
    private String codigo$;
    private String Proveedor;    
    private double CantVentaKg;
    private double CantVenta$;
    private double Merma;
    private double Merma$;
    private double PrecioCompra$;
    private double PrecioVenta$;
    private double Ganancia$;      
    private double PagoProvee; 
   

 public Cuentas(){
        
    }
    public Cuentas(int id, String Producto$, String codigo$,String Proveedor, Double CantVentaKg, Double PagoProvee, Double CantVenta$, Double Merma$, Double Merma, Double PrecioVenta$, Double PrecioCompra$,Double Ganancia$) {
        this.id = id;
        this.Producto$ = Producto$;
        this.codigo$ = codigo$;
        this.CantVenta$ = CantVenta$;
        this.CantVentaKg = CantVentaKg;
        this.Merma = Merma;
        this.Merma$ = Merma$;
        this.PrecioVenta$ = PrecioVenta$;
        this.PrecioCompra$ = PrecioCompra$;
        this.PagoProvee = PagoProvee;
        this.Ganancia$ = Ganancia$;
         this.Proveedor = Proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto$() {
        return Producto$;
    }

    public void setProducto$(String Producto$) {
        this.Producto$ = Producto$;
    }

    public String getCodigo$() {
        return codigo$;
    }

    public void setCodigo$(String codigo$) {
        this.codigo$ = codigo$;
    }

    public double getCantVentaKg() {
        return CantVentaKg;
    }

    public void setCantVentaKg(double CantVentaKg) {
        this.CantVentaKg = CantVentaKg;
    }

    public double getCantVenta$() {
        return CantVenta$;
    }

    public void setCantVenta$(double CantVenta$) {
        this.CantVenta$ = CantVenta$;
    }

    public double getMerma$() {
        return Merma$;
    }

    public void setMerma$(double Merma$) {
        this.Merma$ = Merma$;
    }
    
    public double getMerma() {
        return Merma;
    }

    public void setMerma(double Merma) {
        this.Merma = Merma;
    }

    public double getPrecioCompra$() {
        return PrecioCompra$;
    }

    public void setPrecioCompra$(double PrecioCompra$) {
        this.PrecioCompra$ = PrecioCompra$;
    }

    public double getPrecioVenta$() {
        return PrecioVenta$;
    }

    public void setPrecioVenta$(double PrecioVenta$) {
        this.PrecioVenta$ = PrecioVenta$;
    }

    public double getGanancia$() {
        return Ganancia$;
    }

    public void setGanancia$(double Ganancia$) {
        this.Ganancia$ = Ganancia$;
    }
    
     public double getPagoProvee() {
        return PagoProvee;
    }

    public void setPagoProvee(double PagoProvee) {
        this.PagoProvee = PagoProvee;
    }
    
    
     public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }


   
}
