class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){return intersect(nums2,nums1);}
        Map<Integer,Integer> map= new HashMap<>();
        for(int n:nums1){map.put(n,map.getOrDefault(n,0)+1);}
        int[] res=new int[nums1.length];
        int k=0;
        for(int n:nums2){
            int count=map.getOrDefault(n,0);
            if(count==0){continue;}
            else{
                res[k]=n; k++;
                map.put(n,count-1);
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }
}