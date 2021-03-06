/**
 * Euclid.java
 */
import java.util.Scanner;
/**
 * An implementation of Euclid's algorithm in Java.
 */
public class Euclid {

    /**
     * Euclid's algorithm for finding the greatest common denominator
     * of two numbers.
     * Has a time complexity of O(logN) (logarithmic)
     * and a space complexity of O(1) (constant)
     */
    public static long gcd(long m, long n) {
	while(n != 0) {
	    long remainder = m % n;
	    m = n;
	    n = remainder;
	}
	return m;
    }

    public static void main(String[] args) {
	// Expects two lines corresponding to two longs
	Scanner scan = new Scanner(System.in);
	long one = Long.parseLong(scan.nextLine());
	long two = Long.parseLong(scan.nextLine());
	long result = gcd(one, two);
	System.out.println("gcd: " + result);
    }
}
