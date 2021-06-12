import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    /*Given an array of strings strs, group the anagrams together. You can return the answer in any order.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/

    public static void main (String[] args){

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnangrams = new ArrayList<>();
        HashMap<String, List<String>> hs = new HashMap<>(); // To keep track the matching string

        for (String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars); // sorting the char to standardize
            String sorted = chars.toString();
            if (!hs.containsKey(sorted)){
                hs.put(sorted, new ArrayList<>());
            }
            hs.get(sorted).add(s);
        }
        groupAnangrams.addAll(hs.values());
        return groupAnangrams;
    }
}
