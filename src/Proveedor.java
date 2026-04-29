
package Modelo;

public class Proveedor {
    private int idp;
    private int claveproveedor;
    private String nombrep;
    private int telefono;
    private String direccion;
    private String razon;

    public Proveedor() {
    }

    public Proveedor(int idp, int claveproveedor, String nombrep, int telefono, String direccion, String razon) {
        this.idp = idp;
        this.claveproveedor = claveproveedor;
        this.nombrep = nombrep;
        this.telefono = telefono;
        this.direccion = direccion;
        this.razon = razon;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public int getClaveproveedor() {
        return claveproveedor;
    }

    public void setClaveproveedor(int claveproveedor) {
        this.claveproveedor = claveproveedor;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    
    

}