package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        // Retornos
        System.out.println("------ RETORNOS ------");

        double areaQuadrado = Areas.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Areas.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Areas.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}