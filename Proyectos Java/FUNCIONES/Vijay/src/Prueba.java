public class Prueba {

    public void Saludo(){
    System.out.println("Qiubo");
    }

    public void Saludo2 (String texto) {
    System.out.println("Hola" + texto);

    }

    public String Salu4 (){
    return "Que tranza Banda";

    }


    public String Salu5 (String Extra){
    return "Hola123556";

    }

    public static void main(String[] args) {
    
    Prueba Vijay = new Prueba();
    Prueba Vijay2 = new Prueba();

    Vijay.Saludo();
    Vijay2.Saludo2("World");

    String Salu4I = Vijay.Salu4();

    System.out.println(Salu4I);


    String Extra1 = Vijay2.Salu5("123");

    System.out.println(Extra1);

    }
    
}