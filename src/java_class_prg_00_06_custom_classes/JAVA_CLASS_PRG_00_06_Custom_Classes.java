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
public class JAVA_CLASS_PRG_00_06_Custom_Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clock clockA = new Clock();
        
        clockA.setHour(11);
        clockA.setMinute(50);
        
        
        Clock clockB = new Clock();
        
        clockB.setHour(23);
        clockB.setMinute(55);
        
        for(int i = 0 ; i < 20 ; i++) {
            clockA.incrementMinute();
//            System.out.println(clockA.toString());
            System.out.println("Clock A: " + clockA.getHour() + ":" + clockA.getMinute());
        }
        
        for(int i = 0 ; i < 20 ; i++) {
            clockB.incrementMinute();
            System.out.println("Clock B: " + clockB.getHour() + ":" + clockB.getMinute());
        }
        
        // Aggregation example, creates time zone clocks by
        // incrementing each clock in the array by one hour
        final int ARR_SIZE = 5;
        
        Clock[] clocks = new Clock[ARR_SIZE];
        
        for(int i = 0 ; i < clocks.length; i++) {
            clocks[i] = new Clock(12 + i, 55);
            System.out.println("\nClock " + (i + 1));
//            System.out.println(clocks[i].getHour() + ":" + clocks[i].getMinute());
            System.out.println(clocks[i].toString());
        }
        
        System.out.println(clockA.getTime());
        System.out.println(clockB.getTime());
        
        // Gap between different sections
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        // Inheritance examples with SecondClock
        System.out.println("Second clock examples:\n");
        
        SecondClock secondClock = new SecondClock();
        
        System.out.println("Current time: " + secondClock.getTime());
        
        System.out.println("Current time: " + secondClock.getHour() + ":" +
                secondClock.getMinute() + ":" + secondClock.getSecond());
        
        Clock clockC = new Clock(12,12);
        SecondClock secondClockA = new SecondClock(12,12,12);
        
        System.out.println(clockC.getTime());
        System.out.println(secondClockA.getTime());
        
        // Polymorphism example
        // Variable of base class type
        Clock clockP = new Clock();
        
        // Object of derived class
        SecondClock scP = new SecondClock();
        
        // Legal declaration
        clockP = scP;
        
        // Illegal, cannot go in other direction.
        // scP = clockP;
        
        // Good use, multiple derived classes in an array
        // of the base class
        Clock[] clocksArr = new Clock[3];
        clocksArr[0] = new SecondClock(12,15,17);
        clocksArr[1] = new Clock(3,57);
        clocksArr[2] = new Timer();
        
        for(int i = 0 ; i < 3 ; i++) {
            clocksArr[i].incrementMinute();
        }
    }
}
