import java.awt.Rectangle;
public class CenteredSquaresPrinter
{
	public static void main(String[] args)
	{
        int x = 100;
        int y = 100;
        int sideLength = 200;

        Rectangle square = new Rectangle(x, y , sideLength, sideLength);
        System.out.println(square);

        int growTranslate = (sideLength * 0 - 50);

		square.translate(growTranslate, growTranslate);
		square.grow(growTranslate, growTranslate);
		System.out.println(square);
        

		
	}
}

