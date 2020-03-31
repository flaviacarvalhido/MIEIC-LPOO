public class AreaXMLOutputter {

    private SumProvider agr;

    AreaXMLOutputter(SumProvider a){
        this.agr=a;
    }

    public String output() {
        return "<area>" + agr.sum() + "</area>";
    }
}
