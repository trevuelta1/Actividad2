/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author usuario
 */
public class Cuenta {
    private float balance;
    public Cuenta(){
        this.balance = 50;
    }
    public float getBalance(){
        return this.balance;
    }
    public void sacarDinero(float dinero) throws Exception{
        if(this.balance - dinero < -500){
            throw new Exception("No se puede sacar más dinero.");
        } else if(dinero <= 0){
            throw new Exception("Introduzca una cantidad válida de dinero.");
        } else{
            this.balance = this.balance - dinero;
        }
    }
    public void meterDinero(float dinero) throws Exception{
        if(dinero <= 0){
            throw new Exception("Introduzca una cantidad válida de dinero.");
        } else{
            this.balance = this.balance + dinero;
        }
    }
}
