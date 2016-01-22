/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class Alumno {
    public int Numero_Cuenta;
    public String Nombre, Apellido;
    public double NotaAcum, NotaExamen, Promedio;
    public Clase Asignatura;
   
    //Crear Constructor
    public Alumno(int NC, String Nom, String Apell){
        Numero_Cuenta = NC;
        Nombre = Nom;
        Apellido = Apell;
        //Asignatura = Asig;
        NotaAcum = 40;
        Asignatura = new Clase();
    }

    public Alumno(){
        Numero_Cuenta = 21521004;
        Nombre = "Rachell";
        Apellido = "Valle";
        Asignatura = new Clase();
               
    }
    
    
    
}
