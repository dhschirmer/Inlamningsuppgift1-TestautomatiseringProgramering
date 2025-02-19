package MorseConverter;

import java.util.HashMap;

public class MorseConverter {

    //Attribut
    private HashMap<String, String> morseToEnglishMap;
    private HashMap<String, String> englishToMorseMap;
    
    public MorseConverter() {

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        morseToEnglishMap = new HashMap<>();
        englishToMorseMap = new HashMap<>();

        for (int i=0;i<morse.length;i++) {
            morseToEnglishMap.put(morse[i], alphabet[i]);
            englishToMorseMap.put(alphabet[i] , morse[i]);
        }
    }

    //parte do felhantering
    public boolean isMorseValid (String text) {
        //Iterar (for) sob os caracteres dentro de text
        String[] morse = text.split(" ");

        for (int i=0;i<morse.length;i++) {

            //text aqui eh cada pedaco do array
            if (!morseToEnglishMap.containsKey(morse[i])) {
                System.out.println("Error: Invalid morse code found!"); //imprimir caracter que deu erro.
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
            if (!character.equals(" ") && !englishToMorseMap.containsKey(character)) {
                System.out.println("Error: Invalid character found!"); //imprimir caracter que deu erro.
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

                    result = result + morseToEnglishMap.get(morse[i]);
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

                if (!character.equals(" ")) {
                    result = result + englishToMorseMap.get(character) + " ";
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

