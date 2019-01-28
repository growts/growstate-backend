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

/**
 *
 * @author dario
 */
@Entity
@Table(name = "institucion")
public class Institucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ins_id")
    private Integer insId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ins_nombre")
    private String insNombre;
    @Size(max = 500)
    @Column(name = "ins_observacion")
    private String insObservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ins_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ins_usuario_alta")
    private String insUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ins_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ins_usuario_mod")
    private String insUsuarioMod;
    @Column(name = "ins_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insFechaBaja;
    @Size(max = 45)
    @Column(name = "ins_usuario_baja")
    private String insUsuarioBaja;

    public Institucion() {
    }

    public Institucion(Integer insId) {
        this.insId = insId;
    }

    public Institucion(Integer insId, String insNombre, Date insFechaAlta, String insUsuarioAlta, Date insFechaMod, String insUsuarioMod) {
        this.insId = insId;
        this.insNombre = insNombre;
        this.insFechaAlta = insFechaAlta;
        this.insUsuarioAlta = insUsuarioAlta;
        this.insFechaMod = insFechaMod;
        this.insUsuarioMod = insUsuarioMod;
    }

    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    public String getInsNombre() {
        return insNombre;
    }

    public void setInsNombre(String insNombre) {
        this.insNombre = insNombre;
    }

    public String getInsObservacion() {
        return insObservacion;
    }

    public void setInsObservacion(String insObservacion) {
        this.insObservacion = insObservacion;
    }

    public Date getInsFechaAlta() {
        return insFechaAlta;
    }

    public void setInsFechaAlta(Date insFechaAlta) {
        this.insFechaAlta = insFechaAlta;
    }

    public String getInsUsuarioAlta() {
        return insUsuarioAlta;
    }

    public void setInsUsuarioAlta(String insUsuarioAlta) {
        this.insUsuarioAlta = insUsuarioAlta;
    }

    public Date getInsFechaMod() {
        return insFechaMod;
    }

    public void setInsFechaMod(Date insFechaMod) {
        this.insFechaMod = insFechaMod;
    }

    public String getInsUsuarioMod() {
        return insUsuarioMod;
    }

    public void setInsUsuarioMod(String insUsuarioMod) {
        this.insUsuarioMod = insUsuarioMod;
    }

    public Date getInsFechaBaja() {
        return insFechaBaja;
    }

    public void setInsFechaBaja(Date insFechaBaja) {
        this.insFechaBaja = insFechaBaja;
    }

    public String getInsUsuarioBaja() {
        return insUsuarioBaja;
    }

    public void setInsUsuarioBaja(String insUsuarioBaja) {
        this.insUsuarioBaja = insUsuarioBaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insId != null ? insId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Institucion)) {
            return false;
        }
        Institucion other = (Institucion) object;
        if ((this.insId == null && other.insId != null) || (this.insId != null && !this.insId.equals(other.insId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.eschool.entity.Institucion[ insId=" + insId + " ]";
    }
    
}
