public class Solution {
    public static int getSecondSmallest(int n,int[] a){
        int l = a[0];
        int  s = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(a[i]<l){
                s = l;
                l = a[i];
            }
            else if(a[i]!=l && a[i]<s){
                s = a[i];
            }
        }
        return s;
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        int largest = a[0];
        int secondlargest = -1;
        for(int i=1;i<n;i++){
            if(a[i]>largest && a[i]!=largest){
                secondlargest = largest;
                largest = a[i];
            }
            else if(a[i]<largest && a[i]>secondlargest){
                secondlargest = a[i];
            }
        }
        int secondsmallest = Solution.getSecondSmallest(n, a);
        return new int[]{secondlargest,secondsmallest};
        
    }
}
