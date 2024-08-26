package expresseatapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class BDordenes {
    private Connection conn;
    
    public BDordenes(Connection conn) {
        this.conn = conn;
    }
    
    
    //obtener todos las ordenes
    public List<ordenes> getOrdenes() {
        List<ordenes> Ordenes = new ArrayList<>();
        String sql = "SELECT * FROM ordenes ORDER BY fecha ASC";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                ordenes orden = new ordenes(
                        rs.getInt("orden_id"),
                        rs.getInt("id_empleado"),
                        rs.getObject("fecha", LocalDateTime.class),
                        rs.getFloat("total")
                );
                Ordenes.add(orden);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Ordenes;
    }
    
    //obtener id de ls ultima orden
    public int getUltimoOrdenId() {
        String sql = "SELECT orden_id FROM ordenes ORDER BY orden_id DESC LIMIT 1";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("orden_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    
    //editar orden
    public boolean editarOrden(ordenes edtar) {
        String sql = "UPDATE ordenes SET id_empleado = ?, fecha = ?, total = ? WHERE orden_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, edtar.getIDempleado());
            pstmt.setObject(2, edtar.getFecha());
            pstmt.setFloat(3, edtar.getTotal());
            pstmt.setInt(4, edtar.getOrden());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    
    //crear una orden 
    public boolean crearOrden (ordenes nuevaOrden){
        String sql = "INSERT INTO ordenes (id_empleado, fecha, total) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, nuevaOrden.getIDempleado());
            pstmt.setObject(2, nuevaOrden.getFecha());
            pstmt.setFloat(3, nuevaOrden.getTotal());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    //---crear detalle de orden
    public boolean crearDet (detalles nuevoDet) {
        String sql = "INSERT INTO detalles_orden (id_orden, id_producto, cantidad) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, nuevoDet.getOrden());
            pstmt.setObject(2, nuevoDet.getProd());
            pstmt.setFloat(3, nuevoDet.getCtd());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //---obtener empleado que realizo la orden
    
    public empleado getEmpNom(int usuID){
        String sql = "SELECT * FROM empleados WHERE id_usuario = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, usuID);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
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
    
    /*
    //eliminar
    public boolean borrarVacios() {
        String sql = "DELETE FROM ordenes WHERE id_empleado = 0";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }*/
    
    public boolean eliminarDet (int idOrd, int idPro) {
        String sql = "DELETE FROM detalles_orden WHERE id_orden = ? AND id_producto = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idOrd);
            pstmt.setInt(2, idPro);
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
    
    public List<detalles> getDets(int IDorden){
        List<detalles> Dts = new ArrayList<>();
        String sql = "SELECT * FROM detalles_orden WHERE id_orden = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, IDorden);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                detalles dts = new detalles(
                        rs.getInt("detalle_id"),
                        rs.getInt("id_orden"),
                        rs.getInt("id_producto"),
                        rs.getInt("cantidad")
                );
                Dts.add(dts);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Dts;
    }
    
    /*
    public List<ordenes> getOrdenes() {
        List<ordenes> Ordenes = new ArrayList<>();
        String sql = "SELECT * FROM ordenes ORDER BY fecha ASC";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                ordenes orden = new ordenes(
                        rs.getInt("orden_id"),
                        rs.getInt("id_empleado"),
                        rs.getObject("fecha", LocalDateTime.class),
                        rs.getFloat("total")
                );
                Ordenes.add(orden);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Ordenes;
    }
    */
    
    
}
