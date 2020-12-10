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
public class JugadorEnTurnoEvent extends Event {
    
    private Jugador jugadores[];
    private Apuesta apuesta;
    private Movimiento movimiento;

    public JugadorEnTurnoEvent() {
    }

    public JugadorEnTurnoEvent(Jugador[] jugadores, Apuesta apuesta, Movimiento movimiento) {
        this.jugadores = jugadores;
        this.apuesta = apuesta;
        this.movimiento = movimiento;
    }

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
