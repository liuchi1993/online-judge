/**
 * @Author: liuchi
 * @Date: 2019/8/11 22:40
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        TwoSum t = new TwoSum();
        int[] result = t.twoSum(arr, 9);
        for (int i:result){
            System.out.println(i);
        }

    }
}
