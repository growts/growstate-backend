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
@Table(name = "division")
public class Division implements Serializable, Comparable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dvs_id")
    private Integer dvsId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "dvs_nombre")
    private String dvsNombre;
    @Basic(optional = true)
    @Size(min = 1, max = 250)
    @Column(name = "dvs_observacion")
    private String dvsObservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dvs_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dvsFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "dvs_usuario_alta")
    private String dvsUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dvs_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dvsFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "dvs_usuario_mod")
    private String dvsUsuarioMod;
    @Column(name = "dvs_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dvsFechaBaja;
    @Size(max = 45)
    @Column(name = "dvs_usuario_baja")
    private String dvsUsuarioBaja;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "crsDvsId")
//    private List<Curso> cursoList;

    public Division() {
    }

    public Division(Integer dvsId) {
        this.dvsId = dvsId;
    }

    public Division(Integer dvsId, String dvsNombre, String dvsObservacion, Date dvsFechaAlta, String dvsUsuarioAlta, Date dvsFechaMod, String dvsUsuarioMod) {
        this.dvsId = dvsId;
        this.dvsNombre = dvsNombre;
        this.dvsObservacion = dvsObservacion;
        this.dvsFechaAlta = dvsFechaAlta;
        this.dvsUsuarioAlta = dvsUsuarioAlta;
        this.dvsFechaMod = dvsFechaMod;
        this.dvsUsuarioMod = dvsUsuarioMod;
    }

    public Integer getDvsId() {
        return dvsId;
    }

    public void setDvsId(Integer dvsId) {
        this.dvsId = dvsId;
    }

    public String getDvsNombre() {
        return dvsNombre;
    }

    public void setDvsNombre(String dvsNombre) {
        this.dvsNombre = dvsNombre;
    }

    public String getDvsObservacion() {
        return dvsObservacion;
    }

    public void setDvsObservacion(String dvsObservacion) {
        this.dvsObservacion = dvsObservacion;
    }

    public Date getDvsFechaAlta() {
        return dvsFechaAlta;
    }

    public void setDvsFechaAlta(Date dvsFechaAlta) {
        this.dvsFechaAlta = dvsFechaAlta;
    }

    public String getDvsUsuarioAlta() {
        return dvsUsuarioAlta;
    }

    public void setDvsUsuarioAlta(String dvsUsuarioAlta) {
        this.dvsUsuarioAlta = dvsUsuarioAlta;
    }

    public Date getDvsFechaMod() {
        return dvsFechaMod;
    }

    public void setDvsFechaMod(Date dvsFechaMod) {
        this.dvsFechaMod = dvsFechaMod;
    }

    public String getDvsUsuarioMod() {
        return dvsUsuarioMod;
    }

    public void setDvsUsuarioMod(String dvsUsuarioMod) {
        this.dvsUsuarioMod = dvsUsuarioMod;
    }

    public Date getDvsFechaBaja() {
        return dvsFechaBaja;
    }

    public void setDvsFechaBaja(Date dvsFechaBaja) {
        this.dvsFechaBaja = dvsFechaBaja;
    }

    public String getDvsUsuarioBaja() {
        return dvsUsuarioBaja;
    }

    public void setDvsUsuarioBaja(String dvsUsuarioBaja) {
        this.dvsUsuarioBaja = dvsUsuarioBaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dvsId != null ? dvsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Division)) {
            return false;
        }
        Division other = (Division) object;
        if ((this.dvsId == null && other.dvsId != null) || (this.dvsId != null && !this.dvsId.equals(other.dvsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.eschool.entity.Division[ dvsId=" + dvsId + " ]";
    }

    @Override
    public int compareTo(Object o) {
        Division division = (Division)o;
        if(this.dvsId == division.dvsId){
            return 0;
        }
        return -1;
    }
}
