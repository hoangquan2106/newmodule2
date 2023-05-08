package Vonglap;

public class songuyento {
    public static void main(String[] args) {
        System.out.println(" tất cả các SNT là: ");
        for (int i = 2; i < 100; i++) {
            boolean sothuc = true;

            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    sothuc = false;
                    break;
                }
            }
if(sothuc){
    System.out.print(i + " ");
}
        }
    }
}