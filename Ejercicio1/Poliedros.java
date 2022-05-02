package Ejercicio1;

public class Poliedros extends FigurasGeometricas{
    private double volumen; 
    private final double radio;
    private final double lado; 
    private final double altura; 

 public Poliedros(double volumen, double radio, double lado, double altura, double area) {
     super(area);
     this.volumen = volumen;
     this.radio = radio;
     this.lado = lado;
     this.altura = altura;
    }
 public double area(double lado){
    area= (6)*(Math.pow(lado, 2));
         System.out.println("\nEl área del cubo es: "+getArea());
         return getArea();
}
public double volumen(double lado){
    volumen=Math.pow(lado, 3);
        System.out.println("\nEl volumen del cubo es: "+volumen);
        return volumen;
}
public double area(double radio, double altura){
    area=((2)*(Math.PI)*(radio))*(altura+radio);
        System.out.println("\nEl área del cilindro es: "+getArea());
        return getArea();
}
public double volumen(double radio, double altura){
    volumen=(Math.PI)*(Math.pow(radio, 2))*(altura);
        System.out.println("\nEl volumen del cilindro es: "+volumen);
        return volumen;
}
public double areaEsfera(double radio){
area=(4)*(Math.PI)*(Math.pow(radio, 2));
    System.out.println("\nEl área de la esfera es: "+getArea());
    return getArea();
}
public double volumenEsfera(double radio){
volumen=(4/3)*(Math.PI)*(Math.pow(radio, 3));
    System.out.println("\nEl volumen de la esfera es: "+volumen);
    return volumen;
}
}
