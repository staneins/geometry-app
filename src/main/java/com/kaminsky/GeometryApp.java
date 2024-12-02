package com.kaminsky;

public class GeometryApp
{
    public static void main( String[] args )
    {
        Circle circle = new Circle(24.3);
        Triangle triangle = new Triangle(12.2, 13.2, 8.2);
        Rectangle rectangle = new Rectangle(12.3, 15.5);
        GeometryUtils utils = new GeometryUtils();

        System.out.println(circle.calculateArea() + "\n" + triangle.calculateArea() + "\n" + rectangle.calculateArea());
        System.out.println("======================================================================================");
        System.out.println(circle.calculatePerimeter() + "\n" + triangle.calculatePerimeter() + "\n" + rectangle.calculatePerimeter());
        System.out.println("======================================================================================");
        System.out.println(utils.compareFigures(circle, triangle));

    }
}
