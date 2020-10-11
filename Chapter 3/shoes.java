public class Shoes {
  private String color;
  private String brand;
  private String type;
  private double size;
  
  public String toString() {
    return "Color: " + color +  "," + " Brand: " + brand + "," + " Type: " + type + "," + " Size " + size;
  }
  public void setColor(String newColor) {
    color = newColor;
  }
  public void setBrand(String newBrand) {
  brand = newBrand;
  }
  public void setType(String newType) {
    type = newType;
  }
  public void setSize(double newSize) {
    size = newSize;
  }
}