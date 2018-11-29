import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
                s.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++){
            int toSearch = target - nums[i];

            if (s.containsKey(toSearch)){
                if (s.get(toSearch) != i) {
                    int[] rst = {i, s.get(toSearch)};
                    return (rst);
                }
            }
        }
        return null;

    }
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}