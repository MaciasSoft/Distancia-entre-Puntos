package macias.nelson;

public class Punto {

    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x1) {
        this.x = x;
    }

    public void setY(double y2) {
        this.y = y;
    }

    public double distanciaPuntos(Punto parametros) {
        double cat1 = x - parametros.getX();
        double cat2 = y - parametros.getX();
        double hip = Math.sqrt(cat1 * cat1 + cat2 * cat2);
        return hip;
    }

    public String toString() {
        return "(X=" + getX() + ",Y=" + getY() + ")";
    }
}
