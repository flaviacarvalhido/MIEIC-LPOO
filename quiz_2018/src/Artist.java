public class Artist extends Person {

    public Artist(String n) {
        this.name=n;
    }


    public Artist(String n,int a) {
        this.name=n;
        this.age=a;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public String getUsername(){
        return ""+name+age;
    }
}
