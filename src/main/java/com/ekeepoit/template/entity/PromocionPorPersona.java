package com.ekeepoit.template.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "promocion_por_persona")
public class PromocionPorPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pmp_id")
    private Integer pmpId;
    @JoinColumn(name = "pmp_pps_id", referencedColumnName = "pps_id")
    @ManyToOne
    private PersonaPorSede pmpPpsId;
    @JoinColumn(name = "pmp_pmo_id", referencedColumnName = "pmo_id")
    @ManyToOne
    private Promocion pmpPmoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmp_fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pmpFechaInicio;
    @Column(name = "pmp_fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pmpFechaFin;
    @Column(name = "pmp_observaciones")
    private String pmpObservaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmp_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pmpFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmp_usuario_alta")
    private String pmpUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmp_fecha_ult_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pmpFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmp_usuario_ult_mod")
    private String pmpUsuarioUltMod;
    @Basic(optional = true)
    @Column(name = "pmp_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pmpFechaBaja;
    @Basic(optional = true)
    @Column(name = "pmp_usuario_baja")
    private String pmpUsuarioBaja;

    public Integer getPmpId() {
        return pmpId;
    }

    public void setPmpId(Integer pmpId) {
        this.pmpId = pmpId;
    }

    public PersonaPorSede getPmpPpsId() {
        return pmpPpsId;
    }

    public void setPmpPpsId(PersonaPorSede pmpPpsId) {
        this.pmpPpsId = pmpPpsId;
    }

    public Promocion getPmpPmoId() {
        return pmpPmoId;
    }

    public void setPmpPmoId(Promocion pmpPmoId) {
        this.pmpPmoId = pmpPmoId;
    }

    public Date getPmpFechaInicio() {
        return pmpFechaInicio;
    }

    public void setPmpFechaInicio(Date pmpFechaInicio) {
        this.pmpFechaInicio = pmpFechaInicio;
    }

    public Date getPmpFechaFin() {
        return pmpFechaFin;
    }

    public void setPmpFechaFin(Date pmpFechaFin) {
        this.pmpFechaFin = pmpFechaFin;
    }

    public Date getPmpFechaAlta() {
        return pmpFechaAlta;
    }

    public void setPmpFechaAlta(Date pmpFechaAlta) {
        this.pmpFechaAlta = pmpFechaAlta;
    }

    public String getPmpUsuarioAlta() {
        return pmpUsuarioAlta;
    }

    public void setPmpUsuarioAlta(String pmpUsuarioAlta) {
        this.pmpUsuarioAlta = pmpUsuarioAlta;
    }

    public Date getPmpFechaUltMod() {
        return pmpFechaUltMod;
    }

    public void setPmpFechaUltMod(Date pmpFechaUltMod) {
        this.pmpFechaUltMod = pmpFechaUltMod;
    }

    public String getPmpUsuarioUltMod() {
        return pmpUsuarioUltMod;
    }

    public void setPmpUsuarioUltMod(String pmpUsuarioUltMod) {
        this.pmpUsuarioUltMod = pmpUsuarioUltMod;
    }

    public Date getPmpFechaBaja() {
        return pmpFechaBaja;
    }

    public void setPmpFechaBaja(Date pmpFechaBaja) {
        this.pmpFechaBaja = pmpFechaBaja;
    }

    public String getPmpUsuarioBaja() {
        return pmpUsuarioBaja;
    }

    public void setPmpUsuarioBaja(String pmpUsuarioBaja) {
        this.pmpUsuarioBaja = pmpUsuarioBaja;
    }

    public String getPmpObservaciones() {
        return pmpObservaciones;
    }

    public void setPmpObservaciones(String pmpObservaciones) {
        this.pmpObservaciones = pmpObservaciones;
    }
}
