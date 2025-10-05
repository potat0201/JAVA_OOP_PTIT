import java.util.*;

class Point{
    private double x, y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double distance(Point secondPoint){
        double d1 = this.x - secondPoint.x;
        double d2 = this.y - secondPoint.y;
        return Math.sqrt(d1*d1 + d2*d2);
    }

    public static double distance(Point p1, Point p2){
        double d1 = p1.x - p2.x;
        double d2 = p1.y - p2.y;
        return Math.sqrt(d1*d1 + d2*d2);
    }

    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}

public class J04010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Point A = new Point(sc.nextDouble(), sc.nextDouble());
            Point B = new Point(sc.nextDouble(), sc.nextDouble());
            Point C = new Point(sc.nextDouble(), sc.nextDouble());

            double a = Point.distance(B,C);
            double b = Point.distance(A,C);
            double c = Point.distance(A,B);

            if(a + b <= c || a + c <= b || b + c <= a){
                System.out.println("INVALID");
            }
            else{
                double S = 0.25 * Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b));
                double R = a*b*c /4*S;
                System.out.printf("%.3f\n",Math.PI * R * R);
            }
        }

    }
}
