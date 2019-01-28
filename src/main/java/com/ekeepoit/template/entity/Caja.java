package com.ekeepoit.template.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "caja")
public class Caja implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cja_id")
    private Integer cjaId;
    @Basic(optional = false)
    @JoinColumn(name = "cja_sde_id", referencedColumnName = "sde_id")
    @ManyToOne(optional = false)
    private Sede cjaSdeId;
    @Basic(optional = false)
    @Column(name = "cja_enabled")
    private Integer cjaEnabled;
    @Basic
    @Column(name = "cja_observaciones")
    private String cjaObservaciones;
    @Basic(optional = false)
    @Column(name = "cja_fecha_alta")
    private Timestamp cjaFechaAlta;
    @Basic(optional = false)
    @Column(name = "cja_usuario_alta")
    private String cjaUsuarioAlta;
    @Basic(optional = false)
    @Column(name = "cja_fecha_ult_mod")
    private Timestamp cjaFechaUtlMod;
    @Basic(optional = false)
    @Column(name = "cja_usuario_ult_mod")
    private String cjaUsuarioUltMod;
    @Basic
    @Column(name = "cja_fecha_baja")
    private Timestamp cjaFechaBaja;
    @Basic
    @Column(name = "cja_usuario_baja")
    private String cjaUsuarioBaja;

    public Integer getCjaId() {
        return cjaId;
    }

    public void setCjaId(Integer cjaId) {
        this.cjaId = cjaId;
    }

    public Sede getCjaSdeId() {
        return cjaSdeId;
    }

    public void setCjaSdeId(Sede cjaSdeId) {
        this.cjaSdeId = cjaSdeId;
    }

    public Integer getCjaEnabled() {
        return cjaEnabled;
    }

    public void setCjaEnabled(Integer cjaEnabled) {
        this.cjaEnabled = cjaEnabled;
    }

    public String getCjaObservaciones() {
        return cjaObservaciones;
    }

    public void setCjaObservaciones(String cjaObservaciones) {
        this.cjaObservaciones = cjaObservaciones;
    }

    public Timestamp getCjaFechaAlta() {
        return cjaFechaAlta;
    }

    public void setCjaFechaAlta(Timestamp cjaFechaAlta) {
        this.cjaFechaAlta = cjaFechaAlta;
    }

    public String getCjaUsuarioAlta() {
        return cjaUsuarioAlta;
    }

    public void setCjaUsuarioAlta(String cjaUsuarioAlta) {
        this.cjaUsuarioAlta = cjaUsuarioAlta;
    }

    public Timestamp getCjaFechaUtlMod() {
        return cjaFechaUtlMod;
    }

    public void setCjaFechaUtlMod(Timestamp cjaFechaUtlMod) {
        this.cjaFechaUtlMod = cjaFechaUtlMod;
    }

    public String getCjaUsuarioUltMod() {
        return cjaUsuarioUltMod;
    }

    public void setCjaUsuarioUltMod(String cjaUsuarioUltMod) {
        this.cjaUsuarioUltMod = cjaUsuarioUltMod;
    }

    public Timestamp getCjaFechaBaja() {
        return cjaFechaBaja;
    }

    public void setCjaFechaBaja(Timestamp cjaFechaBaja) {
        this.cjaFechaBaja = cjaFechaBaja;
    }

    public String getCjaUsuarioBaja() {
        return cjaUsuarioBaja;
    }

    public void setCjaUsuarioBaja(String cjaUsuarioBaja) {
        this.cjaUsuarioBaja = cjaUsuarioBaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caja that = (Caja) o;
        return cjaId == that.cjaId &&
                Objects.equals(cjaSdeId, that.cjaSdeId) &&
                Objects.equals(cjaEnabled, that.cjaEnabled) &&
                Objects.equals(cjaObservaciones, that.cjaObservaciones) &&
                Objects.equals(cjaFechaAlta, that.cjaFechaAlta) &&
                Objects.equals(cjaUsuarioAlta, that.cjaUsuarioAlta) &&
                Objects.equals(cjaFechaUtlMod, that.cjaFechaUtlMod) &&
                Objects.equals(cjaUsuarioUltMod, that.cjaUsuarioUltMod) &&
                Objects.equals(cjaFechaBaja, that.cjaFechaBaja) &&
                Objects.equals(cjaUsuarioBaja, that.cjaUsuarioBaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cjaId, cjaSdeId, cjaEnabled, cjaObservaciones, cjaFechaAlta, cjaUsuarioAlta, cjaFechaUtlMod, cjaUsuarioUltMod, cjaFechaBaja, cjaUsuarioBaja);
    }
}
