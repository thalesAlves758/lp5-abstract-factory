public class DarkThemeButton implements Button {

    @Override
    public String create() {
        return "Button of Dark theme was rendered";
    }

    @Override
    public String onClick() {
        return "Button of Dark theme was clicked";
    }
}
