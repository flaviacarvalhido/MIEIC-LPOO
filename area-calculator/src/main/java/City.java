import java.util.ArrayList;
import java.util.List;

public class City implements SumProvider{

    private List<House> houses = new ArrayList<>();

    City(List<House> h){
        this.houses=h;
    }

    public double sum(){
        double sum=0;
        for(House h:houses){
            sum+=h.getArea();
        }
        return sum;
    }

}
