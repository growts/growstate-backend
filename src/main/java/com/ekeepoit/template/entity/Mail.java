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
 * @author Nico
 */
@Entity
@Table(name = "mail")
public class Mail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mail_id")
    private Integer mailId;
    @Size(max = 100)
    @Column(name = "mail_subject")
    private String mailSubject;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "mail_body")
    private String mailBody;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mail_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mailDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mail_is_read")
    private boolean mailIsRead;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mail_is_important")
    private boolean mailIsImportant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mail_is_deleted")
    private boolean mailIsDeleted;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "mail_type")
    private String mailType;
    @Size(max = 45)
    @Column(name = "mail_label_type")
    private String mailLabelType;
    @Size(max = 45)
    @Column(name = "mail_label_class")
    private String mailLabelClass;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mail_fecha_alta")
    @Temporal(TemporalType.DATE)
    private Date mailFechaAlta;
    @Column(name = "mail_fecha_baja")
    @Temporal(TemporalType.DATE)
    private Date mailFechaBaja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mail_fecha_ult_mod")
    @Temporal(TemporalType.DATE)
    private Date mailFechaUltMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "mail_usuario_alta")
    private String mailUsuarioAlta;
    @Size(max = 30)
    @Column(name = "mail_usuario_baja")
    private String mailUsuarioBaja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "mail_usuario_ult_mod")
    private String mailUsuarioUltMod;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "madMailId")
    private List<DetalleMail> detalleMailList;
    @JoinColumn(name = "mail_from", referencedColumnName = "prs_id")
    @ManyToOne(optional = false)
    private Persona mailFrom;
    @OneToMany(mappedBy = "mailParentId")
    private List<Mail> mailList;
    @JoinColumn(name = "mail_parent_id", referencedColumnName = "mail_id")
    @ManyToOne
    private Mail mailParentId;

    public Mail() {
    }

    public Mail(Integer mailId) {
        this.mailId = mailId;
    }

    public Mail(Integer mailId, String mailBody, Date mailDate, boolean mailIsRead, boolean mailIsImportant, String mailType, Date mailFechaAlta, Date mailFechaUltMod, String mailUsuarioAlta, String mailUsuarioUltMod) {
        this.mailId = mailId;
        this.mailBody = mailBody;
        this.mailDate = mailDate;
        this.mailIsRead = mailIsRead;
        this.mailIsImportant = mailIsImportant;
        this.mailType = mailType;
        this.mailFechaAlta = mailFechaAlta;
        this.mailFechaUltMod = mailFechaUltMod;
        this.mailUsuarioAlta = mailUsuarioAlta;
        this.mailUsuarioUltMod = mailUsuarioUltMod;
    }

    public Integer getMailId() {
        return mailId;
    }

    public void setMailId(Integer mailId) {
        this.mailId = mailId;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailBody() {
        return mailBody;
    }

    public void setMailBody(String mailBody) {
        this.mailBody = mailBody;
    }

    public Date getMailDate() {
        return mailDate;
    }

    public void setMailDate(Date mailDate) {
        this.mailDate = mailDate;
    }

    public boolean getMailIsRead() {
        return mailIsRead;
    }

    public void setMailIsRead(boolean mailIsRead) {
        this.mailIsRead = mailIsRead;
    }

    public boolean getMailIsImportant() {
        return mailIsImportant;
    }

    public void setMailIsImportant(boolean mailIsImportant) {
        this.mailIsImportant = mailIsImportant;
    }

    public String getMailType() {
        return mailType;
    }

    public void setMailType(String mailType) {
        this.mailType = mailType;
    }

    public String getMailLabelType() {
        return mailLabelType;
    }

    public void setMailLabelType(String mailLabelType) {
        this.mailLabelType = mailLabelType;
    }

    public String getMailLabelClass() {
        return mailLabelClass;
    }

    public void setMailLabelClass(String mailLabelClass) {
        this.mailLabelClass = mailLabelClass;
    }

    public Date getMailFechaAlta() {
        return mailFechaAlta;
    }

    public void setMailFechaAlta(Date mailFechaAlta) {
        this.mailFechaAlta = mailFechaAlta;
    }

    public Date getMailFechaBaja() {
        return mailFechaBaja;
    }

    public void setMailFechaBaja(Date mailFechaBaja) {
        this.mailFechaBaja = mailFechaBaja;
    }

    public Date getMailFechaUltMod() {
        return mailFechaUltMod;
    }

    public void setMailFechaUltMod(Date mailFechaUltMod) {
        this.mailFechaUltMod = mailFechaUltMod;
    }

    public String getMailUsuarioAlta() {
        return mailUsuarioAlta;
    }

    public void setMailUsuarioAlta(String mailUsuarioAlta) {
        this.mailUsuarioAlta = mailUsuarioAlta;
    }

    public String getMailUsuarioBaja() {
        return mailUsuarioBaja;
    }

    public void setMailUsuarioBaja(String mailUsuarioBaja) {
        this.mailUsuarioBaja = mailUsuarioBaja;
    }

    public String getMailUsuarioUltMod() {
        return mailUsuarioUltMod;
    }

    public void setMailUsuarioUltMod(String mailUsuarioUltMod) {
        this.mailUsuarioUltMod = mailUsuarioUltMod;
    }

    public List<DetalleMail> getDetalleMailList() {
        return detalleMailList;
    }

    public void setDetalleMailList(List<DetalleMail> detalleMailList) {
        this.detalleMailList = detalleMailList;
    }

    public Persona getMailFrom() {
        return mailFrom;
    }

    public void setMailFrom(Persona mailFrom) {
        this.mailFrom = mailFrom;
    }

    public List<Mail> getMailList() {
        return mailList;
    }

    public void setMailList(List<Mail> mailList) {
        this.mailList = mailList;
    }

    public Mail getMailParentId() {
        return mailParentId;
    }

    public void setMailParentId(Mail mailParentId) {
        this.mailParentId = mailParentId;
    }

    public boolean isMailIsDeleted() {
        return mailIsDeleted;
    }

    public void setMailIsDeleted(boolean mailIsDeleted) {
        this.mailIsDeleted = mailIsDeleted;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mailId != null ? mailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mail)) {
            return false;
        }
        Mail other = (Mail) object;
        if ((this.mailId == null && other.mailId != null) || (this.mailId != null && !this.mailId.equals(other.mailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.eschool.entity.Mail[ mailId=" + mailId + " ]";
    }
    
}
