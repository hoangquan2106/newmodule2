package Day5;

public class staticmethod {
    private int rollo;
    private String name;
    private static String college = "BBDIT";

    staticmethod(int r, String n){
        rollo = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollo + " " + name + " " + college);
    }
}
