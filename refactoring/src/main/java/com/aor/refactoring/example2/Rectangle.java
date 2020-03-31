package com.aor.refactoring.example2;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {

    private double x;
    private double y;
    private double width;
    private double height;


    Rectangle(double x, double y, double w, double h){
        this.x=x;
        this.y=y;
        this.width=w;
        this.height=h;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*height;
    }

    @Override
    public void draw(GraphicFramework graphics) {
        graphics.drawLine(x, y, x + width, y);
        graphics.drawLine(x + width, y, x + width, y + height);
        graphics.drawLine(x + width, y + height, x, y + height);
        graphics.drawLine(x, y + height, x, y);
    }
}
