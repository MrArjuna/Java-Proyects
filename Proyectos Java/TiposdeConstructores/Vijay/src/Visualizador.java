import javax.sound.midi.SysexMessage;

public class Visualizador {


    public static void main(String[] args) {
        

        /* Constructor por Defecto
        

        Construccion del objeto

        Clase + Nombre del Objeto + new + Nombre de la clase + ();
         */
        ConstructorPorDefecto ConstructorPorDefectoO = new ConstructorPorDefecto();
        
        // Inicializacion del objeto... Objeto + Atributo, en caso de no tener, mostrara valores como Null, 0, etc.
        System.out.println("ConstructorPorDefecto Nombre: " + ConstructorPorDefectoO.nombre);




        /* Constructor Definido 
       
        Aqui se colocan los atributos del objeto para inicializarlos independientemente por objeto.
        Ahora, cada vez que creas un objeto de tipo Persona, puedes inicializarlo con los valores que desees
         */
        ConstructorDefinido ConstructorDefinidoO = new ConstructorDefinido("Vijay", 25);

        /*  Se inicializa Objeto + Atributo, en este caso ConstructorDefinidoO es el objeto
        y el atributo es el nombre y la edad, estas pidiendo que te muestre el atributo de nombre
        del objeto anteriormente mencionado. 
        */

        System.out.println("ConstructorDefinido Nombre: " + ConstructorDefinidoO.nombre);

        System.out.println("ConstructorDefinido Edad: " + ConstructorDefinidoO.edad);

    


        //Sobrecarga de Constructores

        /*Se construye el objeto sin declarar atributos, ya que los atributos ya fueron declarados en el 
        Constructor. */
        SobrecargaDeConstructores Objeto1 = new SobrecargaDeConstructores();

        /*Aqui se instancia el objeto derivado del segundo constructor, es decir colocando los parametros
          en esta sentencia
         */
        SobrecargaDeConstructores Objeto2 = new SobrecargaDeConstructores("Arjuna", 35);


        //Impresion del primer constructor
        System.out.println("Constructor sin Argumentos: " + Objeto1.nombre);
        System.out.println("Constructor sin Argumentos: " + Objeto1.Edad);

        //Impresion del segundo constructor
        System.out.println("Constructor con Argumentos: " + Objeto2.nombre);
        System.out.println("Constructor con Argumentos: " + Objeto2.Edad);

    }
}
