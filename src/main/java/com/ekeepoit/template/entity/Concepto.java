package com.ekeepoit.template.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "concepto")
public class Concepto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cco_id")
    private Integer ccoId;
    @JoinColumn(name = "cco_tpo_id", referencedColumnName = "tpo_id")
    @ManyToOne(optional=false)
    private TipoConcepto ccoTpoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cco_descripcion")
    private String ccoDescripcion;
    @Column(name = "cco_prorrateable")
    private String ccoProrrateable;
    @Basic(optional = true)
    @NotNull
    @Column(name = "cco_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccoFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cco_usuario_alta")
    private String ccoUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cco_fecha_ult_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccoFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cco_usuario_ult_mod")
    private String ccoUsuarioUltMod;
    @Basic(optional = true)
    @Column(name = "cco_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccoFechaBaja;
    @Basic(optional = true)
    @Column(name = "cco_usuario_baja")
    private String ccoUsuarioBaja;

    @Column(name = "cco_aplica_dto")
    private Integer ccoAplicaDto;

    @Column(name = "cco_calcula_interes")
    private Integer ccoCalculaInteres;

    @Column(name = "cco_generacion_multiple")
    private Integer ccoGeneracionMultiple;

    public Integer getCcoId() {
        return ccoId;
    }

    public void setCcoId(Integer ccoId) {
        this.ccoId = ccoId;
    }

    public TipoConcepto getCcoTpoId() {
        return ccoTpoId;
    }

    public void setCcoTpoId(TipoConcepto ccoTpoId) {
        this.ccoTpoId = ccoTpoId;
    }

    public String getCcoDescripcion() {
        return ccoDescripcion;
    }

    public void setCcoDescripcion(String ccoDescripcion) {
        this.ccoDescripcion = ccoDescripcion;
    }

    public Date getCcoFechaAlta() {
        return ccoFechaAlta;
    }

    public void setCcoFechaAlta(Date ccoFechaAlta) {
        this.ccoFechaAlta = ccoFechaAlta;
    }

    public String getCcoUsuarioAlta() {
        return ccoUsuarioAlta;
    }

    public void setCcoUsuarioAlta(String ccoUsuarioAlta) {
        this.ccoUsuarioAlta = ccoUsuarioAlta;
    }

    public Date getCcoFechaUltMod() {
        return ccoFechaUltMod;
    }

    public void setCcoFechaUltMod(Date ccoFechaUltMod) {
        this.ccoFechaUltMod = ccoFechaUltMod;
    }

    public String getCcoUsuarioUltMod() {
        return ccoUsuarioUltMod;
    }

    public void setCcoUsuarioUltMod(String ccoUsuarioUltMod) {
        this.ccoUsuarioUltMod = ccoUsuarioUltMod;
    }

    public Date getCcoFechaBaja() {
        return ccoFechaBaja;
    }

    public void setCcoFechaBaja(Date ccoFechaBaja) {
        this.ccoFechaBaja = ccoFechaBaja;
    }

    public String getCcoUsuarioBaja() {
        return ccoUsuarioBaja;
    }

    public void setCcoUsuarioBaja(String ccoUsuarioBaja) {
        this.ccoUsuarioBaja = ccoUsuarioBaja;
    }

    public String getCcoProrrateable() {
        return ccoProrrateable;
    }

    public void setCcoProrrateable(String ccoProrrateable) {
        this.ccoProrrateable = ccoProrrateable;
    }

    public Integer getCcoAplicaDto() { return ccoAplicaDto; }

    public void setCcoAplicaDto(Integer ccoAplicaDto) { this.ccoAplicaDto = ccoAplicaDto; }

    public Integer getCcoCalculaInteres() {
        return ccoCalculaInteres;
    }

    public void setCcoCalculaInteres(Integer ccoCalculaInteres) {
        this.ccoCalculaInteres = ccoCalculaInteres;
    }

    public Integer getCcoGeneracionMultiple() {
        return ccoGeneracionMultiple;
    }

    public void setCcoGeneracionMultiple(Integer ccoGeneracionMultiple) {
        this.ccoGeneracionMultiple = ccoGeneracionMultiple;
    }
}
