package ejercicio3.clases;

import ejercicio3.interfaces.Productos;

import java.time.LocalDate;

public class ProductosImp implements Productos {

    //Atributos
    private String nombre;
    private LocalDate fechaProduccion;

    //Constructor
    public ProductosImp(String nombre, LocalDate fechaProduccion) {
        this.nombre = nombre;
        this.fechaProduccion = fechaProduccion;
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(LocalDate fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }
}
