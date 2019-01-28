package com.ekeepoit.template.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "tipo_concepto")
public class TipoConcepto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tpo_id")
    private Integer tpoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tpo_descripcion")
    private String tpoDescripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tpo_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpoFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tpo_usuario_alta")
    private String tpoUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tpo_fecha_ult_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpoFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tpo_usuario_ult_mod")
    private String tpoUsuarioUltMod;
    @Basic(optional = true)
    @Column(name = "tpo_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tpoFechaBaja;
    @Basic(optional = true)
    @Column(name = "tpo_usuario_baja")
    private String tpoUsuarioBaja;

    public Integer getTpoId() {
        return tpoId;
    }

    public void setTpoId(Integer tpoId) {
        this.tpoId = tpoId;
    }

    public String getTpoDescripcion() {
        return tpoDescripcion;
    }

    public void setTpoDescripcion(String tpoDescripcion) {
        this.tpoDescripcion = tpoDescripcion;
    }

    public Date getTpoFechaAlta() {
        return tpoFechaAlta;
    }

    public void setTpoFechaAlta(Date tpoFechaAlta) {
        this.tpoFechaAlta = tpoFechaAlta;
    }

    public String getTpoUsuarioAlta() {
        return tpoUsuarioAlta;
    }

    public void setTpoUsuarioAlta(String tpoUsuarioAlta) {
        this.tpoUsuarioAlta = tpoUsuarioAlta;
    }

    public Date getTpoFechaUltMod() {
        return tpoFechaUltMod;
    }

    public void setTpoFechaUltMod(Date tpoFechaUltMod) {
        this.tpoFechaUltMod = tpoFechaUltMod;
    }

    public String getTpoUsuarioUltMod() {
        return tpoUsuarioUltMod;
    }

    public void setTpoUsuarioUltMod(String tpoUsuarioUltMod) {
        this.tpoUsuarioUltMod = tpoUsuarioUltMod;
    }

    public Date getTpoFechaBaja() {
        return tpoFechaBaja;
    }

    public void setTpoFechaBaja(Date tpoFechaBaja) {
        this.tpoFechaBaja = tpoFechaBaja;
    }

    public String getTpoUsuarioBaja() {
        return tpoUsuarioBaja;
    }

    public void setTpoUsuarioBaja(String tpoUsuarioBaja) {
        this.tpoUsuarioBaja = tpoUsuarioBaja;
    }
}
