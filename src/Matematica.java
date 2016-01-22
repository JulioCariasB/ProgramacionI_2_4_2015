/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Julio
 */
public class Matematica {
    //mundo exterior
    public static void main(String[] args){
        Random rd = new Random();

    //Declarar e instanciar un Objeto de pow
        int base = rd.nextInt(9)+1;
        int expo = rd.nextInt(9)+1;
        Pow pow = new Pow(2,4);
    
         //Imprimir los 3 valores
        System.out.print(pow.base+"^"+pow.exponente+"="+pow.potencia);
        
        //Declarar e instanciar un objeto Factorial
        //Impriman el numero con su factorial
        int num = rd.nextInt(9)+1;
        Factorial fact = new Factorial(num);
        
        
    }
}
