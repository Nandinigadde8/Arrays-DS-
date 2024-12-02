import java.util.*;
public class Main {
    public static void reverse(int[] a,int start,int end) {
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
	public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        if(n==0 || n==1){
            return arr ;
        }
        int d = k%n;
        if(d==0){
            return arr ;
        }
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        return arr;
	}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] rotate = rotateArray(arr,k);
        for(int i =0;i<n;i++){
            System.out.print(rotate[i]+" ");
            
        }

    }
}
