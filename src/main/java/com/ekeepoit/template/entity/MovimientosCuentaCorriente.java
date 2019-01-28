package com.ekeepoit.template.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "movimientos_cuenta_corriente")
public class MovimientosCuentaCorriente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mcc_id")
    private Integer mccId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mcc_importe")
    private double mccImporte;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "mcc_obn_id", referencedColumnName = "obn_id")
    @ManyToOne(optional=false)
    @JsonIgnore
    private Obligaciones mccObnId;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "mcc_cco_id", referencedColumnName = "cco_id")
    @ManyToOne(optional=false)
    private Concepto mccCcoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mcc_tipo_movimiento")
    private String mccTipoMovimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mcc_tipo_origen")
    private String mccTipoOrigen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mcc_origen")
    private Integer mccOrigen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mcc_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mccFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mcc_usuario_alta")
    private String mccUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mcc_fecha_ult_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mccFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mcc_usuario_ult_mod")
    private String mccUsuarioUltMod;
    @Column(name = "mcc_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mccFechaBaja;
    @Column(name = "mcc_usuario_baja")
    private String mccUsuarioBaja;

    public Integer getMccId() {
        return mccId;
    }

    public void setMccId(Integer mccId) {
        this.mccId = mccId;
    }

    public Double getMccImporte() {
        return mccImporte;
    }

    public void setMccImporte(Double mccImporte) {
        this.mccImporte = mccImporte;
    }

    public Obligaciones getMccObnId() {
        return mccObnId;
    }

    public void setMccObnId(Obligaciones mccObnId) {
        this.mccObnId = mccObnId;
    }

    public Concepto getMccCcoId() {
        return mccCcoId;
    }

    public void setMccCcoId(Concepto mccCcoId) {
        this.mccCcoId = mccCcoId;
    }

    public String getMccTipoMovimiento() {
        return mccTipoMovimiento;
    }

    public void setMccTipoMovimiento(String mccTipoMovimiento) {
        this.mccTipoMovimiento = mccTipoMovimiento;
    }

    public String getMccTipoOrigen() {
        return mccTipoOrigen;
    }

    public void setMccTipoOrigen(String mccTipoOrigen) {
        this.mccTipoOrigen = mccTipoOrigen;
    }

    public Integer getMccOrigen() {
        return mccOrigen;
    }

    public void setMccOrigen(Integer mccOrigen) {
        this.mccOrigen = mccOrigen;
    }

    public Date getMccFechaAlta() {
        return mccFechaAlta;
    }

    public void setMccFechaAlta(Date mccFechaAlta) {
        this.mccFechaAlta = mccFechaAlta;
    }

    public String getMccUsuarioAlta() {
        return mccUsuarioAlta;
    }

    public void setMccUsuarioAlta(String mccUsuarioAlta) {
        this.mccUsuarioAlta = mccUsuarioAlta;
    }

    public Date getMccFechaUltMod() {
        return mccFechaUltMod;
    }

    public void setMccFechaUltMod(Date mccFechaUltMod) {
        this.mccFechaUltMod = mccFechaUltMod;
    }

    public String getMccUsuarioUltMod() {
        return mccUsuarioUltMod;
    }

    public void setMccUsuarioUltMod(String mccUsuarioUltMod) {
        this.mccUsuarioUltMod = mccUsuarioUltMod;
    }

    public Date getMccFechaBaja() {
        return mccFechaBaja;
    }

    public void setMccFechaBaja(Date mccFechaBaja) {
        this.mccFechaBaja = mccFechaBaja;
    }

    public String getMccUsuarioBaja() {
        return mccUsuarioBaja;
    }

    public void setMccUsuarioBaja(String mccUsuarioBaja) {
        this.mccUsuarioBaja = mccUsuarioBaja;
    }
}
