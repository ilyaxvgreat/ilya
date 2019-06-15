package com.company;

public class HourRad {
    private final int HOUR_RAD_Q = 30;
    private final float HOUR_RAD_Q_MIN = 0.5f;

    public float hourRad(int hour, int min) {

        return hour * HOUR_RAD_Q + min * HOUR_RAD_Q_MIN;
    }
}
