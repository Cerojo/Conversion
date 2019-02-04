package Binary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTest {
    Binary binary = null;
    private final String nil = "Invalid Input";

    @BeforeEach
    void setUp() {
        binary = new Binary();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void toBinary() {
    }

    @Test
    void toDecimal() {
        int expected = 0;
        int result = Integer.parseInt(binary.toDecimal("0"));
        assertEquals(expected, result);

        expected = 1;
        result = Integer.parseInt(binary.toDecimal("1"));
        assertEquals(expected, result);

        expected = 10;
        result = Integer.parseInt(binary.toDecimal("1010"));
        assertEquals(expected, result);

        expected = 73;
        result = Integer.parseInt(binary.toDecimal("1001001"));
        assertEquals(expected, result);

        assertEquals(nil, binary.toDecimal("-1"));

        assertEquals(nil, binary.toDecimal("9"));

        assertEquals(nil, binary.toDecimal(""));
    }

    @Test
    void toOctal() {
        String expected = "0";
        String result = binary.toOctal("0");
        assertEquals(expected, result);

        expected = "1";
        result = binary.toOctal("1");
        assertEquals(expected, result);

        expected = "12";
        result = binary.toOctal("1010");
        assertEquals(expected, result);

        expected = "111";
        result = binary.toOctal("1001001");
        assertEquals(expected, result);

        expected = nil;
        result = binary.toOctal("-1");
        assertEquals(expected, result);

        result = binary.toOctal("9");
        assertEquals(nil, result);

        result = binary.toOctal("");
        assertEquals(nil, result);
    }

    @Test
    void toHexadecimal() {
        String expected = "0";
        String result = binary.toHexadecimal("0");
        assertEquals(expected, result);

        expected = "1";
        result = binary.toHexadecimal("1");
        assertEquals(expected, result);

        expected = "A";
        result = binary.toHexadecimal("1010");
        assertEquals(expected, result);

        expected = "49";
        result = binary.toHexadecimal("1001001");
        assertEquals(expected, result);

        expected = nil;
        result = binary.toHexadecimal("-1");
        assertEquals(expected, result);

        result = binary.toHexadecimal("9");
        assertEquals(nil, result);

        result = binary.toHexadecimal("");
        assertEquals(nil, result);
    }
}