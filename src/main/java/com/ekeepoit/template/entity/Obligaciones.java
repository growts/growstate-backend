package com.ekeepoit.template.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "obligaciones")
public class Obligaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "obn_id")
    private Integer obnId;
    @JoinColumn(name = "obn_pcr_id", referencedColumnName = "pcr_id")
    @ManyToOne(optional=false)
    private PersonaPorCurso obnPcrId;
    @JoinColumn(name = "obn_ppc_id", referencedColumnName = "ppc_id")
    @ManyToOne
    private PrecioPorCurso obnPpcId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obn_periodo")
    private Integer obnPeriodo;
    @Column(name = "obn_observaciones")
    private String obnObservaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obn_cuota")
    private Integer obnCuota;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obn_importe_original")
    private Double obnImporteOriginal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obn_saldo")
    private Double obnSaldo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obn_manual")
    private Integer obnManual = 0;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obn_fecha_vto_original")
    @Temporal(TemporalType.TIMESTAMP)
    private Date obnFechaVtoOriginal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obn_fecha_vto_prorrogado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date obnFechaVtoProrrogado;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "obn_cco_id", referencedColumnName = "cco_id")
    @ManyToOne(optional=false)
    private Concepto obnCcoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obn_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date obnFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obn_usuario_alta")
    private String obnUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obn_fecha_ult_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date obnFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obn_usuario_ult_mod")
    private String obnUsuarioUltMod;
    @Column(name = "obn_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date obnFechaBaja;
    @Column(name = "obn_usuario_baja")
    private String obnUsuarioBaja;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mccObnId")
    private List<MovimientosCuentaCorriente> lstMovimientosCuentaCorriente;

    public Integer getObnId() {
        return obnId;
    }

    public void setObnId(Integer obnId) {
        this.obnId = obnId;
    }

    public Integer getObnPeriodo() {
        return obnPeriodo;
    }

    public void setObnPeriodo(Integer obnPeriodo) {
        this.obnPeriodo = obnPeriodo;
    }

    public Integer getObnCuota() {
        return obnCuota;
    }

    public void setObnCuota(Integer obnCuota) {
        this.obnCuota = obnCuota;
    }

    public Double getObnImporteOriginal() {
        return obnImporteOriginal;
    }

    public void setObnImporteOriginal(Double obnImporteOriginal) {
        this.obnImporteOriginal = obnImporteOriginal;
    }

    public Double getObnSaldo() {
        return obnSaldo;
    }

    public void setObnSaldo(Double obnSaldo) {
        this.obnSaldo = obnSaldo;
    }

    public Date getObnFechaVtoOriginal() {
        return obnFechaVtoOriginal;
    }

    public void setObnFechaVtoOriginal(Date obnFechaVtoOriginal) {
        this.obnFechaVtoOriginal = obnFechaVtoOriginal;
    }

    public Date getObnFechaVtoProrrogado() {
        return obnFechaVtoProrrogado;
    }

    public void setObnFechaVtoProrrogado(Date obnFechaVtoProrrogado) {
        this.obnFechaVtoProrrogado = obnFechaVtoProrrogado;
    }

    public Concepto getObnCcoId() {
        return obnCcoId;
    }

    public void setObnCcoId(Concepto obnCcoId) {
        this.obnCcoId = obnCcoId;
    }

    public Date getObnFechaAlta() {
        return obnFechaAlta;
    }

    public void setObnFechaAlta(Date obnFechaAlta) {
        this.obnFechaAlta = obnFechaAlta;
    }

    public String getObnUsuarioAlta() {
        return obnUsuarioAlta;
    }

    public void setObnUsuarioAlta(String obnUsuarioAlta) {
        this.obnUsuarioAlta = obnUsuarioAlta;
    }

    public Date getObnFechaUltMod() {
        return obnFechaUltMod;
    }

    public void setObnFechaUltMod(Date obnFechaUltMod) {
        this.obnFechaUltMod = obnFechaUltMod;
    }

    public String getObnUsuarioUltMod() {
        return obnUsuarioUltMod;
    }

    public void setObnUsuarioUltMod(String obnUsuarioUltMod) {
        this.obnUsuarioUltMod = obnUsuarioUltMod;
    }

    public Date getObnFechaBaja() {
        return obnFechaBaja;
    }

    public void setObnFechaBaja(Date obnFechaBaja) {
        this.obnFechaBaja = obnFechaBaja;
    }

    public String getObnUsuarioBaja() {
        return obnUsuarioBaja;
    }

    public void setObnUsuarioBaja(String obnUsuarioBaja) {
        this.obnUsuarioBaja = obnUsuarioBaja;
    }

    public List<MovimientosCuentaCorriente> getLstMovimientosCuentaCorriente() {
        return lstMovimientosCuentaCorriente;
    }

    public void setLstMovimientosCuentaCorriente(List<MovimientosCuentaCorriente> lstMovimientosCuentaCorriente) {
        this.lstMovimientosCuentaCorriente = lstMovimientosCuentaCorriente;
    }

    public PersonaPorCurso getObnPcrId() {
        return obnPcrId;
    }

    public void setObnPcrId(PersonaPorCurso obnPpcId) {
        this.obnPcrId = obnPpcId;
    }

    public PrecioPorCurso getObnPpcId() {
        return obnPpcId;
    }

    public void setObnPpcId(PrecioPorCurso obnPpcId) {
        this.obnPpcId = obnPpcId;
    }

    public Integer getObnManual() {
        return obnManual;
    }

    public void setObnManual(Integer obnManual) {
        this.obnManual = obnManual;
    }

    public String getObnObservaciones() {
        return obnObservaciones;
    }

    public void setObnObservaciones(String obnObservaciones) {
        this.obnObservaciones = obnObservaciones;
    }
}
