package expresseatapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BDempleado {
    private Connection conn;
    
    public BDempleado(Connection conn) {
        this.conn = conn;
    }
    
    
     //---mostrar info de empleado
    public empleado getEmpleado(int IDemp) {
        String sql = "SELECT * FROM empleados WHERE empleado_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, IDemp);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new empleado(
                        rs.getInt("empleado_id"), 
                        rs.getInt("id_usuario"), 
                        rs.getString("nombre"), 
                        rs.getString("apellido")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public usuario getUsuario(int IDusu) {
        String sql = "SELECT * FROM usuarios WHERE usuario_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, IDusu);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new usuario(
                        rs.getInt("usuario_id"), 
                        rs.getString("usuario"), 
                        rs.getString("contraseña"), 
                        rs.getBoolean("admin")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    //imprimir empleados
    public List<empleado> getEmps() {
        List<empleado> EMPS = new ArrayList<>();
        String sql = "SELECT * FROM empleados ORDER BY empleado_id ASC";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                empleado emps = new empleado(
                        rs.getInt("empleado_id"),
                        rs.getInt("id_usuario"),
                        rs.getString("nombre"),
                        rs.getString("apellido")
                );
                EMPS.add(emps);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return EMPS;
    }
    
    //eliminar empleado
    
    public boolean eliminarEmp (int id){
        String sql = "DELETE FROM empleados WHERE empleado_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean eliminarUsu (int id){
        String sql = "DELETE FROM usuarios WHERE usuario_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    //crear nuevo empleado
    
    
    public boolean crearUsu (usuario nu){
        String sql = "INSERT INTO usuarios (usuario, contraseña, admin) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nu.getUsuario());
            pstmt.setString(2, nu.getContra());
            pstmt.setBoolean(3, nu.getAdmin());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //         obtiene ultimo usuario para agrgarlo al empleado
    
    public int getUltUsuario(){
        String sql = "SELECT usuario_id FROM usuarios ORDER BY usuario_id DESC LIMIT 1";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("usuario_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    
    
    public boolean crearEmp (empleado nEmp){
        String sql = "INSERT INTO empleados (id_usuario, nombre, apellido) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, nEmp.getUsu());
            pstmt.setString(2, nEmp.getNom());
            pstmt.setString(3, nEmp.getApe());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    //editar empleado
    public boolean editarEmp(empleado eEmp){
        String sql = "UPDATE empleados SET nombre = ?, apellido = ? WHERE empleado_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, eEmp.getNom());
            pstmt.setString(2, eEmp.getApe());
            pstmt.setInt(3, eEmp.getID());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    //editar usuario
    public boolean editarUsu(usuario eUsu){
        String sql = "UPDATE usuarios SET usuario = ?, contraseña = ?, admin = ? WHERE usuario_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, eUsu.getUsuario());
            pstmt.setString(2, eUsu.getContra());
            pstmt.setBoolean(3, eUsu.getAdmin());
            pstmt.setInt(4, eUsu.getUsuarioID());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    

    
    
    
    
}
