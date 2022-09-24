package nl.novi.opdrachten.lijsten;

import java.util.*;

public class GeheimeCode {

    static char[] alphabetic = {' ','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static char[] alphabeticCaps = {' ', 'A', 'B', 'C', 'D', 'E','F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static void main(String[] secret) {

        List<String> laResistanceMembers = new ArrayList<>();

        addMembers(laResistanceMembers, "Arie");
        addMembers(laResistanceMembers, "Piet");
        addMembers(laResistanceMembers, "Piet");
        addMembers(laResistanceMembers, "Henrie");
        addMembers(laResistanceMembers, "Piet");
        addMembers(laResistanceMembers, "LeDroit CestMoi");





        for (String member:laResistanceMembers) {
//            print(member);
            translator(member);
        }

    }


    public static void translator(String name) {


        for (int i = 0; i < name.length(); i++) {
            char x = name.charAt(i);
            if (Character.isUpperCase(x)) {
                for (int k = 0; k < alphabeticCaps.length; k++) {
                    if (x == alphabeticCaps[k]) {
                        System.out.print(k + 100 + "-");
                    }
                }
            } else {

                for (int k = 0; k < alphabeticCaps.length; k++) {
                    if (alphabetic[k] == x) {
                        if (i + 1 == name.length()) {
                            System.out.print(k + " ");
                        } else {
                            System.out.print(k + "-");
                        }
                    }
                }
            }
        }
      // name spacing equal
        int spaces = 40 - name.length();
        for (int i = 0; i < spaces; i++) {
            System.out.print(" , ");
        }
        System.out.print(name + "\n");
    }


    private static List<String> addMembers(List<String> members, String name) {


        if (members.contains(name)) {
            System.out.println(name + " already excist ");
            System.out.println(" ");

        } else {
            members.add(name);
        }
        return members;

    }

}
     /*
        Opdracht 1: Hierboven zijn via de methode addMembers, leden aan de lijst toegevoegd. Pas de Methode zo aan dat
         er alleen unieke namen in voor mogen komen.
         */

        /*
        Opdracht 2: La Resistance wil niet dat de lijst met namen zo in handen komt te vallen van de bezetter. Versleutel
        Maak een methode die de lijst op de volgende manier versleuteld:
        a) Verander elke letter naar het nummer in het alfabet. Voeg na elke veranderde letter een - toe
        (behalve de laatste). Dus a wordt 1, b wordt 2 et cetera.
        Wanneer een letter een hoofdletter is, moet je beginnen met tellen bij 100. Dus A wordt 101, B wordt 102.
        Voorbeeld: Alex wordt versleuteld naar: 101-12-5-24
        b) Als de positie in de lijst een even getal is, dan moet de cijfercombinatie omgedraaid worden.
         */

        /*
        Opdracht 3:
        Schrijf een methode die de versleutelde lijst kan omzetten naar de ontsleutelde lijst.
         */