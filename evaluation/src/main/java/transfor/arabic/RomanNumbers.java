/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfor.arabic;

/**
 *
 * @author Boris
 */
public class RomanNumbers {
    public static String convertToRomanNumber(int arabicNumber) {
      int i, thousands, hundred, tens, units;
      String romanNumber = "";
      
      
      thousands = arabicNumber / 1000;
      hundred = arabicNumber / 100 % 10;
      tens = arabicNumber / 10 % 10;
      units = arabicNumber % 10;

     
      for (i = 1; i <= thousands; i++) {
             romanNumber = romanNumber + "M";
      }

     
      if (hundred == 9) {
          romanNumber = romanNumber + "CM";
      } else if (hundred >= 5) {
                     romanNumber = romanNumber + "D";
                     for (i = 6; i <= hundred; i++) {
                            romanNumber = romanNumber + "C";
                     }
      } else if (hundred == 4) {
                      romanNumber = romanNumber + "CD";
      } else {
                  for (i = 1; i <= hundred; i++) {
                         romanNumber = romanNumber + "C";
                  }
      }

     
      if (tens == 9) {
           romanNumber = romanNumber + "XC";
      } else if (tens >= 5) {
                      romanNumber = romanNumber + "L";
                      for (i = 6; i <= tens; i++) {
                            romanNumber = romanNumber + "X";
                      }
      } else if (tens == 4) {
                      romanNumber = romanNumber + "XL";
      } else {
                    for (i = 1; i <= tens; i++) {
                           romanNumber = romanNumber + "X";
                    }
      }

     
      if (units == 9) {
           romanNumber = romanNumber + "IX";
      } else if (units >= 5) {
                      romanNumber = romanNumber + "V";
                      for (i = 6; i <= units; i++) {
                             romanNumber = romanNumber + "I";
                      }
      } else if (units == 4) {
                      romanNumber = romanNumber + "IV";
      } else {
                  for (i = 1; i <= units; i++) {
                         romanNumber = romanNumber + "I";
                  }
      }
      return romanNumber;
  }
}
