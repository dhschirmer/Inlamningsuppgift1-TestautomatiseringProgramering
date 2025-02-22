package MorseConverter;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void testIsMorseValid () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdataValidInput = ".- -... -.-. -..";
        String testdataInvalidInput = ".- -...! -.-. -..";
        Boolean expectedValidIput = true;
        Boolean expectedInvalidIput = false;

        // Act
        Boolean actualValidInput = converter.isMorseValid(testdataValidInput);
        Boolean actualInvalidInput = converter.isMorseValid(testdataInvalidInput);

        // Assert
        assertEquals(expectedValidIput, actualValidInput);
        assertEquals(expectedInvalidIput, actualInvalidInput);
    }

    @Test
    public void testIsEnglishValid () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdataValidInput = "ABCD";
        String testdataInvalidInput = "AB!D";
        Boolean expectedValidIput = true;
        Boolean expectedInvalidIput = false;

        // Act
        Boolean actualValidInput = converter.isEnglishValid(testdataValidInput);
        Boolean actualInvalidInput = converter.isEnglishValid(testdataInvalidInput);

        // Assert
        assertEquals(expectedValidIput, actualValidInput);
        assertEquals(expectedInvalidIput, actualInvalidInput);
    }

    @Test
    public void testConvertFromMorseOne () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = "-..";
        String expected = "D";

        // Act
        String actual = converter.convertFromMorse(testdata);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertFromMorse () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = ".- -... -.-. -..";
        String expected = "ABCD";

        // Act
        String actual = converter.convertFromMorse(testdata);

        // Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testConvertFromMorseMoreWords () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = ".- -... -.-. -.. .- -... -.-. -..";
        String expected = "ABCDABCD";

        // Act
        String actual = converter.convertFromMorse(testdata);

        // Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testConvertFromEnglishOne () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = "D";
        String expected = "-..";

        // Act
        String actual = converter.convertFromEnglish(testdata);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertFromEnglish () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = "ABCD";
        String expected = ".- -... -.-. -..";

        // Act
        String actual = converter.convertFromEnglish(testdata);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertFromEnglishMoreWords () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = "ABCD ABCD";
        String expected = ".- -... -.-. -.. .- -... -.-. -..";

        // Act
        String actual = converter.convertFromEnglish(testdata);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseEnglishMixed () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = ". . A .";
        Boolean expected = false;

        // Act
        Boolean actual = converter.isMorseValid(testdata);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testEnglishMorseMixed () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = "A . A .";
        Boolean expected = false;

        // Act
        Boolean actual = converter.isEnglishValid(testdata);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseEnglishEmpty () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = "";
        Boolean expected = false;

        // Act
        Boolean actual = converter.isMorseValid(testdata);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testEnglishMorseEmpty () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = "";
        Boolean expected = false;

        // Act
        Boolean actual = converter.isEnglishValid(testdata);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertFromMorseSpecialCharacter () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = "!";
        String expected = "";

        // Act
        String actual = converter.convertFromMorse(testdata);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertFromEnglishSpecialCharacter () {

        // Arrange
        MorseConverter converter = new MorseConverter();
        String testdata = "!";
        String expected = "";

        // Act
        String actual = converter.convertFromEnglish(testdata);

        // Assert
        assertEquals(expected, actual);
    }

}
