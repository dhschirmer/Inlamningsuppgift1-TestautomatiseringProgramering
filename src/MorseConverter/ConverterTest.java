package MorseConverter;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test

    public void testIsEnglishValid () {

        MorseConverterLogic converter = new MorseConverterLogic();

        String validInput = "ABCD";
        String invalidInput = "AB!D";

        assertEquals(converter.isEnglishValid(validInput), true);
        assertEquals(converter.isEnglishValid(invalidInput), false);
    }


    @Test

    public void testIsMorseValid () {

        MorseConverterLogic converter = new MorseConverterLogic();

        String validInput = ".- -... -.-. -..";
        String invalidInput = ".- -...! -.-. -..";

        assertEquals(converter.isMorseValid(validInput), true);
        assertEquals(converter.isMorseValid(invalidInput), false);
    }

    @Test

    public void testConvertFromMorse () {

        MorseConverterLogic converter = new MorseConverterLogic();

        String testdata = ".- -... -.-. -..";
        String expected = "ABCD";

        String actual = converter.convertFromMorse(testdata);

        assertEquals(expected, actual);

    }

    @Test

    public void testConvertFromMorseMoreWords () {

        MorseConverterLogic converter = new MorseConverterLogic();

        String testdata = ".- -... -.-. -.. .- -... -.-. -..";
        String expected = "ABCDABCD";

        String actual = converter.convertFromMorse(testdata);

        assertEquals(expected, actual);

    }

    @Test

    public void testConvertFromEnglish () {

        MorseConverterLogic converter = new MorseConverterLogic();

        String testdata = "ABCD";
        String expected = ".- -... -.-. -..";

        String actual = converter.convertFromEnglish(testdata);

        assertEquals(expected, actual);

    }

    @Test

    public void testConvertFromEnglishMoreWords () {

        MorseConverterLogic converter = new MorseConverterLogic();

        String testdata = "ABCD ABCD";
        String expected = ".- -... -.-. -.. .- -... -.-. -..";

        String actual = converter.convertFromEnglish(testdata);

        assertEquals(expected, actual);

    }
}


/*
package main;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConverterTest {

    @Test
    public void testConvertFtoMorse() {

        //Arrange
        //Skapa ett objekt av logikklassen
        //Skapa testdata, dvs. vilken data jag ska skicka till logikklassen
        //Vad förväntar jag mig att jag får tillbaka (vilken morsekod ska jag ha tillbaka) (expected)

        //Act
        //Hämta förväntat resultat ifrån logikklassen (skriv en ny metod som som använder testdata) (actual)

        //Assert
        assertEquals(expected, actual);

    }

}
*/


/*
package main;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConverterTest {

    @Test
    public void testConvertFtoMorse() {

        //Arrange
        Converter converter = new Converter();
        //Skapa testdata, dvs. vilken data jag ska skicka till logikklassen
        String testdata = "F";
        //Vad förväntar jag mig att jag får tillbaka (vilken morsekod ska jag ha tillbaka) (expected)
        String expected = "..-.";

        //Act
        //Hämta förväntat resultat ifrån logikklassen (skriv en ny metod som som använder testdata) (actual)
        String actual = converter.engToMorse(testdata);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertEtoMorse() {

        //Arrange
        Converter converter = new Converter();
        //Skapa testdata, dvs. vilken data jag ska skicka till logikklassen
        String testdata = "E";
        //Vad förväntar jag mig att jag får tillbaka (vilken morsekod ska jag ha tillbaka) (expected)
        String expected = ".";

        //Act
        //Hämta förväntat resultat ifrån logikklassen (skriv en ny metod som som använder testdata) (actual)
        String actual = converter.engToMorse(testdata);

        //Assert
        assertEquals(expected, actual);
    }

    //Morse -> Eng
    //Flera tecken -> Morse
    //Flera morse -> Eng
    //Tomt, whitespace, småbokstäver, konstiga tecken, åäö...

} */