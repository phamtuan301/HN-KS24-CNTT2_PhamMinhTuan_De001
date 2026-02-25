public class Ex3 {
    public static void main(String[] args) {
        int[] A = {6, 10, 10, 10, 2, 5, 6, 7, 8, 3};
        int[] B = {2, 3};
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (j < B.length && A[i] == B[j]) {
                j++;
            }
        }
        if (j == B.length) {
            System.out.println("B la mang con cua A");
        } else {
            System.out.println("B khong phai la mang con cua A");
        }
    }
}