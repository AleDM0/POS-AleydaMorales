
package Modelo;

public class login {
    private int Idu;
    private String Nombre;
    private String username;
    private String Pass;

    public login() {
 
    }

    public login(int Idu, String Nombre, String username, String Pass) {
        this.Idu = Idu;
        this.Nombre = Nombre;
        this.username = username;
        this.Pass = Pass;
    }

    public int getIdu() {
        return Idu;
    }

    public void setIdu(int Idu) {
        this.Idu = Idu;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
}