package Classs;

public class Accessmodifier {
    private double radius = 1.0;
    private String color = "red";
    public Accessmodifier(){
    }
    public Accessmodifier(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
