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
public class ValidateGalaxianNumber {

    private RestrictionsValidator restrictionsValidator;

    public ValidateGalaxianNumber(String galaxyValue) {
        this.restrictionsValidator = new RestrictionsValidator(galaxyValue);
    }

    public boolean isGalaxianNumber() {
        boolean returnGalaxianNumber = false;
        if (this.restrictionsValidator.validateGalaxianNumber()) {
            if (this.restrictionsValidator.noMoreThreeTimeIncidences()
                    && this.restrictionsValidator.noMoreOneIncidences()) {
                returnGalaxianNumber = true;
            }else returnGalaxianNumber = false;
        }
        return returnGalaxianNumber;
    }

}
