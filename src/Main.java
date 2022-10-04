
public class Main {
    static int recursiveFib(int n) {
        // the base case for recursion to work
        if (n <= 1)
            return n;

        return recursiveFib(n - 1)
                + recursiveFib(n - 2);
    }

    static void iterativeFib(int n) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        while (counter < n) {

            // Print the number
            System.out.print(num1 + " ");

            // updates the number variables and the counter
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void main(String[] args) {
        // amount of numbers in the sequence
        int n = 20;


        //gets system time
        long startTime = System.nanoTime();

        // uses recursive function
        for (int i = 0; i < n; i++) {
            System.out.print(recursiveFib(i) + " ");
        }

        System.out.println();
        // get system time
        long endTime = System.nanoTime();
        //calculate time it took to do recursive function
        long totalTime = endTime - startTime;
        System.out.println("Recursive: " + totalTime + " nanoseconds.");



        //get time at this point
        startTime = System.nanoTime();
        //use iterative function
        iterativeFib(n);
        //get time
        endTime = System.nanoTime();
        //calculate time iterative function took
        totalTime = endTime - startTime;
        System.out.println();
        System.out.println("Iterative: " + totalTime + " nanoseconds.");

    }
}