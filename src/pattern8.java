//       *********
//        *******
//         *****
//          ***
//           *


public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else if (j <= 2 * n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

