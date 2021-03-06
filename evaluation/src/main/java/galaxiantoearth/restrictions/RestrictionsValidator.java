/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaxiantoearth.restrictions;

import charge.values.ChargeGalaxianValues;
import java.util.Iterator;
import java.util.Map;
import dao.numbers.Galaxian;

/**
 *
 * @author Boris
 */

/*
Clase que valida las restricciones
*/
public class RestrictionsValidator extends Galaxian {  

    private char[] galaxyValueVector;
    private ChargeGalaxianValues chargeGalaxianValues = new ChargeGalaxianValues();
    private Map<String, Double> map;

    /*
    Cargamos los datos al map y al vector de valores calacticos para procesamiento
    */
    public RestrictionsValidator(String galaxyValue) {
        this.map = this.chargeGalaxianValues.setGalaxianValues();
         //setea elString ingresado como un vector de caracteres uno a uno
        this.galaxyValueVector = galaxyValue.toCharArray();
        this.setMap(this.map);
        this.map = getMap();
    }
/**
 * METODO PARA VALIDAR SI EL NUMERO GALACTICO ES CORRECTO 
 *  
 */
    public boolean validateGalaxianNumber() { 
        boolean returnValidateGalaxianNumber = false;
        for (int vectorGalaxiValueWalker = 0; vectorGalaxiValueWalker
                < (this.galaxyValueVector.length); vectorGalaxiValueWalker++) {
            if (this.map.containsKey(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]))) {
                returnValidateGalaxianNumber = true;
            } else {
                returnValidateGalaxianNumber = false;
                break;
            }
        }
        return returnValidateGalaxianNumber;
    }

    /**
     * 
     * Validar que no haya mas de tres repeticiones "I", "X", "C", and "M"
     */
    public boolean noMoreThreeTimeIncidences() { 
        int iCounter = 0;
        int xCounter = 0;
        int cCounter = 0;
        int mCounter = 0;

        boolean returnValidateGalaxianNumber = false;
        for (int vectorGalaxiValueWalker = 0; vectorGalaxiValueWalker
                < (this.galaxyValueVector.length); vectorGalaxiValueWalker++) {
            if ((Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker])).equals("I")
                    && this.map.containsKey(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]))) {
                iCounter++;
            } else {
                if ((Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker])).equals("X")
                        && this.map.containsKey(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]))) {
                    xCounter++;
                } else {
                    if ((Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker])).equals("C")
                            && this.map.containsKey(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]))) {
                        cCounter++;
                    } else {
                        if ((Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker])).equals("M")
                                && this.map.containsKey(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]))) {
                            mCounter++;
                        }
                    }
                }
            }
        }
        
        //metodo para validad que sea posible mas de 4 incidencias del mismo caracter
        if (iCounter > 3 || xCounter > 3 || cCounter > 3 || mCounter > 3) {
            returnValidateGalaxianNumber = fourIncidences();   
        } else {
            returnValidateGalaxianNumber = true;
        }

        return returnValidateGalaxianNumber;
    }

    /**
     * Validar que no haya mas de tres repeticiones "D", "L", and "V"  
     */
    public boolean noMoreOneIncidences() {
        int dCounter = 0;
        int lCounter = 0;
        int vCounter = 0;
        boolean returnValidateGalaxianNumber = false;

        for (int vectorGalaxiValueWalker = 0; vectorGalaxiValueWalker
                < (this.galaxyValueVector.length); vectorGalaxiValueWalker++) {
            if ((Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker])).equals("D")
                    && this.map.containsKey(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]))) {
                dCounter++;
            } else {
                if ((Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker])).equals("L")
                        && this.map.containsKey(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]))) {
                    lCounter++;
                } else {
                    if ((Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker])).equals("V")
                            && this.map.containsKey(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]))) {
                        vCounter++;
                    }
                }
            }
        }
        if (dCounter > 1 || lCounter > 1 || vCounter > 1) {
            returnValidateGalaxianNumber = false;
        } else {
            returnValidateGalaxianNumber = true;
        }

        return returnValidateGalaxianNumber;
    }

    /**
     * metodo para validad que sea posible mas de 4 incidencias del mismo caracter
     */
    public boolean fourIncidences() {   
        boolean returnValidateGalaxianNumber = true;
        int counter = 0;

        for (int i = 0; i < this.galaxyValueVector.length; i++) {
            for (int j = i + 1; j < this.galaxyValueVector.length; j++) {
                if (this.galaxyValueVector[i] == this.galaxyValueVector[j]) {
                    counter++;
                    if (counter == 2) {
                        returnValidateGalaxianNumber = validateFourIncidences(i, returnValidateGalaxianNumber);
                        counter = 0;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return returnValidateGalaxianNumber;
    }

    
    /**
     * metodo para verificar que se cumpla la condición de 4 incidencias de los caracteres I;X;C;M
     * 
     */

    public boolean validateFourIncidences(int i, boolean returnValidateGalaxianNumber) { 

        if ((i + 4) < this.galaxyValueVector.length && (i + 3) < this.galaxyValueVector.length
                && (this.galaxyValueVector[i] == this.galaxyValueVector[i + 1])
                && (this.galaxyValueVector[i] == this.galaxyValueVector[i + 2])) {
            if ((this.galaxyValueVector[i] == this.galaxyValueVector[i + 4])
                    && (this.map.get(Character.toString(this.galaxyValueVector[i + 3]))
                    < this.map.get(Character.toString(this.galaxyValueVector[i])))) {

                returnValidateGalaxianNumber = true;

            } else {
                returnValidateGalaxianNumber = false;
            }
        }
        return returnValidateGalaxianNumber;
    }
}
