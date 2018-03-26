/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_00_06_custom_classes;

import exceptions.IllegalSecondException;
/**
 *
 * @author kbsmith01
 */
public class SecondClock extends Clock {
    // Each SecondClock has an hour, minute
    // Each SecondClock has getHour, setHour, getMinute, setMinute, etc.
    
    // Additional member variables
    private int second;
    
    public SecondClock(int hour, int minute, int second) {
        super(hour,minute); // Call base class constructor
                            // and pass along hour, minute
        this.second = second;
    }
    
    public SecondClock(int second) {
        super();
        this.second = second;
    }
    
    // Constructor
    public SecondClock() {
        super();
        this.second = 0;
    }
    
    // Additional methods related to second
    public void setSecond(int second) {
        if(second >= 0 && second < 60) {
            this.second = second;
        }
    }
    
    public String getSecond() {
        return String.format("%02d", this.second);
    }
    
    public void incrementSecond() {
        if(second >= 60) {
            second = 0;
            super.incrementMinute();
        }
        else if(second >=0 && second < 60) {
            second++;
        }
        else {
            throw new IllegalSecondException();
        }
    }
    
    // Override inherited getTime method
    @Override
    public String getTime( ) {
        String result = super.getTime();
        String sec = String.format("%02d", this.second);
        result += (":");
        result += (sec);
        return result;
    }
}
