/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

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

    public Docente(String especialidad, String nombres, String apellidos, String correo, String tipoIdentifica, String numIdentifica, String tipoUsuario, String username, String password) {
        super(nombres, apellidos, correo, tipoIdentifica, numIdentifica, tipoUsuario, username, password);
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void editarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
