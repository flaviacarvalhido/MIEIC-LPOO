import java.util.ArrayList;
import java.util.List;



public abstract class Bar {

    boolean happy=false;
    List<BarObserver> observers = new ArrayList<>();

    public boolean isHappyHour(){
        return happy;
    }

    public void startHappyHour(){
        this.happy=true;
        this.notifyObservers();
    }

    public void endHappyHour(){
        this.happy=false;
        this.notifyObservers();
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }

}
