/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pascalfares
 */
@Entity
@Table(name = "Specialite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specialite.findAll", query = "SELECT s FROM Specialite s"),
    @NamedQuery(name = "Specialite.findBySpec", query = "SELECT s FROM Specialite s WHERE s.spec = :spec"),
    @NamedQuery(name = "Specialite.findBySpecialite", query = "SELECT s FROM Specialite s WHERE s.specialite = :specialite"),
    @NamedQuery(name = "Specialite.findBySpecialitear", query = "SELECT s FROM Specialite s WHERE s.specialitear = :specialitear"),
    @NamedQuery(name = "Specialite.findByAndebut", query = "SELECT s FROM Specialite s WHERE s.andebut = :andebut"),
    @NamedQuery(name = "Specialite.findByAnfin", query = "SELECT s FROM Specialite s WHERE s.anfin = :anfin"),
    @NamedQuery(name = "Specialite.findByEnsSoir", query = "SELECT s FROM Specialite s WHERE s.ensSoir = :ensSoir")})
public class Specialite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "spec")
    private Short spec;
    @Column(name = "specialite")
    private String specialite;
    @Column(name = "specialitear")
    private String specialitear;
    @Column(name = "andebut")
    private Short andebut;
    @Column(name = "anfin")
    private Short anfin;
    @Basic(optional = false)
    @Column(name = "EnsSoir")
    private boolean ensSoir;
    @OneToMany(mappedBy = "spec")
    private Collection<Diplome> diplomeCollection;
    @JoinColumn(name = "Nochef", referencedColumnName = "Nochef")
    @ManyToOne
    private Chef nochef;

    public Specialite() {
    }

    public Specialite(Short spec) {
        this.spec = spec;
    }

    public Specialite(Short spec, boolean ensSoir) {
        this.spec = spec;
        this.ensSoir = ensSoir;
    }

    public Short getSpec() {
        return spec;
    }

    public void setSpec(Short spec) {
        this.spec = spec;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getSpecialitear() {
        return specialitear;
    }

    public void setSpecialitear(String specialitear) {
        this.specialitear = specialitear;
    }

    public Short getAndebut() {
        return andebut;
    }

    public void setAndebut(Short andebut) {
        this.andebut = andebut;
    }

    public Short getAnfin() {
        return anfin;
    }

    public void setAnfin(Short anfin) {
        this.anfin = anfin;
    }

    public boolean getEnsSoir() {
        return ensSoir;
    }

    public void setEnsSoir(boolean ensSoir) {
        this.ensSoir = ensSoir;
    }

    @XmlTransient
    public Collection<Diplome> getDiplomeCollection() {
        return diplomeCollection;
    }

    public void setDiplomeCollection(Collection<Diplome> diplomeCollection) {
        this.diplomeCollection = diplomeCollection;
    }

    public Chef getNochef() {
        return nochef;
    }

    public void setNochef(Chef nochef) {
        this.nochef = nochef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spec != null ? spec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specialite)) {
            return false;
        }
        Specialite other = (Specialite) object;
        if ((this.spec == null && other.spec != null) || (this.spec != null && !this.spec.equals(other.spec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.cofares.entity.Specialite[ spec=" + spec + " ]";
    }
    
}
