package Day5;

public class Test {
    public static void main(String[] args) {
        staticmethod.change();

        staticmethod s1 = new staticmethod(1, "Quân");
        staticmethod s2 = new staticmethod(2, "Haha");
        staticmethod s3 = new staticmethod(3, "Hoho");

        s1.display();
        s2.display();
        s3.display();

    }
}
