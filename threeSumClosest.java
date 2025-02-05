class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        int closest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                int t=nums[l]+nums[i]+nums[r];
                // System.out.println(i+" "+t);
                closest = Math.abs(target-closest)>Math.abs(target-t)?t:closest;
                if(t==target)return t;
                if(t>target)r--;
                if(t<target)l++;
            }
        }
        return closest;
    }
}
