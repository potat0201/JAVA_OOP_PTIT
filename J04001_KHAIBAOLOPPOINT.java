//import java.util.*;
//
//class Point{
//    private double x;
//    private double y;
//
//    public Point(){
//        this.x = 0;
//        this.y = 0;
//    }
//
//    public Point(double x, double y){
//        this.x = x;
//        this.y = y;
//    }
//    public Point(Point p){
//        this.x = p.x;
//        this.y = p.y;
//    }
//
//    public double getX(){
//        return this.x;
//    }
//
//    public double getY(){
//        return this.y;
//    }
//
//    public double distance(Point secondPoint){
//        double dx = this.x - secondPoint.x;
//        double dy = this.y - secondPoint.y;
//        return Math.sqrt(dx*dx + dy*dy);
//    }
//
//    public static double distance(Point p1, Point p2){
//        double dx = p1.x - p2.x;
//        double dy = p1.y - p2.y;
//        return Math.sqrt(dx*dx + dy*dy);
//    }
//
//    public String toString(){
//        return "(" + x + ", " + y + ")";
//    }
//}
//
//public class J04001_KHAIBAOLOPPOINT {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- > 0){
//            double x1 = sc.nextDouble();
//            double y1 = sc.nextDouble();
//            double x2 = sc.nextDouble();
//            double y2 = sc.nextDouble();
//            Point p1 = new Point(x1, y1);
//            Point p2 = new Point(x2, y2);
//            double d = Point.distance(p1,p2);
//            System.out.printf("%.4f\n", d);
//        }
//    }
//}
