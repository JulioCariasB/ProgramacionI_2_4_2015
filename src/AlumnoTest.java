
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class AlumnoTest {
    public static void main(String[] args) {
         Scanner jc = new Scanner(System.in);
         Alumno al1 = new Alumno(21521004,"Julio", "Carias");
         Alumno al2 = new Alumno();
         
         al1.Asignatura.Nombre_Asig = "Español";
         al2.Asignatura.Nombre_Asig = "Historia";
         al1.Asignatura.Hora = 7;
         
        System.out.println("Numero De Cuenta: "+al1.Numero_Cuenta);
        System.out.println("Nombre Completo: "+al1.Nombre+"-"+al1.Apellido);
        System.out.println("Asignatura: "+al1.Asignatura.Nombre_Asig);
        System.out.println("Hora: "+al1.Asignatura.Hora);
        System.out.println("Numero De Cuenta: "+al2.Numero_Cuenta);
        System.out.println("Nombre Completo: "+al2.Nombre+"-"+al2.Apellido);
        
       
    }
}
