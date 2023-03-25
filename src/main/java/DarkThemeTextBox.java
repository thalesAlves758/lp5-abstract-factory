public class DarkThemeTextBox implements TextBox {

    @Override
    public String create() {
        return "Textbox of Dark theme was rendered";
    }

    @Override
    public String onChange() {
        return "Textbox value of Dark theme has changed";
    }
}
