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
public class EstudianteJDBC {
    private final String SQL_INSERT =
            "INSERT INTO estudiante(pkeyEstudiante, tipoIdentifica, nombres, apellidos,"
            + "correo, tipoUsuario, username, password) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    
    public int insertEstudiante(String nombres, String apellidos, String correo, String tipoIdentifica, int numIdentifica, String tipoUsuario, String username, String password){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;
        
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;
            stmt.setInt(index++, numIdentifica);
            stmt.setString(index++, tipoIdentifica);
            stmt.setString(index++, nombres);
            stmt.setString(index++, apellidos);
            stmt.setString(index++, correo);
            stmt.setString(index++, tipoUsuario);
            stmt.setString(index++, username);
            stmt.setString(index++, password);
            System.out.println("Ejecutando query "+SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros Afectados "+rows);
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);
        }
        return rows;
    }
}
