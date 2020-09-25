
import java.util.Random;


public class randomIntegerGenerator {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Random rand = new Random();



        int randomInteger = 1 + rand.nextInt(50 - 1);
        int randomInteger2 = 1 + rand.nextInt(50 - 1);
        int randomInteger3 = 1 + rand.nextInt(50 - 1);
        int randomInteger4 = 1 + rand.nextInt(50 - 1);
        int randomInteger5 = 1 + rand.nextInt(50 - 1);
        int randomInteger6 = 1 + rand.nextInt(50 - 1);


        System.out.println("Play this combination-it'll make you rich!");
        System.out.println(randomInteger + " " + randomInteger2 + " " + randomInteger3 + " " + randomInteger4 + " " + randomInteger5 + " " + randomInteger6);




        
    }
    
}
