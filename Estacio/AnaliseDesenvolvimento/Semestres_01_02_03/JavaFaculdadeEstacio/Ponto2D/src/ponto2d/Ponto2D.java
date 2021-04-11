package ponto2d;

public class Ponto2D {

    private int x;
    private int y;

    public Ponto2D(int a, int b) {
        x = a;
        y = b;
    }

    public double distancia(Ponto2D p) {
        double distX = p.x - y;
        double distY = p.y - x;
        return Math.sqrt(distX*distX + distY*distY);
    }
}
