package expresseatapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BDmenu {
    private Connection conn;
    
    public BDmenu(Connection conn) {
        this.conn = conn;
    }
    
    //obtener menus
    public List<menu> getMenus() {
        List<menu> MENUS = new ArrayList<>();
        String sql = "SELECT * FROM menu ORDER BY menu_id ASC";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                menu menus = new menu(
                        rs.getInt("menu_id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getFloat("precio")
                );
                MENUS.add(menus);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return MENUS;
    }
    
    //obtener menu
    public menu getProducto (int ID) {
        String sql = "SELECT * FROM menu WHERE menu_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, ID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new menu (
                    rs.getInt("menu_id"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                    rs.getFloat("precio")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    //crear menu
    public boolean crearMenu (menu nMenu){
        String sql = "INSERT INTO menu (nombre, descripcion, precio) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nMenu.getProducto());
            pstmt.setString(2, nMenu.getDesc());
            pstmt.setFloat(3, nMenu.getPrecio());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    } 
    
    //editar menu
    
    public boolean editarMenu(menu eMenu) {
        String sql = "UPDATE menu SET nombre = ?, descripcion = ?, precio = ? WHERE menu_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, eMenu.getProducto());
            pstmt.setString(2, eMenu.getDesc());
            pstmt.setFloat(3, eMenu.getPrecio());
            pstmt.setInt(4, eMenu.getMenuID());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //eliminar
    public boolean eliProducto (int ID) {
        String sql = "DELETE FROM menu WHERE menu_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, ID);
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
    
    
}
