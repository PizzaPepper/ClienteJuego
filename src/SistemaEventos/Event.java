package SistemaEventos;

/* Librearias a utilizar. */
import java.io.Serializable;

/**
 * Esta clase prepara los eventos, implementa la clase serializable la cual
 * serializar un objeto.
 *
 * @author Equipo 5
 */
public class Event implements Serializable {

    /* Constructor vacio.*/
    public Event() {
    }

    /* Metodo para obtener el tipo de clase. */
    public Class getType() {
        return getClass();
    }

}
