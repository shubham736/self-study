package com.gfg.medium;

public class AngleBetweenHourAndMinHand {
    public static void main(String[] args) {
        double hour = 12, min = 12;
        System.out.println( " Degree between "+hour +" : "+ min +" is :- "+calcAngle(hour,min) );
    }

    static int calcAngle(double hour,double minute){
        int angle = 0;
        if(hour < 0 || minute < 0 || hour >12 || minute >60 )
            System.out.println("Invalid input");
        if(hour==12)
            hour =0;
        if(minute == 60){
            minute = 0;
            hour +=1;
            if(hour >12)
                hour = hour-12;
        }

        int hour_angle= (int)(0.5 * (hour*60)+minute);
        int minute_angle = (int) (6*minute);

        angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360-angle,angle);
        return  angle;
    }
}
