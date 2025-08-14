import src.Circle;

public class testCircle {
    public static void main(String[] args) {
        Circle[] circle = {
                new Circle(2.0),
                new Circle(),
                new Circle(3.0, "red", false),
        };
        for (Circle c : circle) {
            System.out.println("before resize: "+ c.toString());
        }

        for (Circle circle1 : circle) {
           circle1.resize(20);
            System.out.println("After resize: "+ circle1.toString());
        }
    }
}
