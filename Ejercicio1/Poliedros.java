package Ejercicio1;

public class Poliedros extends FigurasGeometricas{
    private  double volumen; 
    private  double radio;
    private  double lado; 
    private  double altura; 

 public Poliedros(double volumen, double radio, double lado, double altura, double area) {
     super(area);
     this.volumen = volumen;
     this.radio = radio;
     this.lado = lado;
     this.altura = altura;
    }
 public void cubo(double area, double lado, double volumen){
    area= (6)*(Math.pow(lado, 2));
    volumen=Math.pow(lado, 3);
         System.out.println("El área del cubo es: "+area);
         System.out.println("\nEl volumen del cubo es: "+volumen);
}
public void cilindro(double area, double volumen, double radio, double altura){
    area=((2)*(Math.PI)*(radio))*(altura+radio);
    volumen=(Math.PI)*(Math.pow(radio, 2))*(altura);
        System.out.println("El área del cilindro es: "+area);
        System.out.println("\nEl volumen del cilindro es: "+volumen);
}
public void esfera(double area, double volumen, double radio){
area=(4)*(Math.PI)*(Math.pow(radio, 2));
volumen=(4/3)*(Math.PI)*(Math.pow(radio, 3));
    System.out.println("El área de la esfera es: "+area);
    System.out.println("\nEl volumen de la esfera es: "+volumen);
}
}
