import java.util.*;
class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int target = Integer.parseInt(in.nextLine());
        int[] arr = Arrays.stream(in.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(twosum(arr,target)));
    }
    public static int[] twosum(int[] nums,int target){
        Arrays.sort(nums);
        int cl=Integer.MAX_VALUE;
        int[] ans = new int[2];
        int i=0,j=nums.length-1;
        while(i<j){
                int currsum = nums[i]+nums[j];
                if(Math.abs(target-currsum)<Math.abs(target-cl)){
                    cl=currsum;
                    ans[0]=nums[i];
                    ans[1]=nums[j];
                }
                if(currsum==target)return ans;
                if(currsum>target)j--;
                if(currsum<target)i++;
        }
        return ans;
    }
    
}
