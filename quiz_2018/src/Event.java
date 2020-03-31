import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Event {

    String title, date="", description="";
    List<Person> people = new ArrayList<>();


    Event(){}

    Event(String t){
        this.title=t;
    }

    Event(Event e){
        this.title=e.getTitle();
        this.date=e.getDate();
        this.description=e.getDescription();
    }

    Event(String t, String d){
        this.title=t;
        this.date=d;
    }

    Event(String t, String d, String des){
        this.title=t;
        this.date=d;
        this.description=des;
    }

    public String getTitle(){
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String t) {
        this.title = t;
    }


    public void setDate(String d) {
        this.date=d;
    }


    public void setDescription(String des) {
        this.description=des;
    }


    //prints event
    @Override
    public String toString() {
        return title + " is a " + description + " and will be held at " + date + ".";
    }



    //equals override
    @Override
    public int hashCode() {
        return Objects.hash(title, date, description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                   // are the references equal
        if (o == null) return false;                  // is the other object null
        if (getClass() != o.getClass()) return false; // both objects the same class
        Event e = (Event) o;                          // cast the other object
        return title == e.getTitle() && date == e.getDate() && description == e.getDescription();        // actual comparison
    }


    public boolean addPerson(Person p){

        for(Person g:people){
            if(g.getName() == p.getName()){
                return false;
            }
        }
        people.add(p);
        return true;
    }

    public int getAudienceCount(){
        return people.size();
    }

}
