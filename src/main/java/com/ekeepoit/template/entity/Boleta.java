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
import java.util.List;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "boleta")
public class Boleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "blt_id")
    private Integer bltId;
    @JoinColumn(name = "blt_pps_id", referencedColumnName = "pps_id")
    @ManyToOne(optional = false)
    private PersonaPorSede bltPpsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "blt_fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date bltFechaVencimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 180)
    @Column(name = "blt_codigo_barra")
    private String bltCodigoBarra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "blt_fecha_alta")
    @Temporal(TemporalType.DATE)
    private Date bltFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "blt_usuario_alta")
    private String bltUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "blt_fecha_ult_mod")
    @Temporal(TemporalType.DATE)
    private Date bltFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "blt_usuario_ult_mod")
    private String bltUsuarioUltMod;
    @Column(name = "blt_fecha_baja")
    @Temporal(TemporalType.DATE)
    private Date bltFechaBaja;
    @Size(max = 30)
    @Column(name = "blt_usuario_baja")
    private String bltUsuarioBaja;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dtbBltId")
    private List<DetalleBoleta> detalleBoletaList;
    @Basic(optional = false)
    @NotNull
    @Column(name = "blt_total")
    private Double bltTotal;    
    @Basic(optional = false)
    @NotNull
    @Column(name = "blt_fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date bltFechaEmision;    

    public Boleta() {
    }

    public Boleta(Integer bltId) {
        this.bltId = bltId;
    }

    public Boleta(Integer bltId, Date bltFechaVencimiento, String bltCodigoBarra, Date bltFechaAlta, String bltUsuarioAlta, Date bltFechaUltMod, String bltUsuarioUltMod) {
        this.bltId = bltId;
        this.bltFechaVencimiento = bltFechaVencimiento;
        this.bltCodigoBarra = bltCodigoBarra;
        this.bltFechaAlta = bltFechaAlta;
        this.bltUsuarioAlta = bltUsuarioAlta;
        this.bltFechaUltMod = bltFechaUltMod;
        this.bltUsuarioUltMod = bltUsuarioUltMod;
    }

    public Integer getBltId() {
        return bltId;
    }

    public void setBltId(Integer bltId) {
        this.bltId = bltId;
    }

    public PersonaPorSede getBltPpsId() {
        return bltPpsId;
    }

    public void setBltPpsId(PersonaPorSede bltPcrId) {
        this.bltPpsId = bltPcrId;
    }

    public Date getBltFechaVencimiento() {
        return bltFechaVencimiento;
    }

    public void setBltFechaVencimiento(Date bltFechaVencimiento) {
        this.bltFechaVencimiento = bltFechaVencimiento;
    }

    public String getBltCodigoBarra() {
        return bltCodigoBarra;
    }

    public void setBltCodigoBarra(String bltCodigoBarra) {
        this.bltCodigoBarra = bltCodigoBarra;
    }

    public Date getBltFechaAlta() {
        return bltFechaAlta;
    }

    public void setBltFechaAlta(Date bltFechaAlta) {
        this.bltFechaAlta = bltFechaAlta;
    }

    public String getBltUsuarioAlta() {
        return bltUsuarioAlta;
    }

    public void setBltUsuarioAlta(String bltUsuarioAlta) {
        this.bltUsuarioAlta = bltUsuarioAlta;
    }

    public Date getBltFechaUltMod() {
        return bltFechaUltMod;
    }

    public void setBltFechaUltMod(Date bltFechaUltMod) {
        this.bltFechaUltMod = bltFechaUltMod;
    }

    public String getBltUsuarioUltMod() {
        return bltUsuarioUltMod;
    }

    public void setBltUsuarioUltMod(String bltUsuarioUltMod) {
        this.bltUsuarioUltMod = bltUsuarioUltMod;
    }

    public Date getBltFechaBaja() {
        return bltFechaBaja;
    }

    public void setBltFechaBaja(Date bltFechaBaja) {
        this.bltFechaBaja = bltFechaBaja;
    }

    public String getBltUsuarioBaja() {
        return bltUsuarioBaja;
    }

    public void setBltUsuarioBaja(String bltUsuarioBaja) {
        this.bltUsuarioBaja = bltUsuarioBaja;
    }

    public List<DetalleBoleta> getDetalleBoletaList() {
        return detalleBoletaList;
    }

    public void setDetalleBoletaList(List<DetalleBoleta> detalleBoletaList) {
        this.detalleBoletaList = detalleBoletaList;
    }

    public Double getBltTotal() {
        return bltTotal;
    }

    public void setBltTotal(Double bltTotal) {
        this.bltTotal = bltTotal;
    }

    public Date getBltFechaEmision() {
        return bltFechaEmision;
    }

    public void setBltFechaEmision(Date bltFechaEmision) {
        this.bltFechaEmision = bltFechaEmision;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bltId != null ? bltId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boleta)) {
            return false;
        }
        Boleta other = (Boleta) object;
        if ((this.bltId == null && other.bltId != null) || (this.bltId != null && !this.bltId.equals(other.bltId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmoweb.model.Boleta[ bltId=" + bltId + " ]";
    }
    
}
