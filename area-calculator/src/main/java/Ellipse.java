public class Ellipse implements AreaShape {

    private int xr, yr;

    Ellipse(int xr,int yr){
        this.xr=xr;
        this.yr=yr;
    }

    public int getXr() {
        return xr;
    }

    public int getYr() {
        return yr;
    }

    @Override
    public double getArea() {
        return Math.PI * yr*xr;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass());
    }
}
