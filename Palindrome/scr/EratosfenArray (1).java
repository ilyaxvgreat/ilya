package MyProgram.Work;

import java.util.ArrayList;
import java.util.Arrays;

class EratosfenPalindromeFinder {

    private boolean[] primes;
    private ArrayList<Integer> eratosfenPrimesNumbers = new ArrayList<>();

    private int firstPalindromeMultiplier;
    private int secondPalindromeMultiplier;

    private long palindrome;

    //this numbers are showing that we will use only 5-digit numbers from Eratosfen array(primes numbers)
    private int minNumber = 10000;
    private int maxNumber = 100000;

    public EratosfenPalindromeFinder() {
        primes = new boolean[maxNumber + 1];
    }

    public void fillSieve() {
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
    }

    public void chooseFiveDigitPrimeNumbersFromArray() {
        for (int i = minNumber; i < maxNumber; i++) {
            if (primes[i]) {
                eratosfenPrimesNumbers.add(i);
            }
        }
    }

    public void findMaxPalindromeInArray() {
        long max = 0;
        for (int i = 0; i < eratosfenPrimesNumbers.size(); i++) {
            for (int j = 0; j < eratosfenPrimesNumbers.size(); j++) {
                // avoid type cast
                long palindrome = (long) eratosfenPrimesNumbers.get(i) * eratosfenPrimesNumbers.get(j);
                if (isPalindrome(palindrome)) {
                    if (max < palindrome) {
                        max = palindrome;
                        firstPalindromeMultiplier = eratosfenPrimesNumbers.get(i);
                        secondPalindromeMultiplier = eratosfenPrimesNumbers.get(j);
                        this.palindrome = palindrome;
                    }
                }
            }
        }
    }

    //to String the palindrome and its multipliers
    public String toString() {
        return "Palindrome " + palindrome + "\n" +
                "Num 1 " + firstPalindromeMultiplier + "\n" +
                "Num 2 " + secondPalindromeMultiplier;
    }

    //checking the number on the palindrome
    public static boolean isPalindrome(long number) {

        long palindrome = number;
        long reverse = 0;

        while (palindrome != 0) {
            long remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return number == reverse;
    }
}
