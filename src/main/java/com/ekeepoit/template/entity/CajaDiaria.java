package com.ekeepoit.template.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "caja_diaria")
public class CajaDiaria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cjd_id")
    private Integer cjdId;
    @Basic(optional = false)
    @JoinColumn(name = "cjd_cja_id", referencedColumnName = "cja_id")
    @ManyToOne(optional = false)
    private Caja cjdCjaId;
    @Basic(optional = false)
    @JoinColumn(name = "cjd_prs_id", referencedColumnName = "prs_id")
    @ManyToOne(optional = false)
    private Persona cjdPrsId;
    @Basic(optional = false)
    @Column(name = "cjd_fecha_apertura")
    private Timestamp cjdFechaApertura;
    @Basic
    @Column(name = "cjd_fecha_cierre")
    private Timestamp cjdFechaCierre;
    @Basic(optional = false)
    @Column(name = "cjd_monto_inicial")
    private Double cjdMontoInicial;
    @Basic
    @Column(name = "cjd_total_ingresos")
    private Double cjdTotalIngresos;
    @Basic
    @Column(name = "cjd_total_egresos")
    private Double cjdTotalEgresos;
    @Basic
    @Column(name = "cjd_monto_cierre")
    private Double cjdMontoCierre;
    @Basic(optional = false)
    @Column(name = "cjd_fecha_alta")
    private Timestamp cjdFechaAlta;
    @Basic(optional = false)
    @Column(name = "cjd_usuario_alta")
    private String cjdUsuarioAlta;
    @Basic(optional = false)
    @Column(name = "cjd_fecha_ult_mod")
    private Timestamp cjdFechaUtlMod;
    @Basic(optional = false)
    @Column(name = "cjd_usuario_ult_mod")
    private String cjdUsuarioUltMod;
    @Basic
    @Column(name = "cjd_fecha_baja")
    private Timestamp cjdFechaBaja;
    @Basic
    @Column(name = "cjd_usuario_baja")
    private String cjdUsuarioBaja;



    public Integer getCjdId() {
        return cjdId;
    }

    public void setCjdId(Integer cjdId) {
        this.cjdId = cjdId;
    }

    public Caja getCjdCjaId() {
        return cjdCjaId;
    }

    public void setCjdCjaId(Caja cjdCjaId) {
        this.cjdCjaId = cjdCjaId;
    }

    public Timestamp getCjdFechaApertura() {
        return cjdFechaApertura;
    }

    public void setCjdFechaApertura(Timestamp cjdFechaApertura) {
        this.cjdFechaApertura = cjdFechaApertura;
    }

    public Timestamp getCjdFechaCierre() {
        return cjdFechaCierre;
    }

    public void setCjdFechaCierre(Timestamp cjdFechaCierre) {
        this.cjdFechaCierre = cjdFechaCierre;
    }

    public Double getCjdMontoInicial() {
        return cjdMontoInicial;
    }

    public void setCjdMontoInicial(Double cjdMontoInicial) {
        this.cjdMontoInicial = cjdMontoInicial;
    }

    public Double getCjdTotalIngresos() {
        return cjdTotalIngresos;
    }

    public void setCjdTotalIngresos(Double cjdTotalIngresos) {
        this.cjdTotalIngresos = cjdTotalIngresos;
    }

    public Double getCjdTotalEgresos() {
        return cjdTotalEgresos;
    }

    public void setCjdTotalEgresos(Double cjdTotalEgresos) {
        this.cjdTotalEgresos = cjdTotalEgresos;
    }

    public Double getCjdMontoCierre() {
        return cjdMontoCierre;
    }

    public void setCjdMontoCierre(Double cjdMontoCierre) {
        this.cjdMontoCierre = cjdMontoCierre;
    }

    public Timestamp getCjdFechaAlta() {
        return cjdFechaAlta;
    }

    public void setCjdFechaAlta(Timestamp cjdFechaAlta) {
        this.cjdFechaAlta = cjdFechaAlta;
    }

    public String getCjdUsuarioAlta() {
        return cjdUsuarioAlta;
    }

    public void setCjdUsuarioAlta(String cjdUsuarioAlta) {
        this.cjdUsuarioAlta = cjdUsuarioAlta;
    }

    public Timestamp getCjdFechaUtlMod() {
        return cjdFechaUtlMod;
    }

    public void setCjdFechaUtlMod(Timestamp cjdFechaUtlMod) {
        this.cjdFechaUtlMod = cjdFechaUtlMod;
    }

    public String getCjdUsuarioUltMod() {
        return cjdUsuarioUltMod;
    }

    public void setCjdUsuarioUltMod(String cjdUsuarioUltMod) {
        this.cjdUsuarioUltMod = cjdUsuarioUltMod;
    }

    public Timestamp getCjdFechaBaja() {
        return cjdFechaBaja;
    }

    public void setCjdFechaBaja(Timestamp cjdFechaBaja) {
        this.cjdFechaBaja = cjdFechaBaja;
    }

    public String getCjdUsuarioBaja() {
        return cjdUsuarioBaja;
    }

    public void setCjdUsuarioBaja(String cjdUsuarioBaja) {
        this.cjdUsuarioBaja = cjdUsuarioBaja;
    }

    public Persona getCjdPrsId() {
        return cjdPrsId;
    }

    public void setCjdPrsId(Persona cjdPrsId) {
        this.cjdPrsId = cjdPrsId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CajaDiaria)) return false;
        CajaDiaria that = (CajaDiaria) o;
        return Objects.equals(cjdId, that.cjdId) &&
                Objects.equals(cjdCjaId, that.cjdCjaId) &&
                Objects.equals(cjdPrsId, that.cjdPrsId) &&
                Objects.equals(cjdFechaApertura, that.cjdFechaApertura) &&
                Objects.equals(cjdFechaCierre, that.cjdFechaCierre) &&
                Objects.equals(cjdMontoInicial, that.cjdMontoInicial) &&
                Objects.equals(cjdTotalIngresos, that.cjdTotalIngresos) &&
                Objects.equals(cjdTotalEgresos, that.cjdTotalEgresos) &&
                Objects.equals(cjdMontoCierre, that.cjdMontoCierre) &&
                Objects.equals(cjdFechaAlta, that.cjdFechaAlta) &&
                Objects.equals(cjdUsuarioAlta, that.cjdUsuarioAlta) &&
                Objects.equals(cjdFechaUtlMod, that.cjdFechaUtlMod) &&
                Objects.equals(cjdUsuarioUltMod, that.cjdUsuarioUltMod) &&
                Objects.equals(cjdFechaBaja, that.cjdFechaBaja) &&
                Objects.equals(cjdUsuarioBaja, that.cjdUsuarioBaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cjdId, cjdCjaId, cjdPrsId, cjdFechaApertura, cjdFechaCierre, cjdMontoInicial, cjdTotalIngresos, cjdTotalEgresos, cjdMontoCierre, cjdFechaAlta, cjdUsuarioAlta, cjdFechaUtlMod, cjdUsuarioUltMod, cjdFechaBaja, cjdUsuarioBaja);
    }
}
