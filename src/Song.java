/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class Song {
    
    //1- Atributos
    
    public int Codigo;
    public String Nombre;
    public double Precio;
    private int SumaEstrellas, CantidadReviews;
            
    //2- Constructor
    public Song(int Cod, String Nom, double Prec){
         Codigo = Cod;
         Nombre = Nom;
         Precio = Prec;
         SumaEstrellas = 0;
         CantidadReviews = 0;
         
    }
    
    //3- Funciones
    public int getCodigo(){
        return Codigo;
    }
    
    public double getPrecio(){
        return Precio;
    }
    
    public int addStars(int stars){
        int Estrellas = SumaEstrellas;
        
        if(stars>=0 && stars<=5){
            SumaEstrellas += stars;
            CantidadReviews++;
        }   
        return 0;
    }
    
    public int songRating(){
        int Rating = SumaEstrellas / CantidadReviews;
        return Rating;
    }
    
    public void print(){
        System.out.println("Codigo: "+Codigo+"-"+Nombre+"-Lps."+
                Precio+"-"+songRating());
       
    }
}



