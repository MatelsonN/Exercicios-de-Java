package Exercises.interfaces.exercise4.application;

import Exercises.interfaces.exercise4.device.ComboDevice;

public class Program{

    public static void main(String[] args){

        ComboDevice comboDevice = new ComboDevice("12345");

        comboDevice.processDoc("Hello world");
        comboDevice.print("Hello world");
        System.out.println("Scan result: " + comboDevice.scan());
    }



}
