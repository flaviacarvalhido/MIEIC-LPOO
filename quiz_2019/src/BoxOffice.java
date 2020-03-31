import java.util.ArrayList;
import java.util.List;

public interface BoxOffice {

    public static List<Ticket> buy(Concert c , int n) throws InvalidTicket{
        List<Ticket> bought = new ArrayList<>();

        for(int i = 0; i<n;i++){
            bought.add(new Ticket(c.ticketNum , c));
            c.increaseNum();
        }

        return bought;
    }



}
