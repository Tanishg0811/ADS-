public class CertainQuestion {
    public static void main(String[] args) {
        
    }
    public static int maxSubArraySum(int []nums){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int num:nums){
            currentSum=Math.max(num,currentSum+num);
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
