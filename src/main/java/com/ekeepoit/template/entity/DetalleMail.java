package com.ekeepoit.template.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "detalle_mail")
public class DetalleMail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mad_id")
    private Integer madId;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "mad_to", referencedColumnName = "prs_id")
    @ManyToOne(optional = false)
    private Persona madTo;
    @JsonIgnore
    @JoinColumn(name = "mad_mail_id", referencedColumnName = "mail_id")
    @ManyToOne(optional = false)
    private Mail madMailId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mad_fecha_alta")
    @Temporal(TemporalType.DATE)
    private Date madFechaAlta;
    @Column(name = "mad_fecha_baja")
    @Temporal(TemporalType.DATE)
    private Date madFechaBaja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mad_fecha_ult_mod")
    @Temporal(TemporalType.DATE)
    private Date madFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "mad_usuario_alta")
    private String madUsuarioAlta;
    @Size(max = 30)
    @Column(name = "mad_usuario_baja")
    private String madUsuarioBaja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "mad_usuario_ult_mod")
    private String madUsuarioUltMod;

    public Integer getMadId() {
        return madId;
    }

    public void setMadId(Integer madId) {
        this.madId = madId;
    }

    public Mail getMadMailId() {
        return madMailId;
    }

    public void setMadMailId(Mail madMailId) {
        this.madMailId = madMailId;
    }

    public Date getMadFechaAlta() {
        return madFechaAlta;
    }

    public void setMadFechaAlta(Date madFechaAlta) {
        this.madFechaAlta = madFechaAlta;
    }

    public Date getMadFechaBaja() {
        return madFechaBaja;
    }

    public void setMadFechaBaja(Date madFechaBaja) {
        this.madFechaBaja = madFechaBaja;
    }

    public Date getMadFechaUltMod() {
        return madFechaUltMod;
    }

    public void setMadFechaUltMod(Date madFechaUltMod) {
        this.madFechaUltMod = madFechaUltMod;
    }

    public String getMadUsuarioAlta() {
        return madUsuarioAlta;
    }

    public void setMadUsuarioAlta(String madUsuarioAlta) {
        this.madUsuarioAlta = madUsuarioAlta;
    }

    public String getMadUsuarioBaja() {
        return madUsuarioBaja;
    }

    public void setMadUsuarioBaja(String madUsuarioBaja) {
        this.madUsuarioBaja = madUsuarioBaja;
    }

    public String getMadUsuarioUltMod() {
        return madUsuarioUltMod;
    }

    public void setMadUsuarioUltMod(String madUsuarioUltMod) {
        this.madUsuarioUltMod = madUsuarioUltMod;
    }

    public DetalleMail() {
    }

    public Persona getMadTo() {
        return madTo;
    }

    public void setMadTo(Persona madTo) {
        this.madTo = madTo;
    }
}
