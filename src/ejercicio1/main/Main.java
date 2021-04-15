package ejercicio1.main;

import ejercicio1.clases.Circulo;
import ejercicio1.clases.CuadradoEspecializado;
import ejercicio1.clases.Rectangulo;
import ejercicio1.clases.Triangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        System.out.println(circulo);
        System.out.println(circulo.calcularArea());
        Triangulo triangulo = new Triangulo(3, 4);
        System.out.println(triangulo);
        System.out.println(triangulo.calcularArea());
        Rectangulo rectangulo = new Rectangulo(5,2);
        System.out.println(rectangulo);
        System.out.println(rectangulo.calcularArea());
        CuadradoEspecializado cuadrado = new CuadradoEspecializado(4,4);
        cuadrado.pintarCuadrado('f');
    }
}
