package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    @Test
    public void testPrint() {
        int number = 1;
        String  expected ="  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n";
        String actual = RomanPrinter.print(number);
        assertEquals(expected, actual);

         number = 2;
         expected ="  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n";
         actual = RomanPrinter.print(number);
        assertEquals(expected, actual);

         number = 5;
         expected =" __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n";
         actual = RomanPrinter.print(number);
        assertEquals(expected, actual);

         number = 9;
         expected ="  _____  __   __\n |_   _| \\ \\ / /\n   | |    \\ V / \n   | |     > <  \n  _| |_   / . \\ \n |_____| /_/ \\_\\\n";
         actual = RomanPrinter.print(number);
        assertEquals(expected, actual);

         number = 19;
         expected =" __   __  _____  __   __\n \\ \\ / / |_   _| \\ \\ / /\n  \\ V /    | |    \\ V / \n   > <     | |     > <  \n  / . \\   _| |_   / . \\ \n /_/ \\_\\ |_____| /_/ \\_\\\n";
         actual = RomanPrinter.print(number);
        assertEquals(expected, actual);

         number = 40;
         expected =" __   __  _      \n \\ \\ / / | |     \n  \\ V /  | |     \n   > <   | |     \n  / . \\  | |____ \n /_/ \\_\\ |______|\n";
         actual = RomanPrinter.print(number);
        assertEquals(expected, actual);

         number = 80;
         expected ="  _       __   __ __   __ __   __\n | |      \\ \\ / / \\ \\ / / \\ \\ / /\n | |       \\ V /   \\ V /   \\ V / \n | |        > <     > <     > <  \n | |____   / . \\   / . \\   / . \\ \n |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n";
         actual = RomanPrinter.print(number);
        assertEquals(expected, actual);

         number = 300;
         expected ="   _____    _____    _____ \n  / ____|  / ____|  / ____|\n | |      | |      | |     \n | |      | |      | |     \n | |____  | |____  | |____ \n  \\_____|  \\_____|  \\_____|\n";
         actual = RomanPrinter.print(number);
        assertEquals(expected, actual);

         number = 400;
         expected ="   _____   _____  \n  / ____| |  __ \\ \n | |      | |  | |\n | |      | |  | |\n | |____  | |__| |\n  \\_____| |_____/ \n";
         actual = RomanPrinter.print(number);
        assertEquals(expected, actual);

         number = 900;
         expected ="   _____   __  __ \n  / ____| |  \\/  |\n | |      | \\  / |\n | |      | |\\/| |\n | |____  | |  | |\n  \\_____| |_|  |_|\n";
         actual = RomanPrinter.print(number);
        assertEquals(expected, actual);

        number = 1000;
         expected ="  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n";
         actual = RomanPrinter.print(number);
        assertEquals(expected, actual);


        
        
    }
}