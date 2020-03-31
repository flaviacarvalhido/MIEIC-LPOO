import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {

    List<StringDrink> drinks = new ArrayList<>();
    List<StringRecipe> recipes = new ArrayList<>();
    List<StringBar> bars=new ArrayList<>();

    SmartStrategy(){}

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        drinks.add(drink);
        recipes.add(recipe);
        bars.add(bar);

        if(bar.isHappyHour())this.happyHourStarted(bar);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for(int i=0;i<drinks.size();i++){
            bars.get(i).order(drinks.get(i),recipes.get(i));
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
