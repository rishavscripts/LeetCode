class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(isZero(nums)) return 0;
        int max=1,count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==1 && nums[i-1]==1){count++; max=Math.max(count,max);}
            else{count=1;}
        }
        return max;
    }
    public static boolean isZero(int[] arr){
        for(int i:arr){if(i==1) return false;}
        return true;
    }
}