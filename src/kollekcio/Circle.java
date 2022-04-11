package kollekcio;

public class Circle implements Shape, Area{
    private double r;
    public Circle(double r){this.r = r;}
    public double getArea(){return r*r*Math.PI;}
    public double getPerimeter(){return 2*r*Math.PI;}
}
