import java.util.ArrayList;
import java.util.List;

public class Party extends Event{


    private List<Event> events = new ArrayList<>();
    private List<Person> total=new ArrayList<>();



    Party(String t, String d, String des){
        this.title=t;
        this.date=d;
        this.description=des;
    }

    public void addEvent(Event e){
        events.add(e);
    }

    public int getAudienceCount(){
        int count=0;
        for(Event e:events){
            count+=e.getAudienceCount();
        }

        return people.size()+count;
    }


}
