package com.company;

/**
 * The code for calculating the angle between the minute and hour hands.
 * Time enter independently through the console.
 * There is a check to enter an integer.
 */

class Main {

    public static void main(String[] args) {
        Input input = new Input();
        input.setHour();
        input.setMin();

        MinRad minRad = new MinRad();
        HourRad hourRad = new HourRad();
        System.out.println("Rad = " + calculation(minRad.minRad(input.getMin()), hourRad.hourRad(input.getHour(), input.getMin())));

    }

    private static float calculation(float minRad, float hourRad) {
        float res = hourRad - minRad;
        if (res < 0) {
            return res * (-1);
        } else if (res == 360) {
            return 0;
        }
        return res;
    }
}
