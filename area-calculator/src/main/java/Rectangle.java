public class Rectangle implements AreaShape{

    private int length, width;

    Rectangle(int l, int w){
        this.length=l;
        this.width=w;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass());
    }
}
