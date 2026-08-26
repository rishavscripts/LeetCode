class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        boolean flag=false;
        for(int key:map.keySet()){
            if(map.get(key)>=2){flag=true; break;}
        }
        return flag;
    }
}