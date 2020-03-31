public class AreaStringOutputter {

    private SumProvider agr;

    AreaStringOutputter(SumProvider a){
        this.agr=a;
    }

    public String output() {
        return "Sum of areas: " + agr.sum();
    }

}

