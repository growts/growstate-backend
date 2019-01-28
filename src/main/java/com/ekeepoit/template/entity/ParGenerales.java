package com.ekeepoit.template.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "par_generales")
public class ParGenerales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pag_id")
    private Integer pagId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pag_codigo")
    private String pagCodigo;
    @Column(name = "pag_numerico")
    private Double pagNumerico;
    @Column(name = "pag_alfanumerico")
    private String pagAlfanumerico;
    @Column(name = "pag_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pagFecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pag_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pagFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pag_usuario_alta")
    private String pagUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pag_fecha_ult_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pagFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pag_usuario_ult_mod")
    private String pagUsuarioUltMod;
    @Column(name = "pag_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pagFechaBaja;
    @Column(name = "pag_usuario_baja")
    private String pagUsuarioBaja;

    public Integer getPagId() {
        return pagId;
    }

    public void setPagId(Integer pagId) {
        this.pagId = pagId;
    }

    public String getPagCodigo() {
        return pagCodigo;
    }

    public void setPagCodigo(String pagCodigo) {
        this.pagCodigo = pagCodigo;
    }

    public Double getPagNumerico() {
        return pagNumerico;
    }

    public void setPagNumerico(Double pagNumerico) {
        this.pagNumerico = pagNumerico;
    }

    public String getPagAlfanumerico() {
        return pagAlfanumerico;
    }

    public void setPagAlfanumerico(String pagAlfanumerico) {
        this.pagAlfanumerico = pagAlfanumerico;
    }

    public Date getPagFecha() {
        return pagFecha;
    }

    public void setPagFecha(Date pagFecha) {
        this.pagFecha = pagFecha;
    }

    public Date getPagFechaAlta() {
        return pagFechaAlta;
    }

    public void setPagFechaAlta(Date pagFechaAlta) {
        this.pagFechaAlta = pagFechaAlta;
    }

    public String getPagUsuarioAlta() {
        return pagUsuarioAlta;
    }

    public void setPagUsuarioAlta(String pagUsuarioAlta) {
        this.pagUsuarioAlta = pagUsuarioAlta;
    }

    public Date getPagFechaUltMod() {
        return pagFechaUltMod;
    }

    public void setPagFechaUltMod(Date pagFechaUltMod) {
        this.pagFechaUltMod = pagFechaUltMod;
    }

    public String getPagUsuarioUltMod() {
        return pagUsuarioUltMod;
    }

    public void setPagUsuarioUltMod(String pagUsuarioUltMod) {
        this.pagUsuarioUltMod = pagUsuarioUltMod;
    }

    public Date getPagFechaBaja() {
        return pagFechaBaja;
    }

    public void setPagFechaBaja(Date pagFechaBaja) {
        this.pagFechaBaja = pagFechaBaja;
    }

    public String getPagUsuarioBaja() {
        return pagUsuarioBaja;
    }

    public void setPagUsuarioBaja(String pagUsuarioBaja) {
        this.pagUsuarioBaja = pagUsuarioBaja;
    }
}
