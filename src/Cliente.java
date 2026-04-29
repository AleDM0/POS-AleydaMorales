package Modelo;

/**@author Aleyda*/
public class Cliente {
    private int idc;
    private int clavecliente;
    private String nombre;
    private String apellidom;
    private String apellidop;
    private String sexo;
    private String email;
    private int edad;          // podrías usar int si quieres manejar edad como número
    private int telefono;
    private String localidad;
    private int ncalle;
    private String nomcalle;
    private int cp;
    private String colonia;
    private String RFC;
    private String regimenfiscal;
    private String usoCFDI;

    public Cliente() {
    }

    public Cliente(int idc, int clavecliente, String nombre, String apellidom, String apellidop, String sexo, String email, int edad, int telefono, String localidad, int ncalle, String nomcalle, int cp, String colonia, String RFC, String regimenfiscal, String usoCFDI) {
        this.idc = idc;
        this.clavecliente = clavecliente;
        this.nombre = nombre;
        this.apellidom = apellidom;
        this.apellidop = apellidop;
        this.sexo = sexo;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
        this.localidad = localidad;
        this.ncalle = ncalle;
        this.nomcalle = nomcalle;
        this.cp = cp;
        this.colonia = colonia;
        this.RFC = RFC;
        this.regimenfiscal = regimenfiscal;
        this.usoCFDI = usoCFDI;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public int getClavecliente() {
        return clavecliente;
    }

    public void setClavecliente(int clavecliente) {
        this.clavecliente = clavecliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getRegimenfiscal() {
        return regimenfiscal;
    }

    public void setRegimenfiscal(String regimenfiscal) {
        this.regimenfiscal = regimenfiscal;
    }

    public String getUsoCFDI() {
        return usoCFDI;
    }

    public void setUsoCFDI(String usoCFDI) {
        this.usoCFDI = usoCFDI;
    }
    
    
}