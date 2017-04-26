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

    public int registrarUsuario() {
        
        EstudianteJDBC estudiJDBC = new EstudianteJDBC();
        return estudiJDBC.insertEstudiante(getNombres(), getApellidos(), getCorreo(), getTipoIdentifica(), getNumIdentifica(), getTipoUsuario(), getUsername(), getPassword());
    }
    
    @Override
    public int login(String username, String password){
        
        EstudianteJDBC estuJDBC = new EstudianteJDBC();
        return estuJDBC.select(username, password);

    }
    
}
