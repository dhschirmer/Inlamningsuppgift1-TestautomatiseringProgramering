package MorseConverter;

import java.util.HashMap;
import java.util.Scanner;

public class MorseConverterLogic {

    private HashMap<String, String> map;
    
    public MorseConverterLogic () {

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        map = new HashMap<>();

        for (int i=0;i<morse.length;i++) {
            map.put(morse[i], alphabet[i]);
            map.put(alphabet[i] , morse[i]);
        }
    }

    //parte do felhantering
    public boolean isMorseValid (String text) {
        //Iterar (for) sob os caracteres dentro de text
        String[] morse = text.split(" ");

        for (int i=0;i<morse.length;i++) {

            //text aqui eh cada pedaco do array
            if (!map.containsKey(morse[i])) {
                System.out.println("Error: Invalid morse code found"); //imprimir caracter que deu erro.
                return false;
            }
        }
        return true;

        //Checar se esse caracter existe dentro do map, se nao existir, retorna falso

    }


    public boolean isEnglishValid (String text) {

        //Iterar (for) sob os caracteres dentro de text
        for (int i=0;i<text.length();i++) {
            String character = String.valueOf(text.charAt(i)).toUpperCase(); //Extrai o caracter do texto na posicao i
            if (!character.equals(" ") && !map.containsKey(character)) {
                System.out.println("Error: Invalid character found"); //imprimir caracter que deu erro.
                return false;
            }
        }
        return true;

        //Checar se esse caracter existe dentro do map, se nao existir, retorna falso

    }

    public String convertFromMorse(String text) {
        String result = "";
        if (isMorseValid(text)) {
            String[] morse = text.split(" ");

            for (int i=0;i<morse.length;i++) {

                result = result + map.get(morse[i]);

            }
        }

//        //Testar se a string eh valida para conversao (If)
//        //Usar o split para iterar e converter, os caracteres convertidos vao no result
//        //retorna o result

        return result;
    }

    public String convertFromEnglish(String text) {
        String result = "";
        if (isEnglishValid(text)) {

            for (int i = 0; i < text.length(); i++) {
                String character = String.valueOf(text.charAt(i)).toUpperCase();

                if (character.equals(" ")) {
                    result = "" + result;

                } else {
                    result = result + map.get(character) + " ";
                }
            }
        }
            return result.trim();
        }

}


//    public String convertFromEnglish (String text) {
//        String result = "From English";
//        //Testar se o texto eh valido para conversao (if)
//        //Remover os espacos
//        //Iterar sob os caracteres resultantes dos espacos
//        //Converter cada caracter e adiciona no result
//        return result;
//        //return map.get(text);
//    }

//}

