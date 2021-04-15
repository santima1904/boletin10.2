package ejercicio3.clases;

import ejercicio3.interfaces.Cliente;

import java.time.LocalDate;

public class ClienteImp extends PersonaImp implements Cliente{

    //Atributos
    private int numeroSocio;
    private LocalDate fechaSocio;

    //Constructor
    public ClienteImp(String nombre, String apellidos, int edad, int numeroSocio, LocalDate fechaSocio) {
        super(nombre, apellidos, edad);
        this.numeroSocio = numeroSocio;
        this.fechaSocio = fechaSocio;
    }

    //Getters and setters
    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public LocalDate getFechaSocio() {
        return fechaSocio;
    }

    public void setFechaSocio(LocalDate fechaSocio) {
        this.fechaSocio = fechaSocio;
    }
}
