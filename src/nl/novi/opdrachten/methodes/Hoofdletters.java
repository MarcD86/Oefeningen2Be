package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hoofdletters {

    public static void main(String[] args) {
        List<String> curstomerNames = new ArrayList<>();

        curstomerNames.add("nick piraat");
        curstomerNames.add("mIchael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("miCHiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");

// * Gegeven: een lijst met namen zonder hoofdletters van klanten.
// * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
// * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
//                * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
// *
// * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
//                * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
// *
// *
        System.out.println("names: " + curstomerNames);

       upperCases(curstomerNames);

    }


    public static void upperCases(List<String> names) {

        String name = names.toString().toLowerCase();

        // stores each characters to a char array
        char[] charArray = name.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if (Character.isLetter(charArray[i])) {

                // check space is present before the letter
                if (foundSpace) {

                    // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                // if the new character is not character
                foundSpace = true;
            }
        }

        // convert the char array to the string
        name = String.valueOf(charArray);
        System.out.println("names: " + name);
    }
}