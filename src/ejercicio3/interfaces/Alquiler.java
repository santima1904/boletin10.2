package ejercicio3.interfaces;

import ejercicio3.clases.ClienteImp;
import ejercicio3.clases.PeliculaImp;

import java.time.LocalDate;

public interface Alquiler {

    public ClienteImp getCliente();

    public PeliculaImp getPelicula();

    public LocalDate getFechaAlquiler();
    public void setFechaAlquiler(LocalDate fechaAlquiler);

}
