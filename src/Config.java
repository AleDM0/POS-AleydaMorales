
package Modelo;

public class Config {
    private int idconf;
    private String nombre;
    private String RFC;
    private int telefono;
    private String localidad;
    private int ncalle;
    private String nomcalle;
    private int cp;
    private String colonia;
    private String regimenfiscal;
    
    public Config(){
        
    }

    public Config(int idconf, String nombre, String RFC, int telefono, String localidad, int ncalle, String nomcalle, int cp, String colonia, String regimenfiscal) {
        this.idconf = idconf;
        this.nombre = nombre;
        this.RFC = RFC;
        this.telefono = telefono;
        this.localidad = localidad;
        this.ncalle = ncalle;
        this.nomcalle = nomcalle;
        this.cp = cp;
        this.colonia = colonia;
        this.regimenfiscal = regimenfiscal;
    }

    public int getIdconf() {
        return idconf;
    }

    public void setIdconf(int idconf) {
        this.idconf = idconf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getNcalle() {
        return ncalle;
    }

    public void setNcalle(int ncalle) {
        this.ncalle = ncalle;
    }

    public String getNomcalle() {
        return nomcalle;
    }

    public void setNomcalle(String nomcalle) {
        this.nomcalle = nomcalle;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getRegimenfiscal() {
        return regimenfiscal;
    }

    public void setRegimenfiscal(String regimenfiscal) {
        this.regimenfiscal = regimenfiscal;
    }

    
}
