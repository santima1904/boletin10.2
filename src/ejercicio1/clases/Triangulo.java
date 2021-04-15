package ejercicio1.clases;

public class Triangulo extends Figura{

    //Atributos
    private double base;
    private double altura;

    //Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Getters and setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    //Metodos anhadidos
    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }
}
