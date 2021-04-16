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
public class Perro extends Mamifero {
   
        @Override
        public void Dormir() {
            System.out.println("Duerme como un perro...");
            
    }
        public void Ladrar(){
            System.out.println("Woof Woof...");
    
    }
        
}
