package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    public void setModel(String model ){
        String validModel = model.toLowerCase();
        if(validModel.equals("cerrara") || validModel.equals("holden")){
            this.model = model;
        }
    }
    public String getModel(){
        return this.model;
    }
}
