package SistemaEventos;

/* Librearias a utilizar. */
import dominio.Jugador;
import dominio.Partida;

/**
 * Esta clase tiene como finalidad de preparar el evento crear partida.
 *
 * @author Equipo 5
 */
public class CrearPartidaEvent extends Event {

    /* Variables utilizados en el evento crear partida. */
    private Jugador jugadorActual;
    private Partida partida;

    /* Constructor vacio. */
    public CrearPartidaEvent() {
    }

    /* Conjunto de sets y gests utilizados en el evento crear partida. */
    public CrearPartidaEvent(Jugador jugadorActual, Partida partida) {
        this.jugadorActual = jugadorActual;
        this.partida = partida;
    }

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
