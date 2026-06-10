package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    void deberiaSumarDosNumeros() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.sumar(2, 3);

        assertEquals(5, resultado);
    }
}