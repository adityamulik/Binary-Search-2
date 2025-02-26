
public class FindPeakElement {
    /*
     * Time Complexity: O(log n)
     * Space Complexity: O (1)
     *
     * Divide and conquer to find the peak element
     *
     * Author: Aditya Mulik
     */

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int solution = findPeakElement(nums);
        System.out.println(solution);
    }

    public static int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || nums[mid] > nums[mid-1]) && (mid == nums.length - 1 || nums[mid] > nums[mid+1])) {
                return mid;
            } else if (mid > 0 && nums[mid] < nums[mid-1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
