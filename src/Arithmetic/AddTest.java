package Arithmetic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {
    private Add add;
    @BeforeEach
    void setUp() {
        add = new Add();
    }

    @Test
    void binary() {
        String expected = "100";
        String result = add.binary("11", "1");
        assertEquals(expected, result);
    }

    @Test
    void octal() {
    }

    @Test
    void hexadecimal() {
    }

    @Test
    void decimal() {
    }
}