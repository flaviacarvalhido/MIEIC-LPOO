public class Ticket  {

    int number;
    Concert c;

    Ticket (int n, Concert con) throws InvalidTicket{

        if(n<=0) throw new InvalidTicket();
        this.number = n;
        this.c = con;
    }

    public int getNumber(){
        return number;
    }

    public Concert getConcert(){
        return c;
    }



}
