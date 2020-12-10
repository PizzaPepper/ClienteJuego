/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaCliente;

import SistemaEventos.Event;
import java.io.IOException;
import java.net.Socket;
import Serializador.SerializadorObjetos;
import java.io.DataOutput;
import java.io.DataOutputStream;

/**
 *
 * @author Citlali Orduño
 */
public class Cliente {

    private Socket cliente;

    public void enviar(Event evento) throws IOException {

        this.cliente = new Socket("localhost", 3312);

        SerializadorObjetos<Event> SEvents = new SerializadorObjetos<Event>();
        byte[] objetoS = SEvents.escribirObjeto(evento);

        try {
            DataOutput salidaServidor = new DataOutputStream(cliente.getOutputStream());
            salidaServidor.write(objetoS);
            cliente.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}