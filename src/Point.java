/*Lab 2
* Samuel Julien
* 8-30-17*/
public class Point {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getDistance( Point point){
        double d= Math.sqrt(((point.getX()-x)*(point.getX()-x))+((point.getY()-y)*(point.getY()-y)));
        return d;
    }
}
