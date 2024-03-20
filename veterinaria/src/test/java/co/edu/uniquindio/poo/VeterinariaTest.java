/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /*
     * Prueba para validar a la mascota
     */
    @Test
    public void datosCompletosVeterianria() {
        LOG.info("Inicio test datosCompletosVeterinaria");
        Veterinaria veterinaria = new Veterinaria("Amigos peludos");
        assertEquals("Amigos peludos", veterinaria.getNombre());
        LOG.info("Fin test datosCompletosVeterinaria");
    }

    @Test
    public void datosNulosVeterianria() {
        LOG.info("Inicio test datosNulosVeterianria");
        assertThrows(Throwable.class, () -> new Veterinaria(null));
        LOG.info("Fin test datosNulosVeterianria");
    }

    @Test
    public void registrarMascota() {
        LOG.info("Inicio test registrarMascota ");
        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
        Mascota mascota = new Mascota("2", "Boby", "Canis familiaris", "Beagle", 3, "macho", "Gris", 8.4f);

        veterinaria.agregarMascota(mascota);
        assertTrue(veterinaria.getMascota().contains(mascota));

        LOG.info("Fin test registrarMascota ");

    }

    @Test
    public void MascotaRepetida() {
        LOG.info("Inicio test MascotaRepetida ");
        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
        Mascota mascota1 = new Mascota("2", "Boby", "Canis familiaris", "Beagle", 3, "macho", "Gris", 8.4f);
        Mascota mascota2 = new Mascota("2", "Boby", "Canis familiaris", "Beagle", 3, "macho", "Gris", 8.4f);

        veterinaria.agregarMascota(mascota1);
        assertThrows(Throwable.class, ()-> veterinaria.agregarMascota(mascota2));
       // assertEquals(1, mascota1.Mascota.size());
        LOG.info("Fin test MascotaRepetida ");

    }

    @Test
    public void verificarMascotaSinRepetir() {
        LOG.info("Inicio test verificarIdMascota");
        Veterinaria veterinaria = new Veterinaria("Amigos peludos");
        Mascota mascota1 = new Mascota("1", "Luna", "Canis familiaris", "Labrador", 11, "Hembra", "Negro", 15f);
        Mascota mascota2 = new Mascota("1", "Rocky", "Canis familiaris", "Labrador", 7, "Macho", "Marrón", 7.8f);

        veterinaria.agregarMascota(mascota1);

        assertThrows(Throwable.class, ()-> veterinaria.agregarMascota(mascota2));

        LOG.info("Fin test verificarIdMascota");
    }

    @Test
    public void verificarEdadMascotaMayorQueDiez() {
        LOG.info("Inicio test verificarEdadMascotaMayorQueDiez");
        Veterinaria veterinaria = new Veterinaria("Amigos peludos");
        Mascota mascota1 = new Mascota("1", "Luna", "Canis familiaris", "Labrador", 12, "Hembra", "Negro", 15f);

        boolean resultado = veterinaria.getMascotaMayor10(mascota1);

        assertFalse(resultado);

        
        LOG.info("Fin test verificarEdadMascotaMayorQueDiez");
    }

    @Test
    public void mascotasOrdenadas(){
        Veterinaria veterinaria = new Veterinaria("Amigos peludos");
        Mascota mascota1 = new Mascota("1", "Tobi", "Canis familiaris", "Labrador", 15, "Hembra", "Negro", 15f);
        Mascota mascota2 = new Mascota("222", "Max", "Canis familiaris", "Labrador", 10, "Hembra", "Negro", 15f);
        Mascota mascota3 = new Mascota("3", "Luna", "Canis familiaris", "Labrador", 12, "Hembra", "Negro", 15f);

        veterinaria.agregarMascota(mascota1);

    

        Collection<Mascota> listaOrdenadaObtenida = veterinaria.getMascotasOrdenadas();

        Collection<Mascota> listaDeseada = List.of(mascota1);

        assertIterableEquals(listaOrdenadaObtenida, listaDeseada);

        assertThrows(Throwable.class, ()-> veterinaria.agregarMascota(mascota1));
        assertThrows(Throwable.class, ()-> veterinaria.agregarMascota(mascota2));
        assertThrows(Throwable.class, ()-> veterinaria.agregarMascota(mascota3));


    }

}
