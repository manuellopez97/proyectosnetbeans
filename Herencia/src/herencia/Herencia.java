/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author 34608
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("------GATO------");
        Gato gordo=new Gato();
        gordo.Comer();
        gordo.Dormir();
        gordo.Reproducir();
        gordo.hacerRuido();
        
        System.out.println("\n-------CREAMOS UN OSO DE TIPO PERRO--------");
        Animal oso=new Perro();
        
        oso.Comer();
        oso.Dormir();
        oso.Reproducir();
        
        
        System.out.println("\n-------Creamos a Toby--------");
        Perro toby=new Perro();
        toby.Comer();
        toby.Dormir();
        toby.Ladrar();
        toby.Reproducir();
        
        Gato gato=new Gato();
        Perro nube=new Perro();
        
        System.out.println("\n-------CREAMOS UN OSO TIPO GATO--------");
        oso=gato;
        oso.Comer();
        oso.Dormir();
        oso.Reproducir();
        ((Gato)oso).hacerRuido();
        
        System.out.println("\n------CREAMOS A NUBE COMO PERRO------");
        nube.Reproducir();
        nube.Dormir();
        nube.Comer();
        nube.Ladrar();
        
        oso=nube;
        ((Perro)oso).Ladrar();
        oso.Dormir();
        
        
    }
    
}
