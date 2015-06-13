/*
 * Les diplômes : définition objet
 *
 */
package net.cofares.modelediplome;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import net.cofares.Personne;

/**
 * Classes diplôme prète pour Marshaling unmarshaling en XML / JSON
 * Utilisation de JAXB
 * @author pascalfares
 * @see javax.xml.bind
 */
@XmlRootElement
public class Diplome {
    
    String codeDiplome;
    String titreDiplome;
    String descriptionDiplome;   
    Personne responsableDiplome;    
    /**
     * Date de fin de validté du diplôme
     */
    Date validiteDiplome;
    
    /**
     * Liste des composants (groupe d'UE)
     * qui constituent le diplômes
     */
    List<ComposantDiplome> composantDiplomes;
    
    /**
     * Nombre de crédits à valider pour pretendre au diplôme
     */
    int nombreCredits;
    
}
