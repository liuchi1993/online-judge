/**
 * @Author: liuchi
 * @Date: 2019/8/13 20:23
 */
public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return;
        }
        int zero = -1, current = 0, two = nums.length;
        while (current < two) {
            if (nums[current] == 0) {
                swap(nums, ++zero, current++);
            } else if (nums[current] == 2) {
                swap(nums, --two, current);
            } else {
                current++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
