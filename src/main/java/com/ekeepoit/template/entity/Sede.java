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
@Table(name = "sede")
public class Sede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sde_id")
    private Integer sdeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sde_ins_id")
    private int sdeInsId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "sde_nombre")
    private String sdeNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "sde_domicilio")
    private String sdeDomicilio;
    @Size(max = 500)
    @Column(name = "sde_observacion")
    private String sdeObservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sde_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sdeFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sde_usuario_alta")
    private String sdeUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sde_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sdeFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sde_usuario_mod")
    private String sdeUsuarioMod;
    @Column(name = "sde_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sdeFechaBaja;
    @Size(max = 45)
    @Column(name = "sde_usuario_baja")
    private String sdeUsuarioBaja;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "psdSdeId")
//    private List<ProfesorPorSede> profesorPorSedeList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "asdSdeId")
//    private List<AlumnoPorSede> alumnoPorSedeList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "csdSdeId")
//    private List<CarreraPorSede> carreraPorSedeList;

    public Sede() {
    }

    public Sede(Integer sdeId) {
        this.sdeId = sdeId;
    }

    public Sede(Integer sdeId, int sdeInsId, String sdeNombre, String sdeDomicilio, Date sdeFechaAlta, String sdeUsuarioAlta, Date sdeFechaMod, String sdeUsuarioMod) {
        this.sdeId = sdeId;
        this.sdeInsId = sdeInsId;
        this.sdeNombre = sdeNombre;
        this.sdeDomicilio = sdeDomicilio;
        this.sdeFechaAlta = sdeFechaAlta;
        this.sdeUsuarioAlta = sdeUsuarioAlta;
        this.sdeFechaMod = sdeFechaMod;
        this.sdeUsuarioMod = sdeUsuarioMod;
    }

    public Integer getSdeId() {
        return sdeId;
    }

    public void setSdeId(Integer sdeId) {
        this.sdeId = sdeId;
    }

    public int getSdeInsId() {
        return sdeInsId;
    }

    public void setSdeInsId(int sdeInsId) {
        this.sdeInsId = sdeInsId;
    }

    public String getSdeNombre() {
        return sdeNombre;
    }

    public void setSdeNombre(String sdeNombre) {
        this.sdeNombre = sdeNombre;
    }

    public String getSdeDomicilio() {
        return sdeDomicilio;
    }

    public void setSdeDomicilio(String sdeDomicilio) {
        this.sdeDomicilio = sdeDomicilio;
    }

    public String getSdeObservacion() {
        return sdeObservacion;
    }

    public void setSdeObservacion(String sdeObservacion) {
        this.sdeObservacion = sdeObservacion;
    }

    public Date getSdeFechaAlta() {
        return sdeFechaAlta;
    }

    public void setSdeFechaAlta(Date sdeFechaAlta) {
        this.sdeFechaAlta = sdeFechaAlta;
    }

    public String getSdeUsuarioAlta() {
        return sdeUsuarioAlta;
    }

    public void setSdeUsuarioAlta(String sdeUsuarioAlta) {
        this.sdeUsuarioAlta = sdeUsuarioAlta;
    }

    public Date getSdeFechaMod() {
        return sdeFechaMod;
    }

    public void setSdeFechaMod(Date sdeFechaMod) {
        this.sdeFechaMod = sdeFechaMod;
    }

    public String getSdeUsuarioMod() {
        return sdeUsuarioMod;
    }

    public void setSdeUsuarioMod(String sdeUsuarioMod) {
        this.sdeUsuarioMod = sdeUsuarioMod;
    }

    public Date getSdeFechaBaja() {
        return sdeFechaBaja;
    }

    public void setSdeFechaBaja(Date sdeFechaBaja) {
        this.sdeFechaBaja = sdeFechaBaja;
    }

    public String getSdeUsuarioBaja() {
        return sdeUsuarioBaja;
    }

    public void setSdeUsuarioBaja(String sdeUsuarioBaja) {
        this.sdeUsuarioBaja = sdeUsuarioBaja;
    }

//    public List<ProfesorPorSede> getProfesorPorSedeList() {
//        return profesorPorSedeList;
//    }
//
//    public void setProfesorPorSedeList(List<ProfesorPorSede> profesorPorSedeList) {
//        this.profesorPorSedeList = profesorPorSedeList;
//    }
//
//    public List<AlumnoPorSede> getAlumnoPorSedeList() {
//        return alumnoPorSedeList;
//    }
//
//    public void setAlumnoPorSedeList(List<AlumnoPorSede> alumnoPorSedeList) {
//        this.alumnoPorSedeList = alumnoPorSedeList;
//    }
//
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
        hash += (sdeId != null ? sdeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sede)) {
            return false;
        }
        Sede other = (Sede) object;
        if ((this.sdeId == null && other.sdeId != null) || (this.sdeId != null && !this.sdeId.equals(other.sdeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.eschool.entity.Sede[ sdeId=" + sdeId + " ]";
    }
    
}
