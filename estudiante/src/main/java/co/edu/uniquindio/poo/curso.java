package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;

public class curso {
    private final String nombre;
    private final Collection<Estudiante> listaEstudiantes;

    public curso(String nombre){
        this.nombre = nombre;
        this.listaEstudiantes = new LinkedList<Estudiante>();

    }

   // public void setNombre (String nombre){

     //   this.nombre = nombre;
    //}

    public String getNombre(){

        return nombre;
    }

    public Collection<Estudiante> getListaEstudiantes(){
        return Collections.unmodifiableCollection(listaEstudiantes);


    }
    public void registrarEstudiante(Estudiante estudiante){
        assert verificarNumeroIdentificacion(estudiante.numeroIdentificion()) == false: "Ya existe"+ estudiante.numeroIdentificion();
        listaEstudiantes.add(estudiante);

    }

    private boolean verificarNumeroIdentificacion(String numeroIdentificacion){


        boolean existeEstudiante = false;
        for(Estudiante estudiante : listaEstudiantes){
            if(estudiante.numeroIdentificacion().equals(numeroIdentificacion)){
                existeEstudiante = true;
            }
        }
        return existeEstudiante;
    }




}
