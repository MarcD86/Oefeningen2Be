package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {


        int chosenNumber = 44;

        System.out.println(devide(chosenNumber));

    }

    public static String devide(int number){
        if(number % 5 == 0){
            return "deelbaar door vijf";
        }
        else{
            return "ondeelbaar door vijf";
        }
    }

}
