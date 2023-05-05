import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bạn muốn tìm tháng mấy?");
        int month = sc.nextInt();

        String dayMonth;
        switch (month){
            case 2:
                dayMonth = "28 hoặc 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayMonth ="31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayMonth ="30";
                break;
            default:
                dayMonth ="";
                break;
        }
if (!dayMonth.equals(""))System.out.printf("tháng %d có %s ngày!" , month , dayMonth);
else System.out.print("không hợp lệ");
    }
}
