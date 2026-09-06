class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k%n==0) return ;
        k=k%n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }
    public static void rev(int[] arr,int start, int end){
        while(start<=end){
            int t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;

            start++; end--;
        }
    }
}