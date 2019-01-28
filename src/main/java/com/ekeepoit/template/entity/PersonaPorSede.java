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
@Table(name = "persona_por_sede")
public class PersonaPorSede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pps_id")
    private Integer ppsId;
    @Basic(optional = false)
    @JoinColumn(name = "pps_sde_id",referencedColumnName = "sde_id")
    @ManyToOne
    private Sede ppsSdeId;
    @Basic(optional = false)
    @JoinColumn(name = "pps_prs_id", referencedColumnName = "prs_id")
    @ManyToOne
    private Persona ppsPrsId;
    @Basic(optional = true)
    @Column(name = "pps_nro_matricula")
    private Integer ppsNroMatricula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pps_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppsFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pps_usuario_alta")
    private String ppsUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pps_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppsFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pps_usuario_mod")
    private String ppsUsuarioMod;
    @Column(name = "pps_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppsFechaBaja;
    @Size(max = 45)
    @Column(name = "pps_usuario_baja")
    private String ppsUsuarioBaja;
    @NotNull
    @Column(name = "pps_fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppsFechaInicio;
    @Column(name = "pps_fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppsFechaFin;

    public Integer getPpsId() {
        return ppsId;
    }

    public void setPpsId(Integer ppsId) {
        this.ppsId = ppsId;
    }

    public Sede getPpsSdeId() {
        return ppsSdeId;
    }

    public void setPpsSdeId(Sede ppsSdeId) {
        this.ppsSdeId = ppsSdeId;
    }

    public Persona getPpsPrsId() {
        return ppsPrsId;
    }

    public void setPpsPrsId(Persona ppsPrsId) {
        this.ppsPrsId = ppsPrsId;
    }

    public Integer getPpsNroMatricula() {
        return ppsNroMatricula;
    }

    public void setPpsNroMatricula(Integer ppsNroMatricula) {
        this.ppsNroMatricula = ppsNroMatricula;
    }

    public Date getPpsFechaAlta() {
        return ppsFechaAlta;
    }

    public void setPpsFechaAlta(Date ppsFechaAlta) {
        this.ppsFechaAlta = ppsFechaAlta;
    }

    public String getPpsUsuarioAlta() {
        return ppsUsuarioAlta;
    }

    public void setPpsUsuarioAlta(String ppsUsuarioAlta) {
        this.ppsUsuarioAlta = ppsUsuarioAlta;
    }

    public Date getPpsFechaMod() {
        return ppsFechaMod;
    }

    public void setPpsFechaMod(Date ppsFechaMod) {
        this.ppsFechaMod = ppsFechaMod;
    }

    public String getPpsUsuarioMod() {
        return ppsUsuarioMod;
    }

    public void setPpsUsuarioMod(String ppsUsuarioMod) {
        this.ppsUsuarioMod = ppsUsuarioMod;
    }

    public Date getPpsFechaBaja() {
        return ppsFechaBaja;
    }

    public void setPpsFechaBaja(Date ppsFechaBaja) {
        this.ppsFechaBaja = ppsFechaBaja;
    }

    public String getPpsUsuarioBaja() {
        return ppsUsuarioBaja;
    }

    public void setPpsUsuarioBaja(String ppsUsuarioBaja) {
        this.ppsUsuarioBaja = ppsUsuarioBaja;
    }

    public Date getPpsFechaInicio() {
        return ppsFechaInicio;
    }

    public void setPpsFechaInicio(Date ppsFechaInicio) {
        this.ppsFechaInicio = ppsFechaInicio;
    }

    public Date getPpsFechaFin() {
        return ppsFechaFin;
    }

    public void setPpsFechaFin(Date ppsFechaFin) {
        this.ppsFechaFin = ppsFechaFin;
    }
}

