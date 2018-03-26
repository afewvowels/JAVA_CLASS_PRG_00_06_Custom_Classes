/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_00_06_custom_classes;

import exceptions.IllegalMinuteException;

/**
 *
 * @author kbsmith01
 */
public class Clock {
    // Member variables to keep track of current time
    private int hour;
    private int minute;
    
    public static final int MIN_HOUR = 0;
    public static final int MAX_HOUR = 24;
    public static final int MIN_MINUTE = 0;
    public static final int MAX_MINUTE = 60;
    
    // Constructor overloading
    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    // Constructor sets initial time to 00:00
    public Clock() {
        this.hour = 0;
        this.minute = 0;
    }
    
    // Setter for hour
    public void setHour(int hour) {
        if(hour >= this.MIN_HOUR && hour < this.MAX_HOUR)
            this.hour = hour;
    }
    
    // Setter for minute
    public void setMinute(int minute) {
        if(minute >= this.MIN_MINUTE && minute < this.MAX_MINUTE)
            this.minute = minute; 
        else
            throw new IllegalMinuteException();
    }
    
    public void setTime(int hour, int minute) {
        if(minute >= this.MIN_MINUTE && minute < this.MAX_MINUTE) {
//            this.minute = minute;
            setMinute(minute);
        }
        
        if(hour >= this.MIN_HOUR && hour <= this.MAX_HOUR) {
//            this.hour = hour;
            setHour(hour);
        }
            
    }
    
    // Getter for hour
    public String getHour() {
        return String.format("%02d", this.hour);
    }
    
    // Getter for minute
    public String getMinute() {
        return String.format("%02d", this.minute);
    }
    
    public String getTime() {
        String hr = String.format("%02d", this.hour);
        String mn = String.format("%02d", this.minute);
        String time = hr + ":" + mn;
        
        return time;
    }
    
    public void incrementMinute() {
        this.minute++;
        if(this.minute >= this.MAX_MINUTE) {
            this.minute = this.MIN_MINUTE;
            this.hour++;
            if(this.hour >= this.MAX_HOUR) {
                this.hour = this.MIN_HOUR;
            }
        }
    }
    
    public void incrementHour() {
        if(this.hour < this.MAX_HOUR-1)
            this.hour++;
        else
            this.hour = this.MIN_HOUR;
    }
    
    public String toString() {
//        String debugMessage;
        
//        return "hour: "+getHour()+" minute: "+getMinute();
        return hour+" "+minute;
    }
}
