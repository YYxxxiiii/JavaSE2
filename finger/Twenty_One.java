package finger;

public class Twenty_One {
    public int[] exchange(int[] nums) {
        int low = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] % 2 == 1) {
                int tmp = nums[low];
                nums[low] = nums[fast];
                nums[fast] = tmp;
                low++;
            }
            fast++;
        }
        return nums;
    }
}
