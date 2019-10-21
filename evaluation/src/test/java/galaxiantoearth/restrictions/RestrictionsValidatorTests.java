/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaxiantoearth.restrictions;

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
        RestrictionsValidator restrictionsValidator= new RestrictionsValidator("XVIII");
         assertTrue(restrictionsValidator.validateGalaxianNumber());
    }
    
    @Test
    public void noMoreThreeTimeIncidencesTest() {
        //correcto XXXVI
        //incorrecto XXXXVI
        RestrictionsValidator restrictionsValidator= new RestrictionsValidator("XXXVI");
         assertTrue(restrictionsValidator.noMoreThreeTimeIncidences());
    }
    
    @Test
    public void noMoreOneIncidencesTest() {
        //correcto D,L,V
        //incorrecto DD,LL,VV
        RestrictionsValidator restrictionsValidator= new RestrictionsValidator("DD");
         assertTrue(restrictionsValidator.noMoreOneIncidences());
    }
    
    @Test
    public void fourIncidencesTest() {
        //correcto XXXIX
        //incorrecto XXXCM
        RestrictionsValidator restrictionsValidator= new RestrictionsValidator("XXXCM");
         assertTrue(restrictionsValidator.fourIncidences());
    }
    
}
