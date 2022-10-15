import java.util.ArrayList;

public class Controlador {
    boolean Es_Docente; // False es no_docente, True es docente
    trabajadores trabajador;
    ArrayList<trabajadores> Trabajador_ingresados = new ArrayList<>();
    vista vista = new vista();

    public void programa() {
        int op = 0;
        while (op != 3) {
            op = vista.MenuInicial();
            if (op == 1) { // Ingresar datos de nuevo trabajador
                Crear_trabajador();

            } else if (op == 2) { // Ver listado de trabajadores
                Imprimir_Trabajadores_en_lista();

            } else if (op == 3) { // Salir
                vista.Mostrar("\nSaliendo...");
            } else {
                vista.Mostrar("Cuidado, escribe solamente un número del 1 al 3");
            }
        }

    }

    public void Verificar_tipo_de_Trabajador() {
        Es_Docente = vista.menu_es_docente();
    }

    public void Crear_trabajador() {
        int per = vista.solicitarI("Cuántos trabajadores quieres agregar?"); // Pide cuantos personas quiere
        for (int i = 0; i < per; i++) { // De esos hace una vez cada función por números que hay
            Verificar_tipo_de_Trabajador(); // Verifica que tipo de personas es
            if (Es_Docente == false) {
                No_Docente nodocente_temp = new No_Docente(vista.solicitarS("¿Cuál es el nombre de tu persona"),
                        vista.solicitarS("¿Cuáles la identificación de tu persona?"),
                        vista.solicitarI("¿Cuál es su salario base?"),
                        vista.solicitarI("¿Cuántas ausencias ha tenido?"),
                        vista.solicitarI("¿Cuántos feriados tuvo?"));
                Trabajador_ingresados.add(nodocente_temp);
            }
            if (Es_Docente == true) {
                Docente docente_temp = new Docente(vista.solicitarS("¿Cuál es el nombre de tu persona?"),
                        vista.solicitarS("¿Cuáles la identificación de tu persona?"),
                        vista.solicitarI("¿Cuál es su salario base?"),
                        vista.solicitarI("¿Cuántas horas de ausencia tiene?"),
                        vista.solicitarD("¿Cuántos años de anitugedad tiene?"),
                        vista.menu_de_grado_científico(),
                        vista.menu_de_puesto());
                Trabajador_ingresados.add(docente_temp);
            }
        }

    }

    public void Imprimir_Trabajadores_en_lista() {
        int puesto = 1;
        for (trabajadores trabajador : Trabajador_ingresados) {
            vista.Mostrar("Trabajador número  " + puesto);
            vista.MostrarTrabajador(trabajador);
            puesto++;
        }
        if (Trabajador_ingresados == null) {
            vista.Mostrar("Aún no hay datos de trabajadores registrados.");
        }

    }
}
