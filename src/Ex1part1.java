import java.util.Scanner;

public class Ex1part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        int sum = 0;
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length(); ++j) {
                if(!Character.isLetter(arr[i].charAt(j)))  {
                    sum += Character.getNumericValue(arr[i].charAt(j));
                }
            }
        }
        System.out.println(sum);
    }
}
