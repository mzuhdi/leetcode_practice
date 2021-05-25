public class Main {
    /** "Write a program that prints the numbers from 1 to 100.
     * But for multiples of three print “Fizz” instead of the number
     * and for the multiples of five print “Buzz”.
     * For numbers which are multiples of both three and five print “FizzBuzz”."**/
    public static void main (String[] args){
        fizzbuzzswitch(100);
    }

    public static void fizzbuzz (int num){
        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && ((i % 5 == 0))) {
                System.out.println(i + " : FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " : Buzz");
            } else if (i % 5 == 0) {
                System.out.println(i  + " : Fizz");
            } else {
                System.out.println(i + " : ");
            }
        }
    }

    public static void fizzbuzzswitch(int num){
        for(int i = 1; i <= num; i++) {
            switch(i % 15) {
                case 0:
                    System.out.println(i + " : FizzBuzz");
                    break;
                case 3: case 6: case 9: case 12:
                    System.out.println(i + " : Fizz");
                    break;
                case 5: case 10:
                    System.out.println(i + " : Buzz");
                    break;
            }
        }
    }
}
