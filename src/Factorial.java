/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class Factorial {
    /*
    2 atributos enteros: numero, factorial
    */
    
    public int numero, facto = 1;
    
    /*
    1) el constructor va recibir 1 parametro entero para asignarlo a numero
    2) Calculo el factorial de ese numero y lo guardo en factorial.
    */
    
    public Factorial(int n){
         numero = n;
         for(int x=1; x <= numero; x++){
             facto *= x;
         }
    }
} 
