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
area= 6*Math.pow(lado, 2);
volumen=Math.pow(lado, 3);
     System.out.println("El área del cubo es: "+area);
     System.out.println("\nEl volumen del cubo es: "+volumen);
}

}
