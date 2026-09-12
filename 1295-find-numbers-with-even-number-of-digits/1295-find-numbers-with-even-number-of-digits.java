class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            if(len(n)%2==0){count++;}
        }
        return count;
    }
    public long len(int n){
        long len=0;
        while(n>0){
            len++;
            n/=10;
        }
        return len;
    }
}