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

    // ===== SOMA =====

    @Test
    void deveSomarDoisNumerosPositivos() {
        assertEquals(8, calculadora.somar(5, 3));
    }

    @Test
    void deveSomarNumeroPositivoENegativo() {
        assertEquals(2, calculadora.somar(5, -3));
    }

    @Test
    void deveSomarDoisNumerosNegativos() {
        assertEquals(-8, calculadora.somar(-5, -3));
    }

    @Test
    void deveSomarComZero() {
        assertEquals(5, calculadora.somar(5, 0));
    }

    @Test
    void deveSomarNumerosDecimais() {
        assertEquals(7.5, calculadora.somar(5.0, 2.5));
    }

    // ===== SUBTRAÇÃO =====

    @Test
    void deveSubtrairDoisNumerosPositivos() {
        assertEquals(2, calculadora.subtrair(5, 3));
    }

    @Test
    void deveSubtrairNumeroNegativo() {
        assertEquals(8, calculadora.subtrair(5, -3));
    }

    @Test
    void deveSubtrairComZero() {
        assertEquals(5, calculadora.subtrair(5, 0));
    }

    @Test
    void deveSubtrairResultandoNegativo() {
        assertEquals(-2, calculadora.subtrair(3, 5));
    }

    @Test
    void deveSubtrairNumerosDecimais() {
        assertEquals(2.5, calculadora.subtrair(5.0, 2.5));
    }

    // ===== MULTIPLICAÇÃO =====

    @Test
    void deveMultiplicarDoisNumerosPositivos() {
        assertEquals(15, calculadora.multiplicar(5, 3));
    }

    @Test
    void deveMultiplicarPorZero() {
        assertEquals(0, calculadora.multiplicar(5, 0));
    }

    @Test
    void deveMultiplicarNumeroNegativo() {
        assertEquals(-15, calculadora.multiplicar(5, -3));
    }

    @Test
    void deveMultiplicarDoisNumerosNegativos() {
        assertEquals(15, calculadora.multiplicar(-5, -3));
    }

    @Test
    void deveMultiplicarNumerosDecimais() {
        assertEquals(12.5, calculadora.multiplicar(5.0, 2.5));
    }

    // ===== DIVISÃO =====

    @Test
    void deveDividirDoisNumerosPositivos() {
        assertEquals(2, calculadora.dividir(10, 5));
    }

    @Test
    void deveDividirNumeroNegativo() {
        assertEquals(-2, calculadora.dividir(10, -5));
    }

    @Test
    void deveDividirDoisNumerosNegativos() {
        assertEquals(2, calculadora.dividir(-10, -5));
    }

    @Test
    void deveDividirNumerosDecimais() {
        assertEquals(2.5, calculadora.dividir(5.0, 2.0));
    }

    @Test
    void deveDividirZeroPorNumero() {
        assertEquals(0, calculadora.dividir(0, 5));
    }

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        assertThrows(ArithmeticException.class,
                () -> calculadora.dividir(10, 0));
    }
}