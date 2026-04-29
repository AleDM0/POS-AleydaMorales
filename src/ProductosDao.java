package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class ProductosDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarProductos(Productos pro) {
        String sql = "INSERT INTO productos (codigo, nombre, idprov, stock, precio, preciov, ieps) VALUES (?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setInt(3, pro.getIdprov());
            ps.setInt(4, pro.getStock());
            ps.setDouble(5, pro.getPrecio());
            ps.setDouble(6, pro.getPreciov());
            ps.setInt(7, pro.getIeps());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public void ConsultarProveedor(JComboBox proveedor) {
        String sql = "SELECT nombre FROM proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                proveedor.addItem(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }

    public List ListarProductos() {
        List<Productos> Listapro = new ArrayList();
        String sql = "SELECT *FROM productos";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Productos pro = new Productos();
                pro.setIdpd(rs.getInt("idpd"));
                pro.setCodigo(rs.getInt("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setIdprov(rs.getInt("idprov"));
                pro.setStock(rs.getInt("stock"));
                pro.setPrecio(rs.getDouble("precio"));
                 pro.setPreciov(rs.getDouble("preciov"));
                 pro.setIeps(rs.getInt("ieps"));
                Listapro.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapro;
    }
    

    public boolean EliminarProductos(int idpd){
       String sql = "DELETE FROM productos WHERE idpd = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, idpd);
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
   
    public boolean ModificarProductos(Productos pro){
       String sql = "UPDATE productos SET codigo=?, nombre=?, idprov=?, stock=?, precio=?,  preciov=?, ieps=? WHERE idpd=?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, pro.getCodigo());
           ps.setString(2, pro.getNombre());
           ps.setInt(3, pro.getIdprov());
           ps.setInt(4, pro.getStock());
           ps.setDouble(5, pro.getPrecio());
           ps.setDouble(6, pro.getPreciov());
           ps.setInt(7, pro.getIeps());
           ps.setInt(8, pro.getIdpd());
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
      
    public Productos BuscarPro(String cod){
        Productos producto = new Productos();
        String sql = "SELECT * FROM productos WHERE codigo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
                //producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("preciov"));
                producto.setStock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
    }
    
    public Config BuscarDatos(){
        Config conf = new Config();
        String sql = "SELECT * FROM config";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                conf.setIdconf(rs.getInt("idconf"));
                conf.setNombre(rs.getString("nombre"));
                conf.setRFC(rs.getString("RFC"));
                conf.setTelefono(rs.getInt("telefono"));
                conf.setLocalidad(rs.getString("localidad"));
                conf.setNcalle(rs.getInt("ncalle"));
                conf.setNomcalle(rs.getString("nomcalle"));
                conf.setTelefono(rs.getInt("cp"));
                conf.setColonia(rs.getString("colonia"));
                conf.setRegimenfiscal(rs.getString("regimenfiscal"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return conf;
    }

    
    
    /*
    public Productos BuscarId(int id){
        Productos pro = new Productos();
        String sql = "SELECT pr.id AS id_proveedor, pr.nombre AS nombre_proveedor, p.* FROM proveedor pr INNER JOIN productos p ON p.proveedor = pr.id WHERE p.id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pro.setId(rs.getInt("id"));
                pro.setCodigo(rs.getString("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setProveedor(rs.getInt("proveedor"));
                pro.setProveedorPro(rs.getString("nombre_proveedor"));
                pro.setStock(rs.getInt("stock"));
                pro.setPrecio(rs.getDouble("precio"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pro;
    }
    public Proveedor BuscarProveedor(String nombre){
        Proveedor pr = new Proveedor();
        String sql = "SELECT * FROM proveedor WHERE nombre = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            if (rs.next()) {
                pr.setId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pr;
    }
    
     */
    public boolean ModificarDatos(Config conf){
       String sql = "UPDATE config SET  nombre=?,RFC=?, telefono=?, localidad=?, ncalle=?, nomcalle=?, cp=?,  colonia=?,regimenfiscal=? WHERE idconf=?";
       try {
           ps = con.prepareStatement(sql);
           ps.setString(1, conf.getNombre());
           ps.setString(2, conf.getRFC());
           ps.setInt(3, conf.getTelefono());
           ps.setString(4, conf.getLocalidad());
           ps.setInt(5, conf.getNcalle());
           ps.setString(6, conf.getNomcalle());
           ps.setInt(7, conf.getCp());
           ps.setString(8, conf.getColonia());
           ps.setString(9, conf.getRegimenfiscal());
           ps.setInt(10, conf.getIdconf());
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


