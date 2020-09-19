import java.awt.Rectangle;

public class rectangleClassV2 {
    
    public static void main(String[] args) {
        System.out.println("Final X location: 10");
        System.out.println("Final Y location: 15");
        System.out.println("Predicted width: 30");
        System.out.println("Predicted height: 50");


        int width = 20;
        int height = 30;

        Rectangle Rect = new Rectangle(5, 10, width, height);
        Rect.add(0,0);
        System.out.println(Rect.getY());
        System.out.println(Rect.getX());
        System.out.println(Rect.getWidth());
        System.out.println(Rect.getHeight());

    }
}