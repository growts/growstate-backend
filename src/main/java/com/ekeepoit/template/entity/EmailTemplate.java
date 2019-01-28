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
@Table(name = "email_template")
@NamedQueries({
    @NamedQuery(name = "EmailTemplate.findAll", query = "SELECT e FROM EmailTemplate e")})
public class EmailTemplate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emt_id")
    private Integer emtId;
    @Size(max = 150)
    @Column(name = "emt_name")
    private String emtName;
    @Size(max = 150)
    @Column(name = "emt_from_address")
    private String emtFromAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "emt_subject")
    private String emtSubject;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "emt_html")
    private String emtHtml;
    @Basic(optional = false)
    @NotNull
    @Column(name = "emt_inserted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date emtInsertedAt;
    @Column(name = "emt_ended_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date emtEndedAt;

    public EmailTemplate() {
    }

    public EmailTemplate(Integer emtId) {
        this.emtId = emtId;
    }

    public EmailTemplate(Integer emtId, String emtSubject, String emtHtml, Date emtInsertedAt) {
        this.emtId = emtId;
        this.emtSubject = emtSubject;
        this.emtHtml = emtHtml;
        this.emtInsertedAt = emtInsertedAt;
    }

    public Integer getEmtId() {
        return emtId;
    }

    public void setEmtId(Integer emtId) {
        this.emtId = emtId;
    }

    public String getEmtName() {
        return emtName;
    }

    public void setEmtName(String emtName) {
        this.emtName = emtName;
    }

    public String getEmtFromAddress() {
        return emtFromAddress;
    }

    public void setEmtFromAddress(String emtFromAddress) {
        this.emtFromAddress = emtFromAddress;
    }

    public String getEmtSubject() {
        return emtSubject;
    }

    public void setEmtSubject(String emtSubject) {
        this.emtSubject = emtSubject;
    }

    public String getEmtHtml() {
        return emtHtml;
    }

    public void setEmtHtml(String emtHtml) {
        this.emtHtml = emtHtml;
    }

    public Date getEmtInsertedAt() {
        return emtInsertedAt;
    }

    public void setEmtInsertedAt(Date emtInsertedAt) {
        this.emtInsertedAt = emtInsertedAt;
    }

    public Date getEmtEndedAt() {
        return emtEndedAt;
    }

    public void setEmtEndedAt(Date emtEndedAt) {
        this.emtEndedAt = emtEndedAt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emtId != null ? emtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmailTemplate)) {
            return false;
        }
        EmailTemplate other = (EmailTemplate) object;
        if ((this.emtId == null && other.emtId != null) || (this.emtId != null && !this.emtId.equals(other.emtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ekeepoit.eschool.entity.EmailTemplate[ emtId=" + emtId + " ]";
    }
    
}
