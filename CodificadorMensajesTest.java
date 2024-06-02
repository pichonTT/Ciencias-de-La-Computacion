import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CodificadorMensajesTest.
 *
 * @author  Nahuel Galeano
 * @version v0.1
 */
public class CodificadorMensajesTest
{
    /***
     * Comprueba que el mensaje en la linea 0 no sea un mensaje vacio.
     * Ya que al codificar el mensaje con el Codigo 0 nos retorna el mismo mensaje.
    */
    @Test
    public void stringPosCeroVacio() {
        Mensaje msg = new Mensaje();
        msg.agregarLinea(0, "");
        CodificadorMensajes codificador = new CodificadorMensajes(msg);
        IllegalArgumentException thrown = assertThrows(
           IllegalArgumentException.class,
           () -> codificador.codificarMensaje(),
           "Se espera que se lance excepción IllegalArgumentException");
    }
}
