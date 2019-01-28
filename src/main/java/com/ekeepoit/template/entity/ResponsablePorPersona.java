package com.ekeepoit.template.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "responsable_por_persona")
public class ResponsablePorPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rpp_id")
    private long rppId;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "rpp_id_representado",referencedColumnName = "prs_id")
    @ManyToOne(optional = false)
    private Persona rppIdRepresentado;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "rpp_id_representante",referencedColumnName = "prs_id")
    @ManyToOne(optional = false)
    private Persona rppIdRepresentante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rpp_fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rppFechaInicio;
    @Basic(optional = false)
    @Column(name = "rpp_fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date  rppFechaFin;
    @Column(name = "rpp_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rppFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "rpp_usuario_alta")
    private String rppUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rpp_fecha_ult_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rppFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "rpp_usuario_ult_mod")
    private String rppUsuarioUltMod;
    @Column(name = "rpp_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rppFechaBaja;
    @Size(min = 1, max = 45)
    @Column(name = "rpp_usuario_baja")
    private String rppUsuarioBaja;


    public long getRppId() {
        return rppId;
    }

    public void setRppId(long rppId) {
        this.rppId = rppId;
    }

    public Persona getRppIdRepresentado() {
        return rppIdRepresentado;
    }

    public void setRppIdRepresentado(Persona rppIdRepresentado) {
        this.rppIdRepresentado = rppIdRepresentado;
    }

    public Persona getRppIdRepresentante() {
        return rppIdRepresentante;
    }

    public void setRppIdRepresentante(Persona rppIdRepresentante) {
        this.rppIdRepresentante = rppIdRepresentante;
    }

    public Date getRppFechaInicio() {
        return rppFechaInicio;
    }

    public void setRppFechaInicio(Date rppFechaInicio) {
        this.rppFechaInicio = rppFechaInicio;
    }

    public Date getRppFechaFin() {
        return rppFechaFin;
    }

    public void setRppFechaFin(Date rppFechaFin) {
        this.rppFechaFin = rppFechaFin;
    }

    public Date getRppFechaAlta() {
        return rppFechaAlta;
    }

    public void setRppFechaAlta(Date rppFechaAlta) {
        this.rppFechaAlta = rppFechaAlta;
    }

    public String getRppUsuarioAlta() {
        return rppUsuarioAlta;
    }

    public void setRppUsuarioAlta(String rppUsuarioAlta) {
        this.rppUsuarioAlta = rppUsuarioAlta;
    }

    public Date getRppFechaUltMod() {
        return rppFechaUltMod;
    }

    public void setRppFechaUltMod(Date rppFechaUltMod) {
        this.rppFechaUltMod = rppFechaUltMod;
    }

    public String getRppUsuarioUltMod() {
        return rppUsuarioUltMod;
    }

    public void setRppUsuarioUltMod(String rppUsuarioUltMod) {
        this.rppUsuarioUltMod = rppUsuarioUltMod;
    }

    public Date getRppFechaBaja() {
        return rppFechaBaja;
    }

    public void setRppFechaBaja(Date rppFechaBaja) {
        this.rppFechaBaja = rppFechaBaja;
    }

    public String getRppUsuarioBaja() {
        return rppUsuarioBaja;
    }

    public void setRppUsuarioBaja(String rppUsuarioBaja) {
        this.rppUsuarioBaja = rppUsuarioBaja;
    }

}

