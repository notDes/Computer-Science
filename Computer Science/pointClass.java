import java.awt.Point;

public class pointClass {
    
    public static void main(String[] args) {

        int y1 = 4;
        int x1 = 3;
        int y2 = -4;
        int x2 = -3;

        Point firstPoint = new Point(x1,y1);
        Point secondPoint = new Point(x2,y2);

        System.out.println("My prediction for the distance is 12");

         double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

         System.out.println(distance);

    }
}
