package com.aor.refactoring.example2;

public class Circle extends Shape {

    private double x;
    private double y;
    private double radius; // ONLY FOR CIRCLES

    Circle(double x, double y, double r){
        this.x=x;
        this.y=y;
        this.radius=r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI * radius;
    }

    @Override
    public void draw(GraphicFramework graphics) {
        graphics.drawCircle(x, y, radius);
    }
}
