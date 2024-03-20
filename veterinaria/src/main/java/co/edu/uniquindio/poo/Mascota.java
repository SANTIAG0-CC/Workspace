package co.edu.uniquindio.poo;

public class Mascota {
    private String id;
    private String nombres;
    private String especie;
    private String raza;
    private int edad;
    private String genero;
    private String color;
    private Float peso;
   

    public Mascota (String id, String nombres, String especie, String raza, int edad, String genero, String color,
    Float peso) {
        assert id != null && !id.isBlank() : "El id de la mascota no puede ser null y tampoco puede estar vacío.";
        assert nombres != null && !nombres.isBlank()
                : "El nombre de la mascota no puede ser null y tampoco puede estar vacío.";
        assert especie != null && !especie.isBlank()
                : "La especie de la mascota no puede ser null y tampoco puede estar vacío.";
        assert raza != null && !raza.isBlank() : "La raza de la mascota no puede ser null y tampoco puede estar vacío.";
        assert edad >= 0;
        assert genero != null && !genero.isBlank()
                : "El género de la mascota no puede ser null y tampoco puede estar vacío.";
        assert color != null && !color.isBlank()
                : "El color de la mascota no puede ser null y tampoco puede estar vacío.";
        assert peso >= 0;
    }

    public int getEdad() {
        return edad;
    }

    public String getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public String getGenero() {
        return genero;
    }

    public String getColor() {
        return color;
    }

    public Float getPeso() {
        return peso;
    }

}
