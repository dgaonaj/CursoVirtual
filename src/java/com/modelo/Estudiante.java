/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import com.BD.EstudianteJDBC;

/**
 *
 * @author Amelia
 */
public class Estudiante extends Usuario {

    public Estudiante() {
    }
    
    public Estudiante(String nombres, String apellidos, String correo, String tipoIdentifica, int numIdentifica, String tipoUsuario, String username, String password) {
        super(nombres, apellidos, correo, tipoIdentifica, numIdentifica, tipoUsuario, username, password);
    }
    
    public Estudiante(String username, String password){
        super(username, password);
    }

    @Override
    public int registrarUsuario() {
        return 0;
    }
    
    public int editarUsuario(int pkeyEstudiante, String nombres, String apellidos, String username, String password, String correo){
        
        EstudianteJDBC estuJDBC = new EstudianteJDBC();
        return estuJDBC.update(pkeyEstudiante, nombres, apellidos, username, password, correo);
    }
    
}
