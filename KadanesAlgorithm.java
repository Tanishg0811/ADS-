public class KadanesAlgo{
    public static void main(String[] args) {
        int[] nums={};
        System.out.println();
    }
    public int maxSubArrayLen(int[] nums,int sum) {
        int currSum=0;
        Map<Integer,Integer> mp=new HashMap<>();
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum==sum){
                maxLen=Math.max(maxLen,i+1);
            }
            if(mp.containsKey(currSum-sum)){
                int len=i- mp.get(currSum-sum);
                maxLen=Math.max(maxLen,len);
            }
            mp.putIfAbsent(currSum,i);
        }
        return maxSum;
    }

}
