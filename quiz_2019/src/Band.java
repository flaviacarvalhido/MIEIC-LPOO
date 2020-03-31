import java.util.ArrayList;
import java.util.List;

public class Band extends Act {

    List<Artist> artists = new ArrayList<>();

    public Band(String name, String country) {
        this.name = name;
        this.country=country;
    }

    public void addArtist(Artist a){
        artists.add(a);
    }

    public List<Artist> getArtists(){
        return artists;
    }

    public boolean containsArtist(Artist a){

        for(Artist art : artists){
            if(art.equals(a)){
                return true;
            }
        }

        return false;
    }
}
