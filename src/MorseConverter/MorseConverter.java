package MorseConverter;

import java.util.Scanner;

public class MorseConverter {
    public static void main(String[] args) {

        //Objekt
        MorseConverterLogic converter = new MorseConverterLogic();

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
                    System.out.println("Escreva em codigo morse: " );
                    String text = "";
                    text = scanner.nextLine();
                    String result = converter.convertFromMorse(text);
                    System.out.println(result);
                    break;
                }
                case "2": {
                    System.out.println("Escreva em ingles");
                    String text = "";
                    text = scanner.nextLine();
                    String result = converter.convertFromEnglish(text);
                    System.out.println(result);
                    break;
                }
                case "3":
                    System.out.println("3 - Sair");
                    menu = false;
                    break;
                default:
                    System.out.println("Not a valid operation");

            }

        }
    }
}


