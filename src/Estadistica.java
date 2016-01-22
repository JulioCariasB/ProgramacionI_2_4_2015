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
public class Estadistica {
    private double numeros[];
    
    public Estadistica(int max){
        numeros = new double[max];
    }
    
    
    /*
    Función: LlenarArreglo
    No retorna nada. No recibe de parametro.
    Simplemente llena Random todas las posiciones del teclado.
    */
    
    public void llenar(){
        Random rb = new Random();
        for(int p=0; p < numeros.length; p++){
            numeros[p] = rb.nextInt(15)+1;
        }
    }
}
