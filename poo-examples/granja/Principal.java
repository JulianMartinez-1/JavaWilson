package granja; // Paquete para organización

import java.util.Objects;

// -------------------- Abstracción con clase abstracta --------------------
abstract class Animal {
    private String nombre; // Encapsulamiento con atributo privado
    private int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters con encapsulamiento
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    // Método abstracto → obliga a las subclases a implementarlo
    public abstract void hacerSonido();

    // Método común a todos los animales
    public void dormir() {
        System.out.println(nombre + " está durmiendo...");
    }

    // toString para mostrar bien los datos
    @Override
    public String toString() {
        return "Animal: " + nombre + ", Edad: " + edad;
    }

    // equals y hashCode para comparación correcta
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return edad == animal.edad && Objects.equals(nombre, animal.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}

// -------------------- Interfaz con default --------------------
interface Alimentable {
    void comer();

    default void beberAgua() {
        System.out.println("Bebiendo agua fresca...");
    }
}

// -------------------- Clase concreta con herencia y polimorfismo --------------------
class Perro extends Animal implements Alimentable {
    private String raza;

    // Uso de this y super
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    // Sobrescritura de método abstracto
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " ladra: ¡Guau guau!");
    }

    // Implementación de interfaz
    @Override
    public void comer() {
        System.out.println(getNombre() + " está comiendo croquetas.");
    }

    // Sobrecarga de métodos
    public void jugar() {
        System.out.println(getNombre() + " está jugando.");
    }

    public void jugar(String juguete) {
        System.out.println(getNombre() + " juega con " + juguete + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", Raza: " + raza;
    }
}

// -------------------- Otra clase concreta --------------------
class Gato extends Animal implements Alimentable {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " maúlla: ¡Miau!");
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " está comiendo pescado.");
    }
}

// -------------------- Composición --------------------
class Dueño {
    private String nombre;
    private Perro perro; // Composición → un dueño tiene un perro

    public Dueño(String nombre, Perro perro) {
        this.nombre = nombre;
        this.perro = perro;
    }

    public void pasearPerro() {
        System.out.println(nombre + " está paseando a " + perro.getNombre());
        perro.jugar("pelota");
    }
}

// -------------------- Clase con static y final --------------------
class ContadorAnimales {
    private static int totalAnimales = 0; // miembro de clase compartido
    public static final String NOMBRE_GRANJA = "Granja Feliz"; // constante

    public static void registrarAnimal() {
        totalAnimales++;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }
}

// -------------------- Clase principal (main) --------------------
public class Principal {
    public static void main(String[] args) {
        // Creación de objetos
        Perro p1 = new Perro("Firulais", 3, "Labrador");
        Gato g1 = new Gato("Michi", 2);

        // Uso de métodos
        p1.hacerSonido();
        g1.hacerSonido();

        // Polimorfismo con upcasting
        Animal a1 = p1; // Un perro visto como animal
        a1.hacerSonido(); // Despacho dinámico → llama al de Perro

        // Interfaz con default
        p1.comer();
        p1.beberAgua();
        g1.comer();

        // Sobrecarga
        p1.jugar();
        p1.jugar("hueso");

        // Composición
        Dueño d1 = new Dueño("Carlos", p1);
        d1.pasearPerro();

        // static y final
        ContadorAnimales.registrarAnimal();
        ContadorAnimales.registrarAnimal();
        System.out.println("Animales registrados en " + ContadorAnimales.NOMBRE_GRANJA + ": " + ContadorAnimales.getTotalAnimales());

        // toString, equals, hashCode
        System.out.println(p1.toString());
        System.out.println("¿p1 es igual a g1? " + p1.equals(g1));
    }
}
