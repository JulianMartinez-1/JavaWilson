import java.util.Scanner;  
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World");
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
        // System.out.print("Ingrese su nombre:");
        // String nombre = sc.nextLine();
        // System.out.println("Nombre: " + nombre);
        

        // // Capturar un numero entero
        // System.out.print("Ingrese su edad: ");
        // int edad = sc.nextInt();
        // System.out.println("Nombre: " + edad);

        // // Capturar un numero decimal
        // System.out.print("Ingrese su altura en metos: ");
        // double altura = sc.nextDouble();
        // System.out.println("Nombre: " + altura);

        // // Capturar un caracter
        // System.out.print("Ingrese su inicial: ");
        // char inicial = sc.next().charAt(0);
        // System.out.println("Nombre: " + inicial);

        // // Capturar un valor booleano
        // System.out.print("Eres estudiante? (true/false): ");
        // boolean esEstudiante = sc.nextBoolean();
        // System.out.println("Nombre: " + esEstudiante);

        // System.out.println("\n=== Datos Ingresados ===");
        // System.out.println("Nombre: " + nombre);
        // System.out.println("Edad: " + edad);

        //Precaucion con nextLine() despues de nextInt() o nextDouble()
        //Cuando se usa nextInt() o nextDouble(), el salto de linea (\n) queda en el buffer,
        //lo que puede causar que nextLine() se salte la entrada del usuario. Para evitar esto,
        //usa un scanner.nextLine() despues de nextInt() o nextDouble()

        // // Capturar un String
        // System.out.print("Ingrese su nombre: ");
        // String name = sc.nextLine();

        // //Capturar un numero entero
        // System.out.print("Ingrese su edad: ");
        // int age = sc.nextInt();
        // sc.nextLine();//limpiar buffer


        // System.out.print("Ingrese su edad: ");
        // int age = sc.nextInt();
        // sc.nextLine(); // Limpiar el buffer
        // int age_parametro = 18;
        // boolean tieneBoleta = true;

        // if (| (age < age_parametro || tieneBoleta)) {
        //     System.out.println("Puede ingresar.");
        // } else {
        //     System.out.println("No puede ingresar.");
        // }


        // Verifica si el usuario puede ingresar
        // if (age >= 18 && tieneBoleta) {
        //     System.out.println("Puede ingresar.");
        // } else if (age >= 18 && |tieneBoleta) {
        //     System.out.println("No puede ingresar.");
        // } else if (age < 18 && tieneBoleta) {
        //     System.out.println("No puede ingresar.");
        // } else {
        //     System.out.println("No puede ingresar.");
        // }

        // String mensaje = age >= 18 && tieneBoleta ? "Eres mayor de edad." : "Eres menor de edad.";
        // System.out.println(mensaje);

        // mensaje = age >= 18 && tieneBoleta ? "Puede ingresar." : "No puede ingresar.";
        // System.out.println(mensaje);

//         int edad = 19;
//         boolean tieneBoleta = true;
//         java.time.LocalDate fechaevento = java.time.LocalDate.parse("2025-08-14");}
//         String mensaje = "";
//         java.time.LocalDate fechaActual = java.time.LocalDate.now();

//         if (edad >= 18){
//             if (tieneBoleta){
//                 if (fechaevento.equals(fechaActual) || fechaevento.isEqual(fechaActual)) {
//                     mensaje = "Puede ingresar.";
//                 } else {
//                     mensaje = "No puede ingresar. El evento ya ha pasado.";
//                 }else {
//                 mensaje = "No puede ingresar. No tiene boleta.";
//             }else {
//             mensaje = "No puede ingresar. Eres menor de edad.";
//         }
//     }
// }



        // int dia = 3;
        // switch (dia) {
        //     case 1:
        //         System.out.println("Lunes");
        //         break;
        //     case 2:
        //         System.out.println("Martes");
        //         break;
        //     case 3:
        //         System.out.println("Miércoles");
        //         break;
        //     default:
        //         System.out.println("Otro dia");
        // }

        // //Desde Java 14+, se puede usar una version mejorada del switch expression;
        // String resultado = switch (dia) {
        //     case 1 -> "Lunes";
        //     case 2 -> "Martes";
        //     case 3 -> "Miércoles";
        //     default -> "Otro dia";
        // };

        //Ejemplo de estructura repetitiva for
        //sintaxis
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Iteración: " + i);
        // }

        //Ejemplo de estructura repetitiva for(con break); detiene la 
        //ejecucion de un ciclo, pero no del programa. Es importante tener en 
        //cuenta que el break solo detiene el ciclo mas cercano. Y se usa en 
        //casos como cuando se cumple una condicion y no desea continuar con el ciclo
        //Un caso real es cuando se busca un elemento en un arreglo y se desea detener
        //la busqueda cuando se encuentra el elemento

        // //Sintaxis
        // for (int i = 0; i <= 10; i++) {
        //     if (i == 3) {
        //         break; 
        //     }
        //     System.out.println("Iteraccion " + i);
        // }

        // //Ejemplo
        // int[] numeros = {1, 2, 3, 4, 5};
        // int numeroBuscado = 3;
        // boolean encontrado = false;

        // for (int i =0; i < numeros.length; i++) {
        //     if (numeros[i] == numeroBuscado) {
        //         encontrado = true;
        //         break; 
        //     }
        // }

        // if (encontrado) {
        //     System.out.println("Numero encontrado");
        // } else {
        //     System.out.println("Numero no encontrado");
        // }

        // //Ejemplo de estructura repetitiva for (con continue); detiene la
        // //iteracion actual y continua con la siguiente. Se usa en casos como 
        // //cuando se cumple una cpndicion y se desea continuar con el ciclo. Un
        // //caso real es cuando se desea omitir un elemento en un arreglo.

        // //Sintaxis
        // for (int i = 0; i < 10; i++) {
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println("Iteración " + i);
        // }

        //Estructura repetitiva for (con continue) para el caso real es cuando se desea omitir un elemento en un arreglo

        // int [] numeros = {1, 2, 3, 4, 5};
        // int numeroOmitido = 3;

        // for (int i = 0; i < numeros.length; i++) {
        //     if (numeros[i] == numeroOmitido) {
        //         continue;
        //     }
        //     System.out.println("Numero: " + numeros[i]);
        // }

        //otro ejemplo de estructura repetitiva for (con continue) para el caso real es cuando se desea omitir un elemento en un arreglo
        // array de strings

        // String[] comportamiento = {"Disciplinado", "Serio", "Indiciplinado", "Amable", "Juicioso"};
        // String comportamientoOmitido = "Indiciplinado";

        // for (int i = 0; i < comportamiento.length; i++) {
        //     if (comportamiento[i].equals(comportamientoOmitido)) {
        //         continue; 
        //     }
        //     System.out.println("Comportamiento: " + comportamiento[i]);
        // }

        // //ejemplo con break y continue
        // String[] comportamiento = {"Disciplinado", "Serio", "Indiciplinado", "Amable", "Juicioso"};
        // String comportamientoOmitido = "Indiciplinado";

        // while (int i = 0; i < comportamiento.length; i++) {
        //     if (comportamiento[i].equals(comportamientoOmitido)) {
        //         continue; 
        //     }
        //     System.out.println("Comportamiento: " + comportamiento[i]);
        //     if (comportamiento[i].equals("Juicioso")) {
        //         break; 
        //     }
        // }

        // //ejemplo con do while con break y continue
        // String[] comportamientos = {"Disciplinado", "Serio", "Indiciplinado", "Amable", "Juicioso"};
        // String comportamientoOmitido = "Indiciplinado";

        // int i = 0;
        // do {
        //     if (comportamientos[i].equals(comportamientoOmitido)) {
        //         i++;
        //         continue;
        //     }
        //     System.out.println("Comportamiento: " + comportamientos[i]);
        //     if (comportamientos[i].equals("Juicioso")) {
        //         break;
        //     }
        //     i++;
        // } while (i < comportamientos.length);

        // //Estructura ciclica con ArrayList (explicacion + ejemplo)

        // // sintaxis
        // for (TipoElemento variable : coleccion) {
        //     // // Instrucciones
        // }

        // // Ejemplo con array
        // String[] frutas = {"Manzana", "Banana", "Naranja"};

        // for (String fruta : frutas) {
        //     System.out.println(fruta);
        // }

        // Ejemplo con ArrayList
        // ArrayList<String> colores = new ArrayList<>();

        // colores.add("Rojo");
        // colores.add("Verde");
        // colores.add("Azul");

        // for (String color : colores) {
        //     System.out.println(color);
        // }

        // // Ejemplo
        // List<String> frutas = new ArrayList<>();
        // frutas.add("Manzana");
        // frutas.add("Banana");
        // frutas.add("Naranja");

        // //foreach clasico
        // for (String fruta : frutas) {
        //     System.out.println(fruta);
        // }

        // //Alternativa con forEach (Java 8+) usando una lambda
        // frutas.forEach(f -> System.out.println("->" + f));


        // // Ejercicio Iva por categoría
        // String[] categorias = {"A", "B", "C"};
        // double[] precios = {100.0, 200.0, 300.0};
        // double[] tasasIva = {0.19, 0.05, 0.0};
        // List<String> resultados = new ArrayList<>();
        // for (int i = 0; i < categorias.length; i++) {
        //     double iva = precios[i] * tasasIva[i];
        //     double precioFinal = precios[i] + iva;
        //     resultados.add("Categoría: " + categorias[i] + ", Subtotal: " + precios[i] + ", IVA: " + iva + ", Precio Final: " + precioFinal);
        //     System.out.println("Categoría: " + categorias[i] + ", Subtotal: " + precios[i] + ", IVA: " + iva + ", Precio Final: " + precioFinal);
        // }

        // //Ejemplo estadisticas de lectura
        // List<Double> estadisticasLectura = new ArrayList<>();
        // estadisticasLectura.add(1.5);
        // estadisticasLectura.add(2.0);
        // estadisticasLectura.add(1.8);
        // estadisticasLectura.add(2.5);
        // estadisticasLectura.add(3.0);
        // estadisticasLectura.add(1.2);

        // double suma = 0;
        // double minimo = Double.MAX_VALUE;
        // double maximo = Double.MIN_VALUE;

        // for (double lectura : estadisticasLectura) {
        //     suma += lectura;
        //     if (lectura < minimo) {
        //         minimo = lectura;
        //     }
        //     if (lectura > maximo) {
        //         maximo = lectura;
        //     }
        // }

        // double promedio = suma / estadisticasLectura.size();

        // System.out.println("Estadísticas de lectura:" + estadisticasLectura);
        // System.out.println("Promedio de lectura: " + promedio + " horas");
        // System.out.println("Lectura mínima: " + minimo + " horas");
        // System.out.println("Lectura máxima: " + maximo + " horas");


//         //ejemplo Inventario simple
//         Map<String, Integer> inventario = new HashMap<>();
//         inventario.put("\n Manzanas", 50);
//         inventario.put("\n Bananas", 30);
//         inventario.put("\n Naranjas", 20);
//         inventario.put("\n Peras", 15);
        
//         System.out.println("Inventario inicial: " + inventario);

//         String productoMax = "";
//         int cantidadMax = Integer.MIN_VALUE;

//         for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
//         if (entry.getValue() > cantidadMax) {
//         cantidadMax = entry.getValue();
//         productoMax = entry.getKey();
//     }
// }
//         System.out.println("Producto con mayor cantidad: " + productoMax + " (" + cantidadMax + ")");

        sc.close();

}
}

