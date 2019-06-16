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
        primes = new boolean[getMaxNumber() + 1];
    }

    private int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    private long getPalindrome() {
        return palindrome;
    }

    private void setPalindrome(long palindrome) {
        this.palindrome = palindrome;
    }

    private float getFirstPalindromeMultiplier() {
        return firstPalindromeMultiplier;
    }

    private void setFirstPalindromeMultiplier(int firstPalindromeMultiplier) {
        this.firstPalindromeMultiplier = firstPalindromeMultiplier;
    }

    private float getSecondPalindromeMultiplier() {
        return secondPalindromeMultiplier;
    }

    private void setSecondPalindromeMultiplier(int secondPalindromeMultiplier) {
        this.secondPalindromeMultiplier = secondPalindromeMultiplier;
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
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                eratosfenPrimesNumbers.add(i);
            }
        }
    }

    public void selectionFiveDigitPrimeNumbersFromArray() {
        for (int i = 0; i < eratosfenPrimesNumbers.size(); i++) {
            eratosfenPrimesNumbers.removeIf(y -> (y < getMinNumber()));
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
                        setFirstPalindromeMultiplier(eratosfenPrimesNumbers.get(i));
                        setSecondPalindromeMultiplier(eratosfenPrimesNumbers.get(j));
                        setPalindrome(palindrome);
                    }
                }
            }
        }
    }

    //print of the palindrome and its multipliers
    public void printPalindrome() {
        System.out.println("Palindrome " + getPalindrome() + "\n" +
                "Num 1 " + getFirstPalindromeMultiplier() + "\n" +
                "Num 2 " + getSecondPalindromeMultiplier());
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
