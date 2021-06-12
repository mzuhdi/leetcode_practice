public class Main {
    public static void main (String[] args){
        System.out.println(isPalindrome("Race a car!"));
    }

    public static boolean isPalindrome(String s) {
        //modify string into one long string that is only alphanumeric
        //double pointer

        String clean = "";
        for (char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                clean += c;
            }
        }
        clean = clean.toLowerCase();

        int pointer_a = 0;
        int pointer_b = clean.length() - 1;

        while (pointer_a <= pointer_b){
            if(clean.charAt(pointer_a) != clean.charAt(pointer_b)){
                return false;
            }
            pointer_a++;
            pointer_b--;
        }

        return true;
    }
}
