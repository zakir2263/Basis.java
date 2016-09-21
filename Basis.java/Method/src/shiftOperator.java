/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zakir
 */
public class shiftOperator {
    public static void main(String[] args) {
        int fnumber=16;//10000
        int snumber =fnumber<<2;//1000000
        System.out.println("The result of << operation "+snumber);
        snumber=fnumber>>2;//100
        System.out.println("The result of >> operation "+snumber);
        snumber=fnumber>>>2;
        System.out.println("The result of >>> opertion "+Integer.toBinaryString(snumber));
         int thirdnumber=-32;
         snumber=thirdnumber>>2;
         System.out.println("The result of >> operation is "+snumber);
        
        
    }
    
}
