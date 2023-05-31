package pattern;

public class invertedNumber {
    public static void main(String[] args) {
        int n =6;
        //outer loop to print rows
        for (int i = 1; i <n; i++) {
            //inner loop to print 
            for (int j = 1; j <= n-i; j++) {
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
 * output
 *  1 2 3 4 5 
    1 2 3 4 
    1 2 3 
    1 2 
    1 
 *  //online solution
 *  for(int i=1;i<=n;i++){
        // inner loop
    }
    for(intj=1;j<n-i;j++){
        System.out.print(j);
   }
    System.out.println();
 */

   