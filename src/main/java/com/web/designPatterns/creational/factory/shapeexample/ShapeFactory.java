package com.web.designPatterns.creational.factory.shapeexample;

//this is to create based on which shape object is required
public class ShapeFactory {

    public Shape getShape(String type){
        if(type.equals("square"))
            return new Square();
        else if(type.equals("circle"))
            return new Circle();
        else if(type.equals("rhombus"))
            return new Rhombus();
        return null;
    }
}
