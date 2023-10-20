public class Square implements Shape{

    private int length;

    public Square(){}

    public Square(int length){
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of square is : " + length*length);
    }
}
