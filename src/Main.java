import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsultaConversion consulta = new ConsultaConversion();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Elija la moneda que quiere convertir a dolares:");
            System.out.println("1.COP, 2.EUR, 3.JPY, 4.ARS, 5.Salir");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Ingrese la cantidad de pesos colombianos que quiere convertir a dolares:");
                    try {
                        var cantidad = scanner.nextDouble();
                        Convertidor convertidor = consulta.obtenerResultado("COP", cantidad);
                        System.out.println("Conversión de " + cantidad + " COP a USD: " + convertidor.cantidad());
                    } catch (Exception e) {
                        System.out.println("Error al convertir la moneda");
                    }
                }
                case 2 -> {
                    System.out.println("Ingrese la cantidad de euros que quiere convertir a dolares:");
                    try {
                        var cantidad = scanner.nextDouble();
                        Convertidor convertidor = consulta.obtenerResultado("EUR", cantidad);
                        System.out.println("Conversión de " + cantidad + " EUR a USD: " + convertidor.cantidad());
                    } catch (Exception e) {
                        System.out.println("Error al convertir la moneda");
                    }
                }
                case 3 -> {
                    System.out.println("Ingrese la cantidad de yenes que quiere convertir a dolares:");
                    try {
                        var cantidad = scanner.nextDouble();
                        Convertidor convertidor = consulta.obtenerResultado("JPY", cantidad);
                        System.out.println("Conversión de " + cantidad + " JPY a USD: " + convertidor.cantidad());
                    } catch (Exception e) {
                        System.out.println("Error al convertir la moneda");
                    }
                }
                case 4 -> {
                    System.out.println("Ingrese la cantidad de pesos argentinos que quiere convertir a dolares:");
                    try {
                        var cantidad = scanner.nextDouble();
                        Convertidor convertidor = consulta.obtenerResultado("ARS", cantidad);
                        System.out.println("Conversión de " + cantidad + " ARS a USD: " + convertidor.cantidad());
                    } catch (Exception e) {
                        System.out.println("Error al convertir la moneda");
                    }
                }
                case 5 -> {
                    opcion = 5;
                    System.out.println("Hasta luego!");
                }
                default -> System.out.println("Opción inválida");
            }
        }
    }
}