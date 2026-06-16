package br.com.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void deveSomarDoisNumerosPositivos() {
        assertEquals(8, calculadora.somar(5, 3));
    }

    @Test
    void deveSubtrairDoisNumerosPositivos() {
        assertEquals(2, calculadora.subtrair(5, 3));
    }

    @Test
    void deveMultiplicarDoisNumerosPositivos() {
        assertEquals(15, calculadora.multiplicar(5, 3));
    }

    @Test
    void deveDividirDoisNumerosPositivos() {
        assertEquals(2, calculadora.dividir(10, 5));
    }

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}