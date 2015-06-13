/**
 * 
*/
package net.cofares.modelediplome;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import net.cofares.modele.Configuration;

/**
 *
 * @author pascalfares
 */
@XmlRootElement
public abstract class ComposantDiplome {
    String referenceGroupe;
    /**
     * Nombre de crédit a valider
     */
    int nbcreditAValide;
    
    List<UE> ues;
    
    /**
     * Le composant est validé ou pas
     * @param c la configuaration pour decider si le composant est validé
     * @return valide ou non
     */
    public abstract boolean estValide(Configuration c);
    
    /**
     * Pour valider un composant il faut rechercher dans la Configuration passée en paramètres les Ues 
     * candidates. Une ue utilisé pour validé un composant ne peut plus être utilisé pour un autre composant!
     * ---
     * QUESTION A RESOUDRE: si plusieurs ue de la configuration permettent de valider le groupe que renvoyé?
     * par exemple il faut 6cr pour validé un groupe de 24cr et dans configuration il y a 12cr de validable
     * que faire?
     * --------
     * @param c configuration d'ue pour pour decider si le composant est validé
     * @return La liste des ue (sous ensemble de configuration) qui ont été validés
     */
    public abstract List<UE> uesValide(Configuration c);
}
