
import java.util.Scanner;
import java.awt.Rectangle;

public class rectangleClassv1 {
    
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int width;
    int height;

    System.out.println("What is the width?");
    width = input.nextInt();
    System.out.println("What is the height?");
    height = input.nextInt();

    Rectangle Rect = new Rectangle(100, 100, width, height);

    double area = Rect.getWidth() * Rect.getHeight();
    System.out.println("Area = " + area);


    }
}
