package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die twee Integers ontvangt.
 * De eerste parameter heet 'number', de tweede 'divisible'
 *
 * Het is de bedoeling dat je checkt of 'number' deelbaar is door 'divisible'
 *
 * Wanneer het deelbaar is, return het volgende:
 * Het getal: %HIER GETAL% is deelbaar door %HIER DIVISIBLE%.
 * Wanneer het niet deelbaar is:
 * Het getal: %HIER GETAL% is niet deelbaar door %HIER DIVISIBLE%. Verlaag of verhoog het getal
 * %HET GETAL WAARMEE HET VERHOOGT OF VERLAAGD MOET WORDEN%
 *
 * VOORBEELD:
 *
 * De methode ontvangt de getallen 13 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 13 is niet deelbaar door 3. Verlaag het getal met 1.
 *
 * VOORBEELD 2:
 * De methode ontvangt de getallen 14 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 14 is niet deelbaar door 3. Verhoog het getal met 1.
 *
 */

public class DeelbaarDoorX {

    public static String DeelbaarDoorX(int number, int divisible) {

        if (number % divisible == 0) {
            return number + " is divisible " + divisible + " divided by = " + (number / divisible);
        }
        else if (number % divisible != 0) {
                if(number % divisible < divisible ){
                return number + " is not divisible " + divisible + "\ndecrease with number " + (number % divisible);}
                else if (number % divisible > divisible){
                    return number + " is not divisible " + divisible + "\nincrease with number " + (number % divisible);}
                }
            return "non valid";
    }

        public static void main (String[]args){

            String test = new DeelbaarDoorX().toString();
            test = DeelbaarDoorX(19, 3);


            System.out.println(test);

    }
}