import java.util.Random;

public class testing {
    public static void main(String[] args) {
        while (true) {
            System.out.print(getChar());
        }
    }
    public static String getChar() {
        Random r = new Random();
        int randDouble = (int) Math.ceil(r.nextDouble() * 3);
        String backSlash;

        switch (randDouble) {
            case 1:
                backSlash = "😀";
                break;
            case 2:
                backSlash = "😍";
                break;
            default:
                backSlash = "👮";
                break;

        }
        return backSlash;
    }
}