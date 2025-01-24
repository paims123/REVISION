package Inheritance;

import java.util.Scanner;

class Shape{
    protected String name;
    protected double perimeter;
    protected double area;
    
    public Shape(String name){
        this.name=name;
    }
    public void setPerimeter(double perimeter){
        this.perimeter=perimeter;
    }
    public double getPerimeter(double perimeter){
        return perimeter;
    }
    public void setArea(double area){
        this.area=area;
    }
    public double getArea(double area){
        return area;
    }
    public void display(){
        System.out.printf("Shape: %s\nPerimeter: %.2f\nArea: %.2f\n", name, perimeter, area);
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle() {
        super("Rectangle");
    }
    
    public void acceptsInputs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length=sc.nextDouble();
        System.out.print("Enter width: ");
        width=sc.nextDouble();
    }
    
    public void computePerimeterAndArea(){
        perimeter=2*(length+width);
        area=length*width;
    }
}
class Square extends Shape{
    private double side;
    
    public Square() {
        super("Square");
    }
    
    public void acceptsInputs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        side=sc.nextDouble();
    }
    
    public void computePerimeterAndArea(){
        perimeter=4*side;
        area=side*side;
    }
}
class Circle extends Shape{
    private double diameter;
    
    public Circle() {
        super("Circle");
    }
    
    public void acceptsInputs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        diameter=sc.nextDouble();
    }
    
    public void computePerimeterAndArea(){
        double radius=diameter/2;
        perimeter=Math.PI*diameter;
        area=Math.PI*radius*radius;
    }
}
public class Inheritance {

    public static void main(String[] args) {
         
         System.out.println("Rectangle");
         Rectangle rectangle = new Rectangle();
         rectangle.acceptsInputs();
         rectangle.computePerimeterAndArea();
         rectangle.display();
         System.out.println("");
         
         System.out.println("Square");
         Square square = new Square();
         square.acceptsInputs();
         square.computePerimeterAndArea();
         square.display();
         System.out.println("");
         
         System.out.println("Circle");
         Circle circle = new Circle();
         circle.acceptsInputs();
         circle.computePerimeterAndArea();
         circle.display();
         System.out.println("");
    }
    
}
