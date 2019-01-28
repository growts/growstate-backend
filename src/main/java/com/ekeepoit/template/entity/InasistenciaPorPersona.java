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

/**
 *
 * @author dario
 */
@Entity
@Table(name = "inasistencia_por_persona")
public class InasistenciaPorPersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "isp_id")
    private Integer ispId;
    @Basic(optional = false)
    @Column(name = "isp_pcr_id")
    private Integer ispPcrId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isp_fecha")
    @Temporal(TemporalType.DATE)
    private Date ispFecha;
    @Column(name = "isp_observaciones")
    private String ispObservaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isp_justificada")
    private boolean ispJustificada;
    @Column(name = "isp_archivo_1")
    private String ispArchivo1;
    @Column(name = "isp_archivo_2")
    private String ispArchivo2;
    @Column(name = "isp_archivo_3")
    private String ispArchivo3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isp_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ispFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "isp_usuario_alta")
    private String ispUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isp_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ispFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "isp_usuario_mod")
    private String ispUsuarioMod;
    @Column(name = "isp_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ispFechaBaja;
    @Size(max = 45)
    @Column(name = "isp_usuario_baja")
    private String ispUsuarioBaja;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIspId() {
        return ispId;
    }

    public void setIspId(Integer ispId) {
        this.ispId = ispId;
    }

    public Integer getIspPcrId() {
        return ispPcrId;
    }

    public void setIspPcrId(Integer ispPcrId) {
        this.ispPcrId = ispPcrId;
    }

    public Date getIspFecha() {
        return ispFecha;
    }

    public void setIspFecha(Date ispFecha) {
        this.ispFecha = ispFecha;
    }

    public Date getIspFechaAlta() {
        return ispFechaAlta;
    }

    public void setIspFechaAlta(Date aispFechaAlta) {
        this.ispFechaAlta = aispFechaAlta;
    }

    public String getIspUsuarioAlta() {
        return ispUsuarioAlta;
    }

    public void setIspUsuarioAlta(String ispUsuarioAlta) {
        this.ispUsuarioAlta = ispUsuarioAlta;
    }

    public Date getIspFechaMod() {
        return ispFechaMod;
    }

    public void setIspFechaMod(Date ispFechaMod) {
        this.ispFechaMod = ispFechaMod;
    }

    public String getIspUsuarioMod() {
        return ispUsuarioMod;
    }

    public void setIspUsuarioMod(String asaUsuarioMod) {
        this.ispUsuarioMod = asaUsuarioMod;
    }

    public Date getIspFechaBaja() {
        return ispFechaBaja;
    }

    public void setIspFechaBaja(Date ispFechaBaja) {
        this.ispFechaBaja = ispFechaBaja;
    }

    public String getIspUsuarioBaja() {
        return ispUsuarioBaja;
    }

    public void setIspUsuarioBaja(String ispUsuarioBaja) {
        this.ispUsuarioBaja = ispUsuarioBaja;
    }

    public String getIspObservaciones() {
        return ispObservaciones;
    }

    public void setIspObservaciones(String ispObservaciones) {
        this.ispObservaciones = ispObservaciones;
    }

    public boolean isIspJustificada() {
        return ispJustificada;
    }

    public void setIspJustificada(boolean ispJustificada) {
        this.ispJustificada = ispJustificada;
    }

    public String getIspArchivo1() {
        return ispArchivo1;
    }

    public void setIspArchivo1(String ispArchivo1) {
        this.ispArchivo1 = ispArchivo1;
    }

    public String getIspArchivo2() {
        return ispArchivo2;
    }

    public void setIspArchivo2(String ispArchivo2) {
        this.ispArchivo2 = ispArchivo2;
    }

    public String getIspArchivo3() {
        return ispArchivo3;
    }

    public void setIspArchivo3(String ispArchivo3) {
        this.ispArchivo3 = ispArchivo3;
    }
}
