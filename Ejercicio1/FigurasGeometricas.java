package Ejercicio1;
import java.util.Scanner;

public class FigurasGeometricas {
    double area;

 public FigurasGeometricas(double area) {
     this.area = area;
}
public static void main(String[ ] args){
Scanner sc= new Scanner(System.in);
int opcion;

    System.out.println("Bienvenido!!"
    + "\nEn este programa puedes calcular el área, perímetro y volumen de figuras geométricas");
    System.out.println("Selecciona el tipo de figura del cual estás interesado: ");
    System.out.println("\n1) Polígonos"
    + "\n2) Poliedros");
    opcion= sc.nextInt();

    if(opcion ==1){
        System.out.println("Seleccione la figura de su interes: ");
        System.out.println("\n1) Cuadrado"
        + "\n2) Triangulo "
        + "\n3) Rectangulo");
        int figura= sc.nextInt(); 
        Poligonos clase1 = new Poligonos( 0,0,0,0,0);

            switch(figura){
            case 1: 
            double lado;
                System.out.println("Ingrese la medida de un segmento del cuadrado: ");
                lado = sc.nextDouble();
                System.out.println(clase1.area(lado));
                System.out.println(clase1.perimetro(lado));
            break;
            case 2:
                System.out.println("Ingrese la medida de un segmento del triangulo isoceles : ");
                lado = sc.nextDouble();
                System.out.println("Ingrese la base del triangulo: ");
                double base=sc.nextDouble();
                System.out.println("Ingrese la altura del triangulo: ");
                double altura=sc.nextDouble();
                    System.out.println(clase1.areaTriangulo(base, altura));
                    System.out.println(clase1.perimetroTriangulo(lado, base));
            break;
            case 3:
                System.out.println("Ingrese la base del rectangulo: ");
                base=sc.nextDouble();
                System.out.println("Ingrese la medida de un segmento vertical del rectangulo : ");
                lado = sc.nextDouble();
                    System.out.println(clase1.area(base, lado));
                    System.out.println(clase1.perimetro(lado, base));
            break;     
            }
     }
    else {
        if (opcion==2){
            System.out.println("Seleccione la figura de se interes: ");
            System.out.println("\n1) Cubo"
            + "\n2) Cilindro"
            + "\n3) Esfera");
            int figura= sc.nextInt();
            Poliedros clase2 = new Poliedros (0,0,0,0,0);

            switch(figura){
            case 1: 
                System.out.println("Ingrese la medida de un segmento del cubo : ");
                double lado = sc.nextDouble();
                System.out.println(clase2.area(lado));
                System.out.println(clase2.volumen(lado));
            break;
            case 2:
                 System.out.println("Ingrese el radio del cilindro: ");
                double radio=sc.nextDouble();
                System.out.println("Ingrese la altura del cilindro: ");
                double altura=sc.nextDouble();
                System.out.println(clase2.area(radio, altura));
                System.out.println(clase2.volumen(radio, altura));
            break; 
            case 3:
                System.out.println("Ingrese el radio del cilindro: ");
                radio=sc.nextDouble();
                System.out.println(clase2.areaEsfera(radio));
                System.out.println(clase2.volumenEsfera(radio));
            break; 
            }
       }
    }   
}
    public double getArea() {
        return area;
    }
}
