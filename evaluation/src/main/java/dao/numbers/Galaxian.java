/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.numbers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Boris
 */

/**
 * 
 * Clase que permitela interaccón con los valores galacticos conocidos
 */
public class Galaxian { 
    
    private  Map<String, Double> map = new TreeMap<String, Double>();
   
  
    
    public Map<String, Double> getMap() {
        return map;
    }

    public void setMap(Map<String, Double> map) {
        this.map = map;
    }
    
}
