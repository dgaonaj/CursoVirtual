/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BD;

import com.servicio.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amelia
 */
public class AdministradorJDBC {
    
     public int select(String username, String password){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT COUNT(*) FROM administrador WHERE username = '"+username+"' AND password = '"+password+"'");
            int index = 1;
            rs = stmt.executeQuery();
            rs.next();
            rows = rs.getInt(1);      
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return rows;
    }
}
