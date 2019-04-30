package ua.zp.brain.labs.oop.basics.alex_rijikov;

public class Bus {
    String model;
    String color;
    int size ;
    Bus( String model,String color){}
    Bus(String model,String color ,int size){
        this( model, color);
        this.size = size;
    }
}
