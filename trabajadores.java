/*
 * Clase padre trabajadores
 * Hereda a docente y no docente, permite darles los atributos a sus clases hijas y crear objetod de este tipo.
 */
public class trabajadores {
    private String nombre;
    private String identificación;
    private int salarioBase;
    private int ausencias_impuntualidades;
    private int tarifa_diaria;

    public trabajadores(String nombre, String identificación, int salarioBase, int ausencias_impuntualidades) {
        this.nombre = nombre;
        this.identificación = identificación;
        this.salarioBase = salarioBase;
        this.ausencias_impuntualidades = ausencias_impuntualidades;
        this.tarifa_diaria = salarioBase / 24;
    }

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

}
