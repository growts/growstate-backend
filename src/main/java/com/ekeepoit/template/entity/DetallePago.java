package com.ekeepoit.template.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "detalle_pago")
public class DetallePago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DPO_ID")
    private Integer dpoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DPO_IMPORTE")
    private Double dpoImporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DPO_FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date dpoFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DPO_USUARIO_ALTA")
    private String dpoUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DPO_FECHA_ULT_MOD")
    @Temporal(TemporalType.DATE)
    private Date dpoFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DPO_USUARIO_ULT_MOD")
    private String dpoUsuarioUltMod;
    @Column(name = "DPO_FECHA_BAJA")
    @Temporal(TemporalType.DATE)
    private Date dpoFechaBaja;
    @Size(max = 30)
    @Column(name = "DPO_USUARIO_BAJA")
    private String dpoUsuarioBaja;
    @JoinColumn(name = "DPO_PAO_ID", referencedColumnName = "PAO_ID")
    @ManyToOne(optional = false)
    @JsonIgnore
    private Pago dpoPaoId;
    @JoinColumn(name = "DPO_OBN_ID", referencedColumnName = "OBN_ID")
    @ManyToOne(optional = false)
    private Obligaciones dpoObnId;

    public DetallePago() {
    }

    public DetallePago(Integer dpoId) {
        this.dpoId = dpoId;
    }

    public DetallePago(Integer dpoId, Double dpoImporte, Date dpoFechaAlta, String dpoUsuarioAlta, Date dpoFechaUltMod, String dpoUsuarioUltMod) {
        this.dpoId = dpoId;
        this.dpoImporte = dpoImporte;
        this.dpoFechaAlta = dpoFechaAlta;
        this.dpoUsuarioAlta = dpoUsuarioAlta;
        this.dpoFechaUltMod = dpoFechaUltMod;
        this.dpoUsuarioUltMod = dpoUsuarioUltMod;
    }

    public Integer getDpoId() {
        return dpoId;
    }

    public void setDpoId(Integer dpoId) {
        this.dpoId = dpoId;
    }

    public Double getDpoImporte() {
        return dpoImporte;
    }

    public void setDpoImporte(Double dpoImporte) {
        this.dpoImporte = dpoImporte;
    }

    public Date getDpoFechaAlta() {
        return dpoFechaAlta;
    }

    public void setDpoFechaAlta(Date dpoFechaAlta) {
        this.dpoFechaAlta = dpoFechaAlta;
    }

    public String getDpoUsuarioAlta() {
        return dpoUsuarioAlta;
    }

    public void setDpoUsuarioAlta(String dpoUsuarioAlta) {
        this.dpoUsuarioAlta = dpoUsuarioAlta;
    }

    public Date getDpoFechaUltMod() {
        return dpoFechaUltMod;
    }

    public void setDpoFechaUltMod(Date dpoFechaUltMod) {
        this.dpoFechaUltMod = dpoFechaUltMod;
    }

    public String getDpoUsuarioUltMod() {
        return dpoUsuarioUltMod;
    }

    public void setDpoUsuarioUltMod(String dpoUsuarioUltMod) {
        this.dpoUsuarioUltMod = dpoUsuarioUltMod;
    }

    public Date getDpoFechaBaja() {
        return dpoFechaBaja;
    }

    public void setDpoFechaBaja(Date dpoFechaBaja) {
        this.dpoFechaBaja = dpoFechaBaja;
    }

    public String getDpoUsuarioBaja() {
        return dpoUsuarioBaja;
    }

    public void setDpoUsuarioBaja(String dpoUsuarioBaja) {
        this.dpoUsuarioBaja = dpoUsuarioBaja;
    }

    public Pago getDpoPaoId() {
        return dpoPaoId;
    }

    public void setDpoPaoId(Pago dpoPaoId) {
        this.dpoPaoId = dpoPaoId;
    }

    public Obligaciones getDpoObnId() {
        return dpoObnId;
    }

    public void setDpoObnId(Obligaciones dpoObnId) {
        this.dpoObnId = dpoObnId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dpoId != null ? dpoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePago)) {
            return false;
        }
        DetallePago other = (DetallePago) object;
        if ((this.dpoId == null && other.dpoId != null) || (this.dpoId != null && !this.dpoId.equals(other.dpoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmoweb.model.DetallePago[ dpoId=" + dpoId + " ]";
    }
    
}
