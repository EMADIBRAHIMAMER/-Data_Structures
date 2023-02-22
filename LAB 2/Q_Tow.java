import java.util.Arrays;

public class Q_Tow {

        public static void main(String[] args) {
            int A [] = {10, 20, 30, 40, 50, 60};
            int B [] = new int[A.length];

            for (int i = 0; i < A.length; i++) {
                B[i] = A[i];
            }
            System.out.println("A= " + Arrays.toString(A) + " \n  B= " + Arrays.toString(B));

        }

}
