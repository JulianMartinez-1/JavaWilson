// Colecciones en Java: Las colecciones en Java son estructuras de datos avanzadas que permiten almacenar y manipular múltiples elementos de manera eficiente.

/* Tipos de Colecciones en Java: Java proporciona varias estructuras de datos en el paquete java.util. Las más utilizadas son:
Tipo de Colección	Clase		Características
List				ArrayList	Lista ordenada, permite duplicados.
Set					HashSet		No permite duplicados, sin orden específico.
Map					HashMap		Almacena pares clave-valor, sin orden específico.
*/

// Listas en Java (ArrayList)
// Las listas (List) permiten almacenar elementos en orden y pueden contener duplicados.
// Cuándo usar ArrayList: Cuando necesitas una lista ordenada con acceso rápido a los elementos por índice.

/* import java.util.ArrayList;

public class ListaEjemplo {
    public static void main(String[] args) {
        // Crear una lista de nombres
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos a la lista
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        // Acceder a elementos por índice
        System.out.println("Primer nombre: " + nombres.get(0));

        // Recorrer la lista con un bucle for-each
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Eliminar un elemento
        nombres.remove("María");

        // Verificar si un elemento está en la lista
        System.out.println("¿Carlos está en la lista? " + nombres.contains("Carlos"));

        // Tamaño de la lista
        System.out.println("Tamaño de la lista: " + nombres.size());
    }
}
*/


// Conjuntos en Java (HashSet)
// Los sets (Set) no permiten elementos duplicados.
// Cuándo usar HashSet: Cuando necesitas evitar elementos duplicados y el orden no es importante.

/* import java.util.HashSet;

public class SetEjemplo {
    public static void main(String[] args) {
        // Crear un HashSet
        HashSet<String> frutas = new HashSet<>();

        // Agregar elementos
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Manzana"); // No se añadirá (duplicado)

        // Recorrer el conjunto con for-each
        System.out.println("Frutas en el conjunto:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Comprobar si un elemento existe
        System.out.println("¿El conjunto contiene 'Banana'? " + frutas.contains("Banana"));

        // Tamaño del conjunto
        System.out.println("Tamaño del conjunto: " + frutas.size());

        // Eliminar un elemento
        frutas.remove("Naranja");
    }
}
*/


// Mapas en Java (HashMap)
// Los mapas (Map) almacenan pares clave-valor. Son ideales para almacenar información relacional.
// Cuándo usar HashMap: Cuando necesitas almacenar relaciones clave-valor, como una agenda telefónica o configuración de usuarios.

/* import java.util.HashMap;

public class MapaEjemplo {
    public static void main(String[] args) {
        // Crear un HashMap
        HashMap<Integer, String> estudiantes = new HashMap<>();

        // Agregar elementos (clave, valor)
        estudiantes.put(1, "Juan");
        estudiantes.put(2, "María");
        estudiantes.put(3, "Carlos");

        // Obtener un valor por clave
        System.out.println("Estudiante con clave 2: " + estudiantes.get(2));

        // Recorrer el mapa con for-each
        System.out.println("Lista de estudiantes:");
        for (Integer clave : estudiantes.keySet()) {
            System.out.println("Clave: " + clave + ", Nombre: " + estudiantes.get(clave));
        }

        // Eliminar un elemento
        estudiantes.remove(1);

        // Verificar si una clave existe
        System.out.println("¿Existe la clave 3? " + estudiantes.containsKey(3));

        // Verificar si un valor existe
        System.out.println("¿Existe 'María'? " + estudiantes.containsValue("María"));

        // Tamaño del mapa
        System.out.println("Tamaño del mapa: " + estudiantes.size());
    }
}
*/
