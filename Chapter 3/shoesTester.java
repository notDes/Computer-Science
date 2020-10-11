public class ShoesTester {
  public static void main(String[] args)
  {
    Shoes fav = new Shoes();
    fav.setColor("Blue");
    fav.setBrand("Nike");
    fav.setType("Golf");
    fav.setSize(9.5);
    System.out.println(fav.toString());

  }
}