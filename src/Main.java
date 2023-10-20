import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("1) Circle" + "\n" +
                             "2) Rectangle" + "\n" +
                             "3) Square" + "\n" +
                             "Please select shape : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.print("Enter a radius for circle : ");
                    int radius = sc.nextInt();
                    Shape circle = new Circle(radius);
                    circle.calculateArea();
                    break;
                case 2 :
                    System.out.print("Enter a length for rectangle : ");
                    int length = sc.nextInt();
                    System.out.print("Enter a width for rectangle : ");
                    int width = sc.nextInt();
                    Shape rectangle = new Rectangle(length,width);
                    rectangle.calculateArea();
                    break;
                case 3 :
                    System.out.print("Enter a length for square : ");
                    int len = sc.nextInt();
                    Shape square = new Square(len);
                    square.calculateArea();
                    break;
                default:
                    System.out.println("Invalid input, you can select value from 1,2 and 3");
                    System.exit(0);
            }
        }
    }
}