public class Shoes {
  private String color;
  private String brand;
  private String type;
  private double size;
  public Shoes() {
    color = "";
    brand = "";
    type = "";
    size = 0;
  }

  public String toString() {
    return "Color: "+color+", Brand: " + brand+", Type: "+type+", Size: "+size;
  }

  public void setColor(String newColor) {
    color = newColor;
  }

  public void setType(String newType) {
    type = newType;
  }

  public void setBrand(String newBrand) {
    brand = newBrand;
  }

  public void setSize(double newSize) {
    size = newSize;
  }
}