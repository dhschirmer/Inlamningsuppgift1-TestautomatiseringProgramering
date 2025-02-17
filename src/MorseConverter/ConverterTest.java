package MorseConverter;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test

    public void testIsValid () {

        MorseConverterLogic converter = new MorseConverterLogic();

        String validInput = "ABCD";
        String invalidInput = "AB!D";

        assertEquals(converter.isValid(validInput), true);
        assertEquals(converter.isValid(invalidInput), false);
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