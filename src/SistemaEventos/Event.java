/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaEventos;

import java.io.Serializable;

/**
 *
 * @author Citlali Orduño
 */
public class Event implements Serializable{

    public Event() {
    }
    
    public Class getType(){
        return getClass();
    }
    
}
