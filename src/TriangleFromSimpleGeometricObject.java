/*Lab 2
* Samuel Julien
* 8-30-17*/
import java.text.DecimalFormat;
public class TriangleFromSimpleGeometricObject extends SimpleGeometricObject {
   private Point A;
   private Point B;
   private Point C;
    public TriangleFromSimpleGeometricObject() {
        A = new Point();
        B = new Point();
        C = new Point();

    }
    public TriangleFromSimpleGeometricObject(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }



    public double getArea(){
        double s =(B.getDistance(C)+(A.getDistance(C))+(B.getDistance(A)))/2;
        double area= Math.sqrt(s*(s-B.getDistance(C))*(s-A.getDistance(C))*(s-B.getDistance(A)));
        return area;
    }
    public double getPerimeter() {

        double P = ((B.getDistance(A)) + ((C.getDistance(A)) + ((B.getDistance(C)))));
        return P;
    }
        public String toString() {
            DecimalFormat f = new DecimalFormat("##.00");
            return "The area is of the triangle is :" + getArea() + " The perimeter of the triangle is  :" + f.format(getPerimeter());
        }
    }


