package poo5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EIMV
 */
public class Profesor {
    private String nombre,apellido,especialidad;
    private int edad;
    private List<String> cursos;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String especialidad,int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.edad= edad;
        this.cursos= new ArrayList<>();
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    } 
    
    public String obtenerEspecialidad(){
        return especialidad;
    }
    
    public int obtenerEdad(){
        return edad;
    } 
    
    public List<String> obtenerCursos(){
        return cursos;
    }
    
    public void agregarCurso(String curso){
        cursos.add(curso);
    }
    
    @Override
    public String toString() {
        return "Profesor{" + "Nombre:" + nombre + ", Apellido:"
                + "" + apellido + "Edad:" + edad +", Especialidad: " 
                + especialidad + ", Cursos:" + cursos + '}';
    }
    
}
