import java.util.Scanner;
public class Ex1part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        int sum = 0;
        int currentNumber = 0;
        boolean isNumber = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
                isNumber = true;
            } else {
                if (isNumber) {
                    sum += currentNumber;
                    currentNumber = 0;
                    isNumber = false;
                }
            }
        }
        if (isNumber) {
            sum += currentNumber;
        }

        System.out.println(sum);
    }
}