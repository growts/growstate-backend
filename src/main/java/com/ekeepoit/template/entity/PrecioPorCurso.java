package com.ekeepoit.template.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "precio_por_curso")
public class PrecioPorCurso implements Comparable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ppc_id")
    private Integer ppcId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ppc_importe")
    private Double ppcImporte;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "ppc_ccr_id", referencedColumnName = "ccr_id")
    @ManyToOne(optional=false)
    private CursoPorCarrera ppcCcrId;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "ppc_cco_id", referencedColumnName = "cco_id")
    @ManyToOne(optional=false)
    private Concepto ppcCcoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ppc_fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppcFechaInicio;
    @Basic(optional = true)
    @Column(name = "ppc_cantidad_cuotas")
    private Integer ppcCantidadCuotas;
    @Basic(optional = true)
    @Column(name = "ppc_fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppcFechaFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ppc_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppcFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ppc_usuario_alta")
    private String ppcUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ppc_fecha_ult_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppcFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ppc_usuario_ult_mod")
    private String ppcUsuarioUltMod;
    @Basic(optional = true)
    @Column(name = "ppc_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppcFechaBaja;
    @Basic(optional = true)
    @Column(name = "ppc_usuario_baja")
    private String ppcUsuarioBaja;

    public Integer getPpcId() {
        return ppcId;
    }

    public void setPpcId(Integer ppcId) {
        this.ppcId = ppcId;
    }

    public CursoPorCarrera getPpcCcrId() {
        return ppcCcrId;
    }

    public void setPpcCcrId(CursoPorCarrera ppcCcrId) {
        this.ppcCcrId = ppcCcrId;
    }

    public Concepto getPpcCcoId() {
        return ppcCcoId;
    }

    public void setPpcCcoId(Concepto ppcCcoId) {
        this.ppcCcoId = ppcCcoId;
    }

    public Date getPpcFechaInicio() {
        return ppcFechaInicio;
    }

    public void setPpcFechaInicio(Date ppcFechaInicio) {
        this.ppcFechaInicio = ppcFechaInicio;
    }

    public Date getPpcFechaFin() {
        return ppcFechaFin;
    }

    public void setPpcFechaFin(Date ppcFechaFin) {
        this.ppcFechaFin = ppcFechaFin;
    }

    public Date getPpcFechaAlta() {
        return ppcFechaAlta;
    }

    public void setPpcFechaAlta(Date ppcFechaAlta) {
        this.ppcFechaAlta = ppcFechaAlta;
    }

    public String getPpcUsuarioAlta() {
        return ppcUsuarioAlta;
    }

    public void setPpcUsuarioAlta(String ppcUsuarioAlta) {
        this.ppcUsuarioAlta = ppcUsuarioAlta;
    }

    public Date getPpcFechaUltMod() {
        return ppcFechaUltMod;
    }

    public void setPpcFechaUltMod(Date ppcFechaUltMod) {
        this.ppcFechaUltMod = ppcFechaUltMod;
    }

    public String getPpcUsuarioUltMod() {
        return ppcUsuarioUltMod;
    }

    public void setPpcUsuarioUltMod(String ppcUsuarioUltMod) {
        this.ppcUsuarioUltMod = ppcUsuarioUltMod;
    }

    public Date getPpcFechaBaja() {
        return ppcFechaBaja;
    }

    public void setPpcFechaBaja(Date ppcFechaBaja) {
        this.ppcFechaBaja = ppcFechaBaja;
    }

    public String getPpcUsuarioBaja() {
        return ppcUsuarioBaja;
    }

    public void setPpcUsuarioBaja(String ppcUsuarioBaja) {
        this.ppcUsuarioBaja = ppcUsuarioBaja;
    }

    public Double getPpcImporte() {
        return ppcImporte;
    }

    public void setPpcImporte(Double ppcImporte) {
        this.ppcImporte = ppcImporte;
    }

    public Integer getPpcCantidadCuotas() {
        return ppcCantidadCuotas;
    }

    public void setPpcCantidadCuotas(Integer ppcCantidadCuotas) {
        this.ppcCantidadCuotas = ppcCantidadCuotas;
    }

    @Override
    public int compareTo(Object o) {
        PrecioPorCurso precioPorCurso = (PrecioPorCurso)o;
        if(this.ppcId ==precioPorCurso.getPpcId()){
            return 0;
        }
        return -1;
    }
}
