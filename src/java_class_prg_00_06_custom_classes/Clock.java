/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_00_06_custom_classes;

/**
 *
 * @author kbsmith01
 */
public class Clock {
    // Member variables to keep track of current time
    private int hour;
    private int minute;
    
    // Constructor sets initial time to 00:00
    public Clock() {
        hour = 0;
        minute = 0;
    }
    
    // Setter for hour
    public void setHour(int input) {
        if(input >= 0 && input < 24)
            hour = input;
    }
    
    // Setter for minute
    public void setMinute(int input) {
        if(input >= 0 && input < 60)
            minute = input; 
    }
    
    // Getter for hour
    public int getHour() {
        return hour;
    }
    
    // Getter for minute
    public int getMinute() {
        return minute;
    }
    
    public void incrementMinute() {
        minute++;
        if(minute > 59) {
            minute = 0;
            hour++;
            if(hour > 23) {
                hour = 0;
            }
        }
    }
    
    public void incrementHour() {
        if(hour < 24)
            hour++;
        else
            hour = 0;
    }
}
