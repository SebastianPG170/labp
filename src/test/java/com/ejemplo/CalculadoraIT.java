package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraIT {

    @Test
    void deberiaMultiplicarDosNumerosEnPruebaDeIntegracion() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplicar(4, 5);

        assertEquals(20, resultado);
    }
}