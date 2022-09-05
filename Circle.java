import java.util.Scanner;
public class Circle {
    private double radius;
    private String color;
    public double pi = 3.14;
    public String name;
    public int roll_no;
    private double length;
    private double breadth;
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        radius = r;
        color = "red";
    }
    public Circle(double r,String c){
        radius = r;
        color = c;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
     }
    public double getArea(){
        return (pi*radius*radius);
    }
    public double getCircumference(){
        return (pi*2*radius);
    }
    public void setRectDim(){
        Scanner user_input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the length and breadth");
        length = user_input.nextDouble();
        breadth = user_input.nextDouble();
    }
    public double getRectArea(){
        return length*breadth;
    }
}