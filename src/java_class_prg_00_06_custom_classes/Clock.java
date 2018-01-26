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
    
    // Constructor sets initial time to 00:00W
    public Clock() {
        hour = 0;
        minute = 0;
    }
    
    public void setHour(int input) {
        hour = input;
    }
    
    public void setMinute(int input) {
        minute = input;
    }
}
