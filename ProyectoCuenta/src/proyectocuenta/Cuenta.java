/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocuenta;

/**
 *
 * @author 34608
 */
public class Cuenta {
    private String titular;
    private double saldo;
    private static double beneficio;
    
    public Cuenta ( String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
            
}
