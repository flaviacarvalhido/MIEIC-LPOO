public class Square implements AreaShape{

    private int side;

    Square(int s){
        this.side=s;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass());
    }
}
