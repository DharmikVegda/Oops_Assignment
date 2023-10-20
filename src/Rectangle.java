public class Rectangle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle is : " + length*width);
    }

    public Rectangle(){}

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
