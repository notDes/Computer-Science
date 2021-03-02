public class eval {
    public static void main(String[] args){
      double radius = 3.5;
      double height = 2.5;
  
      System.out.printf("%s%16.2f\n", "Cube volume: ", Geometry.cubeVolume(height));

      System.out.printf("%s%10.2f\n", "Cube surface area: ", Geometry.cubeSurface(height));

      System.out.printf("%s%12.2f\n", "Cylinder volume: ", Geometry.cylinderVolume(radius, height));

      System.out.printf("%s%6.2f\n", "Cylinder surface area: ", Geometry.cylinderSurface(radius, height));
    }

  }
    
  