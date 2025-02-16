package MorseConverter;

import java.util.Scanner;

public class MorseConverter {
    public static void main(String[] args) {


        String text = "";
        boolean iMeny = true;

        while (iMeny) {

            System.out.println("Välj ett av alternativen nedan:");
            System.out.println("1 - Converter o codigo morse para ingles");
            System.out.println("2 - Converter ingles para codigo morse");
            System.out.println("3 - Sair");

            Scanner scanner = new Scanner(System.in);
            String menyVal = scanner.nextLine();


            switch(menyVal){
                case "1":
                    System.out.println("1 - Converter o codigo morse para ingles");
                    break;
                case "2":
                    System.out.println("2 - Converter ingles para codigo morse");
                    break;
                case "3":
                    System.out.println("3 - Sair");
                    iMeny = false;
                    break;
                default:
                    System.out.println("Not a valid operation");

            }
        }
    }
}


