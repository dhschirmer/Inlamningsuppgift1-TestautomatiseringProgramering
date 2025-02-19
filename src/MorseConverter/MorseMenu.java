package MorseConverter;

import java.util.Scanner;

public class MorseMenu {
    public static void main(String[] args) {

        //Objekt
        MorseConverter converter = new MorseConverter();

        boolean menu = true;

        while (menu) {

            System.out.println("Choose one of the options below:");
            System.out.println("1 - Convert the Morse code to English");
            System.out.println("2 - Convert English to Morse code");
            System.out.println("3 - Exit");


            Scanner scanner = new Scanner(System.in);
            String menuChoice = scanner.nextLine();
            //text = scanner.nextLine();


            //converter.(text);

            switch(menuChoice){
                case "1": {
                    System.out.println("Write in Morse code: " );
                    String text = "";
                    text = scanner.nextLine();

                    if (text.equals("")) {
                        System.out.println("Error: Empty text!");
                    } else {
                        String result = converter.convertFromMorse(text);
                        System.out.println(result);
                    }
                    break;
                }
                case "2": {
                    System.out.println("Write in English");
                    String text = "";
                    text = scanner.nextLine();

                    if (text.equals("")) {
                        System.out.println("Error: Empty text!");
                    } else {
                        String result = converter.convertFromEnglish(text);
                        System.out.println(result);
                    }
                    break;
                }
                case "3":
                    System.out.println("3 - Exit");
                    menu = false;
                    break;
                default:
                    System.out.println("Not a valid operation");

            }

        }
    }
}


