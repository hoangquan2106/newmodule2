package Baitapvenha;

public class demo {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9, 2};
        int[] newArr = new int[arr.length + 1];
        int value = 10;
        int index = 3;
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        System.out.println("Mảng mới là: " + );
    }
}

