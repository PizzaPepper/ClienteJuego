package SistemaEventos;

/* Librearias a utilizar. */
import dominio.Jugador;
import dominio.Partida;

/**
 * Esta clase tiene como finalidad de preparar el evento abandonar partida.
 *
 * @author Equipo 5
 */
public class AbandonarPartidaEvent extends Event {

    /* Variables utilizados en el evento abandonar partida. */
    private Jugador jugadorActual;
    private Partida partida;

    /* Constructor vacio. */
    public AbandonarPartidaEvent() {
    }

    /* Conjunto de sets y gests utilizados en el evento abandonar partida. */
    public AbandonarPartidaEvent(Jugador jugadorActual, Partida partida) {
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
