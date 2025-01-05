package LeetCode;

public class CanPlaceFlowers605 {

    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(canPlaceFlowers(arr, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(flowerbed.length==1 && flowerbed[0]==0 && n<=1) return true;
        for(int i=0; i<flowerbed.length; i++){
            if(i==0) {
                if(flowerbed[0]==0 && flowerbed[i+1]==0){
                    count++;
                    i++;
                }
            } else if(i==flowerbed.length-1 && flowerbed[i-1]==0 && flowerbed[i]==0){
                count++;
                i++;
            } else if (i!= flowerbed.length-1 && flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]!=1){
                count++;
                i++;
            }
        }

        return count>=n;
    }

    public static boolean canPlaceFlowers2(int[] flowerbed, int n) {

        return false;
    }

}


