import java.util.HashSet;

public class Main {

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     * <p>
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3
     **/

    public static void main(String[] args) {
        String s = "aab";
        System.out.println("Result: " + lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        //Sliding window problem. Hash set to keep track.
        // int keep track of longest
        // 2 pointer, pointer a at the start. pointer b start at the beginning and goes until the end
        // for loop pointer b to the end
            // if pointer b is the same as a hash set value
                //remove from hashset
                 // move pointer a one spot
            // else
                // add into hashset

        // if (hash count > old max)
        // max = hash count

        int result = 0;
        int pointer_a = 0;
        int pointer_b;

        HashSet<Character> hs = new HashSet<>();

        for (pointer_b = 0; pointer_b < s.length(); pointer_b++) {
            if (hs.contains(s.charAt(pointer_b))) {
                hs.remove(s.charAt(pointer_a));
                pointer_a++;
                pointer_b--;
            } else {
                hs.add(s.charAt(pointer_b));
                if (hs.size() > result) {
                    result = hs.size();
                }

            }
        }
        return result;
    }

}


