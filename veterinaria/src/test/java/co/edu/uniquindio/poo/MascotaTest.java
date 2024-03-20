/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

       /*
     * Prueba para validar a la mascota
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");

        Mascota mascotas = new Mascota("2", "Boby","Canis familiaris","Beagle",3,"macho", "Gris", 8.4f);

        assertEquals("2", mascotas.getId());
        assertEquals("Boby", mascotas.getNombres());
        assertEquals("Canis familiaris", mascotas.getEspecie());
        assertEquals("Beagle", mascotas.getNombres());
        assertEquals(3, mascotas.getEdad());
        assertEquals("macho", mascotas.getGenero());
        assertEquals("Gris", mascotas.getColor());
        assertEquals(8.4f, mascotas.getPeso());

        LOG.info("Los datos estan completos");
    }

    /*
     * Prueba para verificar que los datos de la mascota no sean nulos
     */

     @Test
     public void datosNulos(){
        LOG.info("Inicio prueba datosNulos");
        assertThrows(Throwable.class, ()-> new Mascota(null, null, null, null, 0, null, null, 0f));
        LOG.info("Error, los datos no pueden ser nulos");

        
     }

     @Test
     public void datosVacios(){
        LOG.info("Inicio prueba datosVacios");
        assertThrows(Throwable.class, ()-> new Mascota("", "", "", "", 0, "", "", 0f));
        LOG.info("Error, faltan los datos para registrar a la mascota");

     }

     @Test
     public void edadNegativa(){
        LOG.info("Inicio prueba edadNegativa");
        assertThrows(Throwable.class, ()-> new Mascota("34","Boby", "Canis familiaris", "Beagle", -3, "macho", "Gris", 8.4f));
        LOG.info("Error, la edad no puede ser negativa");
     }

     @Test
     public void pesoNegativo(){
        LOG.info("Inicio prueba pesoNegativo");
        assertThrows(Throwable.class, ()-> new Mascota("65","Boby", "Canis familiaris", "Beagle", 3, "macho", "Gris", -8.4f));
        LOG.info("Error, el peso no puede ser negativo");
     }

}
