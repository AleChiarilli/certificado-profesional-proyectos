package numeros_primos;

import java.util.Random;

public class NumerosPrimos {

    public static void main(String[] args) {
        int[] primos = generarPrimos();
        System.out.println("Array de primos generados aleatoriamente:");
        imprimirArray(primos);
        
        ordenarDescendente(primos);
        System.out.println("\nArray de primos ordenados de forma descendente:");
        imprimirArray(primos);
        
        int minimo = encontrarMinimo(primos);
        int maximo = encontrarMaximo(primos);
        double media = calcularMedia(primos, minimo, maximo);
        
        System.out.println("\nValor mínimo: " + minimo);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Media aritmética: " + media);
    }

    public static int[] generarPrimos() {
        int[] primos = new int[10];
        Random rand = new Random();
        int count = 0;
        
        while (count < 10) {
            int num = rand.nextInt(100) + 1; // Generar un número aleatorio entre 1 y 100
            if (esPrimo(num) && !existeEnArray(primos, num)) {
                primos[count] = num;
                count++;
            }
        }
        return primos;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean existeEnArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void ordenarDescendente(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int encontrarMinimo(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int encontrarMaximo(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double calcularMedia(int[] arr, int min, int max) {
        double suma = 0;
        for (int num : arr) {
            if (num != min && num != max) {
                suma += num;
            }
        }
        return suma / (arr.length - 2);
    }
}
