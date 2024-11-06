import java.util.ArrayList;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (list.contains(num)) {
                return true; 
            } else {
                list.add(num);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1};
        boolean result = solution.containsDuplicate(nums);

        System.out.println(result);
    }
}
