package ejercicio1.clases;

public class CuadradoEspecializado extends Cuadrado{

    //Constructor
    public CuadradoEspecializado(double base, double altura) {
        super(base, altura);
    }

    //Metodo anhadido
    public void pintarCuadrado(char caracter){
        for(int i = 0; i < getBase();i++){
            for (int j = 0; j < getAltura();j++){
                System.out.print(caracter + " ");
            }
            System.out.println(" ");
        }
    }
}
