package src;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1;
    private double height =1;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle() {};

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (width + height)*2;
    }
    public String toString(){
        return "A Rectangle with width="
                + getWidth()
                + " and height="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        //percent = (Math.floor(Math.random() * 100)+1) / 100;
        setWidth(getWidth()*(percent/100)+ getWidth());
        setHeight(getHeight()*(percent/100)+ getHeight());
    }
}
