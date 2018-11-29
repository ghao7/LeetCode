public class Solution {
    public static void main(String[] arg){
        int[] nums = [2,7,5,6];
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result)
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i<nums.length;i++){
            for (int j = 0; j < nums.length; j++){
                if (i!=j){
                    int answer = nums[i]+nums[j];
                    if (answer == target){
                        int[] solution = new int[2];
                        solution[0] = i;
                        solution[1] = j;
                        return solution;
                    }
                }
            }
        }
        return null;
    }


}
