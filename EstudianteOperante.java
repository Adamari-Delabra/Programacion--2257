/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author Administrador
 */
public class EstudianteOperante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a=new Alumno("318187656","ICO", 2, "Luis", 19, 1,1.78f );
        
        System.out.println("Nombre:"+ a.getNombre());
        System.out.println("Edad:"+ a.getEdad());
        System.out.println("Genero:"+a.getGenero());
        System.out.println("Altura:"+a.getAltura());
        System.out.println("NumeroDeCuenta:"+a.getNumeroCuenta());
        System.out.println("Carrera:"+a.getCarrera());
        System.out.println("Semestre:"+a.getSemestre());
        
    }
    
}
