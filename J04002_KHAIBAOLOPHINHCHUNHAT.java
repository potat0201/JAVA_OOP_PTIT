import java.util.*;

class Rectangle{
    public double width;
    public double height;
    public String color;

    public  Rectangle(){
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double findArea(){
        return this.width * this.height;
    }

    public double findPerimeter(){
        return (this.height + this.width)*2;
    }


}

public class J04002_KHAIBAOLOPHINHCHUNHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        String color = sc.next();

        if( width <= 0 || height <= 0 ){
            System.out.println("INVALID");
            return;
        }

        Rectangle p = new Rectangle(width, height, color);
        double S = p.findArea();
        double P = p.findPerimeter();
        System.out.printf("%.0f %.0f %s\n",P, S, p.getColor().substring(0,1).toUpperCase() + p.getColor().substring(1).toLowerCase());
    }
}