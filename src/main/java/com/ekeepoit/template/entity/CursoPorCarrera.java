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
@Table(name = "curso_por_carrera")
public class CursoPorCarrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ccr_id")
    private Integer ccrId;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "ccr_crs_id", referencedColumnName = "crs_id")
    @ManyToOne(optional = false)
    private Curso ccrCrsId;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "ccr_csd_id", referencedColumnName = "csd_id")
    @ManyToOne(optional = false)
    private CarreraPorSede ccrCsdId;
    @Column(name = "ccr_anio")
    private Integer ccrAnio;
    @Basic(optional = true)
    @NotNull
    @Column(name = "ccr_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccrFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ccr_usuario_alta")
    private String ccrUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ccr_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccrFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ccr_usuario_mod")
    private String ccrUsuarioMod;
    @Column(name = "ccr_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccrFechaBaja;
    @Size(max = 45)
    @Column(name = "ccr_usuario_baja")
    private String ccrUsuarioBaja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ccr_fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccrFechaInicio;
    @Basic(optional = false)
    @Column(name = "ccr_fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccrFechaFin;

    public CursoPorCarrera() {
    }

    public CursoPorCarrera(Integer ccrId) {
        this.ccrId = ccrId;
    }

    public CursoPorCarrera(Integer ccrId, Curso ccrCrsId, CarreraPorSede ccrCsdId, Date ccrFechaAlta, String ccrUsuarioAlta, Date ccrFechaMod, String ccrUsuarioMod) {
        this.ccrId = ccrId;
        this.ccrCrsId = ccrCrsId;
        this.ccrCsdId = ccrCsdId;
        this.ccrFechaAlta = ccrFechaAlta;
        this.ccrUsuarioAlta = ccrUsuarioAlta;
        this.ccrFechaMod = ccrFechaMod;
        this.ccrUsuarioMod = ccrUsuarioMod;
    }

    public Date getCcrFechaInicio() {
        return ccrFechaInicio;
    }

    public void setCcrFechaInicio(Date ccrFechaInicio) {
        this.ccrFechaInicio = ccrFechaInicio;
    }

    public Date getCcrFechaFin() {
        return ccrFechaFin;
    }

    public void setCcrFechaFin(Date ccrFechaFin) {
        this.ccrFechaFin = ccrFechaFin;
    }

    public Integer getCcrId() {
        return ccrId;
    }

    public void setCcrId(Integer ccrId) {
        this.ccrId = ccrId;
    }

    public Curso getCcrCrsId() {
        return ccrCrsId;
    }

    public void setCcrCrsId(Curso ccrCrsId) {
        this.ccrCrsId = ccrCrsId;
    }

    public CarreraPorSede getCcrCsdId() {
        return ccrCsdId;
    }

    public void setCcrCsdId(CarreraPorSede ccrCsdId) {
        this.ccrCsdId = ccrCsdId;
    }

    public Integer getCcrAnio() {
        return ccrAnio;
    }

    public void setCcrAnio(Integer ccrAnio) {
        this.ccrAnio = ccrAnio;
    }

    
    public Date getCcrFechaAlta() {
        return ccrFechaAlta;
    }

    public void setCcrFechaAlta(Date ccrFechaAlta) {
        this.ccrFechaAlta = ccrFechaAlta;
    }

    public String getCcrUsuarioAlta() {
        return ccrUsuarioAlta;
    }

    public void setCcrUsuarioAlta(String ccrUsuarioAlta) {
        this.ccrUsuarioAlta = ccrUsuarioAlta;
    }

    public Date getCcrFechaMod() {
        return ccrFechaMod;
    }

    public void setCcrFechaMod(Date ccrFechaMod) {
        this.ccrFechaMod = ccrFechaMod;
    }

    public String getCcrUsuarioMod() {
        return ccrUsuarioMod;
    }

    public void setCcrUsuarioMod(String ccrUsuarioMod) {
        this.ccrUsuarioMod = ccrUsuarioMod;
    }

    public Date getCcrFechaBaja() {
        return ccrFechaBaja;
    }

    public void setCcrFechaBaja(Date ccrFechaBaja) {
        this.ccrFechaBaja = ccrFechaBaja;
    }

    public String getCcrUsuarioBaja() {
        return ccrUsuarioBaja;
    }

    public void setCcrUsuarioBaja(String ccrUsuarioBaja) {
        this.ccrUsuarioBaja = ccrUsuarioBaja;
    }

//    public List<ProfesorPorCurso> getProfesorPorCursoList() {
//        return profesorPorCursoList;
//    }
//
//    public void setProfesorPorCursoList(List<ProfesorPorCurso> profesorPorCursoList) {
//        this.profesorPorCursoList = profesorPorCursoList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ccrId != null ? ccrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursoPorCarrera)) {
            return false;
        }
        CursoPorCarrera other = (CursoPorCarrera) object;
        if ((this.ccrId == null && other.ccrId != null) || (this.ccrId != null && !this.ccrId.equals(other.ccrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.eschool.entity.CursoPorCarrera[ ccrId=" + ccrId + " ]";
    }
    
}
