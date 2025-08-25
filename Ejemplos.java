import java.util.Scanner;

// Clase principal que contiene todos los ejemplos
public class Ejemplos {

    // ========================= 1. Encapsulamiento =========================
    static class Cuenta {
        private double saldo;

        public void depositar(double monto) {
            if (monto > 0) saldo += monto;
        }

        public void retirar(double monto) {
            if (monto <= saldo) saldo -= monto;
            else System.out.println("Saldo insuficiente");
        }

        public double getSaldo() {
            return saldo;
        }
    }

    public static void ejemploEncapsulamiento(Scanner sc) {
        Cuenta cuenta = new Cuenta();

        System.out.print("Monto a depositar: ");
        cuenta.depositar(sc.nextDouble());

        System.out.print("Monto a retirar: ");
        cuenta.retirar(sc.nextDouble());

        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }

    // ========================= 2. Constructores, this, sobrecarga =========================
    static class Persona {
        String nombre;
        int edad;

        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Sobrecarga
        Persona(String nombre) {
            this(nombre, 0);
        }

        void saludar() {
            System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
        }
    }

    public static void ejemploConstructores(Scanner sc) {
        sc.nextLine(); 
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        Persona p1 = new Persona(nombre, edad);
        p1.saludar();

        Persona p2 = new Persona("Invitado");
        p2.saludar();
    }

    // ========================= 3. Herencia y super =========================
    static class Animal {
        String nombre;

        Animal(String nombre) {
            this.nombre = nombre;
        }

        void sonido() {
            System.out.println("Hace un sonido...");
        }
    }

    static class Perro extends Animal {
        Perro(String nombre) {
            super(nombre);
        }

        @Override
        void sonido() {
            super.sonido();
            System.out.println(nombre + " dice: Guau!");
        }
    }

    public static void ejemploHerencia(Scanner sc) {
        sc.nextLine();
        System.out.print("Nombre del perro: ");
        String nombre = sc.nextLine();

        Perro p = new Perro(nombre);
        p.sonido();
    }

    // ========================= 4. Polimorfismo =========================
    static class Figura {
        void dibujar() {
            System.out.println("Dibujando figura...");
        }
    }

    static class Circulo extends Figura {
        @Override
        void dibujar() {
            System.out.println("Dibujando un círculo");
        }
    }

    static class Cuadrado extends Figura {
        @Override
        void dibujar() {
            System.out.println("Dibujando un cuadrado");
        }
    }

    public static void ejemploPolimorfismo(Scanner sc) {
        System.out.print("Ingrese figura (1=círculo, 2=cuadrado): ");
        int opcion = sc.nextInt();

        Figura f;
        if (opcion == 1) f = new Circulo();
        else f = new Cuadrado();

        f.dibujar(); // polimorfismo dinámico
    }

    // ========================= 5. Abstracción =========================
    static abstract class Vehiculo {
        abstract void mover();
    }

    static class Coche extends Vehiculo {
        void mover() {
            System.out.println("El coche avanza sobre ruedas");
        }
    }

    static class Barco extends Vehiculo {
        void mover() {
            System.out.println("El barco navega en el agua");
        }
    }

    public static void ejemploAbstraccion(Scanner sc) {
        System.out.print("Seleccione vehículo (1=coche, 2=barco): ");
        int opcion = sc.nextInt();

        Vehiculo v;
        if (opcion == 1) v = new Coche();
        else v = new Barco();

        v.mover();
    }

    // ========================= 6. static y final =========================
    static class Matematica {
        static final double PI = 3.1416;

        static double areaCirculo(double radio) {
            return PI * radio * radio;
        }
    }

    public static void ejemploStaticFinal(Scanner sc) {
        System.out.print("Ingrese el radio del círculo: ");
        double r = sc.nextDouble();
        System.out.println("Área: " + Matematica.areaCirculo(r));
    }

    // ========================= 7. toString, equals, hashCode =========================
    static class PersonaHash {
        String nombre;

        PersonaHash(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Persona: " + nombre;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof PersonaHash)) return false;
            PersonaHash p = (PersonaHash) obj;
            return this.nombre.equals(p.nombre);
        }

        @Override
        public int hashCode() {
            return nombre.hashCode();
        }
    }

    public static void ejemploToStringEqualsHash(Scanner sc) {
        sc.nextLine();
        System.out.print("Ingrese nombre 1: ");
        PersonaHash p1 = new PersonaHash(sc.nextLine());
        System.out.print("Ingrese nombre 2: ");
        PersonaHash p2 = new PersonaHash(sc.nextLine());

        System.out.println(p1);
        System.out.println("¿Son iguales? " + p1.equals(p2));
    }

    // ========================= 8. Composición vs Herencia =========================
    static class Motor {
        void arrancar() {
            System.out.println("Motor encendido");
        }
    }

    // Herencia
    static class CocheHerencia extends Motor {}

    // Composición
    static class CocheComposicion {
        private Motor motor = new Motor();
        void encender() {
            motor.arrancar();
        }
    }

    public static void ejemploComposicionHerencia(Scanner sc) {
        System.out.print("Seleccione modo (1=herencia, 2=composición): ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            CocheHerencia ch = new CocheHerencia();
            ch.arrancar();
        } else {
            CocheComposicion cc = new CocheComposicion();
            cc.encender();
        }
    }

    // ========================= MAIN =========================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== MENÚ DE EJEMPLOS POO EN JAVA ===");
        System.out.println("1. Encapsulamiento");
        System.out.println("2. Constructores, this, sobrecarga");
        System.out.println("3. Herencia y super");
        System.out.println("4. Polimorfismo");
        System.out.println("5. Abstracción");
        System.out.println("6. static y final");
        System.out.println("7. toString, equals, hashCode");
        System.out.println("8. Composición vs Herencia");
        System.out.print("Seleccione una opción: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: ejemploEncapsulamiento(sc); break;
            case 2: ejemploConstructores(sc); break;
            case 3: ejemploHerencia(sc); break;
            case 4: ejemploPolimorfismo(sc); break;
            case 5: ejemploAbstraccion(sc); break;
            case 6: ejemploStaticFinal(sc); break;
            case 7: ejemploToStringEqualsHash(sc); break;
            case 8: ejemploComposicionHerencia(sc); break;
            default: System.out.println("Opción no válida");
        }

        sc.close();
    }
}   
