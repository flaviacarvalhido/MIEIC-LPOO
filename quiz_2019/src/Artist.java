import java.util.Objects;

public class Artist extends Act {

    public Artist(String name, String country) {
        this.name = name;
        this.country=country;
    }

    //these two overrides should always exist together
    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                   // are the references equal
        if (o == null) return false;                  // is the other object null
        if (getClass() != o.getClass()) return false; // both objects the same class

        Artist a = (Artist) o;
        return (a.getCountry() == country && a.getName() == name);        // actual comparison
    }
}
