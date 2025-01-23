/* Las Clases no pueden ser Staticas, solo los metodos
 
¿Qué es static?

static indica que el miembro (método o variable) está asociado con la clase en sí, no con las instancias (objetos) de esa clase.
Los miembros static se comparten entre todas las instancias de la clase.

Reglas Importantes sobre static
a) Métodos static no pueden acceder directamente a miembros no estáticos
Por qué:

Los miembros no estáticos pertenecen a una instancia específica de la clase. Como los métodos static no están ligados a una instancia, no pueden acceder directamente a ellos.
Solución:

Si necesitas acceder a un miembro no estático desde un método static, primero debes crear una instancia de la clase.
 

Uso común:
Almacenar valores que deben ser compartidos, como un contador global, una configuración, o una constante.
 
 */

public class StaticClass {

    public static int numerostatic = 0;
    public int NumeroNormal = 0;
    public void incrementar (){

        numerostatic++;
        NumeroNormal++;
    }

    public class operacion {
        public static int sumar(int a, int b) {
            return a + b;
        }
    }

    }

    /* Explicación:
    
    numeroStatic pertenece a la clase, por lo que su valor se comparte entre todos los objetos.
    numeroNormal pertenece a cada objeto, por lo que cada instancia tiene su propia copia de esta variable.
    
    */