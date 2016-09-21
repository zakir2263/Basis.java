/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zakir
 */
public class Complex {
    public static void main(String[] args) {
        
    }
    private double real,imaginari;
    
    public Complex (double r,double i){
        real=r;imaginari=i;
    }
    public Complex add(Complex c){
        return new Complex(real+c.real,imaginari +c.imaginari);
    }
            
    
}
