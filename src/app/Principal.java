package app;

import java.util.Random;

import util.Algoritmos;

public class Principal extends Algoritmos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Crear un array de 5 números aleatorios del 1 al 10
        int[] numeros = new int[5];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10) + 1;
        }

        // Calcular el número de Fibonacci de cada número y almacenar los resultados en un nuevo array
        int[] resultadoFibonacci = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
        }

        // Calcular el factorial de cada número y almacenar los resultados en un nuevo array
        int[] resultadoFactorial = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
        }

        // Comprobar si cada número es primo y almacenar los resultados en un nuevo array de booleanos
        boolean[] resultadoPrimos = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);
        }

        // No se permite imprimir por consola ningún valor, por lo que aquí termina el proceso
	}

}
