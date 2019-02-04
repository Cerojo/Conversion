package Binary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalTest {
    private Decimal decimal;
    private final String nil = "Invalid Input";

    @BeforeEach
    void setUp() {
        decimal = new Decimal();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void toBinary() {
        String expected = "0";
        String result = decimal.toBinary("0");
        assertEquals(expected, result);

        expected = "1";
        result = decimal.toBinary("1");
        assertEquals(expected, result);

        expected = "1010";
        result = decimal.toBinary("10");
        assertEquals(expected, result);

        expected = "1001001";
        result = decimal.toBinary("73");
        assertEquals(expected, result);

        expected = nil;
        result = decimal.toBinary("-1");
        assertEquals(expected, result);

        expected = "1001";
        result = decimal.toBinary("9");
        assertEquals(expected, result);

        expected = nil;
        result = decimal.toBinary("");
        assertEquals(expected, result);
    }

    @Test
    void toDecimal() {
    }

    @Test
    void toOctal() {
        String expected = "0";
        String result = decimal.toOctal("0");
        assertEquals(expected, result);

        expected = "1";
        result = decimal.toOctal("1");
        assertEquals(expected, result);

        expected = "12";
        result = decimal.toOctal("10");
        assertEquals(expected, result);

        expected = "111";
        result = decimal.toOctal("73");
        assertEquals(expected, result);

        expected = nil;
        result = decimal.toOctal("-1");
        assertEquals(expected, result);

        expected = "11";
        result = decimal.toOctal("9");
        assertEquals(expected, result);

        result = decimal.toOctal("");
        assertEquals(nil, result);
    }

    @Test
    void toHexadecimal() {
        String expected = "0";
        String result = decimal.toHexadecimal("0");
        assertEquals(expected, result);

        expected = "1";
        result = decimal.toHexadecimal("1");
        assertEquals(expected, result);

        expected = "A";
        result = decimal.toHexadecimal("10");
        assertEquals(expected, result);

        expected = "49";
        result = decimal.toHexadecimal("73");
        assertEquals(expected, result);

        expected = nil;
        result = decimal.toHexadecimal("-1");
        assertEquals(expected, result);

        expected = "9";
        result = decimal.toHexadecimal("9");
        assertEquals(expected, result);

        result = decimal.toHexadecimal("");
        assertEquals(nil, result);
    }
}