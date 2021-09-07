package easy;

import java.util.stream.IntStream;

public class SearchInsertPosition {
    /**
     * Given a sorted array of distinct integers and a target value< return the index if the target is found.
     * If not, return the index where it would be if it where inserted in order.
     * You must write an algorithm with O(log n) runtime complexity.
     */
    public static void main(String[] args) {

    }

    public static int searchInsert(int[] nums, int target) {
//        IntStream.iterate(0,i->i++).limit(nums.length).filter(()->nums[i]<)
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i] || (i == 0 && nums[i] > target)) {
                return i;
            }
            if (i > 0 && target > nums[i - 1] && target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
