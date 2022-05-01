package Ejercicio1;

public class Poligonos extends FigurasGeometricas{
    private double perimetro;
    private double base;
    private double altura;
    private double lado;

public Poligonos(double area, double perimetro) {
    super(area);
    this.perimetro=perimetro;
}
public void cuadrado (double area, double perimetro, double lado){
    area=Math.pow(lado, 2);
    perimetro=4*lado;
        System.out.println("El área del cuadrado es: "+area);
        System.out.println("\nEl perímetro del cuadrado es: "+perimetro);
}

}
