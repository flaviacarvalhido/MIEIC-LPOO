import java.util.Objects;

public class Attendee extends Person {
    boolean paid=false;


    Attendee(String n, Integer a){
        this.age=a;
        this.name=n;
    }

    Attendee(String n){
        this.name=n;
    }

    public boolean hasPaid(){
        return paid;
    }


    //prints Attendee
    @Override
    public String toString() {
        return "Attendee " + name + (paid ? " has" : " hasn't") + " paid its registration.";
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public String getUsername(){
        return ""+name+age;
    }
}
