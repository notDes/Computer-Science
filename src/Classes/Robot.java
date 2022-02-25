package src.Classes;


import java.awt.Point;

public class Robot {
    private int x;
    private int y;
    private int direction;
    private Point location;
    private String finalDirection;



    public Robot(Point startingLocation, int startingDirection) {
        this.location = startingLocation;
        this.direction = startingDirection;

        this.x = (int) location.getX();
        this.y = (int) location.getY();

    } //Note: 0 = North, 1 = East, 2 = South, 3 = West

    public void turnLeft() {
        this.direction -= 1;

    }
    public void turnRight() {
        this.direction += 1;
    }
    public void move() {
        if (direction == 0) {
            this.y += 1;
            location.move(x, y);

        } else if (direction == 1) {
            this.x += 1;
            location.move(x, y);

        } else if (direction == 2) {
            this.y += 1;
            location.move(x, y);
            
        } else {
            this.x -= 1;
            location.move(x, y);
        }
    }
    public Point getLocation() {
        return location;
    }

    public String getDirection() {
        if (direction == 0) {
            finalDirection = "N";

        } else if (direction == 1) {
            finalDirection = "E";

        } else if (direction == 2) {
            finalDirection = "S";

        } else if (direction == 3) {
            finalDirection = "W";
        }
        return finalDirection;
    }

}