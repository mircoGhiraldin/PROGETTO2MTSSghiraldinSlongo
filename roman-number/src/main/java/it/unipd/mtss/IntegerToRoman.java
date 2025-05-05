////////////////////////////////////////////////////////////////////
// Luca Slongo 2111009
// Mirco Ghiraldin 2102505
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class IntegerToRoman {
  public static String convert(int number){
    String risultato = "";
    while(number>0){
      if(number>=1000){
        number = number-1000;
        risultato = risultato + "M";
      }else if(number>=500){
        if((number+100)>=1000){
          risultato = risultato + "C";
          number+=100;
        }else{
          number = number-500;
          risultato = risultato + "D";
        }
      }else if(number>=100){
        if((number+100)>=500){
          risultato = risultato + "C";
          number+=100;
        }else{
        number = number-100;
        risultato = risultato + "C";
        }
      }else if(number>=50){
        if((number+10)>=100){
          risultato = risultato + "X";
          number+=10;
        }else{
          number = number-50;
          risultato = risultato + "L";
        }
      }else if(number>=10){
        if((number+10)>=50){
          risultato = risultato + "X";
          number+=10;
        }else{
        number = number-10;
        risultato = risultato + "X";
        }
      }else if(number>=5){
        if((number+1)==10){
          risultato = risultato + "I";
          number++;
        }else{
          number = number-5;
          risultato = risultato + "V";
        }
      }else{
        if((number+1)==5){
          risultato = risultato + "I";
          number++;
        }else{
          number = number - 1;
          risultato = risultato + "I";
        }
      }
    }
  return risultato;

  }

}