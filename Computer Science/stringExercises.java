import java.lang.StringBuilder;

class Main {
  public static void main(String[] args) {
    System.out.println("R2.9");
    
    String str = "Hello";
    
    String helloToLowerCase = str.toLowerCase();

    System.out.println(helloToLowerCase);
  
    
    System.out.println("R2.10");
    
    String helloToUpperCase = str.toUpperCase();

    System.out.println(helloToUpperCase);
    
    
    System.out.println("E2.3");
    
    String strMississippi = "Mississippi";
    
    String newMississippi = strMississippi.replace("i", "ii");
    
    System.out.println(newMississippi.length());
    
    String newMississippi2 = strMississippi.replace("ss", "s");
    
    System.out.println(newMississippi2.length());
    
    
    System.out.println("E2.8");
    
    
    // System.out.println(strDesserts.reverse().toString());

    StringBuilder desserts = new StringBuilder("desserts");

    System.out.println(desserts.toString());

    
    
    
    
  }
}