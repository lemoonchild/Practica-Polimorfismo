/*
 * Clase hija heredada trabajadores
 * Su propósito es: Tener atributos diferentes para los trabajadores que son identificados como docentes 
 * y así poder calcular su salario total dependiendo de los requerimientos solicitados. 
 */

public class Docente extends trabajadores {

    // Atributos de la clase:
    private double antiguedad;
    private int gradoCientifico;
    private int categoria;

    // Construtores de la clase
    public Docente() {

        super(); // lamada al constructr padre con sus atributos
    }

    public Docente(String nombre, String area, int salarioBase, int horasAusencia, double antiguedad,
            int gradoCientifico, int categoria) {

        super(nombre, area, salarioBase, horasAusencia);
        this.antiguedad = antiguedad;
        this.gradoCientifico = gradoCientifico;
        this.categoria = categoria;

    }

    // Getters y Setters por cada atributo
    public double getPlusantiguedad() {
        return antiguedad;
    }

    public void setPlusantiguedad(double plusantiguedad) {
        this.antiguedad = plusantiguedad;
    }

    public int getPlusgradoCientifico() {
        return gradoCientifico;
    }

    public void setPlusgradoCientifico(int plusgradoCientifico) {
        this.gradoCientifico = plusgradoCientifico;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    // Caracteristicas del docente para el calculo de su salario
    /**
     * @return cantidad de dinero que es brindada como plus por cada 5 años de
     *         antiguedad
     */
    public double plusAntiguedad() {

        return antiguedad * 5 / 20;

    }

    /**
     * @return cantidad de dinero agregada dependiendo de su grado cientifico, 1 si
     *         es master 2 si es doctorado
     */
    public int plusGradoCientifico() {

        int agregado = 0;
        if (gradoCientifico == 1) {
            agregado = 80;
        }
        if (gradoCientifico == 2) {
            agregado = 120;
        } else if (gradoCientifico == 3) {
            agregado = 0;
        }
        return agregado;

    }

    /**
     * @return dependiendo de su categoria como docente se le da un agregado en
     *         porcentajes a su salario como trabajador
     */
    public double salario() {
        double salarioDocente = 0;
        double salarioTrabajador = super.salario();

        if (categoria == 1) {
            salarioDocente += 0.2 * salarioTrabajador;

        }
        if (categoria == 2) {
            salarioDocente += 0.15 * salarioTrabajador;

        }
        if (categoria == 3) {
            salarioDocente += 0.02 * salarioTrabajador;

        }
        if (categoria == 4) {
            salarioDocente += 0.10 * salarioTrabajador;

        }
        if (categoria == 5) {
            salarioDocente = salarioTrabajador;

        }

        salarioDocente += salarioTrabajador - descuentoAusencias() + plusAntiguedad() + plusGradoCientifico();

        return salarioDocente;

    }

    @Override
    public String toString() {
        String mensaje = "";
        mensaje = "\tEl docente de nombre " + super.getNombre() + " y de categoria " + getCategoria()
                + " gana en total: "
                + " Q" + salario();
        return mensaje;
    }

}
