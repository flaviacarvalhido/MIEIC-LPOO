public class Triangle implements AreaShape {

    private int base,height;

    Triangle(int b, int h){
        this.base = b;
        this.height=h;
    }

    @Override
    public double getArea() {
        return base*height/2;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass());
    }
}
