/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import servicios.service;

/**
 *
 * @author nico muller
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        service ahorcadoService = new service();
        ahorcadoService.jugar();
    } // TODO code application logic here
    }
    

