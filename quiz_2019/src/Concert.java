import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {

    private String city, country, date;
    List<Act> acts;
    int ticketNum =1;

    Concert(String city, String country, String date){
        this.city=city;
        this.country=country;
        this.date=date;
        acts = new ArrayList<>();
    }

    public List<Act> getActs(){
        return acts;
    }

    public String getCity(){
        return city;
    }

    public String getCountry(){
        return country;
    }

    public String getDate(){
        return date;
    }

    public void addAct(Act act){
        acts.add(act);
    }


    //these two overrides should always exist together
    @Override
    public int hashCode() {
        return Objects.hash(city, country, date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                   // are the references equal
        if (o == null) return false;                  // is the other object null
        if (getClass() != o.getClass()) return false; // both objects the same class

        Concert c = (Concert) o;
        return (c.getCity() == city && c.getCountry() == country && c.getDate() == date);        // actual comparison
    }

    public boolean isValid(Ticket t) throws  InvalidTicket{

        if(t.getConcert() != this) return false;

        return true;
    }


    public boolean participates(Artist a){
        for(Act act:acts){
            if(act.getClass() == Band.class){
                if(((Band) act).containsArtist(a)){
                    return true;
                }
            }else{
                if(act.equals(a))return true;
            }
        }

        return false;
    }

    public void increaseNum(){
        ticketNum++;
    }
}
