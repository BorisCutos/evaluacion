/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import galaxiantoearth.restrictions.RestrictionsValidator;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Boris
 */
public class RestrictionsValidatorTests {
    
    @Test
    public void validateGalaxianNumberTest() {
        RestrictionsValidator restrictionsValidator= new RestrictionsValidator("kk");
         assertTrue(restrictionsValidator.validateGalaxianNumber());
    }
    
}
