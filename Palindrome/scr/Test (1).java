package MyProgram.Work;//Багнюк Захар

class Test {

    public static void main(String[] args) {
        EratosfenPalindromeFinder eratosfenPalindromeFinder = new EratosfenPalindromeFinder();
        eratosfenPalindromeFinder.fillSieve();
        eratosfenPalindromeFinder.chooseFiveDigitPrimeNumbersFromArray();
        eratosfenPalindromeFinder.findMaxPalindromeInArray();
        System.out.println(eratosfenPalindromeFinder.toString());
    }
} 