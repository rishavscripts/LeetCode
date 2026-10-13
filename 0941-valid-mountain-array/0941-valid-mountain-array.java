class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        int len=arr.length;
        while(i+1<len && arr[i]<arr[i+1]) i++;
        if(i==0 || i+1==len) return false;
        while(i+1<len && arr[i]>arr[i+1] ) i++;
        return i+1==len;
    }
}