package clase04;

import java.util.ArrayList;

public class Profesor extends Persona{
    ArrayList<Alumno> listaDeAlumnos;

    public Profesor(ArrayList<Alumno> listaDeAlumnos, String nombre, String apellido){
        this.listaDeAlumnos = listaDeAlumnos;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public ArrayList<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }

    public void setListaDeAlumnos(ArrayList<Alumno> listaDeAlumnos) {
        this.listaDeAlumnos = listaDeAlumnos;
    }
}
