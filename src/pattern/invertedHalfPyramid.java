package pattern;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        int n=5;
        for (int i =0;i<n;i++){
            //inner loop to print space
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            // inner loop to print pattern
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

 /*
        output
     *
    **
   ***
  ****
 *****

*/