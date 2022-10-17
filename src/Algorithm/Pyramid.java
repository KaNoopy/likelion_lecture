package Algorithm;

public class Pyramid {
    public static void main(String[] args) {

        //공백 출력
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > i; j--) {
                System.out.printf(" ");
            }
        //*출력
            for (int k = 0; k <= i * 2; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

/*
출력물
   *
  ***
 *****
*******
*/
