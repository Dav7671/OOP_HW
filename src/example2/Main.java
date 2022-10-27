package example2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println(circle);
        System.out.println("Circle area = " + circle.getArea());
        Cylinder cylinder = new Cylinder(4.5,5);
        System.out.println("Cylinder area = " + cylinder.getArea());

    }
}
