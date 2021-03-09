
public class Geometry {

    public static double cubeVolume(double h){
        double cubeVol = Math.pow(h, 3);
        return cubeVol;
    }

    public static double cubeSurface(double h){
        double cubeSurf = 6 * Math.pow(h, 2);
        return cubeSurf;
    }

    public static double cylinderVolume(double r, double h){
        double cylinderVol = Math.PI * Math.pow(r, 2) * h;
        return cylinderVol;
    }

    public static double cylinderSurface(double r, double h){
        double cylinderSurf = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
        return cylinderSurf;
        
    }
}
