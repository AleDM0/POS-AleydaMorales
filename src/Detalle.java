
package Modelo;

public class Detalle {
    private int idd;
    private int idpd;
    private int cantidad;
    private double precio;
    private int idventa;
    private int ieps;
    private String metodopago;
    
    
    public Detalle(){
        
    }

    public Detalle(int idd, int idpd, int cantidad, double precio, int idventa, int ieps, String metodopago) {
        this.idd = idd;
        this.idpd = idpd;
        this.cantidad = cantidad;
        this.precio = precio;
        this.idventa = idventa;
        this.ieps = ieps;
        this.metodopago = metodopago;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getIdpd() {
        return idpd;
    }

    public void setIdpd(int idpd) {
        this.idpd = idpd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIeps() {
        return ieps;
    }

    public void setIeps(int ieps) {
        this.ieps = ieps;
    }

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    public void setIdpd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}