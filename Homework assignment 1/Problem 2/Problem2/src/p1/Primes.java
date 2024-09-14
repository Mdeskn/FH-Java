package p1;

public class Primes {
    public static void main(String[] args) {
        int nValues = 50; 
        
        // this code loops through all numbers from 2 to nValues
        Loop1:
        for (int i = 2; i <= nValues; i++) {
            // this one if to check divisibility from 2 up to the square root of i
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    // and now if a divisor is found, skip the current number and go to the next iteration of outer loop
                    continue Loop1;
                }
            }
            // if no divisors are found, print the prime number
            System.out.println(i);
        }
    }
}
