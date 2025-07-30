import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el nombre del usuario: ");
        String nombreUsuario = scanner.nextLine();

        
        System.out.print("Ingrese la lectura inicial del mes (en litros): ");
        int lecturaInicial = scanner.nextInt();

        System.out.print("Ingrese la lectura final del mes (en litros): ");
        int lecturaFinal = scanner.nextInt();

        
        int consumo = lecturaFinal - lecturaInicial;

        
        double tarifaPorLitro = 0.15;

    
        double costo = consumo * tarifaPorLitro;

        
        System.out.println("\n--- Resumen del consumo ---");
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Consumo: " + consumo + " litros");
        System.out.println("Costo total: $" + String.format("%.2f", costo));

        scanner.close();
    }
}