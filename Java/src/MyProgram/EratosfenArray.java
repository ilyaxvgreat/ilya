package MyProgram.Work;

import java.util.ArrayList;
import java.util.Arrays;

public class EratosfenArray {

    private boolean[] primes;
    private ArrayList<Integer> eratosfen = new ArrayList<>();

    private int maxFirstNumEratosfen;
    private int maxSecondtNumEratosfen;
    private long palindrome;

    public long getPalindrome() {
        return palindrome;
    }

    public void setPalindrome(long palindrome) {
        this.palindrome = palindrome;
    }

    public float getMaxFirstNumEratosfen() {
        return maxFirstNumEratosfen;
    }

    public void setMaxFirstNumEratosfen(int maxFirstNumEratosfen) {
        this.maxFirstNumEratosfen = maxFirstNumEratosfen;
    }

    public float getMaxSecondtNumEratosfen() {
        return maxSecondtNumEratosfen;
    }

    public void setMaxSecondtNumEratosfen(int maxSecondtNumEratosfen) {
        this.maxSecondtNumEratosfen = maxSecondtNumEratosfen;
    }


    public int getMinNumber() {
        int minNumber = 10000;
        return minNumber;
    }

    public EratosfenArray(int n) {
        primes = new boolean[n + 1];
    }

    public void fillSieve() {
        //создаем массив Эратосфена
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
        //отбираем натуральные числа и добавляем их индексы в новый массив
        for (int i = 0; i < primes.length; i++) {
            if (primes[i])
                eratosfen.add(i);
        }
        //отбираем только пятизначные элементы
        for (int i = 0; i < eratosfen.size(); i++) {
            eratosfen.removeIf(y -> (y < getMinNumber()));
        }
    }

    // проходимя по элементам массива и перебором перемножаем их друг на друга
    //отбираем при помощи метода числа палиндромы
    public void findPalindromeInArray() {
        long max = 0;
        for (int i = 0; i < eratosfen.size(); i++) {
            for (int j = 0; j < eratosfen.size(); j++) {
                long palindrome = (long) eratosfen.get(i) * eratosfen.get(j);
                if (isPalindrome(palindrome)) {
                    if (max < palindrome) {
                        max = palindrome;
                        setMaxFirstNumEratosfen(eratosfen.get(i));
                        setMaxSecondtNumEratosfen(eratosfen.get(j));
                        setPalindrome(palindrome);
                    }
                }
            }
        }
        System.out.println("Palindrome " + getPalindrome() + "\n" +
                "Num 1 " + getMaxFirstNumEratosfen() + "\n" +
                "Num 2 " + getMaxSecondtNumEratosfen());
    }

/**    public boolean isPalindrome(long number) {

 long palindrome = number;
 long reverse = 0;

 while (palindrome != 0) {
 long remainder = palindrome % 10;
 reverse = reverse * 10 + remainder;
 palindrome = palindrome / 10;
 }
 return number == reverse;
 }*/

    //метод проверки числа на палиндром. спижжено с инэта
    public boolean isPalindrome(long number) {

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
