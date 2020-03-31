public class House implements HasArea {
    private int area;

    House(int a){
        this.area=a;
    }

    @Override
    public double getArea() {
        return area;
    }
}
