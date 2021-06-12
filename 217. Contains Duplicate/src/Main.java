import java.util.HashSet;

public class Main {

    /* Given an integer array nums,
    return true if any value appears at least twice in the array,
    and return false if every element is distinct.
    Input: nums = [1,2,3,1]
    Output: true
    */

    public static void main(String[] args){
        int[] test = new int[] {1, 2, 3, 1};
        int[] test2 = new int[] {1, 2, 3, 4};

        boolean result1 = containsDuplicateHash(test);
        System.out.println(result1);

        boolean result2 = containsDuplicateHash(test2);
        System.out.println(result2);

    }

    public static boolean containsDuplicateHash(int[] nums){

        //initalize hashset of int
        //iterate through the array
            // if the number is not the set
                // add it
                //  otherwise return true

        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i : nums){
            if (!hs.contains(i)){
                hs.add(i);
            } else {
                return true;
            }
        }
        return false;
    }
}
