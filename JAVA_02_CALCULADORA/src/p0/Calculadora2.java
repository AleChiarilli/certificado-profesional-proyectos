package p0;

public class Calculadora2 {

    // Método para obtener el área de un círculo
    public static double areaDeCirculo(double radius) {
        // Fórmula para el área de un círculo: π * radio^2
        return Math.PI * Math.pow(radius, 2);
    }

    // Método para obtener el perímetro de un círculo
    public static double perimetroDeCirculo(double radius) {
        // Fórmula para el perímetro de un círculo: 2 * π * radio
        return 2 * Math.PI * radius;
    }
    

    // Método principal para probar los métodos de la clase
    public static void main(String[] args) {
        int radio = 5; // Definimos el radio del círculo

        // Calculamos y mostramos el área del círculo con un decimal
        double area = areaDeCirculo(radio);
        System.out.printf("El Área del Círculo es: %.1f\n", area);

        // Calculamos y mostramos el perímetro del círculo con un decimal
        double perimetro = perimetroDeCirculo(radio);
        System.out.printf("El Perímetro del Círculo es: %.1f\n", perimetro);
    }

}
