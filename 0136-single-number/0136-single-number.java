class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i =0; i<nums.length; i++) {
            // check if num i is in the map
            if (map.containsKey(nums[i])) {
                map.put(nums[i], 2);
            }
            else {
                map.put(nums[i], 1);
            }
            
        }
        
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
            // if (key.getValue() == 1) {
            //     return true;
            // }
        }
        return ans;
    }
}
// [4,1,2,1,2] [4, 1] [1, 2] [2, 2]