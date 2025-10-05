//import java.util.*;
//
//class Rectangle {
//    private double length;
//    private double width;
//
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public Rectangle() {
//        this.length = 0;
//        this.width = 0;
//    }
//
//    public void getInformation(Rectangle h1) {
//        this.width = h1.width;
//        this.length = h1.length;
//    }
//
//    public void display() {
//        System.out.printf("Chieu dai la %.2f\n", this.length);
//        System.out.printf("Chieu rong la %.2f\n", this.width);
//    }
//
//    public double getArea() {
//        return this.length * this.width;
//    }
//
//    public double getPerimeter() {
//        return (this.length + this.width) * 2;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Nhap chieu dai: ");
//        double length = sc.nextDouble();
//        System.out.print("Nhap chieu rong: ");
//        double width = sc.nextDouble();
//
//        Rectangle hcn = new Rectangle(length, width);
//
//        hcn.display();
//        System.out.printf("Chu vi la: %.2f\n", hcn.getPerimeter());
//        System.out.printf("Dien tich la: %.2f\n", hcn.getArea());
//    }
//}
