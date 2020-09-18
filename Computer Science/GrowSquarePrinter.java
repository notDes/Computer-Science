import java.awt.Rectangle;
public class GrowSquarePrinter
{
	public static void main(String[] args)
	{
		int x = 100;
		int y = 100;
		int sideLength = 50;

		Rectangle square = new Rectangle(x, y, sideLength, sideLength);
		System.out.println(square);

		int growTranslate = (sideLength / 2);

		square.translate(growTranslate, growTranslate);
		square.grow(growTranslate, growTranslate);
		System.out.println(square);



		
		
	}
}

