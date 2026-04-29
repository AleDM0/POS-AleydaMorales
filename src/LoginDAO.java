package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    //correo = USUARIO
    public login log(String nombre, String pass) {
        login l = new login();
        String sql = "SELECT * FROM usuarios WHERE Nombre = ? AND Pass = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                l.setIdu(rs.getInt("Idu"));
                l.setNombre(rs.getString("Nombre"));
                l.setUsername(rs.getString("username"));
                l.setPass(rs.getString("Pass"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return l;
    }

    public boolean Registrar(login reg) {
        String sql = "INSERT INTO usuarios (nombre, username, pass,rol) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getNombre());
            ps.setString(2, reg.getUsername());
            ps.setString(3, reg.getPass());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public List ListarUsuarios() {
        List<login> Lista = new ArrayList();
        String sql = "SELECT * FROM usuarios";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                login lg = new login();
                lg.setIdu(rs.getInt("Idu"));
                lg.setNombre(rs.getString("Nombre"));
                lg.setUsername(rs.getString("username"));
                lg.setPass(rs.getString("Pass"));
                Lista.add(lg);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Lista;
    }
    public boolean EliminarUsuario(int Idu){
       String sql = "DELETE FROM usuarios WHERE Idu = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, Idu);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
   }
    
    public boolean ModificarUsuarios(login user){
       String sql = "UPDATE usuarios SET Nombre=?, username=?, Pass=?,WHERE Idu=?";
       try {
           ps = con.prepareStatement(sql);
           ps.setString(2, user.getNombre());
           ps.setString(3, user.getUsername());
           ps.setString(4, user.getPass());
           ps.setInt(6, user.getIdu());
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
}
