////////////////////////////////////////////////////////////////////
// Luca Slongo 2111009
// Mirco Ghiraldin 2102505
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import it.unipd.mtss.IntegerToRoman;
import it.unipd.mtss.RomanPrinter;

public class Main {
    public static void main(String[] args) {
    int numero = 1987;
    String romano = IntegerToRoman.convert(numero);
    System.out.println("Il numero " + numero + " in numeri romani è: " + romano);

    
    System.out.println(RomanPrinter.print(numero));
    }  
}