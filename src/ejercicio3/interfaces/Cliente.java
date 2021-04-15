package ejercicio3.interfaces;

import java.time.LocalDate;

public interface Cliente {

    public void setNumeroSocio(int numeroSocio);
    public int getNumeroSocio();

    public void setFechaSocio(LocalDate fechaSocio);
    public LocalDate getFechaSocio();
}
