public class Circle implements AreaShape{

    private int radius;

    Circle(int r){
        this.radius=r;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void draw() {
        System.out.println(this.getClass());
    }
}
