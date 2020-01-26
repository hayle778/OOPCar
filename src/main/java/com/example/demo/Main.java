package com.example.demo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String model;
        int seat;
        String color;

        Car car = new Car();
        car.setModel("shevy");
        System.out.println("" + car.getModel());
        car.setSeat(8);
        System.out.println("" + car.getSeat());

        car.setSeat(5);
        car.setColor("red");
//   Car c1 = new Car( "ferrari", 2, "red" );// we can instantiate the object using two ways. Either this or set.
//   Car c2 = new Car("bmw", 6, "lightblue")  ;
//    Car c3 = new Car();
//    c3.setModel("honda");
//    c3.setSeat(6);
//    c3.setColor("yellow");
//    animal.setName(nam);

        System.out.println("Size of the seat: " + car.getSeat() + ",  " + "Color : " + car.getColor());
        // let we make it with for inhance loop
      System.out.println(" ...........Car 2..............");
        Car car2 = new Car("lambo", 2, "brown");
        System.out.println("Car model:" + car2.getModel() + " Quty seat: " + car2.getSeat() + " Color: " + car2.getColor());

    }

    ArrayList<String>name= new ArrayList<>();











}
