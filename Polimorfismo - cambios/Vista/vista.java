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
    public int MenuInicial() {
        System.out.println("\n¿Qué hará?");
        System.out.println("1. Ingresar datos de nuevo trabajador");
        System.out.println("2. Ver listado de trabajadores");
        System.out.println("3. Salir\n");

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
     * Imprime una solicitud y recibe un dato tipo Double
     * Evita una excepción -InputMismatchException- volviendo a solicitar el dato en
     * caso de que ocurra.
     *
     * @param solicitud texto que describe lo solicitado
     * @return decimal - double ingresado por el usuario
     */
    public Double solicitarD(String solicitud) {
        System.out.println(solicitud);
        Double solicitar = 0.0;
        Boolean correcto = false;
        do {
            try {
                solicitar = scan.nextDouble();
                correcto = true;
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("¡Cuidado! Ingresa un número.");
            }
        } while (correcto == false);
        scan.nextLine(); // Elimina la posibilidad de saltarse una linea de solicitud después
        return solicitar;
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

    /**
     * Imprime un texto solicitado
     * 
     * @param text texto a imprimir
     */
    public void Mostrar(String text) {
        System.out.println("\n" + text);
    }

    /**
     * Imprime elementos de tipo trabajador
     * 
     * @param t trabajador a imprimir
     */
    public void MostrarTrabajador(trabajadores t) {
        System.out.println("\n" + t);
    }

    /**
     * Muestra las posibles opciones a elegir por el usuario para saber si es o no
     * un docente.
     * 
     * @return entero con la opción solicitada por el usuario
     */
    public boolean menu_es_docente() {
        System.out.println("\n¿Qué tipo de trabajador es?");
        System.out.println("\t1) Docente");
        System.out.println("\t2) No Docente");
        boolean solic = true;
        boolean continuar = true;

        while (continuar) {
            int docenteria = solicitarI("");
            if (docenteria == 1) {
                solic = true;
                continuar = false;
            } else if (docenteria == 2) {
                solic = false;
                continuar = false;
            } else { // Prevención de error en respuesta
                System.out.println("Cuidado, escribe 1 o 2.");
            }
        }

        return solic;
    }

    /**
     * Muestra las posibles opciones a elegir por el usuario para saber si tiene un
     * grado científico y, de ser así, saber cuál es.
     * 
     * @return entero con la opción elegida por el usuario
     */
    public int menu_de_grado_científico() {
        System.out.println("¿Cuál es su grado científico?");
        System.out.println("1. Master");
        System.out.println("2. Doctorado");
        System.out.println("3. Ninguno");

        int grado = 0;
        while (grado != 1 || grado != 2 || grado != 3) { // Prevención de error en respuesta
            grado = solicitarI("");
            if (grado == 1 || grado == 2 || grado == 3) {
                break;
            } else {
                System.out.println("Lo siento, no podemos recibir ese dato. Porfavor escribe un número del 1 al 3");
            }
        }

        return grado;
    }

    /**
     * Muestra las posibles opciones a elegir por el usuario para conocer el tipo de
     * puesto que tiene, al ser un docente.
     * 
     * @return entero con la opción elegida por el usuario
     */
    public int menu_de_puesto() {
        System.out.println("¿Qué tipo de puesto tiene?");
        System.out.println("1) Decano");
        System.out.println("2) Maestro");
        System.out.println("3) Auxiliar");
        System.out.println("4) Secretaria");
        System.out.println("5) Ninguno de los anteriores");

        int sol = 0;
        while (sol != 1 || sol != 2 || sol != 3 || sol != 4 || sol != 5) { // Prevención de error en respuesta
            sol = solicitarI("");
            if (sol == 1 || sol == 2 || sol == 3 || sol == 4 || sol == 5) {
                break;
            } else {
                System.out.println("Lo siento, no podemos recibir ese dato. Porfavor escribe un número del 1 al 5");
            }
        }
        return sol;
    }
}
