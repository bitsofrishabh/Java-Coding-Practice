package pattern;

public class invertedPyramid{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            //inner loops
            for (int j=5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*         output is
        * * * * * 
        * * * * 
        * * * 
        * * 
        * 
*/