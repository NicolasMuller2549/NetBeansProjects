/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author Oscar
 */
public class Meses {
    String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio",
                      "agosto","septiembre","octubre","noviembre","diciembre"};
    Random random = new Random();
    String mesSecreto = meses[random.nextInt(12)];

    public String getMesSecreto() {
        return mesSecreto;
    }
    
    
}
