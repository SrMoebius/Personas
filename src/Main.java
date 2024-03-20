import ucn.*;

public class Main {
    public static void main(String[] args) {

        String CONTINUAR = "";

        //Lista para guardas las instancias de Persona
        Persona[] ListaPersonas = new Persona[200];
        int cont = 0;


        int opcion = 0;
        while (opcion != 5) {

            StdOut.println("""
                
                =======================
                ===  BASE DE DATOS  ===
                ===       DE        ===
                ===    PERSONAS     ===
                =======================
                
                [1] Ingresar una Persona
                [2] Eliminar una Persona
                [3] Modificar una Persona
                [4] Cantidad de Personas
                [5] Salir
                """);

            StdOut.print("Ingrese una opción: ");
            opcion = StdIn.readInt();

            switch (opcion) {

                //Agregar a una Persona
                case 1 -> {

                    Persona instanciaPersona = nuevaPersona();

                    ListaPersonas[cont] = instanciaPersona;
                    cont++;

                }
                

                //Eliminar a una Persona
                case 2 -> {

                    mostrarPersonas(ListaPersonas, cont);

                    StdOut.print("\nIngrese el número de la persona que desea eliminar: ");
                    int cambio = StdIn.readInt();
                    cambio--;

                    //Algoritmo para eliminar y ordenar la lista de las instancias
                    for (int i = 0; i < cont; i++) {
                        
                        if (i == cambio) {

                            for (int j = i; j < cont-1; j++) {

                                ListaPersonas[j] = ListaPersonas[j+1];
                                
                            }
                            cont--;
                            break;
                            
                        }
                        
                    }

                    StdOut.println("\nPersona eliminada con exito :)\n");
                    mostrarPersonas(ListaPersonas, cont);

                    StdOut.print("\nPresione ENTER para continuar");
                    CONTINUAR = StdIn.readString();
                    
                }
                
                
                //Modificar a una Persona
                case 3 -> {

                    mostrarPersonas(ListaPersonas, cont);

                    StdOut.print("\nIngrese el número de la persona que desea modificar: ");
                    int cambio = StdIn.readInt();
                    cambio--;

                    StdOut.print("\nDesea modificar nombre(1) o edad(2): ");
                    int NoE = StdIn.readInt();

                    if (NoE == 1) {

                        StdOut.print("\nIngrese el nombre nuevo: ");
                        String nombreNuevo = StdIn.readString();

                        ListaPersonas[cambio].setNombre(nombreNuevo);

                    } else if (NoE == 2) {

                        StdOut.print("\nIngrese la edad nueva: ");
                        int edadNueva = StdIn.readInt();

                        ListaPersonas[cambio].setEdad(edadNueva);

                    }

                    StdOut.println("\nPersona modificada con éxito :)\n");
                    detallePersona(ListaPersonas, cambio);

                    StdOut.print("\nPresione ENTER para continuar");
                    CONTINUAR = StdIn.readString();

                }


                //Mostrar Cantidad de Personas
                case 4 -> {

                    mostrarPersonas(ListaPersonas, cont);

                    StdOut.print("\nPresione ENTER para continuar");
                    CONTINUAR = StdIn.readString();

                }


                //Salir
                case 5 -> {}

            }

        }


    }


    public static Persona nuevaPersona() {

        StdOut.print("\nIngrese un nombre: ");
        String nombre = StdIn.readString();

        StdOut.print("Ingrese la edad de " + nombre + ": ");
        int edad = StdIn.readInt();

        return new Persona(nombre, edad);

    }

    public static void mostrarPersonas(Persona[] ListaPersonas, int cont) {

        StdOut.println("\nHay " + cont + " personas en la base de datos.");
        StdOut.println("Y estas son: ");

        for (int i = 0; i < cont; i++) {

            StdOut.println((i+1) + ")");

            StdOut.println("Nombre: " + ListaPersonas[i].getNombre());
            StdOut.println("Edad: " + ListaPersonas[i].getEdad() + " años");

        }

    }

    public static void detallePersona(Persona[] ListaPersonas, int indice) {

        StdOut.println("Nombre: " + ListaPersonas[indice].getNombre());
        StdOut.println("Edad: " + ListaPersonas[indice].getEdad());

    }

}