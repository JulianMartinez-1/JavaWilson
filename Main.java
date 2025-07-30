import java.util.Scanner;   

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // System.out.print("Otro saludo");
        // System.out.println("Programacion Java");
        // System.out.print("Otro Saludoooo");

        //Manejo de variables
        //int edad = 20; //Entero
        //System.out.println("La edad es: " + edad);
        // System.out.println("Su edad es: "  edad);
        //double precio = 99.99; //Numero decimal
        //char inicial = 'A'; //Caracter
        //boolean esMayor = true; //Booleano
        //String nombre = "Juan"; //Cadena de texto

        // // Operaciones
        // int numero1 = 10;
        // int numero2 = 20;

        // int resultado = numero1 + numero2;
        // System.out.print("El resultado es: " + resultado);

        //uso de Scanner para capturar datos desde la consola

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Nombre: " + nombre);
        

        // Capturar un numero entero
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Nombre: " + edad);

        // Capturar un numero decimal
        System.out.print("Ingrese su altura en metos: ");
        double altura = sc.nextDouble();
        System.out.println("Nombre: " + altura);

        // Capturar un caracter
        System.out.print("Ingrese su inicial: ");
        char inicial = sc.next().charAt(0);
        System.out.println("Nombre: " + inicial);

        // Capturar un valor booleano
        System.out.print("Eres estudiante? (true/false): ");
        boolean esEstudiante = sc.nextBoolean();
        System.out.println("Nombre: " + esEstudiante);

        System.out.println("\n=== Datos Ingresados ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        //Precaucion con nextLine() despues de nextInt() o nextDouble()
        //Cuando se usa nextInt() o nextDouble(), el salto de linea (\n) queda en el buffer,
        //lo que puede causar que nextLine() se salte la entrada del usuario. Para evitar esto,
        //usa un scanner.nextLine() despues de nextInt() o nextDouble()

        //CApturar un String
        System.out.print("Ingrese su nombre: ");
        String name = sc.nextLine();

        //Capturar un numero entero
        System.out.print("Ingrese su edad: ");
        int age = sc.nextInt();
        sc.nextLine();//limpiar buffer



        
        sc.close();
    }
}
