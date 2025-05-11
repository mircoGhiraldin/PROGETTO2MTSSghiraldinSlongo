package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test  
    public void testNumber() {
        int v = Main.numero;
        assertTrue("Il numero dovrebbe essere tra 1 e 1000",v >= 1 && v <= 1000);
    }

}