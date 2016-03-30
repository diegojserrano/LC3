package punto;

public class Punto {
    private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    public double distanciaOrigen() {
        return Math.sqrt(x*x+y*y);
    }
    
    public int cuadrante() {
        int cuad = 0;
        
        if (x > 0) {
            if (y > 0) cuad = 1;
            else       cuad = 4;
        }
        else {
            if (y > 0) cuad = 2;
            else       cuad = 3;
        }            
            
        return cuad;
    }
    
    public double distancia(Punto otro) {
        int dx = this.x - otro.x;
        int dy = this.y - otro.y;
        
        return Math.sqrt(dx*dx+dy*dy);
    }
    
}
