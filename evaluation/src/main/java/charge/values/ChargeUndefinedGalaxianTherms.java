/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charge.values;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Boris
 */
public class ChargeUndefinedGalaxianTherms { //Clase que para cargar los valores galacticos indefinidos
      private Map<String, Double> map = new TreeMap<String, Double>();

    public ChargeUndefinedGalaxianTherms() {  //{Gold=14450.0, Iron=195.5, Silver=17.0}
        this.map.put("SILVER",17.0);
        this.map.put("GOLD",14450.0);
        this.map.put("IRON",195.5);
    
    
    }

    /**
     * @return the map
     */
    public Map<String, Double> getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(Map<String, Double> map) {
        this.map = map;
    }
    
}
