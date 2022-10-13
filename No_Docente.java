package Github;

/*
 * Clase hija heredada trabajadores
 * Su propósito es: Tener atributos diferentes para los trabajadores que son identificados 
 * como no docentes y así poder calcular su salario total dependiendo de los requerimientos solicitados. 
 */
public class No_Docente extends trabajadores {

    //Atributos de la clase: 
    private int cantidadFeriados; 

    //Constructores de la clase 
    public No_Docente() {

        super();

    }
    public No_Docente(String nombre, String identificación, int salarioBase, int ausencias_impuntualidades, int cantidadFeriados){
        
        super(nombre, identificación, salarioBase, ausencias_impuntualidades); 
        this.cantidadFeriados = cantidadFeriados;

    }

    //Getters y Setters de los atrubutos
    public int getCantidadFeriados() {
        return cantidadFeriados;
    }
    public void setCantidadFeriados(int cantidadFeriados) {
        this.cantidadFeriados = cantidadFeriados;
    }

    //Características para el cálculo de salario del No Docente

    /**
     * @return el dinero agregado al salario del no docente segun su cantidad de dinero diaria multiplicado 
     * dos veces la cantidad de feriados 
     */
    public double plusFeriados(){ //la cantidad de feria

        return tarifa_diaria*2*cantidadFeriados; 

    }
    /**
     * @return calculo de salario con las caracteristicas solicitadas de los no docentes 
     */
    public double salario(){ 
        
        return super.salario() + plusFeriados();

    }
    @Override
    public String toString() {
        String mensaje = ""; 
        mensaje = "El no docente de nombre " + super.getNombre() + " gana en total: " + "\tQ" + salario();
        return mensaje; 
    }

}