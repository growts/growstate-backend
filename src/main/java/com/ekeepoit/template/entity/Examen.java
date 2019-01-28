/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.template.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Examen")
public class Examen implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "exm_id")
    private Integer exmId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "exm_nombre")
    private String exmNombre;
    @Size(min = 1, max = 300)
    @Column(name = "exm_observaciones")
    private String exmObservaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "exm_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date exmFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "exm_usuario_alta")
    private String exmUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "exm_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date exmFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "exm_usuario_mod")
    private String exmUsuarioMod;
    @Column(name = "exm_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date exmFechaBaja;
    @Size(max = 45)
    @Column(name = "exm_usuario_baja")
    private String exmUsuarioBaja;

    public Integer getExmId() {
        return exmId;
    }

    public void setExmId(Integer exmId) {
        this.exmId = exmId;
    }

    public String getExmNombre() {
        return exmNombre;
    }

    public void setExmNombre(String exmNombre) {
        this.exmNombre = exmNombre;
    }

    public String getExmObservaciones() {
        return exmObservaciones;
    }

    public void setExmObservaciones(String exmObservaciones) {
        this.exmObservaciones = exmObservaciones;
    }

    public Date getExmFechaAlta() {
        return exmFechaAlta;
    }

    public void setExmFechaAlta(Date exmFechaAlta) {
        this.exmFechaAlta = exmFechaAlta;
    }

    public String getExmUsuarioAlta() {
        return exmUsuarioAlta;
    }

    public void setExmUsuarioAlta(String exmUsuarioAlta) {
        this.exmUsuarioAlta = exmUsuarioAlta;
    }

    public Date getExmFechaMod() {
        return exmFechaMod;
    }

    public void setExmFechaMod(Date exmFechaMod) {
        this.exmFechaMod = exmFechaMod;
    }

    public String getExmUsuarioMod() {
        return exmUsuarioMod;
    }

    public void setExmUsuarioMod(String exmUsuarioMod) {
        this.exmUsuarioMod = exmUsuarioMod;
    }

    public Date getExmFechaBaja() {
        return exmFechaBaja;
    }

    public void setExmFechaBaja(Date exmFechaBaja) {
        this.exmFechaBaja = exmFechaBaja;
    }

    public String getExmUsuarioBaja() {
        return exmUsuarioBaja;
    }

    public void setExmUsuarioBaja(String exmUsuarioBaja) {
        this.exmUsuarioBaja = exmUsuarioBaja;
    }
    
    
}
