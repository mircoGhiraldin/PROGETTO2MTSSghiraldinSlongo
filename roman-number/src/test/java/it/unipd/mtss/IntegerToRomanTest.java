package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert() {
   
        int number = 1;
        String expectedRoman = "I";
        
        String actualRoman = IntegerToRoman.convert(number);
        
        assertEquals(expectedRoman, actualRoman);
        
        
        number = 2;
        expectedRoman = "II";
        
        
        actualRoman = IntegerToRoman.convert(number);
        
        assertEquals(expectedRoman, actualRoman);
        
        number = 9;
        expectedRoman = "IX";
        
        
        actualRoman = IntegerToRoman.convert(number);
        
        assertEquals(expectedRoman, actualRoman);
        
        number = 11;
        expectedRoman = "XI";
        
        actualRoman = IntegerToRoman.convert(number);
        
        
        assertEquals(expectedRoman, actualRoman);
        
        number = 25;
        expectedRoman = "XXV";
        
        actualRoman = IntegerToRoman.convert(number);
        

        assertEquals(expectedRoman, actualRoman);
        
        number = 39;
        expectedRoman = "XXXIX";
        

        actualRoman = IntegerToRoman.convert(number);
        

        assertEquals(expectedRoman, actualRoman);
        

        number = 123;
        expectedRoman = "CXXIII";
        

        actualRoman = IntegerToRoman.convert(number);
        

        assertEquals(expectedRoman, actualRoman);
        

        number = 255;
        expectedRoman = "CCLV";
        

        actualRoman = IntegerToRoman.convert(number);
        

        assertEquals(expectedRoman, actualRoman);
        
        number = 458;
        expectedRoman = "CDLVIII";
        
        actualRoman = IntegerToRoman.convert(number);
        
        assertEquals(expectedRoman, actualRoman);
        

        number = 683;
        expectedRoman = "DCLXXXIII";
        
        actualRoman = IntegerToRoman.convert(number);
        
        assertEquals(expectedRoman, actualRoman);
        
   
        number = 815;
        expectedRoman = "DCCCXV";
        
        actualRoman = IntegerToRoman.convert(number);
        
     
        assertEquals(expectedRoman, actualRoman);
        
  
        number = 999;
        expectedRoman = "CMXCIX";
        
    
        actualRoman = IntegerToRoman.convert(number);
        
   
        assertEquals(expectedRoman, actualRoman);
    }
}


