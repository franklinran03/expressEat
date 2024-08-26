package expresseatapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDlogin {
    private Connection conn;
    
    public BDlogin(Connection conn) {
        this.conn = conn;
    }

    //login
    public usuario login(String usuario, String contra){
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, usuario);
            pstmt.setString(2, contra);
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
    
    
    
}
