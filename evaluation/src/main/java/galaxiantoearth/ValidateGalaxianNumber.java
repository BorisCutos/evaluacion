/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaxiantoearth;

import galaxiantoearth.restrictions.RestrictionsValidator;

/**
 *
 * @author Boris
 */

/**
 * clase para validar las condiciones de que el los valores ingresados sea un numero galactico
 * 
 */
public class ValidateGalaxianNumber { 

    private RestrictionsValidator restrictionsValidator;

    public ValidateGalaxianNumber(String galaxyValue) {
        this.restrictionsValidator = new RestrictionsValidator(galaxyValue);
    }
/**
    metodo que valida todas las condiciones para que un numero sea galactico
 */
    public boolean isGalaxianNumber() {
        boolean returnGalaxianNumber = false;
        if (this.restrictionsValidator.validateGalaxianNumber()
                && this.restrictionsValidator.noMoreThreeTimeIncidences()
                && this.restrictionsValidator.noMoreOneIncidences()) {
                returnGalaxianNumber = true;
        }
        return returnGalaxianNumber;
    }

}
