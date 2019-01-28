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
@Table(name = "persona_por_curso")
public class PersonaPorCurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pcr_id")
    private Integer pcrId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pcr_fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pcrFechaInicio;
    @Basic(optional = false)
    @Column(name = "pcr_fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pcrFechaFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pcr_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pcrFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pcr_usuario_alta")
    private String pcrUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pcr_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pcrFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pcr_usuario_mod")
    private String pcrUsuarioMod;
    @Column(name = "pcr_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pcrFechaBaja;
    @Size(max = 45)
    @Column(name = "pcr_usuario_baja")
    private String pcrUsuarioBaja;
    @JoinColumn(name = "pcr_ccr_id", referencedColumnName = "ccr_id")
    @ManyToOne
    private CursoPorCarrera pcrCcrId;
    @JoinColumn(name = "pcr_pps_id", referencedColumnName = "pps_id")
    @ManyToOne
    private PersonaPorSede pcrPpsId;

    public Integer getPcrId() {
        return pcrId;
    }

    public void setPcrId(Integer pcrId) {
        this.pcrId = pcrId;
    }

    public Date getPcrFechaAlta() {
        return pcrFechaAlta;
    }

    public void setPcrFechaAlta(Date pcrFechaAlta) {
        this.pcrFechaAlta = pcrFechaAlta;
    }

    public String getPcrUsuarioAlta() {
        return pcrUsuarioAlta;
    }

    public void setPcrUsuarioAlta(String pcrUsuarioAlta) {
        this.pcrUsuarioAlta = pcrUsuarioAlta;
    }

    public Date getPcrFechaMod() {
        return pcrFechaMod;
    }

    public void setPcrFechaMod(Date pcrFechaMod) {
        this.pcrFechaMod = pcrFechaMod;
    }

    public String getPcrUsuarioMod() {
        return pcrUsuarioMod;
    }

    public void setPcrUsuarioMod(String pcrUsuarioMod) {
        this.pcrUsuarioMod = pcrUsuarioMod;
    }

    public Date getPcrFechaBaja() {
        return pcrFechaBaja;
    }

    public void setPcrFechaBaja(Date pcrFechaBaja) {
        this.pcrFechaBaja = pcrFechaBaja;
    }

    public String getPcrUsuarioBaja() {
        return pcrUsuarioBaja;
    }

    public void setPcrUsuarioBaja(String pcrUsuarioBaja) {
        this.pcrUsuarioBaja = pcrUsuarioBaja;
    }

    public CursoPorCarrera getPcrCcrId() {
        return pcrCcrId;
    }

    public void setPcrCcrId(CursoPorCarrera pcrCcrId) {
        this.pcrCcrId = pcrCcrId;
    }

    public PersonaPorSede getPcrPpsId() {
        return pcrPpsId;
    }

    public void setPcrPpsId(PersonaPorSede pcrPpsId) {
        this.pcrPpsId = pcrPpsId;
    }

    public Date getPcrFechaInicio() {
        return pcrFechaInicio;
    }

    public void setPcrFechaInicio(Date pcrFechaInicio) {
        this.pcrFechaInicio = pcrFechaInicio;
    }

    public Date getPcrFechaFin() {
        return pcrFechaFin;
    }

    public void setPcrFechaFin(Date pcrFechaFin) {
        this.pcrFechaFin = pcrFechaFin;
    }
}
