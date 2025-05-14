package com.web.designPatterns.creational.factory.shapeexample;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("rhombus");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("circle");
        shape2.draw();

        Shape shape = shapeFactory.getShape("null");
        if(shape != null) shape.draw();
    }
}
