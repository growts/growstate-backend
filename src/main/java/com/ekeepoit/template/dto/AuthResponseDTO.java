/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.template.dto;

import java.util.List;

/**
 *
 * @author etorrielli
 */
public class AuthResponseDTO {

    private String token;
    private String user;
    private String rol;
    
    public AuthResponseDTO(){
        
    }

    public AuthResponseDTO(String token, String user, String rol){
        this.token = token;
        this.user = user;
        this.rol = rol;
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

}
