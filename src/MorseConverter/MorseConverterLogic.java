package MorseConverter;

import java.util.HashMap;

public class MorseConverterLogic {

    private HashMap<Character, Character> map;

    public MorseConverterLogic () {

        String morse = ".-  -...  -.-.  -..  .  ..-.  --.  ....  ..  .--- -.-  .-..  --  -.  ---  .--.  --.-  .-.  ...  - ..-  ...-  .--  -..-  -.--  --..";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        map = new HashMap<>();

        for (int i=0;i<alphabet.length();i++) {
            map.put(morse.charAt(i) , alphabet.charAt(i));
            map.put(alphabet.charAt(i) , morse.charAt(i));
        }
    }


    //Mais um metodo

    public String convertFromMorse (String text) {
        String result = "From Morse";
        return result;
        //return map.get(text);
    }

    public String convertFromEnglish (String text) {
        String result = "From English";
        return result;
        //return map.get(text);
    }

}


