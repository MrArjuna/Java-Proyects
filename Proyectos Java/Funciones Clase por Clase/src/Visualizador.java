/*Main
¿Qué significa?
Main no es un tipo de dato, sino el punto de entrada del programa. Es el método que la JVM (Java Virtual Machine) ejecuta cuando inicias tu programa.

¿Por qué se usa?
Todo programa Java necesita un método main para ejecutarse. Sin él, el programa no sabrá por dónde empezar.

*/
public class Visualizador {
    public static void main(String[] args) throws Exception {


        // 1. Funcion Void Sin Parametros

        VoidSinParametros Hola = new VoidSinParametros();
        Hola.Hello();
    

        //2. Funcion Void Con Parametros
        VoidConParametros Adios = new VoidConParametros();
        Adios.Despedida("... Confirmo ! ");

        //3. Función sin parámetro y retorno
        VoidSinParametrosConRetorno HolaRetorno = new VoidSinParametrosConRetorno();
        String HolaV = HolaRetorno.HolaConRetorno();
        System.out.println(HolaV);

        //4. Función con parámetros y retorno

        VoidConParametrosConRetorno AdiosRetorno = new VoidConParametrosConRetorno();
        String AdiosV = AdiosRetorno.AdiosRMetodo("VoidConParametrosConRetorno");
        System.out.println(AdiosV);

        // 5 Método static - Permite invocar funcionalidad sin crear objetos
        //Creacion de Objeto 
        //Clase + Nombre del Objeto + new + Nombre de la clase de nuevo + () +;
        StaticClass Obj1 = new StaticClass();
        StaticClass Objeto2 = new StaticClass();

        Obj1.incrementar();
        Objeto2.incrementar();

        System.out.println( "Ejercicio 5: " + StaticClass.numerostatic);
        System.out.println( "Ejercicio 5: " + Objeto2.NumeroNormal);

        // 5.1 Método static - Permite invocar funcionalidad sin crear objetos

        int Suma = StaticClass.operacion.sumar(5, 6);

        System.out.println("Ejercicio 5.1: " + Suma);
        
       
         // 6 Método abstracto - Se declaran en una clase abstracta.
        //Creacion de Objeto 
        //Clase + Nombre del Objeto + new + Nombre de la clase de nuevo + () +;
        
        MyAbstractMethod2 AbstractObject = new MyAbstractMethod2();

        AbstractObject.Saludo();

        double Odivision = MyAbstractMethod2.Adivision(50,20);

        System.out.println(Odivision);

     

      //Variable Global y Local

      VariableGlobal ObjGlobal = new VariableGlobal();

      ObjGlobal.VarGlobal(" Desde Obj Global");
       



    }
      
}
