package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test  
    public void testConvert() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("XI", IntegerToRoman.convert(11));
        assertEquals("XXV", IntegerToRoman.convert(25));
        assertEquals("XXXIX", IntegerToRoman.convert(39));
        assertEquals("CXXIII", IntegerToRoman.convert(123));
        assertEquals("CCLV", IntegerToRoman.convert(255));
        assertEquals("CDLVIII", IntegerToRoman.convert(458));
        assertEquals("DCLXXXIII", IntegerToRoman.convert(683));
        assertEquals("DCCCXV", IntegerToRoman.convert(815));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
        
    }

}
