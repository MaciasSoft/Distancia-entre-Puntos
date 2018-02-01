package macias.nelson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Puntos p1=new Puntos(1,3);
        Puntos p2=new Puntos(5,3);

        double distancia=p1.DistanciaPuntos(p2);
        System.out.println("La distancia entre Punto 1 a Punto 2 es: "+distancia);
    }
}
