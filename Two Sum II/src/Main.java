public class Main {
    /**
     * Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
     * <p>
     * Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.
     * <p>
     * Input: numbers = [2,3,4], target = 6
     * Output: [1,3]
     **/

    public static void main(String[] args) {
        int[] test1 = new int[] {2,3,4};
        int[] test2 = new int[] {1,2,3};

        int[] result = solution(test1,0);
        System.out.println(result[0] + " " + result[1]);

    }

    public static int[] solution(int[] numbers, int target) {

        // Two pointers. One start at the beginning (A) and one start at the end (B)
        // While the pointers haven't meet
            // if pointer a + pointer b > target
                // move pointer b to left (to make it smaller)
            // else if pointer a + pointer b < target
                // move pointer a to right (to make it bigger)
            //else (you found the target)
                // return array location + 1

        // return array location: -1 (not found)

        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (leftPointer <= rightPointer) {
            if (numbers[leftPointer] + numbers[rightPointer] > target) {
                rightPointer -= 1;
            } else if (numbers[leftPointer] + numbers[rightPointer] < target) {
                leftPointer += 1;
            } else {
                return new int[]{leftPointer + 1, rightPointer + 1};
            }
        }
        return new int[]{-1, -1};
    }

}
