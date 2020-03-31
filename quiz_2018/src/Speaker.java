import java.util.Objects;

public class Speaker extends Person {


    private int fee=0;

    Speaker(String n, Integer a){
        this.age=a;
        this.name=n;
    }

    Speaker(String n){
        this.name=n;
    }

    public int getFee() {
        return fee;
    }


    //prints Speaker
    @Override
    public String toString() {
        return "Speaker " + name + " has a fee value of " + fee + ".";
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public String getUsername(){
        return ""+name+age;
    }
}
