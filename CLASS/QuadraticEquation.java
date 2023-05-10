package CLASS;

public class QuadraticEquation {
   private double a;
   private double b;
   private double c;
   private double delta;

    public QuadraticEquation(){
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = delta;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double delta(){
        delta = (b*b) - (4*a*c);
        return delta;
    }
    public double getRoot1(){
        if (delta < 0){
            return 0;
        }
        return -b+Math.sqrt(delta)/(2*a);
    }
    public double getRoot2(){
        if (delta <0){
            return 0;
        }
       return -b-Math.sqrt(delta)/(2*a);
    }
}
