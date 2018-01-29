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
        this.hour = 0;
        this.minute = 0;
    }
    
    // Setter for hour
    public void setHour(int hour) {
        if(hour >= 0 && hour < 24)
            this.hour = hour;
    }
    
    // Setter for minute
    public void setMinute(int minute) {
        if(minute >= 0 && minute < 60)
            this.minute = minute; 
    }
    
    // Getter for hour
    public int getHour() {
        return this.hour;
    }
    
    // Getter for minute
    public int getMinute() {
        return this.minute;
    }
    
    public void incrementMinute() {
        this.minute++;
        if(this.minute > 59) {
            this.minute = 0;
            this.hour++;
            if(this.hour > 23) {
                this.hour = 0;
            }
        }
    }
    
    public void incrementHour() {
        if(this.hour < 24)
            this.hour++;
        else
            this.hour = 0;
    }
}
