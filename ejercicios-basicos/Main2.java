import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Programacion estructurada a objetos
        // System.out.println("Hello, World!");
        // System.out.println("NUmero 1");
        // int numero1 = sc.nextInt();
        // sc.nextLine();

        // System.out.println("Numero 2");
        // int numero2 = sc.nextInt();
        // sc.nextLine();

        // // int suma = num1 + num2;
        // // System.out.println("La suma es: " + suma);

        // // //Programacion orientada a objetos
        // OperacionesAritmeticas op1 = new OperacionesAritmeticas();
        // op1.num1 = numero1;
        // op1.num2 = numero2;
        // op1.sumar();

        // // //Nueva instancia

        // OperacionesAritmeticas op2 = new OperacionesAritmeticas();
        // op2.num1 = numero1;
        // op2.num2 = numero2;
        // op2.sumar();


        // // //programacion orientada a objetos
        // Persona personaCliente = new Persona("Julian", 20);
        // personaCliente.mostrarInformacion();

        // Persona personaEmpleado = new Persona("Ana", 30);
        // personaEmpleado.mostrarInformacion();

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Ingrese el nombre de la persona:");
        // String nombre = sc.nextLine();
        // System.out.println("Ingrese la edad de la persona:");
        // int edad = sc.nextInt();
        // sc.nextLine();

        int opcion;
        OperacionesAritmeticas op = new OperacionesAritmeticas();
        op.Menu();





        sc.close();
    }
}