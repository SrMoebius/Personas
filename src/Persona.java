public class Persona {


    //Atributos
    private String nombre;
    private int edad;
    //private Object[] ListaPersonas = new Object[200];

    //Constructor
    public Persona(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;

    }

    //Metodo get
    public String getNombre() { return this.nombre = nombre; }
    public int getEdad() { return this.edad = edad; }


    //Metodo set
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
}
