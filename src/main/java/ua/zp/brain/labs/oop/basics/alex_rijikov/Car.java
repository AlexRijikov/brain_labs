package ua.zp.brain.labs.oop.basics.alex_rijikov;

public class Car {
     String model ;
     String color;
     String pasport;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPasport() {
        return pasport;
    }

    Car (String model, String color){
         this.model = model;
         this.color = color;
     }
     void setPasport( String pasport){
         this.pasport = pasport;
     }
}
