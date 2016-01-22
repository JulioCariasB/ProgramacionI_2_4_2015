/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class Pow {
    /*
    3 atributos enteros: la base, exponente y potencia.
    
    */
    public int base, exponente, potencia; 
    //Constructor
    //FORMATO: public NombreDeClase(parametros){}
    
    /**
     * Constructor de Pow
     * @param bas Base
     * @param exp Exponente
     */
    
    public Pow(int bas,int exp){
        //Codificar aca instrucciones iniciales al momento de crear el objeto.
        
        //Asignarle valores constantes a base y exponente
        base = bas;
        exponente = exp;
        
        //Utilizar Math.pow para asignarle valor a potencia
        potencia = (int)Math.pow(base, exponente);
    }
    
    public static void main(String[] args){
        //Declarar e instanciar un Objeto de pow
        Pow pow = new Pow(2,4);
        
         //Imprimir los 3 valores
        System.out.print(pow.base+"^"+pow.exponente+"="+pow.potencia);
        
        
        
        
    }
}
