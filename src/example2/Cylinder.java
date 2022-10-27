package example2;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(){};

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    Cylinder(double radius){
        super(radius);
    }

    public double getHeight(){
        return this.height;
    }

    public double getArea(){
        return 2 * super.getArea() + 2 * Math.PI * this.getRadius() * this.height;
    }

}
