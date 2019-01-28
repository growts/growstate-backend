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
@Table(name = "carrera_por_sede")
public class CarreraPorSede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "csd_id")
    private Integer csdId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "csd_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date csdFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "csd_usuario_alta")
    private String csdUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "csd_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date csdFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "csd_usuario_mod")
    private String csdUsuarioMod;
    @Column(name = "csd_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date csdFechaBaja;
    @Size(max = 45)
    @Column(name = "csd_usuario_baja")
    private String csdUsuarioBaja;
    @JoinColumn(name = "csd_cra_id", referencedColumnName = "cra_id")
    @ManyToOne(optional = false)
    private Carrera csdCraId;
    @JoinColumn(name = "csd_sde_id", referencedColumnName = "sde_id")
    //@ManyToOne(optional = false)
    private Integer csdSdeId;

    public CarreraPorSede() {
    }

    public CarreraPorSede(Integer csdId) {
        this.csdId = csdId;
    }

    public CarreraPorSede(Integer csdId, Date csdFechaAlta, String csdUsuarioAlta, Date csdFechaMod, String csdUsuarioMod) {
        this.csdId = csdId;
        this.csdFechaAlta = csdFechaAlta;
        this.csdUsuarioAlta = csdUsuarioAlta;
        this.csdFechaMod = csdFechaMod;
        this.csdUsuarioMod = csdUsuarioMod;
    }

    public Integer getCsdId() {
        return csdId;
    }

    public void setCsdId(Integer csdId) {
        this.csdId = csdId;
    }

    public Date getCsdFechaAlta() {
        return csdFechaAlta;
    }

    public void setCsdFechaAlta(Date csdFechaAlta) {
        this.csdFechaAlta = csdFechaAlta;
    }

    public String getCsdUsuarioAlta() {
        return csdUsuarioAlta;
    }

    public void setCsdUsuarioAlta(String csdUsuarioAlta) {
        this.csdUsuarioAlta = csdUsuarioAlta;
    }

    public Date getCsdFechaMod() {
        return csdFechaMod;
    }

    public void setCsdFechaMod(Date csdFechaMod) {
        this.csdFechaMod = csdFechaMod;
    }

    public String getCsdUsuarioMod() {
        return csdUsuarioMod;
    }

    public void setCsdUsuarioMod(String csdUsuarioMod) {
        this.csdUsuarioMod = csdUsuarioMod;
    }

    public Date getCsdFechaBaja() {
        return csdFechaBaja;
    }

    public void setCsdFechaBaja(Date csdFechaBaja) {
        this.csdFechaBaja = csdFechaBaja;
    }

    public String getCsdUsuarioBaja() {
        return csdUsuarioBaja;
    }

    public void setCsdUsuarioBaja(String csdUsuarioBaja) {
        this.csdUsuarioBaja = csdUsuarioBaja;
    }

    public Carrera getCsdCraId() {
        return csdCraId;
    }

    public void setCsdCraId(Carrera csdCraId) {
        this.csdCraId = csdCraId;
    }

    public Integer getCsdSdeId() {
        return csdSdeId;
    }

    public void setCsdSdeId(Integer csdSdeId) {
        this.csdSdeId = csdSdeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (csdId != null ? csdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarreraPorSede)) {
            return false;
        }
        CarreraPorSede other = (CarreraPorSede) object;
        if ((this.csdId == null && other.csdId != null) || (this.csdId != null && !this.csdId.equals(other.csdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.eschool.entity.CarreraPorSede[ csdId=" + csdId + " ]";
    }
    
}
