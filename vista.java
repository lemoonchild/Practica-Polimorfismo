import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejercicio en clase - trabajadores
 * 
 * Clase vista - permite la interacción con el usuario con métodos para mostrar y recibir información a través de la consola.
 */

public class vista {
    Scanner scan = new Scanner(System.in);

    /**
     * Muestra las posibles opciones a elegir por el usuario.
     * 
     * @return entero con la opción solicitada por el usuario
     */
    public int Menu() {
        System.out.println("\n¿Qué hará?");
        System.out.println("1. Ingresar datos de nuevo trabajador");
        System.out.println("2. Ver listado de trabajadores");
        System.out.println("3. Ver recuento de salarios de trabajadores");
        System.out.println("4. Salir\n");

        return solicitarI(""); // Envia un entero con la opción del usuario.
    }

    /**
     * Imprime una solicitud y recibe un dato tipo int
     * Evita una excepción -InputMismatchException- volviendo a solicitar el dato en
     * caso de que ocurra.
     *
     * @param solicitud texto que describe lo solicitado
     * @return entero ingresado por el usuario
     */
    public int solicitarI(String solicitud) {
        System.out.println(solicitud);
        int solicitar = 0;
        Boolean correcto = false;
        do {
            try {
                solicitar = scan.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("¡Cuidado! Ingresa un número entero.");
            }
        } while (correcto == false);
        scan.nextLine(); // Elimina la posibilidad de saltarse una linea de solicitud después
        return solicitar;
    }

    /**
     * Imprime un texto solicitado
     * 
     * @param text texto a imprimir
     */
    public void Mostrar(String text) {
        System.out.println("\n" + text);
    }

    /**
     * Imprime una solicitud y recibe un dato tipo String.
     * 
     * @param solicitud texto que describe la solicitud al usuario
     * @return regresa el texto dado por el usuario
     */
    public String solicitarS(String solicitud) {
        System.out.println(solicitud);
        String solic = scan.nextLine();
        return solic;
    }
}
