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
@Table(name = "Examen_por_curso")
public class ExamenPorCurso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "epc_id")
    private Integer epcId;
    @JoinColumn(name = "epc_ccr_id", referencedColumnName = "ccr_id")
    @ManyToOne(optional = false)
    private CursoPorCarrera epcCcrId;
    @JoinColumn(name = "epc_exm_id", referencedColumnName = "exm_id")
    @ManyToOne(optional = false)
    private Examen epcExmId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "epc_fecha_examen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date epcFechaExamen;   
    @Size(min = 1, max = 300)
    @Column(name = "epc_observaciones")
    private String epcObservaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "epc_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date epcFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "epc_usuario_alta")
    private String epcUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "epc_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date epcFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "epc_usuario_mod")
    private String epcUsuarioMod;
    @Column(name = "epc_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date epcFechaBaja;
    @Size(max = 45)
    @Column(name = "epc_usuario_baja")
    private String epcUsuarioBaja;

    public Integer getEpcId() {
        return epcId;
    }

    public void setEpcId(Integer epcId) {
        this.epcId = epcId;
    }

    public CursoPorCarrera getEpcCcrId() {
        return epcCcrId;
    }

    public void setEpcCcrId(CursoPorCarrera epcCcrId) {
        this.epcCcrId = epcCcrId;
    }

    public Examen getEpcExmId() {
        return epcExmId;
    }

    public void setEpcExmId(Examen epcExmId) {
        this.epcExmId = epcExmId;
    }

    public Date getEpcFechaExamen() {
        return epcFechaExamen;
    }

    public void setEpcFechaExamen(Date epcFechaExamen) {
        this.epcFechaExamen = epcFechaExamen;
    }

    public String getEpcObservaciones() {
        return epcObservaciones;
    }

    public void setEpcObservaciones(String epcObservaciones) {
        this.epcObservaciones = epcObservaciones;
    }

    public Date getEpcFechaAlta() {
        return epcFechaAlta;
    }

    public void setEpcFechaAlta(Date epcFechaAlta) {
        this.epcFechaAlta = epcFechaAlta;
    }

    public String getEpcUsuarioAlta() {
        return epcUsuarioAlta;
    }

    public void setEpcUsuarioAlta(String epcUsuarioAlta) {
        this.epcUsuarioAlta = epcUsuarioAlta;
    }

    public Date getEpcFechaMod() {
        return epcFechaMod;
    }

    public void setEpcFechaMod(Date epcFechaMod) {
        this.epcFechaMod = epcFechaMod;
    }

    public String getEpcUsuarioMod() {
        return epcUsuarioMod;
    }

    public void setEpcUsuarioMod(String epcUsuarioMod) {
        this.epcUsuarioMod = epcUsuarioMod;
    }

    public Date getEpcFechaBaja() {
        return epcFechaBaja;
    }

    public void setEpcFechaBaja(Date epcFechaBaja) {
        this.epcFechaBaja = epcFechaBaja;
    }

    public String getEpcUsuarioBaja() {
        return epcUsuarioBaja;
    }

    public void setEpcUsuarioBaja(String epcUsuarioBaja) {
        this.epcUsuarioBaja = epcUsuarioBaja;
    }
    
    
    
}
