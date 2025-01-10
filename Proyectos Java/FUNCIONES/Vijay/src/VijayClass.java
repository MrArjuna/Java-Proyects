
public class VijayClass {

    //1 Función básica sin parámetros:
    public void hello() {
        System.out.println("¡Hi, Java!");
    }
    //2 Función básica con parámetros:  
    public void hola(String java) {
        System.out.println("¡Hola, " + java);
    }
    //3 Función básica sin parámetro y retorno:  
    public String konnichiwa() {
        return "こんにちは, Java";
    }
    //4 Función básica con parámetro y retorno:  
    public String bonjour(String java) {
        return "Bonjour, " + java;
    }
    // 5 Método static - Permite invocar funcionalidad sin crear objetos:
    public class operacion {
        public static int sumar(int a, int b) {
            return a + b;
    
        }
    }
    // 6 Método abstracto - Se declaran en una clase abstracta.
    //Su propósito es definir un "contrato" que las clases hijas deben cumplir.
    public abstract class despedida {
        public abstract void goodbye();
    }
    
    public class MiDespedida extends despedida {
        @Override
        public void goodbye() {
            System.out.println("Goodbye, Java!");
        }
    }
    
    public static void main(String[] args) {
        VijayClass Vijay = new VijayClass();


        //1 /  
        Vijay.hello();
        //2 /  
        Vijay.hola("Mundo");
        //3 /  
        String saludo = Vijay.konnichiwa();
        System.out.println(saludo);
        //4
        String SaludoFrances = Vijay.bonjour("");
        System.out.println(SaludoFrances + "!");
        //5
        int IniciaOperador = operacion.sumar(6, 7);
        System.out.println(IniciaOperador);
        //6
        despedida MiDespedida = Vijay.new MiDespedida();
        MiDespedida.goodbye();
    }    

}

/* 
https://chatgpt.com/share/67818f54-8f58-800e-bfa1-084ab347f46b

void
¿Qué significa?

void indica que el método no devuelve ningún valor. Es decir, realiza una acción pero no produce un resultado que pueda ser utilizado o almacenado.
¿Por qué se usa?

Se usa cuando el método ejecuta algo (como imprimir en pantalla o modificar un estado) pero no necesitas que te regrese un valor.
Ejemplo:

java
Copiar código
public void imprimirMensaje() {
    System.out.println("Hola, Java!");
}
Aquí, el método imprimirMensaje no devuelve nada. Solo imprime un mensaje en la consola. 

*********************************************************************************************************
String (o cualquier tipo de dato como int, boolean, etc.)
¿Qué significa?

Indica el tipo de dato que el método devuelve. En este caso, String significa que el método regresa un texto (una cadena de caracteres).
¿Por qué se usa?

Se usa cuando necesitas que el método realice una operación y te devuelva un resultado que puedas usar después.
Ejemplo:

java
Copiar código
public String obtenerSaludo() {
    return "¡Hola, Java!";
}
Aquí, el método obtenerSaludo devuelve un valor de tipo String, que puedes guardar o utilizar en otra parte de tu código:
java
Copiar código
String saludo = obtenerSaludo();
System.out.println(saludo); // Salida: ¡Hola, Java!

*********************************************************************************************************

Abstract
¿Qué significa?

Indica que el método es abstracto, lo que significa que no tiene implementación (cuerpo). Solo declara su existencia, y las clases que hereden de esta deben implementarlo obligatoriamente.
¿Por qué se usa?

Se utiliza para definir un contrato en una clase abstracta que las clases hijas deben cumplir. Es útil para estructurar el diseño de tu programa.
Ejemplo:

java
Copiar código
public abstract class Despedida {
    public abstract void goodbye(); // Método abstracto
}

public class MiDespedida extends Despedida {
    @Override
    public void goodbye() {
        System.out.println("Goodbye, Java!");
    }
}
Aquí, goodbye es un método abstracto, lo que significa que no tiene cuerpo en la clase Despedida. La clase MiDespedida debe implementar este método.

*********************************************************************************************************
Main
¿Qué significa?

main no es un tipo de dato, sino el punto de entrada del programa. Es el método que la JVM (Java Virtual Machine) ejecuta cuando inicias tu programa.
¿Por qué se usa?

Todo programa Java necesita un método main para ejecutarse. Sin él, el programa no sabrá por dónde empezar.
Sintaxis:

java
Copiar código
public static void main(String[] args) {
    System.out.println("¡Hola, Mundo!");
}

*********************************************************************************************************
¿Qué es Static?

static indica que el miembro (método o variable) está asociado con la clase en sí, no con las instancias (objetos) de esa clase.
Los miembros static se comparten entre todas las instancias de la clase.
Ejemplo Conceptual:

java
Copiar código
public class Ejemplo {
    public static int numeroStatic = 0; // Variable estática
    public int numeroNormal = 0;       // Variable no estática

    public void incrementar() {
        numeroStatic++;
        numeroNormal++;
    }
}

public class Main {
    public static void main(String[] args) {
        Ejemplo obj1 = new Ejemplo();
        Ejemplo obj2 = new Ejemplo();

        obj1.incrementar();
        obj2.incrementar();

        System.out.println("numeroStatic: " + Ejemplo.numeroStatic); // Salida: 2
        System.out.println("obj1.numeroNormal: " + obj1.numeroNormal); // Salida: 1
        System.out.println("obj2.numeroNormal: " + obj2.numeroNormal); // Salida: 1
    }
}
Explicación:

numeroStatic pertenece a la clase, por lo que su valor se comparte entre todos los objetos.
numeroNormal pertenece a cada objeto, por lo que cada instancia tiene su propia copia de esta variable.

Uso común:
Almacenar valores que deben ser compartidos, como un contador global, una configuración, o una constante.


Reglas Importantes sobre static
a) Métodos static no pueden acceder directamente a miembros no estáticos
Por qué:

Los miembros no estáticos pertenecen a una instancia específica de la clase. Como los métodos static no están ligados a una instancia, no pueden acceder directamente a ellos.
Solución:

Si necesitas acceder a un miembro no estático desde un método static, primero debes crear una instancia de la clase.
Ejemplo Incorrecto:

java
Copiar código
public class Ejemplo {
    public int numero = 5;

    public static void mostrar() {
        System.out.println(numero); // Error: No se puede acceder a un miembro no estático desde un contexto estático
    }
}
Ejemplo Correcto:

java
Copiar código
public class Ejemplo {
    public int numero = 5;

    public static void mostrar() {
        Ejemplo obj = new Ejemplo(); // Crear una instancia
        System.out.println(obj.numero); // Ahora se puede acceder
    }
}

*/