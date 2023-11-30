class Solution {
    public int majorityElement(int[] nums) {
        int ele=0,cnt=0;
        for(int x:nums){
            if(cnt==0) ele=x;
            if(ele==x) cnt++;
            else cnt--;
        }
        return ele;
    }
}