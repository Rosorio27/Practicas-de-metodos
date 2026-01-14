package matematicas;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class VariasTest {

    @org.junit.jupiter.api.Test
    void escapicua() {

        boolean resultado = Varias.Escapicua(12321);
        assertTrue(resultado, "12321 debería ser capicúa");
    }

    @org.junit.jupiter.api.Test
    void esPrimo() {
    }

    @org.junit.jupiter.api.Test
    void siguientePrimo() {

    }

    @org.junit.jupiter.api.Test
    void potencia() {
        assertEquals(8, Varias.potencia(2, 3), "2 elevado al cubo debe ser 8");
    }
}