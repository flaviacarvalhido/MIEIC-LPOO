import static java.lang.Character.*;

public class StringCaseChanger implements StringTransformer {


    @Override
    public void execute(StringDrink drink) {

        String init = drink.getText();
        String result="";

        for(int i=0; i < init.length();i++){
            if(isLowerCase(init.charAt(i))){
                result+=toUpperCase(init.charAt(i));
            }else{
                result+=toLowerCase(init.charAt(i));
            }
        }

        drink.setText(result);
    }


    @Override
    public void undo(StringDrink drink) {
        String init = drink.getText();
        String result="";

        for(int i=0; i < init.length();i++){
            if(isLowerCase(init.charAt(i))){
                result+=toUpperCase(init.charAt(i));
            }else{
                result+=toLowerCase(init.charAt(i));
            }
        }

        drink.setText(result);
    }
}
