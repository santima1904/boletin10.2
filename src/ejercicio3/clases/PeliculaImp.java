package ejercicio3.clases;

import ejercicio3.interfaces.Pelicula;

import java.time.LocalDate;

public class PeliculaImp extends ProductosImp implements Pelicula {

    //Atributos
    private String genero;
    private String titulo;
    private int duracion;

    //Constructor
    public PeliculaImp(String nombre, LocalDate fechaProduccion, String genero, String titulo, int edad) {
        super(nombre, fechaProduccion);
        this.duracion = duracion;
        this.genero = genero;
        this.titulo = titulo;
    }

    //Getters and setters
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
