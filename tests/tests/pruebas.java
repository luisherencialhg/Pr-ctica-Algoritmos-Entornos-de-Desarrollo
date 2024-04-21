package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

public class pruebas {

    @Test
    public void testFibonacci() {
        int[] numeros = { 5, 8, 3, 6, 9 };
        int[] resultadoEsperado = { 5, 21, 2, 8, 34 };
        int[] resultadoObtenido = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoObtenido[i] = Algoritmos.fibonacci(numeros[i]);
        }
        assertArrayEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void testFactorial() {
        int[] numeros = { 5, 3, 2, 6, 4 };
        int[] resultadoEsperado = { 120, 6, 2, 720, 24 };
        int[] resultadoObtenido = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoObtenido[i] = Algoritmos.factorial(numeros[i]);
        }
        assertArrayEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void testEsPrimo() {
        int[] numeros = { 5, 8, 3, 6, 9 };
        boolean[] resultadoEsperado = { true, false, true, false, false };
        boolean[] resultadoObtenido = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoObtenido[i] = Algoritmos.esPrimo(numeros[i]);
        }
        assertArrayEquals(resultadoEsperado, resultadoObtenido);
    }
}