/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaxiantoearth;

import charge.values.ChargeGalaxianValues;
import java.util.Map;
import dao.numbers.Galaxian;

/**
 *
 * @author Boris
 */
public class ProcessGalaxianNumber extends Galaxian {

    private char[] galaxyValueVector;
    private ChargeGalaxianValues chargeGalaxianValues = new ChargeGalaxianValues();
    private Map<String, Double> map;

    
    /**
     * Carga los valores ingresados por el usuario al map y al vector de valores gal�cticos
     */
    public ProcessGalaxianNumber(String galaxyValue) {
        this.map = this.chargeGalaxianValues.setGalaxianValues();
        this.galaxyValueVector = galaxyValue.toCharArray(); //setea elString ingresado como un vector de caracteres uno a uno
        this.setMap(this.map);
        this.map = getMap();
    }
    
    /*
    m�todo que permite el computo de los valores galacticos ingresados devolviendo el valor en numeros arabigos
    */
    public double calculateEarthNotation() {
        double numberInEarthNotation = 0;
        char vectorGalaxyCharacter = ' ';
        for (int vectorGalaxiValueWalker = (this.galaxyValueVector.length) - 1; vectorGalaxiValueWalker
                >= 0; vectorGalaxiValueWalker--) {

            if (vectorGalaxiValueWalker == (this.galaxyValueVector.length) - 1) {
                numberInEarthNotation = this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
            } else {
                vectorGalaxyCharacter = this.galaxyValueVector[vectorGalaxiValueWalker];
                //condiciones para los caracteres en las restricciones del problema
                switch (vectorGalaxyCharacter) {
                    case 'I':  

                        if (this.galaxyValueVector[vectorGalaxiValueWalker + 1] == 'V' || this.galaxyValueVector[vectorGalaxiValueWalker + 1] == 'X') {
                            numberInEarthNotation -= this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
                        } else {
                            numberInEarthNotation += this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
                        }

                        break;
                    case 'X'://condiciones para los caracteres en las restricciones del problema
                        if (this.galaxyValueVector[vectorGalaxiValueWalker + 1] == 'L' || this.galaxyValueVector[vectorGalaxiValueWalker + 1] == 'C') {
                            numberInEarthNotation -= this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
                        } else {
                            numberInEarthNotation += this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
                        }
                        break;
                    case 'C'://condiciones para los caracteres en las restricciones del problema
                        if (this.galaxyValueVector[vectorGalaxiValueWalker + 1] == 'D' || this.galaxyValueVector[vectorGalaxiValueWalker + 1] == 'M') {
                            numberInEarthNotation -= this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
                        } else {
                            numberInEarthNotation += this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
                        }
                        break;
                    case 'V'://condiciones para los caracteres en las restricciones del problema
                        numberInEarthNotation += this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
                        break;
                    case 'L'://condiciones para los caracteres en las restricciones del problema
                        numberInEarthNotation += this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
                        break;
                    case 'D'://condiciones para los caracteres en las restricciones del problema
                        numberInEarthNotation += this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
                        break;
                    default:
                        if (this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker + 1])) > this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]))) {
                            numberInEarthNotation -= this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
                        } else {
                            numberInEarthNotation += this.map.get(Character.toString(this.galaxyValueVector[vectorGalaxiValueWalker]));
                        }
                }
            }

        }
        return numberInEarthNotation;
    }

}
