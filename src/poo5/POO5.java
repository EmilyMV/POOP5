package poo5;

import java.util.List;

/**
 * @author poo08alu32
 */
public class POO5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno =new Alumno();
        alumno.setNombre("Alicia");
        alumno.setApellido("Ramirez");
        alumno.setCarrera("Biología");
        alumno.setEscuela("Facultad de Ciencias");
        Fecha fecha=new Fecha(23,04,2004);
        Alumno alumno2=new Alumno("Ofelia","Perez","Contaduria",
                "FES ACATLAN",4,fecha);
        String var=alumno.toString();
        System.out.println(var);
        System.out.println(alumno.toString());
        System.out.println(alumno2);
        
        Profesor profesor = new Profesor("Abraham","Cortes","Computacion",28);
        profesor.agregarCurso("Calculo");
        profesor.agregarCurso("Algebra");
        String nombre = profesor.obtenerNombre();
        String apellido = profesor.obtenerApellido();
        String espe = profesor.obtenerEspecialidad();
        List<String> cursos = profesor.obtenerCursos();
        int edad = profesor.obtenerEdad();
        System.out.println(profesor.toString());
        System.out.println("Nombre del Profesor: "+nombre+" "+apellido
                +"\n"+"Especialidad: "+espe+"\n"+"Edad: "+edad+"\n"+"Cursos: "+cursos);
        
        
        Coche coche = new Coche("Nissan","Versa","Azul","1.6L","Gasolina");
        System.out.println(coche.toString());
        coche.avanzar();
        coche.retroceder();
    }
    
}
