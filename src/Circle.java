public class Circle implements Shape{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(){
    }
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void calculateArea() {
        System.out.println("Area of circle is : " + 3.14 * radius * radius);
    }
}
