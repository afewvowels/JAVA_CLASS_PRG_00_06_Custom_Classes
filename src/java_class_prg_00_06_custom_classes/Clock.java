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
        if(hour >= 0 && hour < 24)
            this.hour = hour;
    }
    
    // Setter for minute
    public void setMinute(int minute) {
        if(minute >= 0 && minute < 60)
            this.minute = minute; 
    }
    
    public void setTime(int hour, int minute) {
        if(minute >= 0 && minute < 60) {
//            this.minute = minute;
            setMinute(minute);
        }
        
        
        if(hour >= 0 && hour < 23) {
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
    
    public String toString() {
//        String debugMessage;
        
        return "hour: "+getHour()+" minute: "+getMinute();
    }
}
