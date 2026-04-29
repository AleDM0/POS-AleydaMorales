
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//VIDEO12

public class ProveedorDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public boolean RegistrarProveedor(Proveedor pr){
        String sql = "INSERT INTO proveedor(claveproveedor, nombrep, telefono, direccion, razon) VALUES (?,?,?,?,?)";
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, pr.getClaveproveedor());
           ps.setString(2, pr.getNombrep());
           ps.setInt(3, pr.getTelefono());
           ps.setString(4, pr.getDireccion());
           ps.setString(5, pr.getRazon());
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
   
    public List ListarProveedor(){
        List<Proveedor> Listapr = new ArrayList();
        String sql = "SELECT * FROM proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Proveedor pr = new Proveedor();
                pr.setIdp(rs.getInt("idp"));
                pr.setClaveproveedor(rs.getInt("claveproveedor"));
                pr.setNombrep(rs.getString("nombrep"));
                pr.setTelefono(rs.getInt("telefono"));
                pr.setDireccion(rs.getString("direccion"));
                pr.setRazon(rs.getString("razon"));
                
                Listapr.add(pr);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapr;
    }
    
    public boolean EliminarProveedor(int id){
        String sql = "DELETE FROM proveedor WHERE id = ? ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
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
     
    public boolean ModificarProveedor(Proveedor pr){
        String sql = "UPDATE proveedor SET claveproveedor=?, nombre=?, telefono=?, direccion=? , razon=? WHERE idp=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pr.getClaveproveedor());
            ps.setString(2, pr.getNombrep());
            ps.setInt(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setString(5,pr.getRazon());
            ps.setInt(6, pr.getIdp());
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
