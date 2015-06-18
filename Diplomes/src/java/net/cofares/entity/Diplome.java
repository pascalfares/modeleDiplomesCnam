/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.entity;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pascalfares
 */
@Entity
@Table(name = "Diplome")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diplome.findAll", query = "SELECT d FROM Diplome d"),
    @NamedQuery(name = "Diplome.findByCodedip", query = "SELECT d FROM Diplome d WHERE d.codedip = :codedip"),
    @NamedQuery(name = "Diplome.findByDiploma", query = "SELECT d FROM Diplome d WHERE d.diploma = :diploma"),
    @NamedQuery(name = "Diplome.findByIdDiplome", query = "SELECT d FROM Diplome d WHERE d.idDiplome = :idDiplome"),
    @NamedQuery(name = "Diplome.findByTypediplome", query = "SELECT d FROM Diplome d WHERE d.typediplome = :typediplome"),
    @NamedQuery(name = "Diplome.findByTotalcredits", query = "SELECT d FROM Diplome d WHERE d.totalcredits = :totalcredits"),
    @NamedQuery(name = "Diplome.findByTotalexperience", query = "SELECT d FROM Diplome d WHERE d.totalexperience = :totalexperience"),
    @NamedQuery(name = "Diplome.findByTotalens", query = "SELECT d FROM Diplome d WHERE d.totalens = :totalens"),
    @NamedQuery(name = "Diplome.findByTotallangue", query = "SELECT d FROM Diplome d WHERE d.totallangue = :totallangue"),
    @NamedQuery(name = "Diplome.findByNiveau", query = "SELECT d FROM Diplome d WHERE d.niveau = :niveau"),
    @NamedQuery(name = "Diplome.findByCycle", query = "SELECT d FROM Diplome d WHERE d.cycle = :cycle"),
    @NamedQuery(name = "Diplome.findByExp", query = "SELECT d FROM Diplome d WHERE d.exp = :exp"),
    @NamedQuery(name = "Diplome.findByNouveaud", query = "SELECT d FROM Diplome d WHERE d.nouveaud = :nouveaud"),
    @NamedQuery(name = "Diplome.findByCodecatalogue", query = "SELECT d FROM Diplome d WHERE d.codecatalogue = :codecatalogue"),
    @NamedQuery(name = "Diplome.findByDipNivFR", query = "SELECT d FROM Diplome d WHERE d.dipNivFR = :dipNivFR"),
    @NamedQuery(name = "Diplome.findByDipNivEN", query = "SELECT d FROM Diplome d WHERE d.dipNivEN = :dipNivEN"),
    @NamedQuery(name = "Diplome.findByDipPhraseNivFR", query = "SELECT d FROM Diplome d WHERE d.dipPhraseNivFR = :dipPhraseNivFR"),
    @NamedQuery(name = "Diplome.findByDipPhraseNivEN", query = "SELECT d FROM Diplome d WHERE d.dipPhraseNivEN = :dipPhraseNivEN")})
public class Diplome implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "codedip")
    private String codedip;
    @Column(name = "diploma")
    private String diploma;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDiplome")
    private Short idDiplome;
    @Column(name = "typediplome")
    private String typediplome;
    @Basic(optional = false)
    @Column(name = "totalcredits")
    private int totalcredits;
    @Column(name = "totalexperience")
    private Integer totalexperience;
    @Column(name = "totalens")
    private Integer totalens;
    @Column(name = "totallangue")
    private Integer totallangue;
    @Basic(optional = false)
    @Column(name = "niveau")
    private String niveau;
    @Basic(optional = false)
    @Column(name = "cycle")
    private String cycle;
    @Basic(optional = false)
    @Column(name = "exp")
    private boolean exp;
    @Basic(optional = false)
    @Column(name = "nouveaud")
    private boolean nouveaud;
    @Column(name = "codecatalogue")
    private String codecatalogue;
    @Column(name = "DipNivFR")
    private Short dipNivFR;
    @Column(name = "DipNivEN")
    private Short dipNivEN;
    @Column(name = "DipPhraseNivFR")
    private String dipPhraseNivFR;
    @Column(name = "DipPhraseNivEN")
    private String dipPhraseNivEN;
    @JoinColumn(name = "spec", referencedColumnName = "spec")
    @ManyToOne
    private Specialite spec;

    public Diplome() {
    }

    public Diplome(Short idDiplome) {
        this.idDiplome = idDiplome;
    }

    public Diplome(Short idDiplome, String codedip, int totalcredits, String niveau, String cycle, boolean exp, boolean nouveaud) {
        this.idDiplome = idDiplome;
        this.codedip = codedip;
        this.totalcredits = totalcredits;
        this.niveau = niveau;
        this.cycle = cycle;
        this.exp = exp;
        this.nouveaud = nouveaud;
    }

    public String getCodedip() {
        return codedip;
    }

    public void setCodedip(String codedip) {
        this.codedip = codedip;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public Short getIdDiplome() {
        return idDiplome;
    }

    public void setIdDiplome(Short idDiplome) {
        this.idDiplome = idDiplome;
    }

    public String getTypediplome() {
        return typediplome;
    }

    public void setTypediplome(String typediplome) {
        this.typediplome = typediplome;
    }

    public int getTotalcredits() {
        return totalcredits;
    }

    public void setTotalcredits(int totalcredits) {
        this.totalcredits = totalcredits;
    }

    public Integer getTotalexperience() {
        return totalexperience;
    }

    public void setTotalexperience(Integer totalexperience) {
        this.totalexperience = totalexperience;
    }

    public Integer getTotalens() {
        return totalens;
    }

    public void setTotalens(Integer totalens) {
        this.totalens = totalens;
    }

    public Integer getTotallangue() {
        return totallangue;
    }

    public void setTotallangue(Integer totallangue) {
        this.totallangue = totallangue;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public boolean getExp() {
        return exp;
    }

    public void setExp(boolean exp) {
        this.exp = exp;
    }

    public boolean getNouveaud() {
        return nouveaud;
    }

    public void setNouveaud(boolean nouveaud) {
        this.nouveaud = nouveaud;
    }

    public String getCodecatalogue() {
        return codecatalogue;
    }

    public void setCodecatalogue(String codecatalogue) {
        this.codecatalogue = codecatalogue;
    }

    public Short getDipNivFR() {
        return dipNivFR;
    }

    public void setDipNivFR(Short dipNivFR) {
        this.dipNivFR = dipNivFR;
    }

    public Short getDipNivEN() {
        return dipNivEN;
    }

    public void setDipNivEN(Short dipNivEN) {
        this.dipNivEN = dipNivEN;
    }

    public String getDipPhraseNivFR() {
        return dipPhraseNivFR;
    }

    public void setDipPhraseNivFR(String dipPhraseNivFR) {
        this.dipPhraseNivFR = dipPhraseNivFR;
    }

    public String getDipPhraseNivEN() {
        return dipPhraseNivEN;
    }

    public void setDipPhraseNivEN(String dipPhraseNivEN) {
        this.dipPhraseNivEN = dipPhraseNivEN;
    }

    public Specialite getSpec() {
        return spec;
    }

    public void setSpec(Specialite spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiplome != null ? idDiplome.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diplome)) {
            return false;
        }
        Diplome other = (Diplome) object;
        if ((this.idDiplome == null && other.idDiplome != null) || (this.idDiplome != null && !this.idDiplome.equals(other.idDiplome))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.cofares.entity.Diplome[ idDiplome=" + idDiplome + " ]";
    }
    
}
