import java.util.Objects;

public abstract class Person extends User implements Comparable<Person>{

    String name;
    int age;



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


}
