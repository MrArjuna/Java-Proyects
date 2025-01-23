/*void
¿Qué significa?

void indica que el método no devuelve ningún valor. Es decir, realiza una acción pero no produce un resultado que pueda ser utilizado o almacenado.
¿Por qué se usa?

Se usa cuando el método ejecuta algo (como imprimir en pantalla o modificar un estado) pero no necesitas que te regrese un valor.

Aquí, el método imprimirMensaje no devuelve nada. Solo imprime un mensaje en la consola.
*/


public class VoidConParametros {

    public void Despedida(String Extra) {
        System.out.println("Ejercicio 2: Te llamo desde VoidConParametros" + Extra);
    }
}
