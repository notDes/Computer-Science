// Use this file as your Balloon Tester

class Main {
    public static void main(String[] args) {
      
      Balloon n = new Balloon();
      n.inflate(1);
      
      
      Balloon g = new Balloon();
      g.inflate(2);
      g.getVolume();
      
      System.out.println("Expected Results of the volume for Balloon n is 43");
      System.out.println("Expected Results of the volume for Balloon g is 90");
      
      System.out.println("The actual Results of the volume for balloon N is " + n.getVolume());
      System.out.println("The actual Results of the volume for balloon G is " + g.getVolume());
      
      
    }
  }