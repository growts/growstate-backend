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
@Table(name = "nivel")
public class Nivel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nvl_id")
    private Integer nvlId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nvl_nombre")
    private String nvlNombre;
    @Basic(optional = true)
    @Size(min = 1, max = 250)
    @Column(name = "nvl_observacion")
    private String nvlObservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nvl_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nvlFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nvl_usuario_alta")
    private String nvlUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nvl_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nvlFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nvl_usuario_mod")
    private String nvlUsuarioMod;
    @Column(name = "nvl_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nvlFechaBaja;
    @Size(max = 45)
    @Column(name = "nvl_usuario_baja")
    private String nvlUsuarioBaja;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "crsNvlId")
//    private List<Curso> cursoList;

    public Nivel() {
    }

    public Nivel(Integer nvlId) {
        this.nvlId = nvlId;
    }

    public Nivel(Integer nvlId, String nvlNombre, String nvlObservacion, Date nvlFechaAlta, String nvlUsuarioAlta, Date nvlFechaMod, String nvlUsuarioMod) {
        this.nvlId = nvlId;
        this.nvlNombre = nvlNombre;
        this.nvlObservacion = nvlObservacion;
        this.nvlFechaAlta = nvlFechaAlta;
        this.nvlUsuarioAlta = nvlUsuarioAlta;
        this.nvlFechaMod = nvlFechaMod;
        this.nvlUsuarioMod = nvlUsuarioMod;
    }

    public Integer getNvlId() {
        return nvlId;
    }

    public void setNvlId(Integer nvlId) {
        this.nvlId = nvlId;
    }

    public String getNvlNombre() {
        return nvlNombre;
    }

    public void setNvlNombre(String nvlNombre) {
        this.nvlNombre = nvlNombre;
    }

    public String getNvlObservacion() {
        return nvlObservacion;
    }

    public void setNvlObservacion(String nvlObservacion) {
        this.nvlObservacion = nvlObservacion;
    }

    public Date getNvlFechaAlta() {
        return nvlFechaAlta;
    }

    public void setNvlFechaAlta(Date nvlFechaAlta) {
        this.nvlFechaAlta = nvlFechaAlta;
    }

    public String getNvlUsuarioAlta() {
        return nvlUsuarioAlta;
    }

    public void setNvlUsuarioAlta(String nvlUsuarioAlta) {
        this.nvlUsuarioAlta = nvlUsuarioAlta;
    }

    public Date getNvlFechaMod() {
        return nvlFechaMod;
    }

    public void setNvlFechaMod(Date nvlFechaMod) {
        this.nvlFechaMod = nvlFechaMod;
    }

    public String getNvlUsuarioMod() {
        return nvlUsuarioMod;
    }

    public void setNvlUsuarioMod(String nvlUsuarioMod) {
        this.nvlUsuarioMod = nvlUsuarioMod;
    }

    public Date getNvlFechaBaja() {
        return nvlFechaBaja;
    }

    public void setNvlFechaBaja(Date nvlFechaBaja) {
        this.nvlFechaBaja = nvlFechaBaja;
    }

    public String getNvlUsuarioBaja() {
        return nvlUsuarioBaja;
    }

    public void setNvlUsuarioBaja(String nvlUsuarioBaja) {
        this.nvlUsuarioBaja = nvlUsuarioBaja;
    }

//    public List<Curso> getCursoList() {
//        return cursoList;
//    }
//
//    public void setCursoList(List<Curso> cursoList) {
//        this.cursoList = cursoList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nvlId != null ? nvlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nivel)) {
            return false;
        }
        Nivel other = (Nivel) object;
        if ((this.nvlId == null && other.nvlId != null) || (this.nvlId != null && !this.nvlId.equals(other.nvlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.eschool.entity.Nivel[ nvlId=" + nvlId + " ]";
    }
    
}
