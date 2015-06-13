/**
 * EU par équivalence
 */
package net.cofares.modele;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import net.cofares.modelediplome.UE;

/**
 *
 * @author pascalfares
 */
@XmlRootElement
public class UEE extends UE{
    String referenceEquivaence;
    Date dateEquivalence;
}
