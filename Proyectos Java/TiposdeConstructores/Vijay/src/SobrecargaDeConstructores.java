
/*Puedes tener múltiples constructores con diferentes números o tipos de parámetros. 
Esto se llama sobrecarga de constructores. */

//De igual manera se señalan los atributos en la clase
public class SobrecargaDeConstructores {
    String nombre;
    Double Edad;

    /*Aqui se declaran las variables, este ejemplo fue sin parametros, es decir, desde aqui se señalo la
     Variable que usara*/
    public SobrecargaDeConstructores (){
        this.nombre = "Unknown";
        this.Edad = 245.23;
    }

    /*Aqui se señala que el mismo constructor tendra 2 parametros, en este caso nombre y edad, los cuales
     Se declararan directamente en el objeto.*/
    public SobrecargaDeConstructores (String nombre, double Edad){
        this.nombre = nombre;
        this.Edad = Edad;
    }
}
