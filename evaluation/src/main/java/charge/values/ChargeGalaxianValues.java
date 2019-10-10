/*
 * To change thi
s license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charge.values;

import java.util.Map;
import java.util.TreeMap;
import dao.numbers.Galaxian;

/**
 *
 * @author Boris
 */
public class ChargeGalaxianValues { //Clase que setea los valores de los números galacticos romanos conocidos
    private Map<String, Double> map = new TreeMap<String, Double>();

    public Map setGalaxianValues() {  
        this.map.put("I",1.0);
        this.map.put("V",5.0);
        this.map.put("X",10.0);
        this.map.put("L",50.0);
        this.map.put("C",100.0);
        this.map.put("D",500.0);
        this.map.put("M",1000.0);
        return map;
    }
    
}
