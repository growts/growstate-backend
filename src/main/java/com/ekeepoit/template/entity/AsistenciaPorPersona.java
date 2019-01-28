package com.ekeepoit.template.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "asistencia_por_persona")
public class AsistenciaPorPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "asa_id")
    private Integer asaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "asa_fecha")
    @Temporal(TemporalType.DATE)
    private Date asaFecha;
    @Column(name = "asa_observaciones")
    private String asaObservaciones;
    @JoinColumn(name = "asa_pcr_id", referencedColumnName = "pcr_id")
    @ManyToOne(optional = false)
    private PersonaPorCurso asaPcrId;
    @Column(name = "asa_valor")
    private String asaValor;
    @NotNull
    @Column(name = "asa_hora_inicio")
    private String asaHoraInicio;
    @Column(name = "asa_hora_fin")
    private String asaHoraFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "asa_fecha_alta")
    @Temporal(TemporalType.DATE)
    private Date asaFechaAlta;
    @Column(name = "asa_fecha_baja")
    @Temporal(TemporalType.DATE)
    private Date asaFechaBaja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "asa_fecha_mod")
    @Temporal(TemporalType.DATE)
    private Date asaFechaMod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "asa_usuario_alta")
    private String asaUsuarioAlta;
    @Column(name = "asa_usuario_baja")
    private String asaUsuarioBaja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "asa_usuario_mod")
    private String asaUsuarioMod;


    public Integer getAsaId() {
        return asaId;
    }

    public void setAsaId(Integer asaId) {
        this.asaId = asaId;
    }


    public Date getAsaFecha() {
        return asaFecha;
    }

    public void setAsaFecha(Date asaFecha) {
        this.asaFecha = asaFecha;
    }

    public String getAsaObservaciones() {
        return asaObservaciones;
    }

    public void setAsaObservaciones(String asaObservaciones) {
        this.asaObservaciones = asaObservaciones;
    }

    public PersonaPorCurso getAsaPcrId() {
        return asaPcrId;
    }

    public void setAsaPcrId(PersonaPorCurso asaPcrId) {
        this.asaPcrId = asaPcrId;
    }

    public String getAsaValor() {
        return asaValor;
    }

    public void setAsaValor(String asaValor) {
        this.asaValor = asaValor;
    }

    public String getAsaHoraInicio() {
        return asaHoraInicio;
    }

    public void setAsaHoraInicio(String asaHoraInicio) {
        this.asaHoraInicio = asaHoraInicio;
    }

    public String getAsaHoraFin() {
        return asaHoraFin;
    }

    public void setAsaHoraFin(String asaHoraFin) {
        this.asaHoraFin = asaHoraFin;
    }

    public Date getAsaFechaAlta() {
        return asaFechaAlta;
    }

    public void setAsaFechaAlta(Date asaFechaAlta) {
        this.asaFechaAlta = asaFechaAlta;
    }

    public Date getAsaFechaBaja() {
        return asaFechaBaja;
    }

    public void setAsaFechaBaja(Date asaFechaBaja) {
        this.asaFechaBaja = asaFechaBaja;
    }

    public Date getAsaFechaMod() {
        return asaFechaMod;
    }

    public void setAsaFechaMod(Date asaFechaMod) {
        this.asaFechaMod = asaFechaMod;
    }

    public String getAsaUsuarioAlta() {
        return asaUsuarioAlta;
    }

    public void setAsaUsuarioAlta(String asaUsuarioAlta) {
        this.asaUsuarioAlta = asaUsuarioAlta;
    }

    public String getAsaUsuarioBaja() {
        return asaUsuarioBaja;
    }

    public void setAsaUsuarioBaja(String asaUsuarioBaja) {
        this.asaUsuarioBaja = asaUsuarioBaja;
    }

    public String getAsaUsuarioMod() {
        return asaUsuarioMod;
    }

    public void setAsaUsuarioMod(String asaUsuarioMod) {
        this.asaUsuarioMod = asaUsuarioMod;
    }
}
