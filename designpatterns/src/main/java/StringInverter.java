public class StringInverter implements StringTransformer {


    @Override
    public void execute(StringDrink drink) {
        StringBuffer init = new StringBuffer(drink.getText());
        init.reverse();

        drink.setText(init.toString());

    }

    @Override
    public void undo(StringDrink drink) {
        StringBuffer init = new StringBuffer(drink.getText());
        init.reverse();

        drink.setText(init.toString());
    }
}
