class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int n:nums1){s1.add(n);}
        for(int n:nums2){s2.add(n);}
        int[] res=new int[s1.size()];
        int k=0;
        for(int n:s1){
            if(s2.contains(n)){res[k++]=n;}
        }
        return Arrays.copyOfRange(res,0,k);
    }
}