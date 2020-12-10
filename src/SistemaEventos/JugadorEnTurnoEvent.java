package SistemaEventos;

/* Librearias a utilizar. */
import dominio.Apuesta;
import dominio.Jugador;
import dominio.Movimiento;

/**
 * Esta clase tiene como finalidad de preparar el evento de jugador en turno.
 *
 * @author Equipo 5
 */
public class JugadorEnTurnoEvent extends Event {

    /* Variables utilizados en el evento de jugador en turno. */
    private Jugador jugadores[];
    private Apuesta apuesta;
    private Movimiento movimiento;

    /* Constructor vacio.*/
    public JugadorEnTurnoEvent() {
    }

    /* Constructor que inicializa las variables del evento jugador en turno.*/
    public JugadorEnTurnoEvent(Jugador[] jugadores, Apuesta apuesta, Movimiento movimiento) {
        this.jugadores = jugadores;
        this.apuesta = apuesta;
        this.movimiento = movimiento;
    }

    /* Conjunto de sets y gests utilizados en el evento de jugador en turno. */
    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
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
