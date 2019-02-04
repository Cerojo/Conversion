package Binary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OctalTest {
    private Octal octal = null;
    private final String nil = "Invalid Input";

    @BeforeEach
    void setUp() {
        octal = new Octal();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void toBinary() {
        String expected = "0";
        String result = octal.toBinary("0");
        assertEquals(expected, result);

        expected = "1";
        result = octal.toBinary("1");
        assertEquals(expected, result);

        expected = "1010";
        result = octal.toBinary("12");
        assertEquals(expected, result);

        expected = "1001010";
        result = octal.toBinary("112");
        assertEquals(expected, result);

        expected = nil;
        result = octal.toBinary("-1");
        assertEquals(expected, result);

        expected = "1001";
        result = octal.toBinary("11");
        assertEquals(expected, result);

        expected = nil;
        result = octal.toBinary("");
        assertEquals(expected, result);
    }

    @Test
    void toDecimal() {
        String expected = "0";
        String result = octal.toDecimal("0");
        assertEquals(expected, result);

        expected = "1";
        result = octal.toDecimal("1");
        assertEquals(expected, result);

        expected = "10";
        result = octal.toDecimal("12");
        assertEquals(expected, result);

        expected = "73";
        result = octal.toDecimal("111");
        assertEquals(expected, result);

        expected = nil;
        result = octal.toDecimal("-1");
        assertEquals(expected, result);

        expected = "9";
        result = octal.toDecimal("11");
        assertEquals(expected, result);

        expected = nil;
        result = octal.toDecimal("");
        assertEquals(expected, result);
    }

    @Test
    void toOctal() {
    }

    @Test
    void toHexadecimal() {
        String expected = "0";
        String result = octal.toHexadecimal("0");
        assertEquals(expected, result);

        expected = "1";
        result = octal.toHexadecimal("1");
        assertEquals(expected, result);

        expected = "A";
        result = octal.toHexadecimal("12");
        assertEquals(expected, result);

        expected = "49";
        result = octal.toHexadecimal("111");
        assertEquals(expected, result);

        expected = nil;
        result = octal.toHexadecimal("-1");
        assertEquals(expected, result);

        expected = "9";
        result = octal.toHexadecimal("11");
        assertEquals(expected, result);

        expected = nil;
        result = octal.toHexadecimal("");
        assertEquals(expected, result);
    }
}