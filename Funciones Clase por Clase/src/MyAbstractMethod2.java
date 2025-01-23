/* 

¿Por qué se usa?

Se utiliza para definir un contrato en una clase abstracta que las clases hijas deben cumplir. Es útil para estructurar el diseño de tu programa.
Aquí, goodbye es un método abstracto, lo que significa que no tiene cuerpo en la clase Despedida. La clase MiDespedida debe implementar este método.
*/

public class MyAbstractMethod2 extends AbstractMethod1{

    @Override
    public void Saludo(){

    System.out.println("Hola desde Abstract Method");
    }


    public static double Adivision (double x, double j){
    return x/j;

    }

}
