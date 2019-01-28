/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.template.dto;

import com.ekeepoit.template.entity.Persona;
import com.ekeepoit.template.entity.Sede;

import java.util.List;

/**
 *
 * @author etorrielli
 */
public class AuthResponseDTO {

    private String token;
    private String user;
    private String rol;
    private List<Sede> lstSedes;
    private Persona persona;
    private boolean cajaIniciada;
    
    public AuthResponseDTO(){
        
    }

    public AuthResponseDTO(String token, String user, String rol, List<Sede> sedes, Persona persona, boolean cajaIniciada){
        this.token = token;
        this.user = user;
        this.rol = rol;
        this.lstSedes = sedes;
        this.persona = persona;
        this.cajaIniciada = cajaIniciada;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Sede> getLstSedes() {
        return lstSedes;
    }

    public void setLstSedes(List<Sede> lstSedes) {
        this.lstSedes = lstSedes;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public boolean isCajaIniciada() {
        return cajaIniciada;
    }

    public void setCajaIniciada(boolean cajaIniciada) {
        this.cajaIniciada = cajaIniciada;
    }
}
