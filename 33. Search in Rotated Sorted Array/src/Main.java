public class Main {

    public static void main (String[] args) {
        int[] test1 = new int[]{4, 5, 6, 7, 0, 1, 2, 3};
        int result = search(test1, 2);
        System.out.println(result);
    }

    public static int search(int[] nums, int target){
        if (nums == null || nums.length == 0){
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left)/2;
            if (nums[mid] > nums[right]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int start = left;
        left = 0;
        right = nums.length - 1;

        if (target >= nums[start] && target <= nums[right]){
            left = start;
        } else {
            right = start;
        }

        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
