package Classs;

public class StaticProperty {
    private String name;
    private String engine;

    public static int num;

    public StaticProperty( String name, String engine){
        this.name = name;
        this.engine = engine;
        num++;
    }
    public void display() {
        System.out.println(this.name + " " + this.engine);
    }
}
