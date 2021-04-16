/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Manuel Lopez
 */
public class Gato extends Animal {
    
    @Override
    public void Comer(){
        System.out.println("El gato está comiendo pescado...");
    }
    
    public void hacerRuido(){
        System.out.println("Grrr...");
    }
}
