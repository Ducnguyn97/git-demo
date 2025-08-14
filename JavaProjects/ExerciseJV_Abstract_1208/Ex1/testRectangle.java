import src.Rectangle;

public class testRectangle {
    public static void main(String[] args) {
       Rectangle[] rectangles = {
               new Rectangle(),
               new Rectangle(2.0,3.5),
               new Rectangle(4.0,5.5, "yellow", false),
       };
       for (Rectangle rectangle : rectangles) {
           System.out.println("before resize: " +  rectangle.toString());
       }
       for (Rectangle rectangle : rectangles) {
           rectangle.resize(50);
           System.out.println("after resize: " +  rectangle.toString());
       }
    }
}
