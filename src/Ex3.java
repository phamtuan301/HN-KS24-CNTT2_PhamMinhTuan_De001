public class Ex3 {
    public static void main(String[] args) {
        int[] A = new int[]{6, 10, 10, 10, 2, 5, 6, 7, 8, 3};
        int[] B = new int[]{2, 3};

        for(int i = 0; i < A.length; ++i) {
            boolean check = false;
            for(int k = 0; k < i; ++k) {
                if (A[i] == A[k]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                for(int j = 0; j < B.length; ++j) {
                    if(A[i] == B[j]){
                        System.out.println(A[i] + " ");
                    }
                }
            }
        }

    }
}
