//Leetcode 217 Contains Duplicate
// Idea :
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        HashMap <Integer,Integer > map=new HashMap<Integer,Integer>();
        for(int x=0;x<nums.length;x++)
        {
            if (map.containsKey(nums[x]))
            {
                return true;
            }
            map.put(nums[x],x);
        }
        return false;
        
    }
}
/*
 Example 1:

Input: nums = [1,2,3,1]
Output: true
 */