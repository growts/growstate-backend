/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ekeepoit.template.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Edgar
 */
@Entity
@Table(name = "pago")
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PAO_ID")
    private Integer paoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAO_MONTO_PAGO")
    private Double paoMontoPago;
    @Basic(optional = false)
    @JoinColumn(name = "PAO_CJD_ID", referencedColumnName = "CJD_ID")
    private Integer paoCjdId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAO_FECHA_PAGO")
    @Temporal(TemporalType.DATE)
    private Date paoFechaPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAO_FECHA_ACREDITACION")
    @Temporal(TemporalType.DATE)
    private Date paoFechaAcreditacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PAO_ESTADO")
    private String paoEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "PAO_NRO_COMPROBANTE")
    private String paoNroComprobante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PAO_ID_PAGO_ELECTRONICO")
    private String paoIdPagoElectronico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PAO_FORMA_PAGO")
    private String paoFormaPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAO_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date paoFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PAO_USUARIO_ALTA")
    private String paoUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAO_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date paoFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PAO_USUARIO_ULT_MOD")
    private String paoUsuarioUltMod;
    @Column(name = "PAO_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date paoFechaBaja;
    @Size(max = 30)
    @Column(name = "PAO_USUARIO_BAJA")
    private String paoUsuarioBaja;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dpoPaoId")
    private List<DetallePago> detallePagoList;

    public Pago() {
    }

    public Pago(Integer paoId) {
        this.paoId = paoId;
    }

    public Pago(Integer paoId, Double paoMontoPago, Date paoFechaPago, String paoEstado, String paoFormaPago, Date paoFechaAlta, String paoUsuarioAlta, Date paoFechaUltMod, String paoUsuarioUltMod) {
        this.paoId = paoId;
        this.paoMontoPago = paoMontoPago;
        this.paoFechaPago = paoFechaPago;
        this.paoEstado = paoEstado;
        this.paoFormaPago = paoFormaPago;
        this.paoFechaAlta = paoFechaAlta;
        this.paoUsuarioAlta = paoUsuarioAlta;
        this.paoFechaUltMod = paoFechaUltMod;
        this.paoUsuarioUltMod = paoUsuarioUltMod;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPaoCjdId() {
        return paoCjdId;
    }

    public void setPaoCjdId(Integer paoCjdId) {
        this.paoCjdId = paoCjdId;
    }

    public Integer getPaoId() {
        return paoId;
    }

    public void setPaoId(Integer paoId) {
        this.paoId = paoId;
    }

    public String getPaoNroComprobante() {
        return paoNroComprobante;
    }

    public void setPaoNroComprobante(String paoNroComprobante) {
        this.paoNroComprobante = paoNroComprobante;
    }

    public String getPaoIdPagoElectronico() {
        return paoIdPagoElectronico;
    }

    public void setPaoIdPagoElectronico(String paoIdPagoElectronico) {
        this.paoIdPagoElectronico = paoIdPagoElectronico;
    }
    
    
    
    public Double getPaoMontoPago() {
        return paoMontoPago;
    }

    public void setPaoMontoPago(Double paoMontoPago) {
        this.paoMontoPago = paoMontoPago;
    }

    public Date getPaoFechaAcreditacion() {
        return paoFechaAcreditacion;
    }

    public void setPaoFechaAcreditacion(Date paoFechaAcreditacion) {
        this.paoFechaAcreditacion = paoFechaAcreditacion;
    }
    
    public Date getPaoFechaPago() {
        return paoFechaPago;
    }

    public void setPaoFechaPago(Date paoFechaPago) {
        this.paoFechaPago = paoFechaPago;
    }

    public String getPaoEstado() {
        return paoEstado;
    }

    public void setPaoEstado(String paoEstado) {
        this.paoEstado = paoEstado;
    }

    public String getPaoFormaPago() {
        return paoFormaPago;
    }

    public void setPaoFormaPago(String paoFormaPago) {
        this.paoFormaPago = paoFormaPago;
    }

    public Date getPaoFechaAlta() {
        return paoFechaAlta;
    }

    public void setPaoFechaAlta(Date paoFechaAlta) {
        this.paoFechaAlta = paoFechaAlta;
    }

    public String getPaoUsuarioAlta() {
        return paoUsuarioAlta;
    }

    public void setPaoUsuarioAlta(String paoUsuarioAlta) {
        this.paoUsuarioAlta = paoUsuarioAlta;
    }

    public Date getPaoFechaUltMod() {
        return paoFechaUltMod;
    }

    public void setPaoFechaUltMod(Date paoFechaUltMod) {
        this.paoFechaUltMod = paoFechaUltMod;
    }

    public String getPaoUsuarioUltMod() {
        return paoUsuarioUltMod;
    }

    public void setPaoUsuarioUltMod(String paoUsuarioUltMod) {
        this.paoUsuarioUltMod = paoUsuarioUltMod;
    }

    public Date getPaoFechaBaja() {
        return paoFechaBaja;
    }

    public void setPaoFechaBaja(Date paoFechaBaja) {
        this.paoFechaBaja = paoFechaBaja;
    }

    public String getPaoUsuarioBaja() {
        return paoUsuarioBaja;
    }

    public void setPaoUsuarioBaja(String paoUsuarioBaja) {
        this.paoUsuarioBaja = paoUsuarioBaja;
    }

    @XmlTransient
    public List<DetallePago> getDetallePagoList() {
        return detallePagoList;
    }

    public void setDetallePagoList(List<DetallePago> detallePagoList) {
        this.detallePagoList = detallePagoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paoId != null ? paoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.paoId == null && other.paoId != null) || (this.paoId != null && !this.paoId.equals(other.paoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmoweb.model.Pago[ paoId=" + paoId + " ]";
    }
    
}
