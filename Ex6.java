package lab05;
class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }
    public double getWidth()  { 
        return width; 
    }
    public double getHeight() { 
        return height; 
    }
    public void setWidth(double width) {
        if (width > 0) this.width = width;
        else System.out.println("Width must be positive.");
    }
    public void setHeight(double height) {
        if (height > 0) this.height = height;
        else System.out.println("Height must be positive.");
    }
    public double area()      { return width * height; }
    public double perimeter() { return 2 * (width + height); }
}
class Circle {
    private double radius;
    public Circle(double radius) {
        setRadius(radius);
    }
    public double getRadius() { 
        return radius; 
    }
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }    
        else System.out.println("Radius must be positive.");
    }
    public double surface()   { return Math.PI * radius * radius; }   
    public double perimeter() { return 2 * Math.PI * radius; }        
}
public class Ex6 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Rectangle " + rect.getWidth() + " x " + rect.getHeight());
        System.out.printf("  Area      = %.2f%n", rect.area());
        System.out.printf("  Perimeter = %.2f%n", rect.perimeter());
        rect.setWidth(10);   
        System.out.println("After setWidth(10):");
        System.out.printf("  Area      = %.2f%n", rect.area());
        System.out.printf("  Perimeter = %.2f%n", rect.perimeter());
        Circle circle = new Circle(4);
        System.out.println("\nCircle radius " + circle.getRadius());
        System.out.printf("  Surface   = %.2f%n", circle.surface());
        System.out.printf("  Perimeter = %.2f%n", circle.perimeter());
    }
}
