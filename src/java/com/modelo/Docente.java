/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import com.BD.DocenteJDBC;

/**
 *
 * @author Amelia
 */
public class Docente extends Usuario {
    
    private String especialidad;

    public Docente() {
    }

    public Docente(String especialidad) {
        this.especialidad = especialidad;
    }

    public Docente(String especialidad, String nombres, String apellidos, String correo, String tipoIdentifica, int numIdentifica, String tipoUsuario, String username, String password) {
        super(nombres, apellidos, correo, tipoIdentifica, numIdentifica, tipoUsuario, username, password);
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int registrarUsuario(){
        
        DocenteJDBC docentJDBC = new DocenteJDBC();      
        return docentJDBC.insertDocente(especialidad, getNombres(), getApellidos(), getCorreo(), getTipoIdentifica(), getNumIdentifica(), getTipoUsuario(), getUsername(), getPassword());
    }
    
    @Override
    public int login(String username, String password){
        
        DocenteJDBC doceJDBC = new DocenteJDBC();
        return doceJDBC.select(username, password);
    }

}
