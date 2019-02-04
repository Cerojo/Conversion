package Binary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {
    private Hexadecimal hexadecimal;
    private final String nil = "Invalid Input";

    @BeforeEach
    void setUp() {
        hexadecimal = new Hexadecimal();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void toBinary() {
        String expected = "0";
        String result = hexadecimal.toBinary("0");
        assertEquals(expected, result);

        expected = "1";
        result = hexadecimal.toBinary("1");
        assertEquals(expected, result);

        expected = "1010";
        result = hexadecimal.toBinary("A");
        assertEquals(expected, result);

        expected = "1001010";
        result = hexadecimal.toBinary("4A");
        assertEquals(expected, result);

        expected = nil;
        result = hexadecimal.toBinary("-1");
        assertEquals(expected, result);

        expected = "1001";
        result = hexadecimal.toBinary("9");
        assertEquals(expected, result);

        expected = nil;
        result = hexadecimal.toBinary("");
        assertEquals(expected, result);
    }

    @Test
    void toDecimal() {
        String expected = "0";
        String result = hexadecimal.toDecimal("0");
        assertEquals(expected, result);

        expected = "1";
        result = hexadecimal.toDecimal("1");
        assertEquals(expected, result);

        expected = "10";
        result = hexadecimal.toDecimal("A");
        assertEquals(expected, result);

        expected = "73";
        result = hexadecimal.toDecimal("49");
        assertEquals(expected, result);

        expected = nil;
        result = hexadecimal.toDecimal("-1");
        assertEquals(expected, result);

        expected = "9";
        result = hexadecimal.toDecimal("9");
        assertEquals(expected, result);

        expected = nil;
        result = hexadecimal.toDecimal("");
        assertEquals(expected, result);
    }

    @Test
    void toOctal() {
        String expected = "0";
        String result = hexadecimal.toOctal("0");
        assertEquals(expected, result);

        expected = "1";
        result = hexadecimal.toOctal("1");
        assertEquals(expected, result);

        expected = "12";
        result = hexadecimal.toOctal("A");
        assertEquals(expected, result);

        expected = "111";
        result = hexadecimal.toOctal("49");
        assertEquals(expected, result);

        expected = nil;
        result = hexadecimal.toOctal("-1");
        assertEquals(expected, result);

        expected = "11";
        result = hexadecimal.toOctal("9");
        assertEquals(expected, result);

        expected = nil;
        result = hexadecimal.toOctal("");
        assertEquals(expected, result);
    }

    @Test
    void toHexadecimal() {
    }
}