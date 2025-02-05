import java.util.HashMap;

public class CertainQuestion2 {
    public static void main(String[] args) {
        
    }
    public static int maxSubArrayLength(int[]nums,int target){
        HashMap<Integer,Integer>sumMap=new HashMap<>();
        int currentSum=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            if(currentSum==target){
                maxLength=i+1;
            }
            if(sumMap.containsKey(currentSum-target)){
                maxLength=Math.max(maxLength,i-sumMap.get(currentSum-target));
            }
            sumMap.putIfAbsent(currentSum,i);
        }
        return maxLength;
    }
}
