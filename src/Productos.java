package Modelo;

public class Productos {
    private int idpd;
    private int codigo;
    private String nombre;
    private int idprov;
    private int stock;
    private double precio;
    private double preciov;
    private int ieps;
    
    public Productos(){
        
    }

    public Productos(int idpd, int codigo, String nombre, int idprov, int stock, double precio, double preciov, int ieps) {
        this.idpd = idpd;
        this.codigo = codigo;
        this.nombre = nombre;
        this.idprov = idprov;
        this.stock = stock;
        this.precio = precio;
        this.preciov = preciov;
        this.ieps = ieps;
    }

    public int getIdpd() {
        return idpd;
    }

    public void setIdpd(int idpd) {
        this.idpd = idpd;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdprov() {
        return idprov;
    }

    public void setIdprov(int idprov) {
        this.idprov = idprov;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPreciov() {
        return preciov;
    }

    public void setPreciov(double preciov) {
        this.preciov = preciov;
    }

    public int getIeps() {
        return ieps;
    }

    public void setIeps(int ieps) {
        this.ieps = ieps;
    }


    }
    