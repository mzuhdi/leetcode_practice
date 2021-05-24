import java.util.HashMap;
import java.util.Map;

public class Main {

    /*Given two strings, write a function to determine if the second string is an anagram
    * of the first. An anagram is a word, phrase, or name formed by rearranging the letters
    * of another, such as cinema, formed from iceman
    *
    * validAnagram ("rat", "tar") returns true */
    public static void main (String[] args){
        System.out.println(validAnagramSingleHashMap("abz", "abc"));
        System.out.println("        ");
        System.out.println(validAnagramSingleHashMap("racecar", "racecar"));

    }

    public static boolean sameLength (String word1, String word2){
        if (word1.length() != word2.length()){
            System.out.println("Failed at string length check");
            return false;
        }
        return true;
    }

    public static boolean validAnagram (String word1, String word2){
        //Check if the string have the same length
            //If the string doesn't have the same length
                // return false
        sameLength(word1, word2);

        //Iterate through the first string
            //Iterate through the second string
                // if word1 at i == word2 at j
                    // remove word2 at j
        for (int i = 0; i < word1.length(); i++){
            for (int j = 0; j < word2.length(); j++){
                if (word1.charAt(i) == word2.charAt(j)){
                    char replaceChar = word2.charAt(j);
                    word2 = word2.replaceFirst(String.valueOf(replaceChar), "");
                    System.out.println(word1);
                    System.out.println(word2);
                }
            }
        }

        // if word2 is not empty string
            // return false
        if (!word2.isBlank()){
            System.out.println("Word2 is not blank");
            return false;
        }

        //return true
        return true;

    }

    public static boolean validAnagramBetter (String word1, String word2){
        //Check if both of the string is not the same length
            // return false
        sameLength(word1, word2);

        //Intialize a map
        //Iterate through the word1 string
            // Key: Letter Value: Frequency
        Map<Character, Integer> word1Map = new HashMap<Character, Integer>();
        for (int i = 0; i < word1.length(); i++){
            int counter = 1;
            if(word1Map.containsKey(word1.charAt(i))){
                counter += word1Map.get(word1.charAt(i));
                word1Map.put(word1.charAt(i), counter);
            }
            word1Map.put(word1.charAt(i), counter);
        }

        //Do it again for word2
        Map<Character, Integer> word2Map = new HashMap<Character, Integer>();
        for (int i = 0; i < word2.length(); i++){
            int counter = 1;
            if(word2Map.containsKey(word2.charAt(i))){
                counter += word2Map.get(word2.charAt(i));
                word2Map.put(word2.charAt(i), counter);
            }
            word2Map.put(word2.charAt(i), counter);
        }

        //Compare the keys of the map
        //iterate through the first map keys
            // if map1 keys does not match the any of the word2 key
                // return false
            // if map1 value does not match the word2 value
                //return false

        System.out.println(word1Map.toString());
        System.out.println(word2Map.toString());

        for(Map.Entry<Character, Integer> entry : word1Map.entrySet()){
            if (!word2Map.containsKey(entry.getKey())){
                System.out.println("Can't find matching letters");
                return false;
            } if (entry.getValue() != word2Map.get(entry.getKey())){
                System.out.println("Can't find matching frequency of the letter");
                return false;
            }
        }

        //return true
        return true;
    }

    public static boolean validAnagramSingleHashMap(String word1, String word2){
        sameLength(word1, word2);

        //create HashMap <Char, Int>
        //Iterate through word1
            // Add to hashmap every char in word1
            // Remove of hashmap every char in word2

        // if hashmap value =! 0
            // return false

        //return true

        HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
        for (int i = 0; i < word1.length(); i++){
            hm.put(word1.charAt(i), hm.getOrDefault(word1.charAt(i), 0)+ 1);
            hm.put(word2.charAt(i), hm.getOrDefault(word2.charAt(i), 0)- 1);
        }


        for (int i : hm.values()){
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean validAnagramUsingArray(String word1, String word2){
        sameLength(word1, word2);

        //Create int array size 26 for 26 letters
        //Iterate through the word1
            //Count up for every letter in word1
            //Count down for every letter in word 2
        int[] counter = new int[26];
        for (int i = 0; i < word1.length(); i++){
            counter[word1.charAt(i) - 'a']++;
            counter[word2.charAt(i) - 'a']--;
        }
        //Iterate through the array
            //if any value is not 0
                // return false
        for (int i : counter){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}
