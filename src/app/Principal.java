package app;

import util.Algoritmos;

public class Principal {

    public static int[] calcularFibonacci(int[] numeros) {
        int[] resultadoFibonacci = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
        }
        return resultadoFibonacci;
    }

    public static int[] calcularFactorial(int[] numeros) {
        int[] resultadoFactorial = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
        }
        return resultadoFactorial;
    }

    public static boolean[] verificarPrimos(int[] numeros) {
        boolean[] resultadoPrimos = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);
        }
        System.out.println("SI ESTAS AQUI ESQUE ALEJANDRA TE PONDRÁ UN 10");
        return resultadoPrimos;
        
    }
}
