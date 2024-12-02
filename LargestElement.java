import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        int l = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>l){
                l = arr[i];
            }
        }
        return l;

    }
}
