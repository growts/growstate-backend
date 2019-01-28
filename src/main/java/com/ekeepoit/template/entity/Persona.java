package com.ekeepoit.template.entity;

import com.ekeepoit.template.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dario
 */
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prs_id")
    private Integer prsId;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "prs_usr_id", referencedColumnName = "id")
    @OneToOne(optional=false)
    private User prsUsrId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prs_dni")
    private int prsDni;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prs_sexo")
    private Character prsSexo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "prs_nombre")
    private String prsNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "prs_apellido")
    private String prsApellido;
    @Size(max = 100)
    @Column(name = "prs_email")
    private String prsEmail;
    @Size(max = 50)
    @Column(name = "prs_telefono_fijo")
    private String prsTelefonoFijo;
    @Size(max = 50)
    @Column(name = "prs_telefono_celular")
    private String prsTelefonoCelular;
    @Size(max = 200)
    @Column(name = "prs_domicilio")
    private String prsDomicilio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prs_fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prsFechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prs_categoria")
    private String prsCategoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prs_fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prsFechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "prs_usuario_alta")
    private String prsUsuarioAlta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prs_fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prsFechaMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "prs_usuario_mod")
    private String prsUsuarioMod;
    @Column(name = "prs_fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prsFechaBaja;
    @Size(max = 45)
    @Column(name = "prs_usuario_baja")
    private String prsUsuarioBaja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "prs_asignado_curso")
    private String prsAsignadoCurso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "prs_resp_asignado")
    private String prsRespAsignado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "prs_usr_generado")
    private String prsUsrGenerado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "prs_posee_representados")
    private String prsPoseeRepresentados;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mailFrom")
    private List<Mail> mailList;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "madTo")
    private List<DetalleMail> detalleMailList;
    @Column(name = "prs_edad")
    private Integer prsEdad;

    public Persona() {
    }

    public Persona(Integer prsId) {
        this.prsId = prsId;
    }

    public Persona(Integer prsId, int prsDni, Character prsSexo, String prsNombre, String prsApellido, Date prsFechaNacimiento, Date prsFechaAlta, String prsUsuarioAlta, Date prsFechaMod, String prsUsuarioMod) {
        this.prsId = prsId;
        this.prsDni = prsDni;
        this.prsSexo = prsSexo;
        this.prsNombre = prsNombre;
        this.prsApellido = prsApellido;
        this.prsFechaNacimiento = prsFechaNacimiento;
        this.prsFechaAlta = prsFechaAlta;
        this.prsUsuarioAlta = prsUsuarioAlta;
        this.prsFechaMod = prsFechaMod;
        this.prsUsuarioMod = prsUsuarioMod;
    }

    public String getPrsAsignadoCurso() {
        return prsAsignadoCurso;
    }

    public void setPrsAsignadoCurso(String prsAsignadoCurso) {
        this.prsAsignadoCurso = prsAsignadoCurso;
    }

    public String getPrsRespAsignado() {
        return prsRespAsignado;
    }

    public void setPrsRespAsignado(String prsRespAsignado) {
        this.prsRespAsignado = prsRespAsignado;
    }

    public String getPrsUsrGenerado() {
        return prsUsrGenerado;
    }

    public void setPrsUsrGenerado(String prsUsrGenerado) {
        this.prsUsrGenerado = prsUsrGenerado;
    }

    public Integer getPrsId() {
        return prsId;
    }

    public void setPrsId(Integer prsId) {
        this.prsId = prsId;
    }

    public User getPrsUsrId() {
        return prsUsrId;
    }

    public void setPrsUsrId(User prsUsrId) {
        this.prsUsrId = prsUsrId;
    }

    
    public int getPrsDni() {
        return prsDni;
    }

    public void setPrsDni(int prsDni) {
        this.prsDni = prsDni;
    }

    public Character getPrsSexo() {
        return prsSexo;
    }

    public void setPrsSexo(Character prsSexo) {
        this.prsSexo = prsSexo;
    }

    public String getPrsNombre() {
        return prsNombre;
    }

    public void setPrsNombre(String prsNombre) {
        this.prsNombre = prsNombre;
    }

    public String getPrsApellido() {
        return prsApellido;
    }

    public void setPrsApellido(String prsApellido) {
        this.prsApellido = prsApellido;
    }

    public String getPrsEmail() {
        return prsEmail;
    }

    public void setPrsEmail(String prsEmail) {
        this.prsEmail = prsEmail;
    }

    public String getPrsTelefonoFijo() {
        return prsTelefonoFijo;
    }

    public void setPrsTelefonoFijo(String prsTelefonoFijo) {
        this.prsTelefonoFijo = prsTelefonoFijo;
    }

    public String getPrsTelefonoCelular() {
        return prsTelefonoCelular;
    }

    public void setPrsTelefonoCelular(String prsTelefonoCelular) {
        this.prsTelefonoCelular = prsTelefonoCelular;
    }

    public String getPrsDomicilio() {
        return prsDomicilio;
    }

    public void setPrsDomicilio(String prsDomicilio) {
        this.prsDomicilio = prsDomicilio;
    }

    public Date getPrsFechaNacimiento() {
        return prsFechaNacimiento;
    }

    public void setPrsFechaNacimiento(Date prsFechaNacimiento) {
        this.prsFechaNacimiento = prsFechaNacimiento;
    }

    public String getPrsCategoria() {
        return prsCategoria;
    }

    public void setPrsCategoria(String prsCategoria) {
        this.prsCategoria = prsCategoria;
    }
    
    public Date getPrsFechaAlta() {
        return prsFechaAlta;
    }

    public void setPrsFechaAlta(Date prsFechaAlta) {
        this.prsFechaAlta = prsFechaAlta;
    }

    public String getPrsUsuarioAlta() {
        return prsUsuarioAlta;
    }

    public void setPrsUsuarioAlta(String prsUsuarioAlta) {
        this.prsUsuarioAlta = prsUsuarioAlta;
    }

    public Date getPrsFechaMod() {
        return prsFechaMod;
    }

    public void setPrsFechaMod(Date prsFechaMod) {
        this.prsFechaMod = prsFechaMod;
    }

    public String getPrsUsuarioMod() {
        return prsUsuarioMod;
    }

    public void setPrsUsuarioMod(String prsUsuarioMod) {
        this.prsUsuarioMod = prsUsuarioMod;
    }

    public Date getPrsFechaBaja() {
        return prsFechaBaja;
    }

    public void setPrsFechaBaja(Date prsFechaBaja) {
        this.prsFechaBaja = prsFechaBaja;
    }

    public String getPrsUsuarioBaja() {
        return prsUsuarioBaja;
    }

    public void setPrsUsuarioBaja(String prsUsuarioBaja) {
        this.prsUsuarioBaja = prsUsuarioBaja;
    }

    public String getPrsPoseeRepresentados() {
        return prsPoseeRepresentados;
    }

    public void setPrsPoseeRepresentados(String prsPoseeRepresentados) {
        this.prsPoseeRepresentados = prsPoseeRepresentados;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prsId != null ? prsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.prsId == null && other.prsId != null) || (this.prsId != null && !this.prsId.equals(other.prsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.eschool.entity.Persona[ prsId=" + prsId + " ]";
    }

    public Integer getPrsEdad() {
        return prsEdad;
    }

    public void setPrsEdad(Integer prsEdad) {
        this.prsEdad = prsEdad;
    }

    public List<Mail> getMailList() {
        return mailList;
    }

    public void setMailList(List<Mail> mailList) {
        this.mailList = mailList;
    }

    public List<DetalleMail> getDetalleMailList() {
        return detalleMailList;
    }

    public void setDetalleMailList(List<DetalleMail> detalleMailList) {
        this.detalleMailList = detalleMailList;
    }
}
