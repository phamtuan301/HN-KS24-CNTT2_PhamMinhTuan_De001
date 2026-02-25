import java.util.Scanner;
public class Ex1part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String n = sc.nextLine();
        int[] count = new int[128];
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (Character.isLetter(c)) {
                count[c]++;
            }
        }

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);

            if (Character.isLetter(c)) {
                System.out.println("Ki tu " + c + " xuat hien " + count[c] + " lan");
            }
        }
    }
}