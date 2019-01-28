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
@Table(name = "curso")
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "crs_id")
    private Integer crsId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "crs_nombre")
    private String crsNombre;
    @Basic(optional = true)
    @Size(min = 1, max = 250)
    @Column(name = "crs_observacion")
    private String crsObservacion;
    @Basic(optional = true)
    @Size(min = 1, max = 250)
    @Column(name = "crs_classroom_url")
    private String crsClassroomUrl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "crs_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crsFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "crs_usuario_alta")
    private String crsUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "crs_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crsFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "crs_usuario_mod")
    private String crsUsuarioMod;
    @Column(name = "crs_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crsFechaBaja;
    @Size(max = 45)
    @Column(name = "crs_usuario_baja")
    private String crsUsuarioBaja;
    @JoinColumn(name = "crs_dvs_id", referencedColumnName = "dvs_id")
    @ManyToOne(optional = false)
    private Division crsDvsId;
    @JoinColumn(name = "crs_nvl_id", referencedColumnName = "nvl_id")
    @ManyToOne(optional = false)
    private Nivel crsNvlId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "crs_catedra")
    private String crsCatedra;
    @Column(name = "crs_cambridge")
    private String crsCambridge;    
    @Column(name = "crs_edades")
    private String crsEdades;
    @Basic(optional = false)
    @Column(name = "crs_especial")
    private Integer crsEspecial;

    public Curso() {
    }

    public Curso(Integer crsId) {
        this.crsId = crsId;
    }

    public Curso(Integer crsId, String crsNombre, String crsObservacion, Date crsFechaAlta, String crsUsuarioAlta, Date crsFechaMod, String crsUsuarioMod) {
        this.crsId = crsId;
        this.crsNombre = crsNombre;
        this.crsObservacion = crsObservacion;
        this.crsFechaAlta = crsFechaAlta;
        this.crsUsuarioAlta = crsUsuarioAlta;
        this.crsFechaMod = crsFechaMod;
        this.crsUsuarioMod = crsUsuarioMod;
    }

    public Integer getCrsId() {
        return crsId;
    }

    public void setCrsId(Integer crsId) {
        this.crsId = crsId;
    }

    public String getCrsNombre() {
        return crsNombre;
    }

    public void setCrsNombre(String crsNombre) {
        this.crsNombre = crsNombre;
    }

    public String getCrsObservacion() {
        return crsObservacion;
    }

    public void setCrsObservacion(String crsObservacion) {
        this.crsObservacion = crsObservacion;
    }

    public Date getCrsFechaAlta() {
        return crsFechaAlta;
    }

    public void setCrsFechaAlta(Date crsFechaAlta) {
        this.crsFechaAlta = crsFechaAlta;
    }

    public String getCrsUsuarioAlta() {
        return crsUsuarioAlta;
    }

    public void setCrsUsuarioAlta(String crsUsuarioAlta) {
        this.crsUsuarioAlta = crsUsuarioAlta;
    }

    public Date getCrsFechaMod() {
        return crsFechaMod;
    }

    public void setCrsFechaMod(Date crsFechaMod) {
        this.crsFechaMod = crsFechaMod;
    }

    public String getCrsUsuarioMod() {
        return crsUsuarioMod;
    }

    public void setCrsUsuarioMod(String crsUsuarioMod) {
        this.crsUsuarioMod = crsUsuarioMod;
    }

    public Date getCrsFechaBaja() {
        return crsFechaBaja;
    }

    public void setCrsFechaBaja(Date crsFechaBaja) {
        this.crsFechaBaja = crsFechaBaja;
    }

    public String getCrsUsuarioBaja() {
        return crsUsuarioBaja;
    }

    public void setCrsUsuarioBaja(String crsUsuarioBaja) {
        this.crsUsuarioBaja = crsUsuarioBaja;
    }

    public Division getCrsDvsId() {
        return crsDvsId;
    }

    public void setCrsDvsId(Division crsDvsId) {
        this.crsDvsId = crsDvsId;
    }

    public Nivel getCrsNvlId() {
        return crsNvlId;
    }

    public void setCrsNvlId(Nivel crsNvlId) {
        this.crsNvlId = crsNvlId;
    }

    public Integer getCrsEspecial() {
        return crsEspecial;
    }

    public void setCrsEspecial(Integer crsEspecial) {
        this.crsEspecial = crsEspecial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crsId != null ? crsId.hashCode() : 0);
        return hash;
    }

    public String getCrsCatedra() {
        return crsCatedra;
    }

    public void setCrsCatedra(String crsCatedra) {
        this.crsCatedra = crsCatedra;
    }    

    public String getCrsCambridge() {
        return crsCambridge;
    }

    public void setCrsCambridge(String crsCambridge) {
        this.crsCambridge = crsCambridge;
    }

    public String getCrsEdades() {
        return crsEdades;
    }

    public void setCrsEdades(String crsEdades) {
        this.crsEdades = crsEdades;
    }

    public String getCrsClassroomUrl() {
        return crsClassroomUrl;
    }

    public void setCrsClassroomUrl(String crsClassroomUrl) {
        this.crsClassroomUrl = crsClassroomUrl;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.crsId == null && other.crsId != null) || (this.crsId != null && !this.crsId.equals(other.crsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.eschool.entity.Curso[ crsId=" + crsId + " ]";
    }
    
}
