/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.modele;

import net.cofares.modelediplome.UE;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * UE optenue par réussite Réussie
 * UER est un résulat d'un  traitemet sur tous les examnes passé par l'auditeur
 * Puis decission du jury
 * @author pascalfares
 */
@XmlRootElement
public class UER extends UE {
    double note;
    String mention;
    String semestreReussite;
    String aneeReussite;
    String sessionReussite;
}
