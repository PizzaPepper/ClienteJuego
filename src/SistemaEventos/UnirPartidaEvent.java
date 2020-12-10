package SistemaEventos;

/* Librearias a utilizar. */
import dominio.Jugador;
import dominio.Partida;

/**
 * Esta clase tiene como finalidad de preparar el evento de unir partida.
 *
 * @author Equipo 5
 */
public class UnirPartidaEvent extends Event {

    /* Variables utilizados en el evento unir partida. */
    private Jugador jugadorActual;
    private Partida partida;

    /* Constructor que inicializa las variables del evento unir partida.*/
    public UnirPartidaEvent(Jugador jugadorActual, Partida partida) {
        this.jugadorActual = jugadorActual;
        this.partida = partida;
    }

    /* Constructor vacio. */
    public UnirPartidaEvent() {
    }
 
    /* Conjunto de sets y gests utilizados en el evento unir partida. */
    public Jugador getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(Jugador jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

}
