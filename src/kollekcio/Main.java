package kollekcio;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        System.out.println(c.getArea());
        Shape s1 = c;
        Area a1 = c;
        System.out.println(a1.getArea());
        System.out.println(s1.getPerimeter());
    }
}
