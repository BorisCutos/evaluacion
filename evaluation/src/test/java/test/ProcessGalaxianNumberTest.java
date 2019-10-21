/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import galaxiantoearth.ProcessGalaxianNumber;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Boris
 */
public class ProcessGalaxianNumberTest {
    
    @Test
    public void processGalaxianNumberTest(){
        ProcessGalaxianNumber processGalaxianNumber = new ProcessGalaxianNumber("XVIII");
        assertEquals(18.0, processGalaxianNumber.calculateEarthNotation(), 0);     
    }
    
}
