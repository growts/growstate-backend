/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.template.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "calificacion")
public class Calificacion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cal_id")
    private Integer calId;
    @Basic(optional = false)
    @Column(name = "cal_nota")
    private Integer calNota;
    @JoinColumn(name = "cal_pcr_id", referencedColumnName = "pcr_id")
    @ManyToOne(optional = false)
    private PersonaPorCurso calPcrId;
    @JoinColumn(name = "cal_epc_id", referencedColumnName = "epc_id")
    @ManyToOne(optional = false)
    private ExamenPorCurso calEpcId;
    @Size(min = 1, max = 300)
    @Column(name = "cal_observaciones")
    private String calObservaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cal_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date calFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cal_usuario_alta")
    private String calUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cal_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date calFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cal_usuario_mod")
    private String calUsuarioMod;
    @Column(name = "cal_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date calFechaBaja;
    @Size(max = 45)
    @Column(name = "cal_usuario_baja")
    private String calUsuarioBaja;

    public Integer getCalId() {
        return calId;
    }

    public void setCalId(Integer calId) {
        this.calId = calId;
    }

    public Integer getCalNota() {
        return calNota;
    }

    public void setCalNota(Integer calNota) {
        this.calNota = calNota;
    }

    public PersonaPorCurso getCalPcrId() {
        return calPcrId;
    }

    public void setCalPcrId(PersonaPorCurso calPcrId) {
        this.calPcrId = calPcrId;
    }

    public ExamenPorCurso getCalEpcId() {
        return calEpcId;
    }

    public void setCalEpcId(ExamenPorCurso calEpcId) {
        this.calEpcId = calEpcId;
    }

    public String getCalObservaciones() {
        return calObservaciones;
    }

    public void setCalObservaciones(String calObservaciones) {
        this.calObservaciones = calObservaciones;
    }

    public Date getCalFechaAlta() {
        return calFechaAlta;
    }

    public void setCalFechaAlta(Date calFechaAlta) {
        this.calFechaAlta = calFechaAlta;
    }

    public String getCalUsuarioAlta() {
        return calUsuarioAlta;
    }

    public void setCalUsuarioAlta(String calUsuarioAlta) {
        this.calUsuarioAlta = calUsuarioAlta;
    }

    public Date getCalFechaMod() {
        return calFechaMod;
    }

    public void setCalFechaMod(Date calFechaMod) {
        this.calFechaMod = calFechaMod;
    }

    public String getCalUsuarioMod() {
        return calUsuarioMod;
    }

    public void setCalUsuarioMod(String calUsuarioMod) {
        this.calUsuarioMod = calUsuarioMod;
    }

    public Date getCalFechaBaja() {
        return calFechaBaja;
    }

    public void setCalFechaBaja(Date calFechaBaja) {
        this.calFechaBaja = calFechaBaja;
    }

    public String getCalUsuarioBaja() {
        return calUsuarioBaja;
    }

    public void setCalUsuarioBaja(String calUsuarioBaja) {
        this.calUsuarioBaja = calUsuarioBaja;
    }

    
    
    
}
