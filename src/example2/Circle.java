package example2;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){};

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius: " + radius +
                ", color: " + color + '\'' +
                '}';
    }
}
