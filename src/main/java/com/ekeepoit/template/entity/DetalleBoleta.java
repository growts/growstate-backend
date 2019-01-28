/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.template.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "detalle_boleta")
public class DetalleBoleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dtb_id")
    private Integer dtbId;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "dtb_obn_id", referencedColumnName = "OBN_ID")
    @ManyToOne(optional = false)
    private Obligaciones dtbObnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dtb_importe")
    private Double dtbImporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dtb_fecha_alta")
    @Temporal(TemporalType.DATE)
    private Date dtbFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "dtb_usuario_alta")
    private String dtbUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dtb_fecha_ult_mod")
    @Temporal(TemporalType.DATE)
    private Date dtbFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "dtb_usuario_ult_mod")
    private String dtbUsuarioUltMod;
    @Column(name = "dtb_fecha_baja")
    @Temporal(TemporalType.DATE)
    private Date dtbFechaBaja;
    @Size(max = 30)
    @Column(name = "dtb_usuario_baja")
    private String dtbUsuarioBaja;
    @JoinColumn(name = "dtb_blt_id", referencedColumnName = "blt_id")
    @ManyToOne(optional = false)
    @JsonBackReference
    private Boleta dtbBltId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dtb_recargo")
    private Double dtbRecargo;   
    @Basic(optional = false)
    @NotNull
    @Column(name = "dtb_descuento")
    private Double dtbDescuento;

    public DetalleBoleta() {
    }

    public DetalleBoleta(Integer dtbId) {
        this.dtbId = dtbId;
    }

    public DetalleBoleta(Integer dtbId, Double dtbImporte, Date dtbFechaAlta, String dtbUsuarioAlta, Date dtbFechaUltMod, String dtbUsuarioUltMod) {
        this.dtbId = dtbId;
        this.dtbImporte = dtbImporte;
        this.dtbFechaAlta = dtbFechaAlta;
        this.dtbUsuarioAlta = dtbUsuarioAlta;
        this.dtbFechaUltMod = dtbFechaUltMod;
        this.dtbUsuarioUltMod = dtbUsuarioUltMod;
    }

    public Integer getDtbId() {
        return dtbId;
    }

    public void setDtbId(Integer dtbId) {
        this.dtbId = dtbId;
    }

    public Obligaciones getDtbObnId() {
        return dtbObnId;
    }

    public void setDtbObnId(Obligaciones dtbObnId) {
        this.dtbObnId = dtbObnId;
    }

    public Double getDtbImporte() {
        return dtbImporte;
    }

    public void setDtbImporte(Double dtbImporte) {
        this.dtbImporte = dtbImporte;
    }

    public Date getDtbFechaAlta() {
        return dtbFechaAlta;
    }

    public void setDtbFechaAlta(Date dtbFechaAlta) {
        this.dtbFechaAlta = dtbFechaAlta;
    }

    public String getDtbUsuarioAlta() {
        return dtbUsuarioAlta;
    }

    public void setDtbUsuarioAlta(String dtbUsuarioAlta) {
        this.dtbUsuarioAlta = dtbUsuarioAlta;
    }

    public Date getDtbFechaUltMod() {
        return dtbFechaUltMod;
    }

    public void setDtbFechaUltMod(Date dtbFechaUltMod) {
        this.dtbFechaUltMod = dtbFechaUltMod;
    }

    public String getDtbUsuarioUltMod() {
        return dtbUsuarioUltMod;
    }

    public void setDtbUsuarioUltMod(String dtbUsuarioUltMod) {
        this.dtbUsuarioUltMod = dtbUsuarioUltMod;
    }

    public Date getDtbFechaBaja() {
        return dtbFechaBaja;
    }

    public void setDtbFechaBaja(Date dtbFechaBaja) {
        this.dtbFechaBaja = dtbFechaBaja;
    }

    public String getDtbUsuarioBaja() {
        return dtbUsuarioBaja;
    }

    public void setDtbUsuarioBaja(String dtbUsuarioBaja) {
        this.dtbUsuarioBaja = dtbUsuarioBaja;
    }

    public Boleta getDtbBltId() {
        return dtbBltId;
    }

    public void setDtbBltId(Boleta dtbBltId) {
        this.dtbBltId = dtbBltId;
    }

    public Double getDtbRecargo() {
        return dtbRecargo;
    }

    public void setDtbRecargo(Double dtbRecargo) {
        this.dtbRecargo = dtbRecargo;
    }

    public Double getDtbDescuento() {
        return dtbDescuento;
    }

    public void setDtbdescuento(Double dtbDescuento) {
        this.dtbDescuento = dtbDescuento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtbId != null ? dtbId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleBoleta)) {
            return false;
        }
        DetalleBoleta other = (DetalleBoleta) object;
        if ((this.dtbId == null && other.dtbId != null) || (this.dtbId != null && !this.dtbId.equals(other.dtbId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmoweb.model.DetalleBoleta[ dtbId=" + dtbId + " ]";
    }
    
}
