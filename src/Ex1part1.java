import java.util.Scanner;
public class Ex1part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        int sum = 0;
        int currentNumber = 0;
        boolean isBuildingNumber = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
                isBuildingNumber = true;
            } else {
                if (isBuildingNumber) {
                    sum += currentNumber;
                    currentNumber = 0;
                    isBuildingNumber = false;
                }
            }
        }
        if (isBuildingNumber) {
            sum += currentNumber;
        }

        System.out.println(sum);
    }
}