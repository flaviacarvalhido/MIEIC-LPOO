public class StringReplacer implements StringTransformer {

    private char original , replacer;

    StringReplacer(char o, char r){
        this.original=o;
        this.replacer=r;
    }

    @Override
    public void execute(StringDrink drink) {
        String init = drink.getText();

        drink.setText(init.replace(original,replacer));
    }

    @Override
    public void undo(StringDrink drink) {
        String init = drink.getText();

        drink.setText(init.replace(replacer,original));
    }
}
