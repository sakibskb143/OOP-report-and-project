public class Main {
    public static void main(String[] args) {
        Polygon[] polygons = {
            new Circle(5),
            new Triangle(4, 3),
            new Rectangle(6, 4),
            new Square(5)
        };

        for (Polygon p : polygons) {
            p.draw();
            System.out.println("Area: " + p.area());
        }
    }
}