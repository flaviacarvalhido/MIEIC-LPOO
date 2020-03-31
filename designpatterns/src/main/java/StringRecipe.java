import java.util.ArrayList;
import java.util.List;

public class StringRecipe {

    List<StringTransformer> recipe = new ArrayList<>();

    StringRecipe(List<StringTransformer> r){
        this.recipe=r;
    }

    public void mix(StringDrink drink){

        for(StringTransformer t:recipe){
            t.execute(drink);
        }

    }

}
