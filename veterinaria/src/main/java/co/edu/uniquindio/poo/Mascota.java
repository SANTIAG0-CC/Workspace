package co.edu.uniquindio.poo;

public record Mascota(String nombre,String especie, String raza, int edad, String genero, String color, Float peso ) {
    
    public Mascota{
        assert nombre != null && !nombre.isBlank() :"El nombre de la mascota no puede ser null y tampoco puede estar vacío.";
        assert especie != null && !especie.isBlank() :"La especie de la mascota no puede ser null y tampoco puede estar vacío.";
        assert raza != null && !raza.isBlank() :"La raza de la mascota no puede ser null y tampoco puede estar vacío.";
        assert edad>=0;
        assert genero != null && !genero.isBlank(): "El género de la mascota no puede ser null y tampoco puede estar vacío.";
        assert color != null && !color.isBlank() :"El color de la mascota no puede ser null y tampoco puede estar vacío.";
        assert peso >= 0;
    }



}
