package MorseConverter;

import java.util.HashMap;

public class MorseConverter {

    // Attribut
    // HashMaps - Morsekod till Engelska och Engelska till Morsekod
    private HashMap<String, String> morseToEnglishMap;
    private HashMap<String, String> englishToMorseMap;

    // Konstruktor
    public MorseConverter() {

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        morseToEnglishMap = new HashMap<>();
        englishToMorseMap = new HashMap<>();

        // Initierar HashMaps
        for (int i = 0; i < morse.length; i++) {
            morseToEnglishMap.put(morse[i], alphabet[i]);
            englishToMorseMap.put(alphabet[i], morse[i]);
        }
    }

    // Valideringsmetod för att kontrollera om det är tillåtet att konvertera från Morsekod
    public boolean isMorseValid(String text) {

        //Variabel som lagrar texten separerad med mellanslag
        String[] morse = text.split(" ");

        // Felhantering - Konvertera inte tom text
        if (morse.length == 0) {
            return false;
        }

        // Iterera över tecknen i text
        for (int i = 0; i < morse.length; i++) {

            // Kontrollera om tecknen finns i HashMapen
            // Felhantering - Om tecknet inte finns i HashMapen returneras false och ett felmeddelande
            if (!morseToEnglishMap.containsKey(morse[i])) {
                System.out.println("Error: Invalid morse code found!");
                return false;
            }
        }

        // Om alla tecken finns i HashMapen returneras true
        return true;
    }

    // Valideringsmetod för att kontrollera om det är tillåtet att konvertera från engelska
    public boolean isEnglishValid(String text) {

        // Felhantering - Konvertera inte tom text
        if (text.isEmpty()) {
            return false;
        }

        // Kontrollera om tecknen finns i HashMapen
        for (int i = 0; i < text.length(); i++) {
            String character = String.valueOf(text.charAt(i)).toUpperCase();

            // Felhantering - Om tecknet inte finns i HashMapen och inte är ett mellanslag
            // Returneras false och ett felmeddelande
            if (!englishToMorseMap.containsKey(character) && !character.equals(" ")) {
                System.out.println("Error: Invalid character found!");
                return false;
            }
        }

        // Om alla tecken finns i HashMapen returneras true
        return true;
    }

    // Metod för konvertering från HashMap Morsekod
    public String convertFromMorse(String text) {
        // Variabel som lagrar resultatet av konverteringen
        // Initialvärdet är tomt eftersom det är vad som ska returneras vid någon fel
        String result = "";

        // Om tecknen är giltiga för konvertering, börja konverteringen
        if (isMorseValid(text)) {
            // Variabel som lagrar texten separerad med mellanslag
            String[] morse = text.split(" ");

            // Iterera över tecknen i texten
            for (int i = 0; i < morse.length; i++) {
                // Lägg till nästa konverterade tecken till resultatet
                result = result + morseToEnglishMap.get(morse[i]);
            }
        }
        // Returnera konverteringen
        return result;
    }

    // Metod för konvertering från HashMap Engelska
    public String convertFromEnglish(String text) {
        // Variabel som lagrar resultatet av konverteringen
        String result = "";

        // Om tecknen är giltiga för konvertering, börja konverteringen
        if (isEnglishValid(text)) {

            // Iterera över tecknen i texten
            for (int i = 0; i < text.length(); i++) {

                // Sträng som lagrar tecknet - Homogeniserade tecken
                // HashMap accepterar endast strängar i storbokstav
                String character = String.valueOf(text.charAt(i)).toUpperCase();

                // Konvertera alla tecken förutom mellanslag
                if (!character.equals(" ")) {
                    // Lägg till nästa konverterade tecken till morsekodresultatet
                    result = result + englishToMorseMap.get(character) + " ";
                }
            }
        }
        // Returnera konverteringen - utan det sista mellanslaget
        return result.trim();
    }

}


