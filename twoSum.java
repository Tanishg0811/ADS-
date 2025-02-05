class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=1;i<=numbers.length;){
            for(int j=numbers.length;j>i;){
                int sum=numbers[i-1]+numbers[j-1];
                if(sum==target)return new int[]{i,j};,
                if(sum<target)i++;
                if(sum>target)j--;
            }
        }
        return new int[]{};
    }
}
