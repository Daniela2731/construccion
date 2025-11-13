package com.tecsup.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleTest {

    @Test
    void sumaCorrecta() {
        int resultado = 2 + 3;
        assertEquals(5, resultado, "La suma debe ser correcta");
    }
}
