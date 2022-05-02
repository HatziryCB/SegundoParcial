package Ejercicio1;

public class Poligonos extends FigurasGeometricas{
    private double perimetro;
    private final double base;
    private final double altura;
    private final double lado;

//Constructor
public Poligonos(double area, double perimetro, double base, double altura, double lado) {
    super(area);
    this.perimetro=perimetro;
    this.base=base;
    this.altura=altura;
    this.lado=lado;
}
//Apicando sobre carga de metodos
public double area (double lado){
    area=Math.pow(lado, 2);
            System.out.println("\nEl área del cuadrado es: "+getArea());
            return getArea();
}
//Aplicando sobre carga de metodos
public double perimetro(double lado){
    perimetro=(4)*(lado);
    System.out.println("\nEl perímetro del cuadrado es: "+getPerimetro());
    return getPerimetro();
}

public double areaTriangulo(double base, double altura){
    area=((base*altura)/2);
    System.out.println("El área del triangulo es: "+getArea());
    return getArea();
}
public double perimetroTriangulo(double lado, double base){
    perimetro=2*lado+base;
    System.out.println("\nEl perimetro del triangulo es: "+getPerimetro());
    return getPerimetro();
}
//Aplicando sobre carga de metodos
public double area(double base, double lado){
    area=base*lado;
        System.out.println("El área del rectangulo es: "+getArea());    
        return getArea();
}
//Aplicando sobre carga de metodos
public double perimetro(double lado, double base){
    perimetro= ((2*lado)+(2*base));
        System.out.println("\nEl perímetro del rectangulo es: "+getPerimetro());
        return getPerimetro();
}
    public double getPerimetro() {
        return perimetro;
    }
}
