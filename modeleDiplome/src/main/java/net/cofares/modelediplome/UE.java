/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.modelediplome;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Information d'une UE
 * @author pascalfares
 */
@XmlRootElement
public class UE {
    private String codeUe;
    private String nomUe;
    private String descriptionUe;
    private String credit;

    /**
     * @return the codeUe
     */
    public String getCodeUe() {
        return codeUe;
    }

    /**
     * @param codeUe the codeUe to set
     */
    public void setCodeUe(String codeUe) {
        this.codeUe = codeUe;
    }

    /**
     * @return the nomUe
     */
    public String getNomUe() {
        return nomUe;
    }

    /**
     * @param nomUe the nomUe to set
     */
    public void setNomUe(String nomUe) {
        this.nomUe = nomUe;
    }

    /**
     * @return the descriptionUe
     */
    public String getDescriptionUe() {
        return descriptionUe;
    }

    /**
     * @param descriptionUe the descriptionUe to set
     */
    public void setDescriptionUe(String descriptionUe) {
        this.descriptionUe = descriptionUe;
    }

    /**
     * @return the credit
     */
    public String getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(String credit) {
        this.credit = credit;
    }
    
}
