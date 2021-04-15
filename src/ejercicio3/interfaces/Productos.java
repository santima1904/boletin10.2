package ejercicio3.interfaces;

import java.time.LocalDate;

public interface Productos {

    public void setNombre(String nombre);
    public String getNombre();

    public void setFechaProduccion(LocalDate fechaProduccion);
    public LocalDate getFechaProduccion();

}
