package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
        assert verificarMascotaExistente(mascota.getId()) == false;
        mascotas.add(mascota);
    }


    /**
     * Metodo para verificar id repetidos
     * @param id
     * @return
     */

    private boolean verificarMascotaExistente(String id){
        boolean existe = false;
        for(Mascota mascota : mascotas){
            if(mascota.getId().equals(id)){
                existe = true;
            }
        }
        return existe;
    }

    /**
     * Metodo para agregar las mascotas con edades mayores a 10
     * @param mascota
     */

     public boolean getMascotaMayor10(Mascota mascota) {
        return mascota.getEdad() > 10;
    }
    

    /**
     * Metodo para obtener el nombre de la Veterinaria
     */


    public String getNombre(){
        return nombre;
    }

        public Collection<Mascota> getMascotasOrdenadas(){
        Collection<Mascota> listaOrdenada = null;

        //objeto que se encarga de comparar por los nombres
        Comparator.comparing(Mascota :: getNombre);
        listaOrdenada = mascotas.stream().sorted(Comparator.comparing(Mascota :: getNombre)).toList();


        return Collections.unmodifiableCollection(listaOrdenada);
    }
    

    public Collection<Mascota> getEdadMascotasOrdenadasDescendente(){
        Collection<Mascota> listaOrdenada = null;

        //objeto que se encarga de comparar por los nombres
        Comparator.comparing(Mascota :: getEdad);
        listaOrdenada = mascotas.stream().sorted(Comparator.comparing(Mascota :: getEdad).reversed()).toList();


        return Collections.unmodifiableCollection(listaOrdenada);
    }


    public Collection<Mascota>obtenerListaMascotasMayore(){
        Collection<Mascota> listaMayoresEdad = new LinkedList<>();

        for (Mascota mascota : this.mascotas){
            if (mascota.getEdad()> 10){

            }
        }
        
        return Collections.unmodifiableCollection(listaMayoresEdad);
    }



        /**
         * Metodo para obtener la lista de mascotas
         * @return
         */
    public Collection<Mascota> getMascota() {
        return mascotas;
    }


}


