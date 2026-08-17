class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> find = new HashMap<>();
        for (int i=0; i<nums.length;i++){
        if(find.containsKey(nums[i])) return true;
        find.put(nums[i],i);}
        return false;
        
        
    }
}