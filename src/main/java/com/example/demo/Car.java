package com.example.demo;

public class Car {
    private String model;
    private int seat;
    private String color;


    public Car(){}

    public Car(String model, int seat, String color) {

   this.model=model;
   this.seat=seat;
   this.color=color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public static void main(String[] args) {
//
//        Car ferrari= new Car();
//
//        ferrari.model ="Ferrari F438";
//        ferrari.seat = 4;
//        ferrari.color = "red";
//
//
//       Car lexus = new Car();
//
//        lexus.model ="Ferrari F438";
//        lexus.seat = 4;
//        lexus.color = "red";

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", seat=" + seat +
                ", color='" + color + '\'' +
                '}';
    }



}



























