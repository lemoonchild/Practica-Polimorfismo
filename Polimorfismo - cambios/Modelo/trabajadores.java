/*
 * Clase padre trabajadores
 * Hereda a docente y no docente, permite darles los atributos a sus clases hijas y crear objetod de este tipo.
 */
public class trabajadores {
    String nombre;
    String identificación;
    int salarioBase;
    int ausencias_impuntualidades;
    int tarifa_diaria;

    // Constructores de la clase padre
    public trabajadores() {
        this.nombre = "";
        this.identificación = "";
        this.salarioBase = 0;
        this.ausencias_impuntualidades = 0;
        this.tarifa_diaria = salarioBase / 24;
    }

    public trabajadores(String nombre, String identificación, int salarioBase, int ausencias_impuntualidades) {
        this.nombre = nombre;
        this.identificación = identificación;
        this.salarioBase = salarioBase;
        this.ausencias_impuntualidades = ausencias_impuntualidades;
        this.tarifa_diaria = salarioBase / 24;
    }

    // Getters y Setters de los atributos del trabajador
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificación() {
        return identificación;
    }

    public void setIdentificación(String identificación) {
        this.identificación = identificación;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAusencias_impuntualidades() {
        return ausencias_impuntualidades;
    }

    public void setAusencias_impuntualidades(int ausencias_impuntualidades) {
        this.ausencias_impuntualidades = ausencias_impuntualidades;
    }

    public int getTarifa_diaria() {
        return tarifa_diaria;
    }

    public void setTarifa_diaria(int tarifa_diaria) {
        this.tarifa_diaria = tarifa_diaria;
    }

    // Calculos del salario promedio de los trabadores que será heredado por las
    // clases hijas
    /**
     * @return la cantidad de salario que gana un trabajador promedio
     */
    public double salario() {

        return salarioBase;

    }

    /**
     * @return el descuento por las ausencias multiplicado con la tarifa diaria del
     *         trabajador
     */
    public double descuentoAusencias() {

        return tarifa_diaria * ausencias_impuntualidades;

    }

}
