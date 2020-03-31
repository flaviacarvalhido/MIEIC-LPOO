package com.aor.refactoring.example2;

public abstract class Shape {        //huge class! should have different classes for each shape and each shape should have their own different methods

    /*
    enum TYPE {RECTANGLE, CIRCLE}

    private TYPE type;
    private double x;
    private double y;
    private double width;  // ONLY FOR RECTANGLES
    private double height; // ONLY FOR RECTANGLES
    private double radius; // ONLY FOR CIRCLES

    public Shape(double x, double y, double width, double height) {
        this.type = TYPE.RECTANGLE;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Shape(double x, double y, double radius) {
        this.type = TYPE.CIRCLE;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

     */


    public abstract double getArea();
        /*
        switch (type) {
            case RECTANGLE:
                return width * height;
            case CIRCLE:
                return Math.PI * Math.pow(radius, 2);
            default:
                throw new Exception("Shape with no type");
        }
         */


    public abstract double getPerimeter();
        /*
        switch (type) {
            case RECTANGLE:
                return 2 * (width + height);
            case CIRCLE:
                return 2 * Math.PI * radius;
            default:
                throw new Exception("Shape with no type");
        }
         */

    public abstract void draw(GraphicFramework graphics) ;
        /*
        switch (type) {
            case RECTANGLE:
                graphics.drawLine(x, y, x + width, y);
                graphics.drawLine(x + width, y, x + width, y + height);
                graphics.drawLine(x + width, y + height, x, y + height);
                graphics.drawLine(x, y + height, x, y);
                break;
            case CIRCLE:
                graphics.drawCircle(x, y, radius);
                break;
        }

         */

}
