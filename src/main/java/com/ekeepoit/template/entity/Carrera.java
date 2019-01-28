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
@Table(name = "carrera")
public class Carrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cra_id")
    private Integer craId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "cra_nombre")
    private String craNombre;
    @Size(max = 500)
    @Column(name = "cra_observacion")
    private String craObservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cra_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date craFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cra_usuario_alta")
    private String craUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cra_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date craFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cra_usuario_mod")
    private String craUsuarioMod;
    @Column(name = "cra_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date craFechaBaja;
    @Size(max = 45)
    @Column(name = "cra_usuario_baja")
    private String craUsuarioBaja;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "csdCraId")
//    private List<CarreraPorSede> carreraPorSedeList;

    public Carrera() {
    }

    public Carrera(Integer craId) {
        this.craId = craId;
    }

    public Carrera(Integer craId, String craNombre, Date craFechaAlta, String craUsuarioAlta, Date craFechaMod, String craUsuarioMod) {
        this.craId = craId;
        this.craNombre = craNombre;
        this.craFechaAlta = craFechaAlta;
        this.craUsuarioAlta = craUsuarioAlta;
        this.craFechaMod = craFechaMod;
        this.craUsuarioMod = craUsuarioMod;
    }

    public Integer getCraId() {
        return craId;
    }

    public void setCraId(Integer craId) {
        this.craId = craId;
    }

    public String getCraNombre() {
        return craNombre;
    }

    public void setCraNombre(String craNombre) {
        this.craNombre = craNombre;
    }

    public String getCraObservacion() {
        return craObservacion;
    }

    public void setCraObservacion(String craObservacion) {
        this.craObservacion = craObservacion;
    }

    public Date getCraFechaAlta() {
        return craFechaAlta;
    }

    public void setCraFechaAlta(Date craFechaAlta) {
        this.craFechaAlta = craFechaAlta;
    }

    public String getCraUsuarioAlta() {
        return craUsuarioAlta;
    }

    public void setCraUsuarioAlta(String craUsuarioAlta) {
        this.craUsuarioAlta = craUsuarioAlta;
    }

    public Date getCraFechaMod() {
        return craFechaMod;
    }

    public void setCraFechaMod(Date craFechaMod) {
        this.craFechaMod = craFechaMod;
    }

    public String getCraUsuarioMod() {
        return craUsuarioMod;
    }

    public void setCraUsuarioMod(String craUsuarioMod) {
        this.craUsuarioMod = craUsuarioMod;
    }

    public Date getCraFechaBaja() {
        return craFechaBaja;
    }

    public void setCraFechaBaja(Date craFechaBaja) {
        this.craFechaBaja = craFechaBaja;
    }

    public String getCraUsuarioBaja() {
        return craUsuarioBaja;
    }

    public void setCraUsuarioBaja(String craUsuarioBaja) {
        this.craUsuarioBaja = craUsuarioBaja;
    }

//    public List<CarreraPorSede> getCarreraPorSedeList() {
//        return carreraPorSedeList;
//    }
//
//    public void setCarreraPorSedeList(List<CarreraPorSede> carreraPorSedeList) {
//        this.carreraPorSedeList = carreraPorSedeList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (craId != null ? craId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrera)) {
            return false;
        }
        Carrera other = (Carrera) object;
        if ((this.craId == null && other.craId != null) || (this.craId != null && !this.craId.equals(other.craId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.eschool.entity.Carrera[ craId=" + craId + " ]";
    }
    
}
