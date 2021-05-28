import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    //Given two arrays, check if the second array is to the power of 2 of the first array.
    //Ensure that they have the same frequency
    //Input [1,2,2,3], [4,4,1,9]
    //Output true

    public static void main (String[] args){
        int[] test1 = new int[] {1,2,2,3,3,3};
        int[] test2 = new int[] {4,4,1,9,9,9};

        System.out.println("Result is " + powerof2singlehashmap(test1,test2));

    }

    public static boolean isSameLength (int[] args1, int[]args2){
        if (args1.length != args2.length){
            return false;
        }
        return true;
    }

    public static boolean powerof2 (int[] args1, int[]args2){
        //since we need to have the same frequency. We will need to check if they are the same length.
        //if not, return false

        isSameLength(args1, args2);

        int doublevalue;
        //Iterate through the first loop.
            //Iterate through the second loop
                // Exponent the value of the first array
                // If the double of the first array == a value of second array
                // Set that value as -1
                // Break(?)
        for (int i = 0; i < args1.length; i++){
            for (int j = 0; j < args2.length; j++){
                System.out.println(Arrays.toString(args1));
                System.out.println(Arrays.toString(args2));
                doublevalue = (int) Math.pow(args1[i], 2);
                if (doublevalue == args2[j]){
                    args2[j] = -1;
                    //break;
                }
            }
        }
        System.out.println(Arrays.toString(args1));
        System.out.println(Arrays.toString(args2));

        //Iterate through the second loop
            //if (second[i] != -1)
                // return false
        for (int i = 0; i < args2.length; i++){
            if (args2[i] != -1){
                return false;
            }
        }
        //return true
        return true;
    }
    public static boolean powerof2better (int[] args1, int[]args2){
        //since we need to have the same frequency. We will need to check if they are the same length.
        //if not, return false

        isSameLength(args1, args2);

        Map <Integer, Integer> Map1 = new HashMap<Integer, Integer>();
        Map <Integer, Integer> Map2 = new HashMap<Integer, Integer>();
        //Iterate through the first loop.
        // Key: Number , Value: Frequency

        for (int i = 0; i < args1.length; i++){
            int counter = 1;
            if (Map1.containsKey(args1[i])){
                counter += Map1.get(args1[i]);
                Map1.put(args1[i],counter);;
            }
            Map1.put(args1[i],counter);
        }

        //Iterate thorugh the second loop
        //Store it in a map
        for (int i = 0; i < args2.length; i++){
            int counter = 1;
            if (Map2.containsKey(args2[i])){
                counter += Map2.get(args2[i]);
                Map2.put(args2[i],counter);;
            }
            Map2.put(args2[i],counter);
        }

        System.out.println(Map1.toString());
        System.out.println(Map2.toString());

        //Iterate through the Map
        // If !(Key^2 is in Map2 key)
            //return false
        // if (Key^2 != Map2 key value)
            //return false
        for(Map.Entry<Integer, Integer> key : Map1.entrySet()){
            int doublevalue = (int) Math.pow(key.getKey(),2);

            if (!(Map2.containsKey(doublevalue))){
                System.out.println(doublevalue);
                System.out.println(Map2.containsKey(doublevalue));
                System.out.println("Fail to find matching key");
                return false;
            }
            if (Map2.get(doublevalue) != key.getValue()){
                System.out.println(key.getValue());
                System.out.println(doublevalue);
                System.out.println("Fail to find matching frequency");
                return false;
            }

        }
        return true;
    }
     public static boolean powerof2singlehashmap (int[] args1, int[] args2){
        //assuming args1 will always be the array that needs to be power by 2

        isSameLength(args1, args2);

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < args1.length; i++){
            int powerby2 = (int) Math.pow(args1[i],2);
            hm.put(powerby2, hm.getOrDefault(powerby2,0)+ 1);
            hm.put(powerby2, hm.getOrDefault(powerby2,0)- 1);
        }

        for (int i : hm.values()){
            if(i != 0){
                return false;
            }
         }
        return true;


     }


}
