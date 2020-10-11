import java.lang.StringBuilder;

class stringExcerises {
  public static void main(String[] args) {
    System.out.println("R2.9");
    
    String str = "Hello";
    String helloToUpperCase = str.toUpperCase();

    System.out.println(helloToUpperCase);
    
    
    System.out.println("R2.10");
    

    String helloToLowerCase = str.toLowerCase();

    System.out.println(helloToLowerCase);
    
    System.out.println("E2.3");
    
    String strMississippi = "Mississippi";
    
    strMississippi = strMississippi.replace("i", "ii");
    
    System.out.println(strMississippi.length());
    
    strMississippi = strMississippi.replace("ss", "s");
    
    // System.out.println(newMississippi); Testing 
    
    System.out.println(strMississippi.length());
    
    
    System.out.println("E2.8");
    
    String strDesserts = "desserts";
    
    // System.out.println(strDesserts.reverse().toString());
    
    StringBuilder desserts = new StringBuilder("desserts");
    desserts = desserts.reverse();
    
    System.out.println(desserts.toString());
    
    
    
  }
}