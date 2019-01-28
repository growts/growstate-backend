package com.ekeepoit.template.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "promocion")
public class Promocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pmo_id")
    private Integer pmoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmo_nombre")
    private String pmoNombre;
    @Column(name = "pmo_descripcion")
    private String pmoDescripcion;
    @Column(name = "pmo_porcentaje")
    private Double pmoPorcentaje;
    @Column(name = "pmo_monto")
    private Double pmoMonto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmo_nivel")
    private String pmoNivel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmo_genera_descuento")
    private Integer pmoGeneraDescuento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmo_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pmoFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmo_usuario_alta")
    private String pmoUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmo_fecha_ult_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pmoFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmo_usuario_ult_mod")
    private String pmoUsuarioUltMod;
    @Column(name = "pmo_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pmoFechaBaja;
    @Column(name = "pmo_usuario_baja")
    private String pmoUsuarioBaja;

    public Integer getPmoId() {
        return pmoId;
    }

    public void setPmoId(Integer pmoId) {
        this.pmoId = pmoId;
    }

    public String getPmoNombre() {
        return pmoNombre;
    }

    public void setPmoNombre(String pmoNombre) {
        this.pmoNombre = pmoNombre;
    }

    public String getPmoDescripcion() {
        return pmoDescripcion;
    }

    public void setPmoDescripcion(String pmoDescripcion) {
        this.pmoDescripcion = pmoDescripcion;
    }

    public Double getPmoPorcentaje() {
        return pmoPorcentaje;
    }

    public void setPmoPorcentaje(Double pmoPorcentaje) {
        this.pmoPorcentaje = pmoPorcentaje;
    }

    public Double getPmoMonto() {
        return pmoMonto;
    }

    public void setPmoMonto(Double pmoMonto) {
        this.pmoMonto = pmoMonto;
    }

    public Date getPmoFechaAlta() {
        return pmoFechaAlta;
    }

    public void setPmoFechaAlta(Date pmoFechaAlta) {
        this.pmoFechaAlta = pmoFechaAlta;
    }

    public String getPmoUsuarioAlta() {
        return pmoUsuarioAlta;
    }

    public void setPmoUsuarioAlta(String pmoUsuarioAlta) {
        this.pmoUsuarioAlta = pmoUsuarioAlta;
    }

    public Date getPmoFechaUltMod() {
        return pmoFechaUltMod;
    }

    public void setPmoFechaUltMod(Date pmoFechaUltMod) {
        this.pmoFechaUltMod = pmoFechaUltMod;
    }

    public String getPmoUsuarioUltMod() {
        return pmoUsuarioUltMod;
    }

    public void setPmoUsuarioUltMod(String pmoUsuarioUltMod) {
        this.pmoUsuarioUltMod = pmoUsuarioUltMod;
    }

    public Date getPmoFechaBaja() {
        return pmoFechaBaja;
    }

    public void setPmoFechaBaja(Date pmoFechaBaja) {
        this.pmoFechaBaja = pmoFechaBaja;
    }

    public String getPmoUsuarioBaja() {
        return pmoUsuarioBaja;
    }

    public void setPmoUsuarioBaja(String pmoUsuarioBaja) {
        this.pmoUsuarioBaja = pmoUsuarioBaja;
    }

    public String getPmoNivel() {
        return pmoNivel;
    }

    public void setPmoNivel(String pmoNivel) {
        this.pmoNivel = pmoNivel;
    }

    public Integer getPmoGeneraDescuento() {
        return pmoGeneraDescuento;
    }

    public void setPmoGeneraDescuento(Integer pmoGeneraDescuento) {
        this.pmoGeneraDescuento = pmoGeneraDescuento;
    }
    
    
    
}
