import java.util.Scanner;

public class Ex2part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.println("Nhap phan tu cua mang");
            arr[i] = sc.nextInt();
        }
        int num = 0;
        for (int i = 0; i < n; ++i) {
            for  (int j = i + 1; j < n; ++j) {
                if (arr[i] == arr[j]) {
                    num = arr[i];
                }
            }
        }
        System.out.println(num);
    }
}
