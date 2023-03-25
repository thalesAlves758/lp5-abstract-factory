public class LightThemeTextBox implements TextBox {

    @Override
    public String create() {
        return "Textbox of Light theme was rendered";
    }

    @Override
    public String onChange() {
        return "Textbox value of Light theme has changed";
    }
}
