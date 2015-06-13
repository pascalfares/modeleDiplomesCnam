/**
 * Une Configuration est un ensemble d'Ue.
 * Avec cette ensemble d'UE nous cherchons a savoir
 * si ils permettent d'obtenir un diplôme ou pas.
 */
package net.cofares.modele;

import java.util.Collection;
import java.util.HashMap;
import net.cofares.modelediplome.UE;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pascalfares
 */
@XmlRootElement
public class Configuration {
    private HashMap<String,UE> configuration;

   
    
    public void setConfiguration (UE ue) {
        this.configuration.put(ue.getCodeUe(),ue);
    }
    
    public void setConfiguration (HashMap<String,? extends UE> map) {
        this.configuration.putAll(map);
    }
    
    public UE getConfiguration(String codeUe) {
       return  configuration.get(codeUe);
    }
    
    public Collection<UE> getConfiguration() {
        return configuration.values();
    }
}
