package macias.nelson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Punto p1=new Punto(5.4,3.9);
        Punto p2=new Punto(5.8,1.6);

        double distancia=p1.distanciaPuntos(p2);
        System.out.println("La distancia entre Punto 1 a Punto 2 es: "+distancia);
    }
}
