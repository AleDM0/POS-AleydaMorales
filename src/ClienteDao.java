/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ClienteDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarCliente(Cliente cl) {//6
        String sql = "INSERT INTO clientes (clavecliente, nombre,apellidom,apellidop,sexo,email,edad,telefono,localidad,"
   + "ncalle,nomcalle,cp,colonia,RFC,regimenfiscalusoCFDI) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cl.getClavecliente());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getApellidom());       
            ps.setString(4, cl.getApellidop());       
            ps.setString(5, cl.getSexo());            
            ps.setString(6, cl.getEmail());           
            ps.setInt(7, cl.getEdad());                
            ps.setInt(8, cl.getTelefono());            
            ps.setString(9, cl.getLocalidad());       
            ps.setInt(10, cl.getNcalle());             
            ps.setString(11, cl.getNomcalle());       
            ps.setInt(12, cl.getCp());                
            ps.setString(13, cl.getColonia());        
            ps.setString(14, cl.getRFC());            
            ps.setString(15, cl.getRegimenfiscal());  
            ps.setString(16, cl.getUsoCFDI()); 
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public List ListarCliente() {
        List<Cliente> ListaCl = new ArrayList();
        String sql = "SELECT * FROM clientes";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cl = new Cliente();
                cl.setIdc(rs.getInt("idc"));
                cl.setClavecliente(rs.getInt("clavecliente"));
                cl.setNombre(rs.getString("nombre"));
                cl.setApellidom(rs.getString("apellidom"));
                cl.setApellidop(rs.getString("apellidop"));
                cl.setSexo(rs.getString("sexo"));
                cl.setEmail(rs.getString("email"));
                cl.setEdad(rs.getInt("edad"));          
                cl.setTelefono(rs.getInt("telefono"));
                cl.setLocalidad(rs.getString("localidad"));
                cl.setNcalle(rs.getInt("ncalle"));
                cl.setNomcalle(rs.getString("nomcalle"));
                cl.setCp(rs.getInt("cp"));
                cl.setColonia(rs.getString("colonia"));
                cl.setRFC(rs.getString("RFC"));
                cl.setRegimenfiscal(rs.getString("regimenfiscal"));
                cl.setUsoCFDI(rs.getString("usoCFDI"));
                ListaCl.add(cl);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaCl;
    }

    public boolean EliminarCliente(int idc) {
        String sql = "DELETE FROM clientes WHERE idc = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idc);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public boolean ModificarCliente(Cliente cl) {
        String sql = "UPDATE clientes SET clavecliente=?, nombre=?,apellidom=?,apellidop=?,sexo=?,"
    + "email=?,edad=?,telefono=?,localidad=?,ncalle=?,nomcalle=?,cp=?,colonia=?,RFC=?,regimenfiscal=?,usoCFDI=? WHERE idc=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cl.getClavecliente());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getApellidom());
            ps.setString(4, cl.getApellidop());
            ps.setString(5, cl.getSexo());
            ps.setString(6, cl.getEmail());
            ps.setInt(7, cl.getEdad());          
            ps.setInt(8, cl.getTelefono());
            ps.setString(9, cl.getLocalidad());
            ps.setInt(10, cl.getNcalle());
            ps.setString(11, cl.getNomcalle());
            ps.setInt(12, cl.getCp());
            ps.setString(13, cl.getColonia());
            ps.setString(14, cl.getRFC());
            ps.setString(15, cl.getRegimenfiscal());
            ps.setString(16, cl.getUsoCFDI());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
   public Cliente Buscarcliente(int clavecliente){
       Cliente cl = new Cliente();
       String sql = "SELECT * FROM clientes WHERE clavecliente = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, clavecliente);
           rs = ps.executeQuery();
           if (rs.next()) {
                cl.setClavecliente(rs.getInt("clavecliente"));
                cl.setNombre(rs.getString("nombre"));
                cl.setApellidom(rs.getString("apellidom"));
                cl.setApellidop(rs.getString("apellidop"));
                cl.setSexo(rs.getString("sexo"));
                cl.setEmail(rs.getString("email"));
                cl.setEdad(rs.getInt("edad"));          
                cl.setTelefono(rs.getInt("telefono"));
                cl.setLocalidad(rs.getString("localidad"));
                cl.setNcalle(rs.getInt("ncalle"));
                cl.setNomcalle(rs.getString("nomcalle"));
                cl.setCp(rs.getInt("cp"));
                cl.setColonia(rs.getString("colonia"));
                cl.setRFC(rs.getString("RFC"));
                cl.setRegimenfiscal(rs.getString("regimenfiscal"));
                cl.setUsoCFDI(rs.getString("usoCFDI"));
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return cl;
   }

}
