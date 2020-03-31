public class StringBar extends Bar {


    StringBar(){};

    public void order(StringDrink drink, StringRecipe r){
        r.mix(drink);
    }
}
