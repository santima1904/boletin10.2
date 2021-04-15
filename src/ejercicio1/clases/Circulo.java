package ejercicio1.clases;

public class Circulo extends Figura{
    //Atributos
    private double radio;
    public static final double PI = 3.14;

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Getters and setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //tostring


    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    //Metodos anhadidos
    @Override
    public double calcularArea(){
        return 2*PI*(radio*radio);
        //area de un circulo
    }
}
