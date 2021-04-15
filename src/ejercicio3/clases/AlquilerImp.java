package ejercicio3.clases;

import ejercicio3.interfaces.Alquiler;
import ejercicio3.interfaces.Pelicula;

import java.time.LocalDate;

public class AlquilerImp implements Alquiler {

    //Atributos
    private ClienteImp cliente;
    private PeliculaImp pelicula;
    private LocalDate fechaAlquiler;

    //Constructor
    public AlquilerImp(ClienteImp cliente, PeliculaImp pelicula, LocalDate fechaAlquiler) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaAlquiler = fechaAlquiler;
    }

    //Getters and setters
    public ClienteImp getCliente() {
        return cliente;
    }

    public PeliculaImp getPelicula() {
        return pelicula;
    }

    @Override
    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    @Override
    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
}
