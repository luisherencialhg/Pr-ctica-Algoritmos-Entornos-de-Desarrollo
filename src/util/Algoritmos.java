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

	   
}
