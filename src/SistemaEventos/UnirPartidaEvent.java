/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaEventos;

import dominio.Jugador;
import dominio.Partida;

/**
 *
 * @author Citlali Orduño
 */
public class UnirPartidaEvent extends Event{
    
    private Jugador jugadorActual;
    private Partida partida;

    public UnirPartidaEvent(Jugador jugadorActual, Partida partida) {
        this.jugadorActual = jugadorActual;
        this.partida = partida;
    }

    public UnirPartidaEvent() {
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


