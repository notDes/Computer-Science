
public class Balloon{
    double radius;
    double volume;
    
    public Balloon(){
        radius = 0;
    }

    public void inflate(double amount){
        radius = radius + amount;

    }
    public double getVolume(){
        volume = (radius * radius * radius) * 4/3 * Math.PI;
        return volume;
    }

}
