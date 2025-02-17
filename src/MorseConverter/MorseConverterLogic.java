package MorseConverter;

import java.util.HashMap;

public class MorseConverterLogic {

    private HashMap<String, String> map;

    public MorseConverterLogic () {

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        //String morse = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..";
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        //String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        map = new HashMap<>();

        for (int i=0;i<morse.length;i++) {
            map.put(morse[i], alphabet[i]);
            map.put(alphabet[i] , morse[i]);
        }
    }

    //parte do felhantering

    public boolean isValid (String text) {
        //Iterar (for) sob os caracteres dentro de text
        for (int i=0;i<text.length();i++) {
            String character = String.valueOf(text.charAt(i));
            if (!map.containsKey(character)) {
                System.out.println("Error: Invalid character found");
                return false;
            }
        }
        return true;

        //Checar se esse caracter existe dentro do map, se nao existir, retorna falso

    }

    public String convertFromMorse (String text) {
        String result = "From Morse";
        //Testar se a string eh valida para conversao (If)
        //Usar o split para iterar e converter, os caracteres convertidos vao no result
        //retorna o result
        return result;
        //return map.get(text);
    }

    public String convertFromEnglish (String text) {
        String result = "From English";
        //Testar se o texto eh valido para conversao (if)
        //Remover os espacos
        //Iterar sob os caracteres resultantes dos espacos
        //Converter cada caracter e adiciona no result
        return result;
        //return map.get(text);
    }

}
