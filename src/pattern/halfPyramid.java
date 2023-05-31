package pattern;
/*
 Pattern is
* 
* * 
* * * 
* * * * 
* * * * * 
    
*/


public class halfPyramid {
    public static void main(String[] args) {
        //outer loop
        for(int i=0;i<5;i++){
            //inner loops
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

