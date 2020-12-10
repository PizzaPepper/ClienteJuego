/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaEventos;

import dominio.Apuesta;
import dominio.Jugador;
import dominio.Movimiento;

/**
 *
 * @author Citlali Orduño
 */
public class EjecutarLanzadaEvent extends Event{
    
    private Jugador jugadorActual;
    private Apuesta apuesta;
    private Movimiento movimiento;

    public EjecutarLanzadaEvent() {
    }

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
