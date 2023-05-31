package leetcode.easy;
//https://leetcode.com/problems/can-place-flowers/
public class canPlaceFlowers {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(arr,n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i]==0){
                boolean checkLeft = (i==0) || (flowerbed[i-1]==0);
                boolean checkRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if(checkLeft && checkRight){
                    flowerbed[i]=1;
                    count++;
                }
            }

        }
        return count>=n;
    }
}
