package finger;

public class Three0304 {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                while (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }
        return -1;
    }
    // //方法2：排序，时间O(nlogn)，空间O(logn)，修改了原数据
    // public int findRepeatNumber(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i = 0 ; i < nums.length-1 ;i++){
    //         if(nums[i]==nums[i+1]) {
    //            return nums[i];
    //         }
    //     }
    //     return -1;
    // }

    //方法3：hash表，时间O(n)，空间O(n)，不修改原数据
    // public int findRepeatNumber(int[] nums) {
    //     HashSet<Integer> set = new HashSet<>();
    //     for(int num:nums){
    //         if(set.contains(num)) return num;
    //         set.add(num);
    //     }
    //     return -1;
    // }
}
