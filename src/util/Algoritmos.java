package util;

public abstract class Algoritmos {
	/**
	 * Clase abstracta que contiene métodos para realizar diferentes algoritmos matemáticos.
	 */
	

	    /**
	     * Calcula el número de Fibonacci para el número dado.
	     * @param numero Número entero para el cálculo del número de Fibonacci.
	     * @return El número de Fibonacci correspondiente al número dado.
	     */
	    public static int fibonacci(int numero) {
	        // Implementación del algoritmo de Fibonacci
	        if (numero <= 1)
	            return numero;
	        else
	            return fibonacci(numero - 1) + fibonacci(numero - 2);
	    }

	    /**
	     * Calcula el factorial del número dado.
	     * @param numero Número entero para el cálculo del factorial.
	     * @return El factorial del número dado.
	     */
	    public static int factorial(int numero) {
	        // Implementación del algoritmo de factorial
	        if (numero == 0)
	            return 1;
	        else
	            return numero * factorial(numero - 1);
	    }

	    /**
	     * Verifica si el número dado es primo.
	     * @param numero Número entero a verificar.
	     * @return true si el número es primo, false de lo contrario.
	     */
	    public static boolean esPrimo(int numero) {
	        // Implementación del algoritmo para verificar si un número es primo
	        if (numero <= 1)
	            return false;
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0)
	                return false;
	        }
	        return true;
	    }
}
