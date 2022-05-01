package Ejercicio1;

public class Poliedros extends FigurasGeometricas{
private double volumen; 
private double radio;
private double lado; 
private double altura; 

 public Poliedros(double volumen, double radio, double lado, double altura, double area) {
        super(area);
        this.volumen = volumen;
        this.radio = radio;
        this.lado = lado;
        this.altura = altura;
    }
 
}
