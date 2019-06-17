package com.rajeshchinni;

public class Main {

    public static void main(String[] args) {


        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));  // returns true
        System.out.println(rover.equals(rover2));  // return true

        // But how to ensure that equals can't be overridden in sub classes of dog?




    }
}
