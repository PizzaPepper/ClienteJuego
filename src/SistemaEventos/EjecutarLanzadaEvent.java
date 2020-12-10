package SistemaEventos;

/* Librearias a utilizar. */
import dominio.Apuesta;
import dominio.Jugador;
import dominio.Movimiento;

/**
 * Esta clase tiene como finalidad de preparar el evento de ejecutar lanzada.
 *
 * @author Equipo 5
 */
public class EjecutarLanzadaEvent extends Event {

    /* Variables utilizados en el evento ejecutar lanzada. */
    private Jugador jugadorActual;
    private Apuesta apuesta;
    private Movimiento movimiento;

    /* Constructor vacio. */
    public EjecutarLanzadaEvent() {
    }

    /* Conjunto de sets y gests utilizados en el evento ejecutar lanzada. */
    public EjecutarLanzadaEvent(Jugador jugadorActual, Apuesta apuesta, Movimiento movimiento) {
        this.jugadorActual = jugadorActual;
        this.apuesta = apuesta;
        this.movimiento = movimiento;
    }

    public Jugador getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(Jugador jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    public Apuesta getApuesta() {
        return apuesta;
    }

    public void setApuesta(Apuesta apuesta) {
        this.apuesta = apuesta;
    }

    public Movimiento getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

}
