package com.ekeepoit.template.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "movimientos_caja")
public class MovimientosCaja implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mca_id")
    private Integer mcaId;
    @Basic(optional = false)
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="mca_cjd_id")
    private CajaDiaria mcaCjdId;
    @Basic(optional = false)
    @Column(name = "mca_tipo_movimiento")
    private String mcaTipoMovimiento;
    @Basic(optional = false)
    @Column(name = "mca_importe")
    private Double mcaImporte;
    @Basic(optional = false)
    @Column(name = "mca_fecha")
    private Timestamp mcaFecha;
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="mca_cco_id")
    private Concepto mcaCcoId;
    @Basic
    @Column(name = "mca_observaciones")
    private String mcaObservaciones;
    @Basic(optional = false)
    @Column(name = "mca_fecha_alta")
    private Timestamp mcaFechaAlta;
    @Basic(optional = false)
    @Column(name = "mca_usuario_alta")
    private String mcaUsuarioAlta;
    @Basic(optional = false)
    @Column(name = "mca_fecha_ult_mod")
    private Timestamp mcaFechaUtlMod;
    @Basic(optional = false)
    @Column(name = "mca_usuario_ult_mod")
    private String mcaUsuarioUltMod;
    @Basic
    @Column(name = "mca_fecha_baja")
    private Timestamp mcaFechaBaja;
    @Basic
    @Column(name = "mca_usuario_baja")
    private String mcaUsuarioBaja;

    public Integer getMcaId() {
        return mcaId;
    }

    public void setMcaId(Integer mcaId) {
        this.mcaId = mcaId;
    }

    public CajaDiaria getMcaCjdId() {
        return mcaCjdId;
    }

    public void setMcamcaId(CajaDiaria mcamcaId) {
        this.mcaCjdId = mcamcaId;
    }

    public String getMcaTipoMovimiento() {
        return mcaTipoMovimiento;
    }

    public void setMcaTipoMovimiento(String mcaTipoMovimiento) {
        this.mcaTipoMovimiento = mcaTipoMovimiento;
    }

    public Double getMcaImporte() {
        return mcaImporte;
    }

    public void setMcaImporte(Double mcaImporte) {
        this.mcaImporte = mcaImporte;
    }

    public Timestamp getMcaFecha() {
        return mcaFecha;
    }

    public void setMcaFecha(Timestamp mcaFecha) {
        this.mcaFecha = mcaFecha;
    }

    public Concepto getMcaCcoId() {
        return mcaCcoId;
    }

    public void setMcaCcoId(Concepto mcaCcoId) {
        this.mcaCcoId = mcaCcoId;
    }

    public String getMcaObservaciones() {
        return mcaObservaciones;
    }

    public void setMcaObservaciones(String mcaObservaciones) {
        this.mcaObservaciones = mcaObservaciones;
    }

    public Timestamp getMcaFechaAlta() {
        return mcaFechaAlta;
    }

    public void setMcaFechaAlta(Timestamp mcaFechaAlta) {
        this.mcaFechaAlta = mcaFechaAlta;
    }

    public String getMcaUsuarioAlta() {
        return mcaUsuarioAlta;
    }

    public void setMcaUsuarioAlta(String mcaUsuarioAlta) {
        this.mcaUsuarioAlta = mcaUsuarioAlta;
    }

    public Timestamp getMcaFechaUtlMod() {
        return mcaFechaUtlMod;
    }

    public void setMcaFechaUtlMod(Timestamp mcaFechaUtlMod) {
        this.mcaFechaUtlMod = mcaFechaUtlMod;
    }

    public String getMcaUsuarioUltMod() {
        return mcaUsuarioUltMod;
    }

    public void setMcaUsuarioUltMod(String mcaUsuarioUltMod) {
        this.mcaUsuarioUltMod = mcaUsuarioUltMod;
    }

    public Timestamp getMcaFechaBaja() {
        return mcaFechaBaja;
    }

    public void setMcaFechaBaja(Timestamp mcaFechaBaja) {
        this.mcaFechaBaja = mcaFechaBaja;
    }

    public String getMcaUsuarioBaja() {
        return mcaUsuarioBaja;
    }

    public void setMcaUsuarioBaja(String mcaUsuarioBaja) {
        this.mcaUsuarioBaja = mcaUsuarioBaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovimientosCaja that = (MovimientosCaja) o;
        return mcaId == that.mcaId &&
                Objects.equals(mcaCjdId, that.mcaCjdId) &&
                Objects.equals(mcaTipoMovimiento, that.mcaTipoMovimiento) &&
                Objects.equals(mcaImporte, that.mcaImporte) &&
                Objects.equals(mcaFecha, that.mcaFecha) &&
                Objects.equals(mcaCcoId, that.mcaCcoId) &&
                Objects.equals(mcaObservaciones, that.mcaObservaciones) &&
                Objects.equals(mcaFechaAlta, that.mcaFechaAlta) &&
                Objects.equals(mcaUsuarioAlta, that.mcaUsuarioAlta) &&
                Objects.equals(mcaFechaUtlMod, that.mcaFechaUtlMod) &&
                Objects.equals(mcaUsuarioUltMod, that.mcaUsuarioUltMod) &&
                Objects.equals(mcaFechaBaja, that.mcaFechaBaja) &&
                Objects.equals(mcaUsuarioBaja, that.mcaUsuarioBaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcaId, mcaCjdId, mcaTipoMovimiento, mcaImporte, mcaFecha, mcaCcoId, mcaObservaciones, mcaFechaAlta, mcaUsuarioAlta, mcaFechaUtlMod, mcaUsuarioUltMod, mcaFechaBaja, mcaUsuarioBaja);
    }
}
