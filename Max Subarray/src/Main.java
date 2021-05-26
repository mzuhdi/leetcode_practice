public class Main {

    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     **/

    public static void main(String[] args) {

        int[] test = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int[] test0 = new int[] {};
        int[] test1 = new int[] {1};
        System.out.println(maxSubarrayBruteForce(test));

    }

    public static int maxSubarrayBruteForce(int[] nums) {

        if (nums.length == 0 ){
            throw new IllegalArgumentException("Array size is zero");
        }
        else if (nums.length == 1){
            return nums[0];
        }

        //Nested for loops
        //Find all of the possible subarrays
        //Keep a tracker of the max and return the max

        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentmax = 0;
            for (int j = i; j < nums.length; j++) {
                currentmax += nums[j];
                if (currentmax > max) {
                    max = currentmax;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println("Index starting from " + start + " to " + end);
        return max;
    }
}
