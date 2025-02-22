package MorseConverter;

import java.util.Scanner;

public class MorseMenu {
    public static void main(String[] args) {

        // Objekt
        MorseConverter converter = new MorseConverter();

        // Kontrollvariabel för menyn
        boolean menu = true;

        // Menykontroll
        while (menu) {
            System.out.println("Choose one of the options below:");
            System.out.println("1 - Convert the Morse code to English");
            System.out.println("2 - Convert English to Morse code");
            System.out.println("3 - Exit");

            //Läs in en text
            Scanner scanner = new Scanner(System.in);
            String menuChoice = scanner.nextLine();

            // Valmeny
            switch(menuChoice){

                // Morsekod till Engelska
                case "1": {
                    System.out.println("Write in Morse code: " );
                    String text = "";
                    text = scanner.nextLine();

                    // Felhantering för att kontrollera om användarens inmatning är tom
                    if (text.equals("")) {
                        System.out.println("Error: Empty text!");
                    } else {
                        // Konvertera resultatet med Logikklassen
                        String result = converter.convertFromMorse(text);
                        // Skriver ut Morsekod till Engelska
                        System.out.println(result);
                    }
                    break;
                }
                // Engelska till Morsekod
                case "2": {
                    System.out.println("Write in English");
                    String text = "";
                    text = scanner.nextLine();

                    // Felhantering för att kontrollera om användarens inmatning är tom
                    if (text.equals("")) {
                        System.out.println("Error: Empty text!");
                    } else {
                        // Konvertera resultatet med Logikklassen
                        String result = converter.convertFromEnglish(text);
                        // Skriver ut Engelska till Morsekod
                        System.out.println(result);
                    }
                    break;
                }
                // Avsluta programmet
                case "3": {
                    System.out.println("3 - Exit");
                    menu = false;
                    break;
                }
                // Felhantering för menyn
                default:
                    System.out.println("Not a valid operation");

            }

        }
    }
}


