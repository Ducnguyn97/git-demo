package src;

public class Rectangle {
    public double width;
    public double height;
    public Rectangle(){};
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea() {
        return width*height;
    }
    public double getPerimeter() {
        return 2*(width + height);
    }
    public String Display(){
        return "Area: "+ getArea()+"\nPerimeter: "+getPerimeter();
    }
}
