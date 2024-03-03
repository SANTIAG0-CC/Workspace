package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Veterinaria {

    private String nombre; 
    private Collection <Mascota> mascotas;

    /**
     * Constructor clase Veterinaria
     * @param nombre
     */


    public Veterinaria(String nombre){
        assert nombre != null;
        mascotas = new LinkedList<>();
        this.nombre = nombre;

    
    }
    /**
     * Metodo para agregar mascotas
     */

    public void agregarMascota( Mascota mascota){
        assert verificarMascotaExistente(mascota.id()) == false;
        mascotas.add(mascota);
    }


    /**
     * Metodo para verificar id repetidos
     * @param id
     * @return
     */

    private boolean verificarMascotaExistente(String id){
        boolean existe = false;
        for(Mascota mascota1 : mascotas){
            if(mascota1.id().equals(id)){
                existe = true;
            }
        }
        return existe;
    }

    /**
     * Metodo para agregar las mascotas con edades mayores a 10
     * @param mascota
     */

    public void agregarMascotaMayor10(Mascota mascota) {
        if (mascota.getEdad() > 10) {
            agregarMascota(mascota);
        }
    }

    /**
     * Metodo para obtener el nombre de la Veterinaria
     */


    public String getNombre(){
        return nombre;
    }


        /**
         * Metodo para obtener la lista de mascotas
         * @return
         */
    public Collection<Mascota> getMascota() {
        return mascotas;
    }


}


