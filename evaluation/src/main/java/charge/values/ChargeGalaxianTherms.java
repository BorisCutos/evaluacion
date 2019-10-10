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
public class ChargeGalaxianTherms {  //Clase que setea los valores de las palabras galacticas conocidas

    private Map<String, String> map = new TreeMap<String, String>();

    public ChargeGalaxianTherms() {  
        this.map.put("GLOB","I");
        this.map.put("PROK","V");
        this.map.put("PISH","X");
        this.map.put("TEGJ","L");
    }

    /**
     * @return the map
     */
    public Map<String, String> getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
