import java.util.ArrayList;
import java.util.List;

public class StringTransformerGroup implements StringTransformer {

    //transformergroups are more complex steps of a recipe, instead of one step at a time, a recipe can execute a transformergroup (which will execute each transformer inside it)

    List<StringTransformer> group = new ArrayList<>();

    StringTransformerGroup(List<StringTransformer> g){
        this.group=g;
    }


    @Override
    public void execute(StringDrink drink) {
        for(StringTransformer t:group){
            t.execute(drink);
        }
    }

    @Override
    public void undo(StringDrink drink) {
        for(StringTransformer t:group){
            t.undo(drink);
        }
    }
}
