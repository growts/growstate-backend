package com.ekeepoit.template.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "ajuste_precio")
public class AjustePrecio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ajp_id")
    private Integer ajpId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ajp_importe")
    private Double ajpImporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ajp_porcentaje")
    private Double ajpPorcentaje;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "ajp_ppc_id", referencedColumnName = "ppc_id")
    @ManyToOne(optional=false)
    private PrecioPorCurso ajpPpcId;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "ajp_cco_id", referencedColumnName = "cco_id")
    @ManyToOne(optional=false)
    private Concepto ajpCcoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ajp_fecha_desde")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ajpFechaDesde;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ajp_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ajpFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ajp_usuario_alta")
    private String ajpUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ajp_fecha_ult_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ajpFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ajp_usuario_ult_mod")
    private String ajpUsuarioUltMod;
    @Basic(optional = true)
    @Column(name = "ajp_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ajpFechaBaja;
    @Basic(optional = true)
    @Column(name = "ajp_usuario_baja")
    private String ajpUsuarioBaja;

    public Integer getAjpId() {
        return ajpId;
    }

    public void setAjpId(Integer ajpId) {
        this.ajpId = ajpId;
    }

    public PrecioPorCurso getAjpPpcId() {
        return ajpPpcId;
    }

    public void setAjpPpcId(PrecioPorCurso ajpPpcId) {
        this.ajpPpcId = ajpPpcId;
    }

    public Concepto getAjpCcoId() {
        return ajpCcoId;
    }

    public void setAjpCcoId(Concepto ajpCcoId) {
        this.ajpCcoId = ajpCcoId;
    }

    public Date getAjpFechaDesde() {
        return ajpFechaDesde;
    }

    public void setAjpFechaDesde(Date ajpFechaDesde) {
        this.ajpFechaDesde = ajpFechaDesde;
    }

    public Date getAjpFechaAlta() {
        return ajpFechaAlta;
    }

    public void setAjpFechaAlta(Date ajpFechaAlta) {
        this.ajpFechaAlta = ajpFechaAlta;
    }

    public String getAjpUsuarioAlta() {
        return ajpUsuarioAlta;
    }

    public void setAjpUsuarioAlta(String ajpUsuarioAlta) {
        this.ajpUsuarioAlta = ajpUsuarioAlta;
    }

    public Date getAjpFechaUltMod() {
        return ajpFechaUltMod;
    }

    public void setAjpFechaUltMod(Date ajpFechaUltMod) {
        this.ajpFechaUltMod = ajpFechaUltMod;
    }

    public String getAjpUsuarioUltMod() {
        return ajpUsuarioUltMod;
    }

    public void setAjpUsuarioUltMod(String ajpUsuarioUltMod) {
        this.ajpUsuarioUltMod = ajpUsuarioUltMod;
    }

    public Date getAjpFechaBaja() {
        return ajpFechaBaja;
    }

    public void setAjpFechaBaja(Date ajpFechaBaja) {
        this.ajpFechaBaja = ajpFechaBaja;
    }

    public String getAjpUsuarioBaja() {
        return ajpUsuarioBaja;
    }

    public void setAjpUsuarioBaja(String ajpUsuarioBaja) {
        this.ajpUsuarioBaja = ajpUsuarioBaja;
    }

    public Double getAjpImporte() {
        return ajpImporte;
    }

    public void setAjpImporte(Double ajpImporte) {
        this.ajpImporte = ajpImporte;
    }

    public Double getAjpPorcentaje() {
        return ajpPorcentaje;
    }

    public void setAjpPorcentaje(Double ajpPorcentaje) {
        this.ajpPorcentaje = ajpPorcentaje;
    }
}
